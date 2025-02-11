import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TeamsApi;
import com.boldsign.model.TeamUpdateRequest;

public class TeamUpdate
{
    public static void main(String[] args) {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TeamsApi teamsApi = new TeamsApi(apiClient);
            TeamUpdateRequest teamUpdateRequest = new TeamUpdateRequest();
            teamUpdateRequest.setTeamId("YOUR_TEAM_ID"); 
            teamUpdateRequest.setTeamName("Sales");
            teamsApi.updateTeam(teamUpdateRequest);
            System.out.println("Team updated successfully: " );
        }
        catch (ApiException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}