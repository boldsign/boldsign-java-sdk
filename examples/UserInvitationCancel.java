import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.UserApi;

public class UserInvitationCancel
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            UserApi userApi = new UserApi(apiClient);
            String userId = "YOUR_USER_ID";  
            userApi.cancelInvitation(userId);
            System.out.println("Invitation canceled successfully!");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}