package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.BrandingApi;
import com.boldsign.api.DocumentApi;
import com.boldsign.api.IdentityVerificationApi;
import com.boldsign.model.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IdentityVerificationApiTest {

    private static ApiClient apiClient;
    private static DocumentApi documentApi;
    private static IdentityVerificationApi identityVerificationApi;
    private static String createdDocumentId;


    @BeforeAll
    public static void setUpClass() {
        createdDocumentId = null;
        String apiKey = System.getenv("API_KEY");
        String hostUrl = System.getenv("HOST_URL");
        if (apiKey == null || hostUrl == null) {
            throw new IllegalArgumentException("Environment variables 'APIKey' or 'hostUrl' are not set.");
        }
        apiClient = new ApiClient();
        apiClient.setApiKey(apiKey);
        apiClient.setBasePath(hostUrl);
        identityVerificationApi = new IdentityVerificationApi(apiClient);
        documentApi = new DocumentApi(apiClient);
    }

    @Test
    @Order(1)
    public void testSendDocumentWithIdentityVerification() {
        try {
            FormField formField = new FormField()
                    .id("textValue")
                    .fieldType(FormField.FieldTypeEnum.TEXT_BOX)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isReadOnly(true)
                    .validationType(FormField.ValidationTypeEnum.NUMBERS_ONLY);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(50f);
            bounds.setWidth(200f);
            bounds.setHeight(25f);
            formField.setBounds(bounds);

            DocumentSigner signer = new DocumentSigner();
            signer.setName("Test Signer");
            signer.setEmailAddress("girisankar.syncfusion@gmail.com");
            signer.setSignerOrder(1);
            signer.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            signer.setAuthenticationType(DocumentSigner.AuthenticationTypeEnum.ID_VERIFICATION);
            signer.setFormFields(Collections.singletonList(formField));

            IdentityVerificationSettings identityVerification = new IdentityVerificationSettings();
            identityVerification.setType(IdentityVerificationSettings.TypeEnum.EVERY_ACCESS);
            identityVerification.setMaximumRetryCount(1);
            signer.setIdentityVerificationSettings(identityVerification);
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(true);

            SendForSign sendRequest = new SendForSign();
            sendRequest.setTitle("Document SDK API");
            List<File> files = new ArrayList<>();
            files.add(new File("examples/documents/agreement.pdf"));
            sendRequest.setFiles(files);
            sendRequest.setSigners(Collections.singletonList(signer));
            sendRequest.setMessage("Please sign this document");
            sendRequest.setEnablePrintAndSign(true);
            sendRequest.setAutoDetectFields(true);
            sendRequest.setDisableEmails(true);
            sendRequest.setDisableExpiryAlert(true);
            sendRequest.setReminderSettings(reminderSettings);
            DocumentCreated response = documentApi.sendDocument(sendRequest);
            assertNotNull(response, "No response received from API");
            assertNotNull(response.getDocumentId(), "Document ID is missing");
            System.out.println("Document sent successfully with ID: " + response.getDocumentId());

            createdDocumentId = response.getDocumentId();
            TimeUnit.SECONDS.sleep(60);
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
    public void testCreateEmbeddedVerificationUrlNegative() {
        try {
            EmbeddedFileDetails request = new EmbeddedFileDetails();
            request.setEmailId("girisankar.syncfusion@gmail.com");
            request.setCountryCode("+91");
            request.setPhoneNumber("87654345678");
            request.setRedirectUrl("https://www.boldsign.com");
            request.setOrder(1);
            identityVerificationApi.createEmbeddedVerificationUrl(createdDocumentId, request);
            fail("Expected ApiException for invalid was not thrown");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            System.out.println("Expected ApiException occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(3)
    public void testGetIdentityVerificationReportNegative() {
        try {
            VerificationDataRequest reportRequest = new VerificationDataRequest();
            reportRequest.setEmailId("girisankar.syncfusion@gmail.com");
            reportRequest.setCountryCode("+91");
            reportRequest.setPhoneNumber("87654345678");
            reportRequest.setOrder(1);
            identityVerificationApi.report(createdDocumentId, reportRequest);
            fail("Expected ApiException with status 403 was not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            System.out.println("Expected ApiException occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(4)
    public void testGetIdentityVerificationImageNegative() {
        try {
            DownloadImageRequest imageRequest = new DownloadImageRequest();
            imageRequest.setEmailId("girisankar.syncfusion@gmail.com");
            imageRequest.setCountryCode("+91");
            imageRequest.setPhoneNumber("87654345678");
            imageRequest.setFileId("invalid-field-id"); // Intentionally invalid
            imageRequest.setOrder(1);
            identityVerificationApi.image(createdDocumentId, imageRequest);
            fail("Expected ApiException for invalid was not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode(), "Expected HTTP 403 Forbidden");
            System.out.println("Expected ApiException occurred: " + e.getMessage());
        }
    }
}
