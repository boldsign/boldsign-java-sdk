import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.EmbeddedCreateTemplateRequest;
import com.boldsign.model.TemplateRole;
import com.boldsign.model.EmbeddedTemplateCreated;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplateEmbeddedRequestLinkCreate
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Manager");
            EmbeddedCreateTemplateRequest embeddedCreateTemplateRequest = new EmbeddedCreateTemplateRequest();
            embeddedCreateTemplateRequest.setTitle("API template");
            embeddedCreateTemplateRequest.setDescription("API template description");
            embeddedCreateTemplateRequest.setDocumentTitle("API document title");
            embeddedCreateTemplateRequest.setDocumentMessage("API document message description");
            embeddedCreateTemplateRequest.setAllowMessageEditing(true);
            embeddedCreateTemplateRequest.setRoles(Arrays.asList(templateRole));  // Add the role to the list
            embeddedCreateTemplateRequest.setShowToolbar(true);
            embeddedCreateTemplateRequest.setShowNavigationButtons(true);
            embeddedCreateTemplateRequest.setShowPreviewButton(true);
            embeddedCreateTemplateRequest.setShowSaveButton(true);
            embeddedCreateTemplateRequest.setLocale(embeddedCreateTemplateRequest.getLocale());
            embeddedCreateTemplateRequest.setShowTooltip(false);
            embeddedCreateTemplateRequest.setViewOption(embeddedCreateTemplateRequest.getViewOption());
            List<File> files = new ArrayList<File>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            embeddedCreateTemplateRequest.setFiles(files);
            EmbeddedTemplateCreated embeddedTemplateCreated = templateApi.createEmbeddedTemplateUrl(embeddedCreateTemplateRequest);
            URI embeddedTemplateUrl = embeddedTemplateCreated.getCreateUrl();
            System.out.println("Embedded Template URL: " + embeddedTemplateUrl);
        }
        catch (ApiException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}