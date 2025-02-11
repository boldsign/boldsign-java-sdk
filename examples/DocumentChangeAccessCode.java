import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.AccessCodeDetails;

public class DocumentChangeAccessCode 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            AccessCodeDetails accessCodeDetails = new AccessCodeDetails();
            accessCodeDetails.setAccessCode("YOUR_ACCESS_CODE"); 
            String documentId = "DOCUMENT_ID";
            String emailId = "alexgayle@cubeflakes.com";
            Integer zorder = 2;
            documentApi.changeAccessCode(documentId, accessCodeDetails, emailId, zorder);
            System.out.println("Access code changed successfully.");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}