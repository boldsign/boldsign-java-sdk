import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.SenderIdentitiesApi;
import com.boldsign.model.SenderIdentityList;

public class SenderIdentitiesList 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            SenderIdentitiesApi senderIdentitiesApi = new SenderIdentitiesApi(apiClient);
            Integer page = 1;       
            Integer pageSize = 10;  
            String search = " ";     
            SenderIdentityList senderIdentityList = senderIdentitiesApi.listSenderIdentities(page, pageSize, search, null);
            System.out.println("Sender Identity List: " + senderIdentityList);
        } 
        catch (ApiException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}