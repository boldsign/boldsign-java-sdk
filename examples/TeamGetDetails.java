import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TeamsApi;
import com.boldsign.model.TeamResponse;

public class TeamGetDetails
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TeamsApi teamsApi = new TeamsApi(apiClient);
            String teamId = "YOUR_TEAM_ID"; 
            TeamResponse teamDetailsResponse = teamsApi.getTeam(teamId);
            System.out.println("Team details: " + teamDetailsResponse);
        } 
        catch (ApiException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}