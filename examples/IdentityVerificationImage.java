import java.io.File;
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.IdentityVerificationApi;
import com.boldsign.model.DownloadImageRequest;

public class IdentityVerificationImage {
    public static void main(String[] args) {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setApiKey("YOUR_API_KEY");        
        IdentityVerificationApi identityVerificationApi = new IdentityVerificationApi(apiClient);
        String document_id = "YOUR_DOCUMENT_ID"; 
        DownloadImageRequest downloadImageRequest = new DownloadImageRequest();
        downloadImageRequest.setEmailId("sivaramani.sivaraj@syncfusion.com");
        downloadImageRequest.setCountryCode("+91");
        downloadImageRequest.setPhoneNumber("9944445555");
        downloadImageRequest.setFileId("YOUR_FILE_ID");

        try {
            File verificationimage = identityVerificationApi.image(document_id,downloadImageRequest);
            System.out.println(verificationimage);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityVerificationApi-->image");
            e.printStackTrace();
        }
    }
}
