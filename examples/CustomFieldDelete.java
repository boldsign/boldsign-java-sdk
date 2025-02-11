import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.CustomFieldApi;

public class CustomFieldDelete
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            CustomFieldApi customFieldApi =new CustomFieldApi(apiClient);
            String customFieldId = "YOUR_CUSTOMFIELD_ID";
            customFieldApi.deleteCustomField(customFieldId);
            System.out.println("Custom field with ID " + customFieldId + " deleted successfully.");
        }
        catch (ApiException e)
        {
            System.err.println("Error message: " + e.getMessage());
        }
    }
}