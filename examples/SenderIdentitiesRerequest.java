import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.SenderIdentitiesApi;

public class SenderIdentitiesRerequest
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            SenderIdentitiesApi senderIdentitiesApi = new SenderIdentitiesApi(apiClient);
            String email = "luthercooper@cubeflakes.com"; 
            senderIdentitiesApi.reRequestSenderIdentities(email);
            System.out.println("Sender identity re-requested successfully for: " + email);
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        } 
    }
}