import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.EmbeddedDocumentRequest;
import com.boldsign.model.EmbeddedSendCreated;
import com.boldsign.model.DocumentSigner;
import com.boldsign.model.FormField;
import com.boldsign.model.Rectangle;
import java.io.File;
import java.net.URI;
import java.util.Arrays;

public class DocumentEmbeddedRequestUrl 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            Rectangle rectangle = new Rectangle();
            rectangle.setX(50f);
            rectangle.setY(50f);
            rectangle.setWidth(200f);
            rectangle.setHeight(30f);
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE); 
            formField.setPageNumber(1);
            formField.setBounds(rectangle);
            DocumentSigner documentSigner = new DocumentSigner();
            documentSigner.setName("Signer Name 1");
            documentSigner.setEmailAddress("signer1@boldsign.dev"); 
            documentSigner.setSignerOrder(1);
            documentSigner.setSignerType(documentSigner.getSignerType()); 
            documentSigner.setAuthenticationCode("1123");
            documentSigner.setPrivateMessage("This is private message for signer");
            documentSigner.setFormFields(Arrays.asList(formField));
            documentSigner.setLocale(documentSigner.getLocale()); 
            EmbeddedDocumentRequest embeddedDocumentRequest = new EmbeddedDocumentRequest();
            embeddedDocumentRequest.setTitle("Sent from API Java SDK");
            embeddedDocumentRequest.setShowToolbar(true);
            embeddedDocumentRequest.setShowNavigationButtons(true);
            embeddedDocumentRequest.setShowPreviewButton(true);
            embeddedDocumentRequest.setShowSendButton(true);
            embeddedDocumentRequest.setShowSaveButton(true);
            embeddedDocumentRequest.setSendViewOption(embeddedDocumentRequest.getSendViewOption()); 
            embeddedDocumentRequest.setLocale(embeddedDocumentRequest.getLocale()); 
            embeddedDocumentRequest.setShowTooltip(false);
            embeddedDocumentRequest.setRedirectUrl(URI.create("https://boldsign.dev/sign/redirect"));
            embeddedDocumentRequest.setMessage("This is document message sent from API Java SDK");
            embeddedDocumentRequest.setEnableSigningOrder(false);
            embeddedDocumentRequest.setSigners(Arrays.asList(documentSigner));
            File file = new File("examples/documents/agreement.pdf"); 
            embeddedDocumentRequest.setFiles(Arrays.asList(file)); 
            EmbeddedSendCreated response = documentApi.createEmbeddedRequestUrlDocument(embeddedDocumentRequest);
            System.out.println("Embedded Document URL: " + response.getSendUrl());
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