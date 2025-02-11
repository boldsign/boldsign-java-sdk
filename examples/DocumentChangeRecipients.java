import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.ChangeRecipient; 

public class DocumentChangeRecipients
{
    public static void main(String[] args) 
    {
        try 
        {            
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            String documentId = "DOCUMENT_ID"; 
            String oldSignerEmail = "david@cubeflakes.com"; 
            String reason = "Wrongly sent"; 
            String newSignerName = "David"; 
            String newSignerEmail = "luthercooper@cubeflakes.com";  
            ChangeRecipient changeRecipient = new ChangeRecipient();
            changeRecipient.setOldSignerEmail(oldSignerEmail);
            changeRecipient.setReason(reason);
            changeRecipient.setNewSignerName(newSignerName);
            changeRecipient.setNewSignerEmail(newSignerEmail);
            documentApi.changeRecipient(documentId, changeRecipient);
            System.out.println("Recipient changed successfully for document ID: " + documentId);
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