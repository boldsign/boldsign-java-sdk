import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.ContactsApi;
import com.boldsign.model.ContactDetails;
import com.boldsign.model.PhoneNumber;
import com.boldsign.model.CreateContactResponse;
import java.util.ArrayList;
import java.util.List;

public class ContactCreate
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            ContactsApi contactsApi = new ContactsApi(apiClient);
            List<ContactDetails> contactDetailsList = new ArrayList<>();
            ContactDetails contact = new ContactDetails();
            contact.setEmail("luthercooper@cubeflakes.com");
            contact.setName("LutherCooper");
            contact.setJobTitle("Developer");
            contact.setCompanyName("CubeFlakes");
            PhoneNumber phone = new PhoneNumber();
            phone.setCountryCode("+91");
            phone.setNumber("8807799764");
            contact.setPhoneNumber(phone);
            contactDetailsList.add(contact);
            CreateContactResponse createContactResponse = contactsApi.createContact(contactDetailsList);
            System.out.println("Contacts created successfully:"+createContactResponse);
        }
        catch (ApiException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
