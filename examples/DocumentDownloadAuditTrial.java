import java.io.File;
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;

public class DocumentDownloadAuditTrial 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            String documentId = "DOCUMENT_ID";
            String onBehalfof = "david@cubeflakes.com"; 
            System.out.println("Attempting to download audit log for document ID: " + documentId);
            File downloadAuditLogResponse = documentApi.downloadAuditLog(documentId, onBehalfof);
            System.out.println("Audit log downloaded successfully to: " + downloadAuditLogResponse.getAbsolutePath());
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}