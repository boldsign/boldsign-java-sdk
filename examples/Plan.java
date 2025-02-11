import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.PlanApi;
import com.boldsign.model.BillingViewModel;

public class Plan 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            PlanApi planApi = new PlanApi(apiClient);
            BillingViewModel creditsCount = planApi.apiCreditsCount(); 
            System.out.println("API Credits Count: " + creditsCount);
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        }
    }
}