import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.RemoveAuthentication;

public class DocumentRemoveAuthentication 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            RemoveAuthentication removeAuthentication = new RemoveAuthentication();
            removeAuthentication.setEmailId("alexgayle@cubeflakes.com"); 
            String documentId = "DOCUMENT_ID"; 
            documentApi.removeAuthentication(documentId, removeAuthentication);
            System.out.println("Authentication removed successfully for document: " + documentId);
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        }
    }
}