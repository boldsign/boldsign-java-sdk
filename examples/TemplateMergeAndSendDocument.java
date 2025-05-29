import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.FormField;
import com.boldsign.model.MergeAndSendForSignForm;
import com.boldsign.model.Rectangle;
import com.boldsign.model.Role;
import java.util.Arrays;

public class TemplateMergeAndSendDocument
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
            role.setRoleIndex(1);
            role.setSignerName("David");
            role.setSignerEmail("divya.boopathy+23@syncfusion.com");
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setSignerRole("Manager");
            role.setFormFields(Arrays.asList(formField));
            MergeAndSendForSignForm mergeAndSendForSign = new MergeAndSendForSignForm();
            mergeAndSendForSign.setTitle("Invitation form");
            mergeAndSendForSign.setMessage("Kindly review and sign this.");
            mergeAndSendForSign.setRoles(Arrays.asList(role));
            mergeAndSendForSign.setTemplateIds(Arrays.asList("Template-Id1", "Template-Id2"));
            templateApi.mergeAndSend(mergeAndSendForSign);
            System.out.println("Document sent for signing using merged templates successfully");
        } catch (ApiException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}