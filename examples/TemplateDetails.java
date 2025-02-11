import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.TemplateProperties;

public class TemplateDetails
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            String templateId = "YOUR_TEMPLATE_ID";
            TemplateProperties templatePropertiesResponse = templateApi.getProperties(templateId);
            System.out.println("Template Properties:");
            System.out.println(templatePropertiesResponse);
        }
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}