import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.TemplateTag;
import java.util.Arrays;

public class TemplateAddTag
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            TemplateTag addTag = new TemplateTag();
            addTag.setTemplateId("YOUR_TEMPLATE_ID");
            addTag.setDocumentLabels(Arrays.asList("test", "api"));
            addTag.setTemplateLabels(Arrays.asList("test", "api"));
            templateApi.addTag(addTag);
            System.out.println("Tag added successfully.");
        }
        catch (ApiException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}