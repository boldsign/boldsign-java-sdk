import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.ContactsApi;
import com.boldsign.model.ContactsList; 

public class ContactList
{
    public static void main(String[] args) 
    {
        try 
        {          
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");            
            ContactsApi contactsApi = new ContactsApi(apiClient);
            Integer page = 1; 
            Integer pageSize = 10; 
            String SearchKey = " "; 
            String  ContactType = "MyContacts";            
            ContactsList listContactResponse = contactsApi.contactUserList(page, pageSize, SearchKey,ContactType);            
            System.out.println("Contact list retrieved: " + listContactResponse);
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