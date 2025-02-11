import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.ContactsApi;
import com.boldsign.model.ContactsDetails; 

public class ContactGet
{
    public static void main(String[] args) 
    {
        try 
        {           
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            ContactsApi contactApi = new ContactsApi(apiClient);
            String contactId = "YOUR_CONTACT_ID";  
            ContactsDetails contactDetails = contactApi.getContact(contactId); 
            System.out.println("Contact details retrieved successfully!");
            System.out.println("Name: " + contactDetails.getName());
            System.out.println("Email: " + contactDetails.getEmail());
            System.out.println("Company: " + contactDetails.getCompanyName());
            System.out.println("Job Title: " + contactDetails.getJobTitle());
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