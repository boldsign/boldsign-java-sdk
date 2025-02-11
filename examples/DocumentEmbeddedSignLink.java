import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.EmbeddedSigningLink; 
import java.net.URI;
import java.time.OffsetDateTime;

public class DocumentEmbeddedSignLink 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            String documentId = "DOCUMENT_ID";
            String signerEmail = "david@cubeflakes.com"; 
            String countryCode = "COUNTRY_CODE ";
            String phoneNumber = "YOUR_PHONE_NUMBER";
            OffsetDateTime signLinkValidTill = OffsetDateTime.parse("2023-01-01T00:00:00+00:00");
            URI redirectUrl = URI.create("https://www.syncfusion.com/"); 
            EmbeddedSigningLink embeddedSignLink = documentApi.getEmbeddedSignLink(
                documentId,
                signerEmail,
                countryCode,
                phoneNumber,
                signLinkValidTill,
                redirectUrl
            );
            System.out.println("Embedded Sign Link: " + embeddedSignLink.getSignLink());
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}