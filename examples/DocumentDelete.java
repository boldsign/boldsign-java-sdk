import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;

public class DocumentDelete 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            String documentId = "DOCUMENT_ID";
            Boolean deletePermanently = false;  
            documentApi.deleteDocument(documentId, deletePermanently);
            System.out.println("Document deleted successfully!");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred while calling the API: " + e.getMessage());
        }
    }
}