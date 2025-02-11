import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.EditTemplateRequest;
import com.boldsign.model.FormField;
import com.boldsign.model.Rectangle;
import com.boldsign.model.TemplateRole;
import java.util.Arrays;

public class TemplateEdit
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            formField.setBounds(bounds);
            TemplateRole role = new TemplateRole();
            role.setIndex(1);
            role.setName("Manager");
            role.setDefaultSignerName("Alex Gayle");
            role.setDefaultSignerEmail("alexgayle@boldsign.dev");
            role.setSignerOrder(1);
            role.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            role.setFormFields(Arrays.asList(formField));
            EditTemplateRequest editTemplateRequest = new EditTemplateRequest();
            editTemplateRequest.setTitle("A new title for template");
            editTemplateRequest.setEnableSigningOrder(false);
            editTemplateRequest.setRoles(Arrays.asList(role));
            String templateId = "YOUR_TEMPLATE_ID";
            templateApi.editTemplate(templateId, editTemplateRequest);
            System.out.println("Template edited successfully!");
        }
        catch (ApiException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
