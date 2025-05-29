import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.IdentityVerificationApi;
import com.boldsign.model.IdReport;
import com.boldsign.model.VerificationDataRequest;

public class IdentityVerificationReport {
    public static void main(String[] args) {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setApiKey("YOUR_API_KEY");        
        IdentityVerificationApi identityVerificationApi = new IdentityVerificationApi(apiClient);
        String document_id = "YOUR_DOCUMENT_ID"; 
        VerificationDataRequest verificationDataRequest = new VerificationDataRequest();
        verificationDataRequest.setEmailId("sivaramani.sivaraj@syncfusion.com");
        verificationDataRequest.setCountryCode("+91");
        verificationDataRequest.setPhoneNumber("9944445555");

        try {
            IdReport verificationReport = identityVerificationApi.report(document_id,verificationDataRequest);
            System.out.println(verificationReport);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityVerificationApi-->Report");
            e.printStackTrace();
        }
    }
}
