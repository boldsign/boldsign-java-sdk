import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.FormField;
import com.boldsign.model.Rectangle;
import com.boldsign.model.DocumentSigner;
import com.boldsign.model.SendForSign;
import com.boldsign.model.ReminderSettings;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class DocumentSendOnBehalf
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(50f);
            bounds.setWidth(200f);
            bounds.setHeight(25f);
            formField.setBounds(bounds);
            DocumentSigner documentSigner = new DocumentSigner();
            documentSigner.setName("David");
            documentSigner.setEmailAddress("david@cubeflakes.com");
            documentSigner.setSignerOrder(1);
            documentSigner.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            documentSigner.setFormFields(Arrays.asList(formField));
            documentSigner.setLocale(documentSigner.getLocale());
            SendForSign sendForSign = new SendForSign();
            sendForSign.setTitle("SDK Document Test case");
            sendForSign.setMessage("Testing document from SDK integration test case");
            List<File> files = Arrays.asList(new File("examples/documents/agreement.pdf")); 
            sendForSign.setFiles(files);
            sendForSign.setDisableExpiryAlert(false);
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(false);
            sendForSign.setReminderSettings(reminderSettings);
            sendForSign.setEnableReassign(true);
            sendForSign.setMessage("Please sign this.");
            sendForSign.setSigners(Arrays.asList(documentSigner));
            sendForSign.setEnablePrintAndSign(false);
            sendForSign.setAutoDetectFields(false);
            sendForSign.setOnBehalfOf("luthercooper@cubeflakes.com");
            sendForSign.setEnableSigningOrder(false);
            sendForSign.setUseTextTags(false);
            sendForSign.setTitle("Agreement");
            sendForSign.setHideDocumentId(false);
            sendForSign.setExpiryDateType(SendForSign.ExpiryDateTypeEnum.DAYS);
            sendForSign.setExpiryValue(60L); 
            sendForSign.setDisableEmails(false);
            sendForSign.setDisableSMS(false);
            documentApi.sendDocument(sendForSign);
            System.out.println("Document sent for signing successfully!");
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}