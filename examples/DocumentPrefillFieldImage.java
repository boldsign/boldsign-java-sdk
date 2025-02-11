import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.PrefillField;
import com.boldsign.model.PrefillFieldRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
 
public class DocumentPrefillFieldImage 
{
    public static void main(String[] args) throws IOException 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            PrefillField prefillField = new PrefillField();
            prefillField.setId("image_1qXtm");
            prefillField.setValue("data:image/png;base64," + Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get("D:/Boldsign/Github/java-sdk-recheck-examples/open-api-sdk/java/sdk/examples/documents/Screenshot (25).png"))));
            PrefillFieldRequest prefillFieldRequest = new PrefillFieldRequest();
            prefillFieldRequest.setFields(Arrays.asList(prefillField));
            String documentId = "DOCUMENT_ID";
            documentApi.prefillFields(documentId, prefillFieldRequest);
            System.out.println("Fields have been prefilled successfully.");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred while pre-filling fields: " + e.getMessage());
        }
    }
}