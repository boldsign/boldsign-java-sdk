import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.SenderIdentitiesApi;
import com.boldsign.model.NotificationSettings;
import com.boldsign.model.EditSenderIdentityRequest;

public class SenderIdentityUpdate 
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
            EditSenderIdentityRequest editSenderIdentityRequest = new EditSenderIdentityRequest();
            editSenderIdentityRequest.setName("Luther");
            editSenderIdentityRequest.setNotificationSettings(notificationSettings);
            senderIdentitiesApi.updateSenderIdentities("luthercooper@cubeflakes.com", editSenderIdentityRequest);
            System.out.println("Sender identity updated successfully");
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        }
    }
}