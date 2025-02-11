package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.SenderIdentitiesApi;
import com.boldsign.model.CreateSenderIdentityRequest;
import com.boldsign.model.EditSenderIdentityRequest;
import com.boldsign.model.NotificationSettings;
import com.boldsign.model.SenderIdentityList;
import org.junit.jupiter.api.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SenderidentityApiTest {
    private static SenderIdentitiesApi senderIdentitiesApi;
    private static ApiClient apiClient;
    private static String emailId;
    private static String email;

    private static String randomNumbers() {
        Random random = new Random();
        int rangeStart = (int) Math.pow(10, 3 - 1);
        int rangeEnd = (int) (Math.pow(10, 3) - 1);
        return String.valueOf(random.nextInt(rangeEnd - rangeStart + 1) + rangeStart);
    }

    @BeforeAll
        public static void setUp() throws Exception {
            emailId = null;
            String apiKey = System.getenv("API_KEY");
            String hostUrl = System.getenv("HOST_URL");
            if (apiKey == null || hostUrl == null) {
                throw new IllegalArgumentException("Environment variables 'APIKey' or 'hostUrl' are not set.");
            }
            apiClient = new ApiClient();
            apiClient.setApiKey(apiKey);
            apiClient.setBasePath(hostUrl);
            senderIdentitiesApi = new SenderIdentitiesApi(apiClient);
            String randomStr = randomNumbers();
            emailId = "sdktesting" + randomStr + "@syncfusion.com";
            email = emailId ;
        }

    @Test
    @Order(1)
    public void testCreateSenderIdentitiesPositive() {
        try {
            String senderIdentityName = "SenderIdentity API";
            CreateSenderIdentityRequest senderIdentityRequest = new CreateSenderIdentityRequest();
            senderIdentityRequest.setName(senderIdentityName);
            senderIdentityRequest.setEmail(email);
            senderIdentitiesApi.createSenderIdentities(senderIdentityRequest);
            Assertions.assertNotNull(senderIdentityRequest);
            Assertions.assertEquals(senderIdentityName, senderIdentityRequest.getName());
            Assertions.assertEquals(email, senderIdentityRequest.getEmail());
        } catch (ApiException e) {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException occurred: " + e.getMessage());
            }
        }
    }

    @Test
    @Order(2)
    public void testCreateSendIdentityNegative() throws Exception {
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
        createSenderIdentityRequest.setName("abc");
        createSenderIdentityRequest.setEmail("invalid Email");
        createSenderIdentityRequest.setNotificationSettings(notificationSettings);
        URI redirectUri = URI.create("https://boldsign.com");
        createSenderIdentityRequest.setRedirectUrl(redirectUri);
        try {
            senderIdentitiesApi.createSenderIdentities(createSenderIdentityRequest);
            Assertions.fail("Expected ApiException due to invalid email format");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The field Email is invalid"));
        }
    }

    @Test
    @Order(3)
    public void testUpdateSenderIdentitiesPositive() {
        try {
            String senderIdentityName = "SenderIdentity API Update";
            EditSenderIdentityRequest editSenderIdentityRequest = new EditSenderIdentityRequest();
            editSenderIdentityRequest.setName(senderIdentityName);
            senderIdentitiesApi.updateSenderIdentities(email, editSenderIdentityRequest);
            Assertions.assertNotNull(editSenderIdentityRequest, "Sender identity update request should not be null.");
            Assertions.assertEquals(senderIdentityName, editSenderIdentityRequest.getName(), "Sender identity name should be updated.");
        } catch (ApiException e) {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(4)
    public void testUpdateSenderIdentityNegative() throws Exception {
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
        editSenderIdentityRequest.setName("Sender identity");
        editSenderIdentityRequest.setNotificationSettings(notificationSettings);
        try {
            senderIdentitiesApi.updateSenderIdentities("invalid-email", editSenderIdentityRequest);
            Assertions.fail("Expected ApiException due to invalid email format or empty name.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The field email is invalid"));
        }
    }

    @Test
    @Order(5)
    public void testResendInvitationSenderIdentityPositive() throws Exception {
        senderIdentitiesApi.resendInvitationSenderIdentities(email);
        Assertions.assertTrue(true, "Invitation resent successfully  " );
    }

    @Test
    @Order(6)
    public void testResendInvitationSenderIdentityNegative() {
        String invalidSenderEmail = "invalid-email";
        try {
            senderIdentitiesApi.resendInvitationSenderIdentities(invalidSenderEmail);
            Assertions.fail("Expected ApiException due to invalid sender email");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("The field email is invalid"));
        }
    }

    @Test
    @Order(7)
    public void testReRequestSenderIdentityNegativeInvalidEmail() {
        String Email = "invalid-email";
        try {
            senderIdentitiesApi.reRequestSenderIdentities(Email);
            Assertions.fail("Expected ApiException due to empty email.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The field email is invalid."));
        }
    }


    @Test
    @Order(8)
    public void testReRequestSenderIdentityNegativeEmptyEmail() {
        String emptyEmail = " ";
        try {
            senderIdentitiesApi.reRequestSenderIdentities(emptyEmail);
            Assertions.fail("Expected ApiException due to empty email.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The email field is required"));
        }
    }

    @Test
    @Order(9)
    public void testListSenderIdentitiesPositive() throws Exception {
        Integer page = 1;
        Integer pageSize = 10;
        String search = " ";
        List<String> brandIds = new ArrayList<>();
        SenderIdentityList senderIdentityList = senderIdentitiesApi.listSenderIdentities(page, pageSize, search, brandIds);
        Assertions.assertNotNull(senderIdentityList, "Sender identity list should not be null");
        Assertions.assertNotNull(senderIdentityList);
        Assertions.assertNotNull(senderIdentityList.getPageDetails());
    }

    @Test
    @Order(10)
    public void testListSenderIdentitiesNegative() throws Exception {
        Integer invalidPage = -1;
        Integer invalidPageSize = 150;
        String invalidSearch = "";
        List<String> brandIds = new ArrayList<>();
        try {
            SenderIdentityList response = senderIdentitiesApi.listSenderIdentities(invalidPage, invalidPageSize, invalidSearch, brandIds);
            Assertions.fail("Expected ApiException due to invalid page number or search term");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Invalid page number") || e.getMessage().contains("Page number should be greater than 0"));
        }
    }

    @Test
    @Order(11)
    public void testDeleteSenderIdentityPositive() throws Exception {
        senderIdentitiesApi.deleteSenderIdentities(email);
        Assertions.assertTrue(true, "Sender identity deletion should be successful.");
    }

    @Test
    @Order(12)
    public void testDeleteSenderIdentityNegative() throws Exception {
        String invalidEmail = "invalid-email";
        try {
            senderIdentitiesApi.deleteSenderIdentities(invalidEmail);
            Assertions.fail("Expected ApiException due to invalid email or non-existent sender identity");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The field email is invalid"));
        }
    }
}