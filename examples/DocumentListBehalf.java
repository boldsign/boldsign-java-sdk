import java.time.OffsetDateTime;
import java.util.List;
import java.util.ArrayList;
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.BehalfDocumentRecords;

public class DocumentListBehalf 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            Integer page = 1;
            String pageType = "BehalfOfOthers";
            List<String> emailAddress = new ArrayList<>();
            emailAddress.add("luthercooper@cubeflakes.com");
            List<String> signers = new ArrayList<>();
            signers.add("richard@cubeflakes.com");
            signers.add("david@cubeflakes.com");
            Integer pageSize = 10;
            OffsetDateTime startDate = OffsetDateTime.parse("2023-01-01T00:00:00+00:00");
            List<String> status = new ArrayList<>();
            status.add("None");
            OffsetDateTime endDate = OffsetDateTime.parse("2023-12-31T23:59:59+00:00");
            String searchkey = "documents";
            List<String> labels = new ArrayList<>();
            labels.add("Tags");
            Long nextCursor = 1689815402493L; 
            List<String> brandIds = new ArrayList<>();
            brandIds.add("YOUR_BRAND_ID ");
            BehalfDocumentRecords behalfDocumentsResponse = documentApi.behalfDocuments(
                page,
                pageType,
                emailAddress,
                signers,
                pageSize,
                startDate,
                status,
                endDate,
                searchkey,
                labels,
                nextCursor,
                brandIds
            );
            System.out.println("Documents on behalf retrieved successfully:");
            System.out.println(behalfDocumentsResponse); 
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