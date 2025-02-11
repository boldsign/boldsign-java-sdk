import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.UserApi;
import com.boldsign.model.CreateUser;
import java.util.Arrays;
 
public class UserCreate
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            UserApi userApi = new UserApi(apiClient);
            CreateUser userRequest = new CreateUser();
            userRequest.setEmailId("luthercooper@cubeflakes.com");
            userRequest.setTeamId("YOUR_TEAM_ID");
            userRequest.setUserRole(CreateUser.UserRoleEnum.TEAM_ADMIN);
            userApi.createUser(Arrays.asList(userRequest));
            System.out.println("User created successfully!");
        }
        catch (ApiException e)
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}