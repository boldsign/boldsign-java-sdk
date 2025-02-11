import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.TemplateTag;
import java.util.Arrays;

public class TemplateTagDelete
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            TemplateTag templateTag = new TemplateTag();
            templateTag.setTemplateId("YOUR_TEMPLATE_ID");
            templateTag.setDocumentLabels(Arrays.asList("test", "api"));
            templateTag.setTemplateLabels(Arrays.asList("test", "api"));
            templateApi.deleteTag(templateTag);
            System.out.println("Tag deleted successfully.");
        }
        catch (ApiException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}