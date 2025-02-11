package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.PlanApi;
import com.boldsign.model.BillingViewModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanApiTest {
    private static PlanApi planApi;
    private static ApiClient apiClient;

    @BeforeAll
    public static void setUp() {
        String apiKey = System.getenv("API_KEY");
        String hostUrl = System.getenv("HOST_URL");
        if (apiKey == null || hostUrl == null) {
            throw new IllegalArgumentException("Environment variables 'APIKey' or 'hostUrl' are not set.");
        }
        apiClient = new ApiClient();
        apiClient.setApiKey(apiKey);
        apiClient.setBasePath(hostUrl);
    }

    @BeforeEach
    public void setup() {
        planApi = new PlanApi(apiClient);
    }

    @Test
    public void testCreatePlanPositive() throws ApiException {
            BillingViewModel creditsCount = planApi.apiCreditsCount();
            Assertions.assertNotNull(creditsCount);
            Assertions.assertTrue(creditsCount.getBalanceCredits() >= 0);
        }
}