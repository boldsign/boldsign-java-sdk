import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TeamsApi;
import com.boldsign.model.CreateTeamRequest;
import com.boldsign.model.TeamCreated; 

public class TeamCreate
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TeamsApi teamsApi = new TeamsApi(apiClient);
            CreateTeamRequest createTeamRequest = new CreateTeamRequest();
            createTeamRequest.setTeamName("HR");
            TeamCreated createTeamResponse = teamsApi.createTeam(createTeamRequest);
            System.out.println("Team created successfully: ");
            System.out.println("Team ID: " + createTeamResponse.getTeamId());
        } 
        catch (ApiException e) 
        {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }
}