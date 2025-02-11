import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.UserApi;
import com.boldsign.model.UserProperties;

public class UserGet 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            UserApi userApi = new UserApi(apiClient);
            String userId = "YOUR_USER_ID";
            UserProperties userDetails = userApi.getUser(userId);
            System.out.println("User ID: " + userDetails.getUserId());
            System.out.println("User Email: " + userDetails.getEmail());
            System.out.println("User Role: " + userDetails.getRole());
            System.out.println("User Name: " + userDetails.getFirstName());
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}