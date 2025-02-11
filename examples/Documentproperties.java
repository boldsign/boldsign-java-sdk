import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.DocumentProperties;

public class Documentproperties 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            String documentId = "DOCUMENT_ID"; 
            DocumentProperties getPropertiesResponse = documentApi.getProperties(documentId);
            System.out.println("Document Properties: " + getPropertiesResponse);
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        }
    }
}