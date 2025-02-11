import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.ContactsApi;

public class ContactDelete 
{
    public static void main(String[] args) 
    {
        try 
        {           
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            ContactsApi contactsApi = new ContactsApi(apiClient);
            String contactId = "YOUR_CONTACT_ID";  
            contactsApi.deleteContacts(contactId); 
            System.out.println("Contact deleted successfully!");
        }
        catch (ApiException e) 
        {         
            System.err.println("API error: " + e.getMessage());
        } 
        catch (Exception e) 
        {            
            System.err.println("Error: " + e.getMessage());
        }
    }
}