import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.FormField;
import com.boldsign.model.Rectangle;
import com.boldsign.model.Role;
import com.boldsign.model.SendForSignFromTemplateForm;

public class TemplateSendDocument
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            Rectangle bounds = new Rectangle();
            bounds.setX(100f);
            bounds.setY(50f);
            bounds.setWidth(100f);
            bounds.setHeight(100f);
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            formField.setBounds(bounds);
            Role role = new Role();
            role.setSignerName("Richard");
            role.setSignerEmail("richard@cubeflakes.com");
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setFormFields(java.util.Arrays.asList(formField));
            String templateId = "87d75789-1788-4d3f-a621-1c516c376b43";  
            SendForSignFromTemplateForm sendForSignFromTemplate = new SendForSignFromTemplateForm();
            templateApi.sendUsingTemplate(templateId, sendForSignFromTemplate);
            System.out.println("Document sent for signing using template successfully!");
        }
        catch (ApiException e)
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}