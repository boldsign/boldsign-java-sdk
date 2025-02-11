import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.EmbeddedTemplateEditRequest;
import com.boldsign.model.EmbeddedTemplateEdited;

public class TemplateEmbeddedEdit
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            String templateId = "YOUR_TEMPLATE_ID";
            EmbeddedTemplateEditRequest embeddedTemplateEditRequest = new EmbeddedTemplateEditRequest();
            embeddedTemplateEditRequest.setShowToolbar(true);
            embeddedTemplateEditRequest.setShowNavigationButtons(false);
            embeddedTemplateEditRequest.setShowSaveButton(false);
            embeddedTemplateEditRequest.setShowPreviewButton(true);
            embeddedTemplateEditRequest.setShowCreateButton(false);
            embeddedTemplateEditRequest.setShowTooltip(false);
            EmbeddedTemplateEdited editUrl = templateApi.getEmbeddedTemplateEditUrl(templateId,embeddedTemplateEditRequest);
            System.out.println("Template Edit URL: " + editUrl);
        }
        catch (ApiException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}