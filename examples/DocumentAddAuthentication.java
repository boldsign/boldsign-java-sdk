import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.AccessCodeDetail;
import com.boldsign.model.AccessCodeDetail.AuthenticationTypeEnum;

public class DocumentAddAuthentication 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            AccessCodeDetail accessCodeDetail = new AccessCodeDetail();
            accessCodeDetail.setAuthenticationType(AuthenticationTypeEnum.EMAIL_OTP); 
            accessCodeDetail.setEmailId("alexgayle@cubeflakes.com"); 
            documentApi.addAuthentication("DOCUMENT_ID", accessCodeDetail);
            System.out.println("Authentication added successfully to the document!");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}