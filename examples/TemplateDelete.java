import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;

public class TemplateDelete
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            String templateId = "YOUR_TEMPLATE_ID";
            templateApi.deleteTemplate(templateId, null);
            System.out.println("Template deleted successfully with ID: " + templateId);
        } 
        catch (ApiException e) 
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}