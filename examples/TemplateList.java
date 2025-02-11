import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.TemplateRecords;

public class TemplateList
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            Integer page = 1;
            String templateType = "MyTemplates";
            Integer pageSize = 10;
            String searchkey ="Tests";
            List<String> onBehalfof = Arrays.asList("hankwhite@cubeflakes.com");
            List<String> createdBy = Arrays.asList("luthercooper@cubeflakes.com");
            List<String> templateLabels = Arrays.asList("null");
            OffsetDateTime startDate = OffsetDateTime.parse("2023-01-01T00:00:00+00:00"), endDate = OffsetDateTime.parse("2023-12-31T23:59:59+00:00");
            List<String> brandIds = Arrays.asList("YOUR_BRAND_ID");
            TemplateRecords listTemplatesResponse = templateApi.listTemplates(page,templateType,pageSize,searchkey,onBehalfof,createdBy,templateLabels,startDate,endDate,brandIds);
            System.out.println("Templates listed successfully:");
            System.out.println(listTemplatesResponse);
        }
        catch (ApiException e)
        {
            System.err.println("Error occurred: " +e.getMessage());
        }
    }
}