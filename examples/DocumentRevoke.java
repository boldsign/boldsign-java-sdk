import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.RevokeDocument;

public class DocumentRevoke 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            RevokeDocument revokeDocument = new RevokeDocument();
            revokeDocument.setMessage("This is document revoke message");
            String documentId = "DOCUMENT_ID";
            documentApi.revokeDocument(documentId, revokeDocument);
            System.out.println("Document revoked successfully.");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}