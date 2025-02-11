import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.SenderIdentitiesApi;
import com.boldsign.model.NotificationSettings;
import com.boldsign.model.CreateSenderIdentityRequest;
import java.net.URI;

public class SenderIdentityCreate 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            SenderIdentitiesApi senderIdentitiesApi = new SenderIdentitiesApi(apiClient);
            NotificationSettings notificationSettings = new NotificationSettings();
            notificationSettings.setViewed(true);
            notificationSettings.setSent(false);
            notificationSettings.setDeliveryFailed(true);
            notificationSettings.setDeclined(true);
            notificationSettings.setRevoked(true);
            notificationSettings.setReassigned(true);
            notificationSettings.setCompleted(true);
            notificationSettings.setSigned(true);
            notificationSettings.setExpired(true);
            notificationSettings.setAuthenticationFailed(true);
            notificationSettings.setReminders(true);
            CreateSenderIdentityRequest createSenderIdentityRequest = new CreateSenderIdentityRequest();
            createSenderIdentityRequest.setName("Luther Cooper");
            createSenderIdentityRequest.setEmail("luthercooper@cubeflakes.com");
            createSenderIdentityRequest.setNotificationSettings(notificationSettings);
            URI redirectUri = new URI("https://boldsign.com");
            createSenderIdentityRequest.setRedirectUrl(redirectUri);
            senderIdentitiesApi.createSenderIdentities(createSenderIdentityRequest);
            System.out.println("Sender Identity created successfully");
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