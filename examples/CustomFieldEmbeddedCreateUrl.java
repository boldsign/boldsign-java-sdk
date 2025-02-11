import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.CustomFieldApi;
import com.boldsign.model.EmbeddedCustomFieldCreated;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class CustomFieldEmbeddedCreateUrl
{
    public static void main(String[] args)
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            CustomFieldApi customFieldApi =new CustomFieldApi(apiClient);
            String brandId = "YOUR_BRAND_ID";
            String linkValidTillStr = "2025-01-20T09%3A12%3A28Z";
            String decodedLinkValidTillStr = URLDecoder.decode(linkValidTillStr, StandardCharsets.UTF_8);
            OffsetDateTime linkValidTill = OffsetDateTime.parse(decodedLinkValidTillStr, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            EmbeddedCustomFieldCreated embeddedCustomFieldResponse = customFieldApi.embedCustomField(brandId, linkValidTill);
            System.out.println("Embedded Custom Field Response: " + embeddedCustomFieldResponse);
        }
        catch (ApiException e) 
        {
            System.err.println("Error message: " + e.getMessage());
        }
    }
}