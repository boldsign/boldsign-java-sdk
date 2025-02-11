import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.DocumentCreated;
import com.boldsign.model.DocumentSigner;
import com.boldsign.model.FormField;
import com.boldsign.model.Rectangle;
import com.boldsign.model.SendForSign;
import com.boldsign.model.FormField.FieldTypeEnum;

public class DocumentSend 
{
    public static void main(String[] args) throws ApiException 
    {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setApiKey("YOUR_API_KEY");
        DocumentApi documentApi = new DocumentApi(apiClient);

        List<File> files = new ArrayList<File>();
        File file = new File("examples/documents/agreement.pdf");
        files.add(file);

        List<FormField> formFields = new ArrayList<FormField>();

        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);

        List<FormField> formFields1 = new ArrayList<FormField>();
        FormField signatureField1 = new FormField();
        signatureField1.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField1.setPageNumber(1);
        Rectangle rectangle1 = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField1.setBounds(rectangle1);
        formFields1.add(signatureField1);

        List<DocumentSigner> signers = new ArrayList<DocumentSigner>();

        DocumentSigner signer = new DocumentSigner();
        signer.setName("Signer");
        signer.setEmailAddress("hankwhite@cubeflakes.com");
        signer.setFormFields(formFields);
        signers.add(signer);

        DocumentSigner signer1 = new DocumentSigner();
        signer1.setName("Signer1");
        signer1.setEmailAddress("luthercooper@cubeflakes.com");
        signer1.setFormFields(formFields1);
        signers.add(signer1);

        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        DocumentCreated document = documentApi.sendDocument(sendForSign);
        System.out.println(document.getDocumentId());
    }
}