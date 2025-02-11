import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.FormField;
import com.boldsign.model.Rectangle;
import com.boldsign.model.Role;
import com.boldsign.model.SendForSignFromTemplateForm;
import com.boldsign.model.ReminderSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplateSendDocument
{
    public static void main(String[] args)
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(100f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(50f);
            formField.setBounds(bounds);
            Role role = new Role();
            role.setRoleIndex(50);
            role.setSignerName("Richard");
            role.setSignerOrder(1);
            role.setSignerEmail("richard@cubeflakes.com");
            role.setPrivateMessage("Please check and sign the document.");
            role.setAuthenticationCode("281028");
            role.setEnableEmailOTP(false);
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setSignerRole("Manager");
            role.setFormFields(Arrays.asList(formField));
            role.setLocale(Role.LocaleEnum.EN);
            String templateId = "YOUR_TEMPLATE_ID";
            SendForSignFromTemplateForm sendForSignFromTemplate =new SendForSignFromTemplateForm();
            List<File> files = new ArrayList<File>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            sendForSignFromTemplate.setFiles(files);
            sendForSignFromTemplate.setTitle("Invitation form");
            sendForSignFromTemplate.setMessage("Kindly review and sign this.");
            sendForSignFromTemplate.setRoles(Arrays.asList(role));
            sendForSignFromTemplate.setLabels(Arrays.asList("Invitation"));
            sendForSignFromTemplate.setDisableEmails(false);
            sendForSignFromTemplate.setDisableSMS(false);
            sendForSignFromTemplate.setHideDocumentId(true);
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(false);
            sendForSignFromTemplate.setReminderSettings(reminderSettings);
            sendForSignFromTemplate.setExpiryValue(60L);
            sendForSignFromTemplate.setDisableExpiryAlert(true);
            sendForSignFromTemplate.setEnablePrintAndSign(true);
            sendForSignFromTemplate.setEnableReassign(true);
            sendForSignFromTemplate.setEnableSigningOrder(true);
            sendForSignFromTemplate.setRoleRemovalIndices(Arrays.asList(1, 2));
            templateApi.sendUsingTemplate(templateId, sendForSignFromTemplate);
            System.out.println("Document sent for signing using template successfully!");
        }
        catch (ApiException e)
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}