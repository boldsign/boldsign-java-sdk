import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TeamsApi;
import com.boldsign.model.TeamListResponse;

public class TeamList
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TeamsApi teamsApi = new TeamsApi(apiClient);
            Integer page = 1;
            Integer pageSize = 10;
            String filter = "";
            TeamListResponse teamListResponse = teamsApi.listTeams(page,pageSize,filter);
            System.out.println("Team List: " + teamListResponse);
        }
        catch (ApiException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}