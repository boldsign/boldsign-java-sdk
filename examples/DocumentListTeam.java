import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.TeamDocumentRecords;

public class DocumentListTeam 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            Integer page = 1;
            List<String> userId = new ArrayList<String>();
            userId.add("USER_ID");
            List<String> teamId = new ArrayList<String>();
            teamId.add("TEAM_ID");
            String transmitType = "Sent";
            Integer pageSize = 10;
            OffsetDateTime startDate = OffsetDateTime.parse("2024-01-01T00:00:00Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            List<String> status = new ArrayList<String>();
            status.add("None");
            OffsetDateTime endDate = OffsetDateTime.parse("2024-12-31T23:59:59Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            String searchkey = "document title";
            List<String> labels = new ArrayList<String>();
            labels.add("Tags");
            Long nextCursor = 233445L; 
            List<String> brandIDs = new ArrayList<String>();
            brandIDs.add("YOUR_BRAND_ID");
            TeamDocumentRecords teamDocumentsResponse = documentApi.teamDocuments(
                page,
                userId,
                teamId,
                transmitType,
                null,
                pageSize,
                startDate,
                status,
                endDate,
                searchkey,
                labels,
                nextCursor,
                brandIDs
            );
            System.out.println("Team Documents: " + teamDocumentsResponse);
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}