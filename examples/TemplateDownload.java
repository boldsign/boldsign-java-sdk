import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;

public class TemplateDownload
{
    public static void main(String[] args)
    {
        try
        {    
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            String templateId = "YOUR_TEMPLATE_ID";
            String onBehalfof = "david@cubeflakes.com";
            templateApi.download(templateId, onBehalfof);
            System.out.println("Template downloaded successfully");
        }
        catch (ApiException e)
        {
            System.err.println("API call failed: " + e.getMessage());
        }
    }
}