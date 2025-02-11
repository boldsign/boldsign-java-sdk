package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.TeamsApi;
import com.boldsign.model.*;
import org.junit.jupiter.api.*;
import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TeamsApiTest {
    private static TeamsApi teamsApi;
    private static ApiClient apiClient;
    private static String teamId;
    private static String teamName;

    private static String randomNumbers() {
        Random rand = new Random();
        int rangeStart = (int) Math.pow(10, 3 - 1);
        int rangeEnd = (int) (Math.pow(10, 3) - 1);
        int randomNum = rand.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        return String.valueOf(randomNum);
    }

    @BeforeAll
    public static void setup() {
        teamId = null;
        teamName = null;
        String apiKey = System.getenv("API_KEY");
        String hostUrl = System.getenv("HOST_URL");
        if (apiKey == null || hostUrl == null) {
            throw new IllegalArgumentException("Environment variables 'APIKey' or 'hostUrl' are not set.");
        }
        apiClient = new ApiClient();
        apiClient.setApiKey(apiKey);
        apiClient.setBasePath(hostUrl);
        teamsApi = new TeamsApi(apiClient);
        String randomStr = randomNumbers();
        teamName = "sdktestingteam" + randomStr;
    }

    @Test
    @Order(1)
    public void testCreateTeamPositive() throws Exception {
        CreateTeamRequest createTeamRequest = new CreateTeamRequest();
        createTeamRequest.setTeamName(teamName);
        TeamCreated response = teamsApi.createTeam(createTeamRequest);
        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getTeamId());
        Assertions.assertEquals(teamName, createTeamRequest.getTeamName());
        teamId = response.getTeamId();
    }

    @Test
    @Order(2)
    public void testCreateTeamNegative() throws Exception {
        try {
            CreateTeamRequest createTeamRequest = new CreateTeamRequest();
            createTeamRequest.setTeamName(teamName);
            TeamCreated response = teamsApi.createTeam(createTeamRequest);
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getResponseBody().startsWith("{\"error\":\"Team Name already exists\"}"));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(3)
    public void testGetTeamPositive() throws Exception {
        TeamResponse response = teamsApi.getTeam(teamId);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(teamId, response.getTeamId());
        Assertions.assertEquals(teamName, response.getTeamName());
    }

    @Test
    @Order(4)
    public void testGetTeamNegative() throws Exception {
        String invalidTeamId = "invalid-team-id";
        try {
            TeamResponse response = teamsApi.getTeam(invalidTeamId);
            Assertions.fail("Expected exception for invalid teamId, but the response was not null.");
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("Please provide valid team ID"));
            System.out.println("Expected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(5)
    public void testUpdateTeamPositive() throws Exception {
        TeamUpdateRequest updateTeamRequest = new TeamUpdateRequest();
        updateTeamRequest.setTeamName("update"+teamName);
        updateTeamRequest.setTeamId(teamId);
        teamsApi.updateTeam(updateTeamRequest);
        Assertions.assertNotNull(updateTeamRequest);
    }

    @Test
    @Order(6)
    public void testUpdateTeamNegative() throws Exception {
        TeamUpdateRequest updateTeamRequest = new TeamUpdateRequest();
        updateTeamRequest.setTeamId("invalid-team-id");
        updateTeamRequest.setTeamName(teamName);
        try {
            teamsApi.updateTeam(updateTeamRequest);
            Assertions.fail("Expected exception due to invalid teamId");
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("Please provide valid team ID"));
        }
    }
    
    @Test
    @Order(7)
    public void testListTeamsPositive() throws Exception {
        Integer page = 1;
        Integer pagesize = 10;
        String search = "";
        TeamListResponse response = teamsApi.listTeams(page, pagesize, search);
        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getPageDetails());
    }

    @Test
    @Order(8)
    public void testListTeamsNegative() throws Exception {
        Integer invalidPage = -1;
        Integer invalidPageSize = 10;
        String invalidSearch = "";
        try {
            TeamListResponse response = teamsApi.listTeams(invalidPage, invalidPageSize, invalidSearch);
            Assertions.fail("Expected ApiException due to invalid page number or search term");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Invalid page number") || e.getMessage().contains("Page number should be greater than 0"));
            System.out.println("Expected error occurred: " + e.getMessage());
        }
    }
}