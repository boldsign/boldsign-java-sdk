import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.DocumentTags;
import java.util.ArrayList;

public class DocumentDeleteTags 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            DocumentTags documentTags = new DocumentTags();
            documentTags.setDocumentId("DOCUMENT_ID");
            ArrayList<String> tags = new ArrayList<>();
            tags.add("test");
            tags.add("api");
            documentTags.setTags(tags); 
            documentApi.deleteTag(documentTags);
            System.out.println("Tags deleted successfully.");
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