import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.ExtendExpiry;

public class DocumentExtendExpiry 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            ExtendExpiry extendExpiry = new ExtendExpiry();
            extendExpiry.setNewExpiryValue("2025-04-15T10:58:04.863Z"); 
            extendExpiry.setWarnPrior(true); 
            String documentId = "DOCUMENT_ID";
            documentApi.extendExpiry(documentId, extendExpiry);
            System.out.println("Expiry date extended successfully.");
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