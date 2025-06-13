package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.BrandingApi;
import com.boldsign.api.SenderIdentitiesApi;
import com.boldsign.model.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SenderidentityApiTest {
    private static SenderIdentitiesApi senderIdentitiesApi;
    private static BrandingApi brandingApi;
    private static ApiClient apiClient;
    private static String emailId;
    private static String email;
    private static String createdBrandId;

    private static String randomNumbers() {
        Random random = new Random();
        int rangeStart = (int) Math.pow(10, 3 - 1);
        int rangeEnd = (int) (Math.pow(10, 3) - 1);
        return String.valueOf(random.nextInt(rangeEnd - rangeStart + 1) + rangeStart);
    }

    private String generateRandomAlphaNumeric(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    @BeforeAll
        public static void setUp() throws Exception {
            createdBrandId=null;
            emailId = null;
            String apiKey = System.getenv("API_KEY");
            String hostUrl = System.getenv("HOST_URL");
            if (apiKey == null || hostUrl == null) {
                throw new IllegalArgumentException("Environment variables 'APIKey' or 'hostUrl' are not set.");
            }
            apiClient = new ApiClient();
            apiClient.setApiKey(apiKey);
            apiClient.setBasePath(hostUrl);
            brandingApi = new BrandingApi(apiClient);
            senderIdentitiesApi = new SenderIdentitiesApi(apiClient);
            String randomStr = randomNumbers();
            emailId = "sdktest" + randomStr + "@syncfusion.com";
            email = emailId ;
        }

    @Test
    @Order(1)
    public void testCreateBrand() throws ApiException
    {
        try
        {
            String brandName = "Syncfusion";
            File brandLogo = new File("examples/documents/logo.jpg");
            String backgroundColor = "red";
            String buttonColor = "blue";
            String buttonTextColor = "green";
            String emailDisplayname = "{SenderName} from Syncfusion";
            String disclaimerDescription = "syncfusion";
            String disclaimerTitle = "true";
            String redirectUrl = "https://www.syncfusion.com/";
            Boolean isDefault = true;
            Boolean canHideTagLine = true;
            Boolean combineAuditTrail = true;
            Boolean excludeAuditTrailFromEmail = false;
            String emailSignedDocument = "1";
            String documentTimeZone = "+05:30";
            Boolean showBuiltInFormFields = true;
            Boolean allowCustomFieldCreation = true;
            Boolean showSharedCustomFields = false;
            Boolean hideDecline = false;
            Boolean hideSave = false;
            String documentExpirySettingsExpiryDateType = "1";
            Integer documentExpirySettingsExpiryValue = 10;
            Boolean documentExpirySettingsEnableDefaultExpiryAlert = true;
            Boolean documentExpirySettingsEnableAutoReminder = true;
            Integer documentExpirySettingsRemainderDays = 1;
            Integer documentExpirySettingsReminderCount = 1;
            String customDomainSettingsDomainName = "mail.cubeflakes.com";
            String customDomainSettingsFromName = "notification";
            BrandCreated createBrandingResponse = brandingApi.createBrand(
                    brandName,
                    brandLogo,
                    backgroundColor,
                    buttonColor,
                    buttonTextColor,
                    emailDisplayname,
                    disclaimerDescription,
                    disclaimerTitle,
                    redirectUrl,
                    isDefault,
                    canHideTagLine,
                    combineAuditTrail,
                    excludeAuditTrailFromEmail,
                    emailSignedDocument,
                    documentTimeZone,
                    showBuiltInFormFields,
                    allowCustomFieldCreation,
                    showSharedCustomFields,
                    hideDecline,
                    hideSave,
                    documentExpirySettingsExpiryDateType,
                    documentExpirySettingsExpiryValue,
                    documentExpirySettingsEnableDefaultExpiryAlert,
                    documentExpirySettingsEnableAutoReminder,
                    documentExpirySettingsRemainderDays,
                    documentExpirySettingsReminderCount,
                    customDomainSettingsDomainName,
                    customDomainSettingsFromName
            );
            assertNotNull(createBrandingResponse);
            assertNotNull(createBrandingResponse.getBrandId());
            createdBrandId = createBrandingResponse.getBrandId();
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
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
    @Order(3)
    public void testCreateSenderIdentitiesNegativeMissingName() {
        try {
            CreateSenderIdentityRequest senderIdentityRequest = new CreateSenderIdentityRequest();
            senderIdentityRequest.setEmail(email);

            senderIdentitiesApi.createSenderIdentities(senderIdentityRequest);
            Assertions.fail("Expected ApiException due to missing sender identity name was not thrown.");
        } catch (ApiException e) {
            assertTrue(e.getResponseBody().contains("The name cannot be null, empty, or whitespace."));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(4)
    public void testCreateSenderIdentitiesNegativeEmptyEmail() {
        try {
            CreateSenderIdentityRequest senderIdentityRequest = new CreateSenderIdentityRequest();
            senderIdentityRequest.setName("Sender Identity Name");
            senderIdentityRequest.setEmail("");
            senderIdentitiesApi.createSenderIdentities(senderIdentityRequest);
            Assertions.fail("Expected ApiException due to empty email was not thrown.");
        } catch (ApiException e) {
            assertTrue(e.getResponseBody().contains("The Email field is required."));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(5)
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
    @Order(6)
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
    @Order(7)
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
    @Order(8)
    public void testUpdateSenderIdentitiesNegativeEmptyName() {
        try {
            EditSenderIdentityRequest editSenderIdentityRequest = new EditSenderIdentityRequest();
            editSenderIdentityRequest.setName(""); // Empty name to trigger validation error

            senderIdentitiesApi.updateSenderIdentities(email, editSenderIdentityRequest);
            Assertions.fail("Expected ApiException due to empty name was not thrown.");
        } catch (ApiException e) {
            assertTrue(e.getResponseBody().contains("To update the sender identity, at least one of the following is required: name, redirectUrl, or metadata."));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(9)
    public void testUpdateSenderIdentitiesNegativeEmptyEmail() {
        try {
            EditSenderIdentityRequest editSenderIdentityRequest = new EditSenderIdentityRequest();
            editSenderIdentityRequest.setName("SDK Testing");
            String emptyEmail = "";
            senderIdentitiesApi.updateSenderIdentities(emptyEmail, editSenderIdentityRequest);
            Assertions.fail("Expected ApiException due to empty email was not thrown.");
        } catch (ApiException e) {
            assertTrue(e.getResponseBody().contains("The email field is required."));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(10)
    public void testResendInvitationSenderIdentityPositive() throws Exception {
        senderIdentitiesApi.resendInvitationSenderIdentities(email);
        Assertions.assertTrue(true, "Invitation resent successfully  " );
    }

    @Test
    @Order(11)
    public void testResendInvitationSenderIdentityNegative() {
        String invalidSenderEmail = "invalid-email";
        try {
            senderIdentitiesApi.resendInvitationSenderIdentities(invalidSenderEmail);
            Assertions.fail("Expected ApiException due to invalid sender email");
        } catch (ApiException e) {
            assertTrue(e.getResponseBody().contains("The field email is invalid."));
        }
    }

    @Test
    @Order(12)
    public void testResendInvitationSenderIdentityNegativeEmptyEmail() {
        String emptyEmail = "";  // Empty email to trigger validation error
        try {
            senderIdentitiesApi.resendInvitationSenderIdentities(emptyEmail);
            Assertions.fail("Expected ApiException due to empty sender email");
        } catch (ApiException e) {
            assertTrue(e.getResponseBody().contains("The email field is required."));
        }
    }

    @Test
    @Order(13)
    public void testResendInvitationSenderIdentityNegativeNonExisting() {
        String nonExistingEmail = "sdktestinabc@syncfusion.com";
        try {
            senderIdentitiesApi.resendInvitationSenderIdentities(nonExistingEmail);
            Assertions.fail("Expected ApiException due to non-existing sender email");
        } catch (ApiException e) {
            assertTrue(e.getResponseBody().contains("The specified sender identity does not exist in your account."));
        }
    }

    @Test
    @Order(14)
    public void testReRequestSenderIdentityNegativeInvalidEmail() {
        String Email = emailId;
        try {
            senderIdentitiesApi.reRequestSenderIdentities(Email);
            Assertions.fail("Expected ApiException due to empty email.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("You can re-request sender identity only if the invitation is rejected."));
        }
    }

    @Test
    @Order(15)
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
    @Order(16)
    public void testListSenderIdentitiesNegativeWithExceeds() throws Exception {
        Integer invalidPage = 100;
        Integer invalidPageSize = 150;
        String invalidSearch = "";
        List<String> brandIds = new ArrayList<>();
        try {
            SenderIdentityList response = senderIdentitiesApi.listSenderIdentities(invalidPage, invalidPageSize, invalidSearch, brandIds);
            Assertions.fail("Expected ApiException due to invalid page number or search term");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Provide a valid page size between 1 and 100"));
        }
    }

    @Test
    @Order(17)
    public void testListSenderIdentitiesNegativeWithInvalidPageAndPageSize() throws Exception {
        Integer invalidPage = -1;
        Integer invalidPageSize = -5;
        String search = "";
        List<String> brandIds = new ArrayList<>();
        try {
            SenderIdentityList response = senderIdentitiesApi.listSenderIdentities(invalidPage, invalidPageSize, search, brandIds);
            Assertions.fail("Expected ApiException due to invalid page number or page size");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Page number should be greater than 0"));
        }
    }

    @Test
    @Order(18)
    public void testDeleteSenderIdentityPositive() throws Exception {
        senderIdentitiesApi.deleteSenderIdentities(email);
        Assertions.assertTrue(true, "Sender identity deletion should be successful.");
    }

    @Test
    @Order(19)
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

    @Test
    @Order(20)
    public void testDeleteSenderIdentityNegativeEmptyEmail() throws Exception {
        String emptyEmail = "";
        try {
            senderIdentitiesApi.deleteSenderIdentities(emptyEmail);
            Assertions.fail("Expected ApiException due to empty email ID");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The email field is required."));
        }
    }

    @Test
    @Order(21)
    public void testDeleteSenderIdentityNegativeNonExistingIdentity() throws Exception {
        String emptyEmail = "sdktestinabc@syncfusion.com";
        try {
            senderIdentitiesApi.deleteSenderIdentities(emptyEmail);
            Assertions.fail("Expected ApiException due to empty email ID");
        } catch (ApiException e) {
            Assertions.assertEquals(403, e.getCode());
          Assertions.assertTrue(e.getMessage().contains("Forbidden"));
        }
    }

    @Test
    @Order(22)
    public void testCreateSenderIdentitiesWithBrandIdPositive() {
        try {
            String senderIdentityName = "SenderIdentity API with Brand";
            CreateSenderIdentityRequest senderIdentityRequest = new CreateSenderIdentityRequest();
            senderIdentityRequest.setName(senderIdentityName);
            senderIdentityRequest.setEmail(email);
            senderIdentityRequest.setBrandId(createdBrandId);

            senderIdentitiesApi.createSenderIdentities(senderIdentityRequest);

            Assertions.assertNotNull(senderIdentityRequest);
            Assertions.assertEquals(senderIdentityName, senderIdentityRequest.getName());
            Assertions.assertEquals(email, senderIdentityRequest.getEmail());
        } catch (ApiException e) {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(23)
    public void testDeleteSenderIdentity() throws Exception {
        senderIdentitiesApi.deleteSenderIdentities(email);
        Assertions.assertTrue(true, "Sender identity deletion should be successful.");
    }

    @Test
    @Order(24)
    public void testDeleteBrandPositive() throws ApiException
    {
        String brandId =createdBrandId;
        BrandingMessage deleteBrandResponse = brandingApi.deleteBrand(brandId);
        assertNotNull(deleteBrandResponse);
        assertEquals("The brand has been deleted successfully", deleteBrandResponse.getMessage());
    }

    @Test
    @Order(25)
    public void testCreateSenderIdentitiesWithDynamic80CharsName() {
        try {
            String senderIdentityName = generateRandomAlphaNumeric(80);

            CreateSenderIdentityRequest senderIdentityRequest = new CreateSenderIdentityRequest();
            senderIdentityRequest.setName(senderIdentityName);
            senderIdentityRequest.setEmail(emailId);

            senderIdentitiesApi.createSenderIdentities(senderIdentityRequest);
            Assertions.assertNotNull(senderIdentityRequest);
            Assertions.assertEquals(senderIdentityName, senderIdentityRequest.getName());
            Assertions.assertEquals(email, senderIdentityRequest.getEmail());

        } catch (ApiException e) {
            System.out.println("\nException when calling BoldSign API: " + e.getMessage());
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nException when calling BoldSign: " + e.getMessage());
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(26)
    public void testCreateSenderIdentitiesNegativeDuplicateEmail() {
        try {
            String senderIdentityName = generateRandomAlphaNumeric(80);

            CreateSenderIdentityRequest senderIdentityRequest = new CreateSenderIdentityRequest();
            senderIdentityRequest.setName(senderIdentityName);
            senderIdentityRequest.setEmail(emailId);

            senderIdentitiesApi.createSenderIdentities(senderIdentityRequest);
            fail("Expected ApiException due to duplicate email was not thrown.");
        } catch (ApiException e) {
            System.out.println("Expected exception occurred: " + e.getMessage());
            assertEquals(400, e.getCode(), "Expected HTTP 400 Bad Request for duplicate email.");
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }
}