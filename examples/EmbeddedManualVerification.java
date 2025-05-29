import com.boldsign.ApiClient;
import com.boldsign.Configuration;
import com.boldsign.api.IdentityVerificationApi;
import com.boldsign.model.EmbeddedFileDetails;
import com.boldsign.model.EmbeddedFileLink;

public class EmbeddedManualVerification {
    public static void main(String[] args) {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setApiKey("YOUR_API_KEY");
        IdentityVerificationApi identityVerificationApi = new IdentityVerificationApi(apiClient);
        String document_id ="YOUR_DOCUMENT_ID";

        EmbeddedFileDetails embeddedFileDetails = new EmbeddedFileDetails();
        embeddedFileDetails.setEmailId("sivaramani.sivaraj@syncfusion.com");
        embeddedFileDetails.setCountryCode("+91");
        embeddedFileDetails.setPhoneNumber("0987654323");
        embeddedFileDetails.setRedirectUrl("www.boldsign.com");

        try {
            EmbeddedFileLink verificationUrl = identityVerificationApi.createEmbeddedVerificationUrl(document_id, embeddedFileDetails);
            System.out.println(verificationUrl);
        } catch (Exception e) {
            System.err.println("Exception when calling IdentityVerificationApi-->createEmbeddedVerificationUrl");
            e.printStackTrace();
        }
    }
}