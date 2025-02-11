import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.UserApi;
import com.boldsign.model.UserRecords;  

public class UserList 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            UserApi userApi = new UserApi(apiClient);
            UserRecords response = userApi.listUsers(10, 1, null); 
            System.out.println("Response: " + response);
        } 
        catch (ApiException e) 
        { 
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}