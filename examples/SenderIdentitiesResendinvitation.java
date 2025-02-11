import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.SenderIdentitiesApi;

public class SenderIdentitiesResendinvitation 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            SenderIdentitiesApi senderIdentitiesApi = new SenderIdentitiesApi(apiClient);
            String email = "david@cubeflakes.com"; 
            senderIdentitiesApi.resendInvitationSenderIdentities(email);
            System.out.println("Invitation sent successfully to: " + email);
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        }
    }
}