
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.FormField;
import com.boldsign.model.MergeAndSendForSignForm;
import com.boldsign.model.Rectangle;
import com.boldsign.model.Role;
import java.util.Arrays;
import java.util.Collections;

public class TemplateSendDocumentUsingMultipleTemplate {

    public static void main(String[] args) {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setApiKey("YOUR_API_KEY");
        TemplateApi templateApi = new TemplateApi(apiClient);

        try {
            FormField formField1 = new FormField();
            formField1.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField1.setPageNumber(1);
            Rectangle bounds1 = new Rectangle();
            bounds1.setX(100f);
            bounds1.setY(50f);
            bounds1.setWidth(100f);
            bounds1.setHeight(100f);
            formField1.setBounds(bounds1);

            // Role 1
            Role role1 = new Role();
            role1.setRoleIndex(1);
            role1.setSignerName("Divya");
            role1.setSignerEmail("divya.boopathy+9989@syncfusion.com");
            role1.setSignerOrder(1);
            role1.setSignerType(Role.SignerTypeEnum.SIGNER);
            role1.setSignerRole("Manager");
            role1.setFormFields(Collections.singletonList(formField1));

            // Form field for signer 2
            FormField formField2 = new FormField();
            formField2.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField2.setPageNumber(1);
            Rectangle bounds2 = new Rectangle();
            bounds2.setX(250f);  // Adjust position
            bounds2.setY(50f);
            bounds2.setWidth(100f);
            bounds2.setHeight(100f);
            formField2.setBounds(bounds2);

            // Role 2
            Role role2 = new Role();
            role2.setRoleIndex(2);
            role2.setSignerName("Kumar");
            role2.setSignerEmail("kumar.test+9989@syncfusion.com");
            role2.setSignerOrder(2);
            role2.setSignerType(Role.SignerTypeEnum.SIGNER);
            role2.setSignerRole("Reviewer");
            role2.setFormFields(Collections.singletonList(formField2));

            // Merge and send form
            MergeAndSendForSignForm mergeAndSendForm = new MergeAndSendForSignForm();
            mergeAndSendForm.setTitle("Invitation form");
            mergeAndSendForm.setMessage("Kindly review and sign this.");
            mergeAndSendForm.setRoles(Arrays.asList(role1, role2));
            mergeAndSendForm.setTemplateIds(Arrays.asList(
                    "YOUR_TEMPLATE_ID_1",
                    "YOUR_TEMPLATE_ID_2"  
            ));

            templateApi.mergeAndSend(mergeAndSendForm);
        } catch (ApiException e) {
            System.err.println("Error message: " + e.getMessage());
        }

    }
}
