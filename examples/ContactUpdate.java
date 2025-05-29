import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.ContactsApi; 
import com.boldsign.model.ContactDetails;
import com.boldsign.model.PhoneNumber;

public class ContactUpdate 
{
    public static void main(String[] args) 
    {
        try 
        {           
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");  
            ContactsApi contactApi = new ContactsApi(apiClient);  
            String id = "YOUR_CONTACT_ID"; 
            ContactDetails updateContact = new ContactDetails();
            updateContact.setEmail("test1711@gmail.com");
            updateContact.setName("Test_Engineer");
            updateContact.setCompanyName("Flakes");
            updateContact.setJobTitle("Test");
            PhoneNumber phone = new PhoneNumber();
            phone.setCountryCode("+91");
            phone.setNumber("8807799764");
            updateContact.setPhoneNumber(phone);
            contactApi.updateContact(id, updateContact);  
            System.out.println("Contact updated successfully!");
        } 
        catch (ApiException e) 
        {        
            System.err.println("Error occurred: "+ e.getMessage());
        } 
        catch (Exception e) 
        {          
            System.err.println("Unexpected error occurred: "+ e.getMessage());
        }
    }
}