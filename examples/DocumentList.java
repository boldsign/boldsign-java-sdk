import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.DocumentRecords;

public class DocumentList 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            Integer page=1;
           
            DocumentRecords listDocumentsResponse = documentApi.listDocuments(
                page,
                null,
                null,
                null,
                null,
                10,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );
            System.out.println("Documents:" + listDocumentsResponse);
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}