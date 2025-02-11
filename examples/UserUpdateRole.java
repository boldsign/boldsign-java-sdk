import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.UserApi;
import com.boldsign.model.UpdateUser;

public class UserUpdateRole 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            UserApi userApi = new UserApi(apiClient);
            UpdateUser updateUserRequest = new UpdateUser();  
            updateUserRequest.setUserId("YOUR_USER_ID");  
            updateUserRequest.setUserRole(UpdateUser.UserRoleEnum.TEAM_ADMIN); 
            userApi.updateUser(updateUserRequest);  
            System.out.println("Userrole updated successfully!");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
