import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.DocumentTags;

public class DocumentAddTags 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            DocumentTags documentTags = new DocumentTags();
            documentTags.setDocumentId("YOUR_DOCUMENT_ID");
            documentTags.addTagsItem("test");
            documentTags.addTagsItem("api");
            documentApi.addTag(documentTags);
            System.out.println("Tags added successfully.");
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