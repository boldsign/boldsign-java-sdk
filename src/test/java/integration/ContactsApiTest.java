package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.ContactsApi;
import com.boldsign.model.*;
import org.junit.jupiter.api.*;
import java.util.Collections;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ContactsApiTest
{
    private static String emailId;
    private static String contactId;
    private static ApiClient apiClient;
    private static ContactsApi contactsApi;
    public static String randomNumbers()
    {
        Random rand = new Random();
        int rangeStart = (int) Math.pow(10, 3 - 1);
        int rangeEnd = (int) (Math.pow(10, 3) - 1);
        return String.valueOf(rand.nextInt(rangeEnd - rangeStart + 1) + rangeStart);
    }

    @BeforeAll
    public static void setUp() throws Exception
    {
        emailId = null;
        contactId = null;
        String apiKey = System.getenv("API_KEY");
        String url = System.getenv("HOST_URL");

        if (apiKey == null || url == null)
        {
            throw new IllegalArgumentException("API_KEY and HOST_URL environment variables must be set");
        }
        apiClient = new ApiClient();
        apiClient.setApiKey(apiKey);
        apiClient.setBasePath(url);
        contactsApi = new ContactsApi(apiClient);
        String randomStr = randomNumbers();
        emailId = "mohammedmushraf.abuthakir" + randomStr + "@syncfusion.com";

    }

    @Test
    @Order(1)
    public void testCreateContactsPositive()
    {
        try
        {
            String userName = "SDK Testing 1";
            String email = emailId;
            ContactDetails contactDetails = new ContactDetails();
            contactDetails.setEmail(email);
            contactDetails.setName(userName);
            CreateContactResponse createContactsResponse = contactsApi.createContact(
                    java.util.Collections.singletonList(contactDetails));
            assertNotNull(createContactsResponse, "Create contacts response should not be null");
            assertNotNull(createContactsResponse.getCreatedContacts(), "Contact ID should not be null");
            contactId = createContactsResponse.getCreatedContacts().get(0).getId();
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
    public void testCreateContactsNegative() throws ApiException
    {
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setEmail("mohammedmushraf.abuthakir+889syncfusion.com");
        contactDetails.setName("Mohammed");
        ApiException exception = null;
        try
        {
            contactsApi.createContact(Collections.singletonList(contactDetails));
        } catch (ApiException e) {
            exception = e;
        }
        assertEquals(400, exception.getCode());
        assertTrue(exception.getResponseBody().contains("\"[0].Email\":[\"The field Email is invalid.\"]"));
        assertTrue(exception.getResponseBody().contains("status\":400"));
        assertTrue(exception.getResponseBody().contains("title\":\"One or more validation errors occurred."));
    }

    @Test
    @Order(3)
    public void testUpdateContactPositive() throws ApiException
    {
        String ContactId = contactId;
        String Email = emailId;
        String updatedName = "Mohammed";
        ContactsDetails currentContact = contactsApi.getContact(contactId);
        ContactDetails updatedContactDetails = new ContactDetails();
        updatedContactDetails.setEmail(Email);
        updatedContactDetails.setName(updatedName);
        contactsApi.updateContact(contactId, updatedContactDetails);
        assertNotNull(updatedContactDetails);
    }

    @Test
    @Order(4)
    public void testUpdateContactNegative()
    {
        try
        {
            String contactsId = "wrongUserId";
            ContactDetails updateRequest = new ContactDetails();
            updateRequest.setName("Update Contact name");
            updateRequest.setEmail("mohammedmushraf.abuthakir+6@syncfusion.com");
            contactsApi.updateContact(contactsId, updateRequest);
            Assertions.fail("Expected ApiException not thrown");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getResponseBody().startsWith("{\"errors\":{\"id\":[\"Provide a valid Contact Id\"]},"));
        }
    }

    @Test
    @Order(5)
    public void testGetContactPositive()
    {
        try
        {
            String ContactsId = contactId;
            ContactsDetails getContactResponse = contactsApi.getContact(ContactsId);
            assertNotNull(getContactResponse, "Response should not be null");
            assertNotNull(getContactResponse.getEmail(), "Email should not be null");
            assertEquals(getContactResponse.getEmail(), emailId);
            assertEquals("Mohammed", getContactResponse.getName(), "Name does match expected value");
            assertEquals(emailId, getContactResponse.getEmail(), "Email does match expected value");
            assertTrue(getContactResponse instanceof ContactsDetails, "Response should be an instance of ContactsDetails");
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
   @Order(6)
    public void testGetContactNegative()
    {
        try
        {
            String invalidContactId = "f4673a5f-5440-468b-9289-8aa53a75e4f3c_cjAbg";
            contactsApi.getContact(invalidContactId);
            fail("Expected ApiException due to invalid contact ID, but no exception was thrown.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode(), "Expected status code 400 for bad request.");
            assertTrue(e.getMessage().contains("This Contact ID is invalid or unauthorized for this operation. Please use a valid Contact ID."));
        }
    }


    @Test
   @Order(7)
    public void testListContactPositive()
    {
        try
        {
            int page = 1;
            int pageSize = 20;
            String searchKey= "Mohammed";
            String contactType="MyContacts";
            ContactsList contactUserListResponse = contactsApi.contactUserList(page,pageSize,searchKey,contactType);
            assertNotNull(contactUserListResponse);
            assertNotNull(contactUserListResponse.getResult());
            assertTrue(contactUserListResponse instanceof ContactsList);
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
   @Order(8)
    public void testListContactNegative()
    {
        try
        {
            int invalidPage = -1;
            int invalidPageSize = 0;
            String searchKey= "Mohammed";
            String contactType="MyContact";
            ContactsList contactUserListResponse = contactsApi.contactUserList(invalidPage,invalidPageSize,searchKey,contactType);
            fail("Expected ApiException due to invalid parameters, but the API call succeeded.");
        }
        catch (ApiException e)
        {
            assertNotNull(e.getMessage());
            assertFalse(e.getMessage().contains("Invalid page or page size"));
        }
    }

    @Test
    @Order(9)
    public void testDeleteContactsPositive()
    {
        try
        {
            String deleteContactId =contactId;
            contactsApi.deleteContacts(deleteContactId);
        } catch (Exception e)
        {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(10)
    public void testDeleteContactsNegative()
    {
        try
        {
            String invalidContactsId = "f4673a5f-5440-468b-9289-8aa53a75e4f3c_g1XBm";
            contactsApi.deleteContacts(invalidContactsId);
            fail("Expected ApiException due to invalid contact ID, but no exception was thrown.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getResponseBody().contains("This Contact ID is invalid or unauthorized for this operation. Please use a valid Contact ID."));
        }
    }
}