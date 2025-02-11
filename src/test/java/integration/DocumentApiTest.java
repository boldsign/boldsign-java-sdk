package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.boldsign.model.FormField.FieldTypeEnum;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DocumentApiTest {
    private static DocumentApi documentApi;
    private static ApiClient apiClient;
    private static String documentId;
    private static String senderEmail;
    private static String createdDocumentId;

    public byte[] readFile(String path) throws IOException {
        try (FileInputStream fis = new FileInputStream(path)) {
            return fis.readAllBytes();
        }
    }

    public String imageToBase64(String imagePath) throws IOException {
        byte[] imageContent = readFile(imagePath);
        String imageType = imagePath.substring(imagePath.lastIndexOf('.') + 1);
        return String.format("data:image/%s;base64,%s", imageType, Base64.getEncoder().encodeToString(imageContent));
    }

    @BeforeAll
    public static void setUp() {
        documentId = null;
        senderEmail = null;
        String apiKey = System.getenv("API_KEY");
        String hostUrl = System.getenv("HOST_URL");
        if (apiKey == null || hostUrl == null) {
            throw new IllegalArgumentException("Environment variables 'APIKey' or 'hostUrl' are not set.");
        }
        apiClient = new ApiClient();
        apiClient.setApiKey(apiKey);
        apiClient.setBasePath(hostUrl);
        documentApi = new DocumentApi(apiClient);
    }

    @Test
    @Order(1)
    public void testSenderDetail() throws Exception {
        try {
            Integer page = 1;
            Integer pageSize = 10;
            DocumentRecords listDocumentsResponse = documentApi.listDocuments(
                    page,
                    null,
                    null,
                    null,
                    pageSize,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null
            );
            Assertions.assertNotNull(listDocumentsResponse);
            Assertions.assertTrue(listDocumentsResponse.getResult().size() > 0);
            senderEmail = listDocumentsResponse.getResult().get(0).getSenderDetail().getEmailAddress();
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
    public void testSendDocumentPositive() {
        try {
            System.out.println("senderEmail"+ senderEmail);
            List<DocumentSigner> signers = new ArrayList<>();
            DocumentSigner signer1 = new DocumentSigner();
            signer1.setName("Test Signer");
            signer1.setEmailAddress("divya.boopathy+30@syncfusion.com");
            signer1.setSignerOrder(1);
            signer1.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            signer1.setAuthenticationType(DocumentSigner.AuthenticationTypeEnum.ACCESS_CODE);
            signer1.setAuthenticationCode("123456");
            List<FormField> formFields1 = new ArrayList<>();
            formFields1.add(new FormField().name("Sign")
                    .fieldType(FieldTypeEnum.SIGNATURE)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isRequired(true)
                    .bounds(new Rectangle()));
            signer1.setFormFields(formFields1);
            signer1.setPrivateMessage("This is private message for signer");
            signers.add(signer1);
            DocumentSigner signer2 = new DocumentSigner();
            signer2.setName("Test Reviewer");
            signer2.setEmailAddress("divya.boopathy+9@syncfusion.com");
            signer2.setSignerOrder(2);
            signer2.setSignerType(DocumentSigner.SignerTypeEnum.REVIEWER);
            signer2.setAuthenticationType(DocumentSigner.AuthenticationTypeEnum.EMAIL_OTP);
            signer2.setPrivateMessage("This is private message for Reviewer");
            signers.add(signer2);
            DocumentSigner signer3 = new DocumentSigner();
            signer3.setName("Test In-Person Signer");
            signer3.setEmailAddress("divya.boopathy+2@syncfusion.com");
            signer3.setSignerOrder(3);
            signer3.setSignerType(DocumentSigner.SignerTypeEnum.IN_PERSON_SIGNER);
            signer3.setHostEmail(senderEmail);
            signer3.setAuthenticationType(DocumentSigner.AuthenticationTypeEnum.EMAIL_OTP);
            List<FormField> formFields3 = new ArrayList<>();
            formFields3.add(new FormField().name("Sign")
                    .fieldType(FieldTypeEnum.SIGNATURE)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isRequired(true)
                    .bounds(new Rectangle()));
            signer3.setFormFields(formFields3);
            signers.add(signer3);
            SendForSign sendDocumentRequest = new SendForSign();
            sendDocumentRequest.setTitle("Document SDK API");
            List<File> files = new ArrayList<>();
            files.add(new File("examples/documents/agreement.pdf"));
            sendDocumentRequest.setFiles(files);
            sendDocumentRequest.setEnablePrintAndSign(true);
            sendDocumentRequest.setSigners(signers);
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            assertNotNull(sendDocument);
            assertNotNull(sendDocument.getDocumentId());
            String createdDocumentId = sendDocument.getDocumentId();
            documentId = sendDocument.getDocumentId();
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    @Order(3)
    public void testCreateDocumentPositiveWithManySigners() throws Exception {
        List<File> files = new ArrayList<>();
        File file = new File("examples/documents/agreement.pdf");
        files.add(file);
        List<FormField> formFields = new ArrayList<>();
        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);
        List<DocumentSigner> signers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            DocumentSigner signer = new DocumentSigner();
            signer.setName("Signer" + i);
            signer.setEmailAddress("divya.boopathy+" + i + "@syncfusion.com");
            signer.setFormFields(formFields);
            signers.add(signer);
        }
        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        DocumentCreated document = documentApi.sendDocument(sendForSign);
        assertNotNull(document);
        assertNotNull(document.getDocumentId());
    }

    @Test
    @Order(4)
    public void testSendDocumentPositiveWithMultipleFiles() throws Exception {
        List<File> files = new ArrayList<>();
        File file1 = new File("examples/documents/agreement.pdf");
        File file2 = new File("examples/documents/agreement.pdf");
        files.add(file1);
        files.add(file2);
        List<FormField> formFields = new ArrayList<>();
        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);
        List<DocumentSigner> signers = new ArrayList<>();
        DocumentSigner signer = new DocumentSigner();
        signer.setName("Signer1");
        signer.setEmailAddress("divya.boopathy+1@syncfusion.com");
        signer.setFormFields(formFields);
        signers.add(signer);
        DocumentSigner signer1 = new DocumentSigner();
        signer1.setName("Signer2");
        signer1.setEmailAddress("divya.boopathy+2@syncfusion.com");
        signer1.setFormFields(formFields);
        signers.add(signer1);
        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement with Multiple Files");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        DocumentCreated document = documentApi.sendDocument(sendForSign);
        assertNotNull(document);
        assertNotNull(document.getDocumentId());
        Assertions.assertEquals(document.getDocumentId(), document.getDocumentId());
    }

    @Test
    @Order(5)
    public void testCreateDocumentWithSigningOrder() throws Exception {
        List<File> files = new ArrayList<>();
        File file1 = new File("examples/documents/agreement.pdf");
        files.add(file1);
        List<FormField> formFields = new ArrayList<>();
        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);
        DocumentSigner signer1 = new DocumentSigner();
        signer1.setName("Signer 1 Name");
        signer1.setEmailAddress("divya.boopathy+12@syncfusion.com");
        signer1.setSignerRole("SIGNER");
        signer1.setFormFields(formFields);
        signer1.setSignerOrder(1);
        DocumentSigner signer2 = new DocumentSigner();
        signer2.setName("Signer 2 Name");
        signer2.setEmailAddress("divya.boopathy+13@syncfusion.com");
        signer2.setSignerRole("SIGNER");
        signer2.setFormFields(formFields);
        signer2.setSignerOrder(2);
        List<DocumentSigner> signers = new ArrayList<>();
        signers.add(signer1);
        signers.add(signer2);
        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement Document");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        DocumentCreated document = documentApi.sendDocument(sendForSign);
        assertNotNull(document);
        assertNotNull(document.getDocumentId());
        Assertions.assertEquals(1, signers.get(0).getSignerOrder());
        Assertions.assertEquals(2, signers.get(1).getSignerOrder());
    }

    @Test
    @Order(6)
    public void testCreateDocumentNegativeNoSigners() throws Exception {
        List<File> files = new ArrayList<>();
        File file = new File("examples/documents/agreement.pdf");
        files.add(file);
        List<FormField> formFields = new ArrayList<>();
        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);
        List<DocumentSigner> signers = new ArrayList<>();
        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        try {
            DocumentCreated document = documentApi.sendDocument(sendForSign);
            Assertions.fail("Expected exception for missing signers, but got: " + document);
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
        }
    }

    @Test
    @Order(7)
    public void testCreateDocumentNegativeMissingRequiredField() throws Exception {
        List<File> files = new ArrayList<>();
        File file = new File("examples/documents/agreement.pdf");
        files.add(file);
        List<FormField> formFields = new ArrayList<>();
        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);
        List<DocumentSigner> signers = new ArrayList<>();
        DocumentSigner signer = new DocumentSigner();
        signer.setName("Signer");
        signer.setEmailAddress("");
        signer.setFormFields(formFields);
        signers.add(signer);
        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        try {
            DocumentCreated document = documentApi.sendDocument(sendForSign);
            Assertions.fail("Expected exception for missing signer fields, but got: " + document);
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
        }
    }

    @Test
    @Order(8)
    public void testCreateDocumentNegativeInvalidEmail() throws Exception {
        List<File> files = new ArrayList<>();
        File file = new File("examples/documents/agreement.pdf");
        files.add(file);
        List<FormField> formFields = new ArrayList<>();
        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);
        List<DocumentSigner> signers = new ArrayList<>();
        DocumentSigner signer = new DocumentSigner();
        signer.setName("Signer");
        signer.setEmailAddress("invalid-email.com");
        signer.setFormFields(formFields);
        signers.add(signer);
        DocumentSigner signer1 = new DocumentSigner();
        signer1.setName("Signer1");
        signer1.setEmailAddress("divya.boopathy+24@syncfusion.com");
        signer1.setFormFields(formFields);
        signers.add(signer1);
        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        try {
            DocumentCreated document = documentApi.sendDocument(sendForSign);
            Assertions.fail("Expected exception due to invalid email format");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("The field EmailAddress is invalid"));
        }
    }

    @Test
    @Order(9)
    public void testCreateDocumentWithMultipleCCs() throws Exception {
        List<File> files = new ArrayList<>();
        File file1 = new File("examples/documents/agreement.pdf");
        files.add(file1);
        List<FormField> formFields = new ArrayList<>();
        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);
        List<DocumentSigner> signers = new ArrayList<>();
        DocumentSigner signer1 = new DocumentSigner();
        signer1.setName("Divya");
        signer1.setEmailAddress("divya.boopathy+1@syncfusion.com");
        signer1.setSignerRole("SIGNER");
        signer1.setFormFields(formFields);
        signers.add(signer1);
        DocumentSigner signer2 = new DocumentSigner();
        signer2.setName("DivyaBoopathy");
        signer2.setEmailAddress("divya.boopathy+2@syncfusion.com");
        signer2.setSignerRole("SIGNER");
        signer2.setFormFields(formFields);
        signers.add(signer2);
        List<DocumentCC> ccList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            DocumentCC cc = new DocumentCC();
            cc.setEmailAddress("divya.boopathy+" + (i + 2) + "@syncfusion.com");
            ccList.add(cc);
        }
        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement Document");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);
        sendForSign.setCc(ccList);
        DocumentCreated document = documentApi.sendDocument(sendForSign);
        assertNotNull(document);
        assertNotNull(document.getDocumentId());
        assertTrue(ccList.stream().anyMatch(cc -> cc.getEmailAddress().contains("@syncfusion.com")));
        System.out.println("Document sent successfully with document ID: " + document.getDocumentId());
    }

    @Test
    @Order(10)
    public void testGetEmbeddedSignLink() {
        try {
            String signerEmail = "divya.boopathy+30@syncfusion.com";
            String countryCode = "+91";
            String phoneNumber = "";
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
            Assertions.assertNotNull(embeddedSignLink);
            Assertions.assertNotNull(embeddedSignLink.getSignLink());
        } catch (ApiException e) {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(11)
    public void testGetEmbeddedSignLinkWithInvalidDocumentId() {
        try {
            String documentId = "INVALID_DOCUMENT_ID";
            String signerEmail = "divya.boopathy+sdk@syncfusion.com";
            String countryCode = "+91";
            String phoneNumber = "";
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
            Assertions.fail("Expected ApiException was not thrown.");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("Invalid Document ID"));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(12)
    public void testGetEmbeddedSignLinkWithMissingEmail() {
        try {
            String signerEmail = "";
            String countryCode = "+91";
            String phoneNumber = "";
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
            Assertions.fail("Expected ApiException was not thrown due to missing signer email.");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("Please provide the signer's email address or phone number along with the country code to generate an embedded sign link"));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(13)
    public void testRemoveAuthenticationPositive() throws Exception {
        System.out.println(documentId);
        RemoveAuthentication removeAuthentication = new RemoveAuthentication();
        removeAuthentication.setEmailId("divya.boopathy+9@syncfusion.com");
        documentApi.removeAuthentication(documentId, removeAuthentication);
        assertTrue(true, "Authentication successfully removed from the document.");
    }

    @Test
    @Order(14)
    public void testRemoveAuthenticationNegative() {
        RemoveAuthentication removeAuthentication = new RemoveAuthentication();
        removeAuthentication.setEmailId("divya.boopathy+30@syncfusion.com");
        String documentId = "Wrong-documentid";
        try {
            documentApi.removeAuthentication(documentId, removeAuthentication);
            Assertions.fail("Expected ApiException due to invalid email or document ID, but it was not thrown.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("The field DocumentId is invalid") );
        }
    }

    @Test
    @Order(15)
    public void testAddAuthenticationPositive() {
        try {
            AccessCodeDetail accessCodeDetail = new AccessCodeDetail();
            accessCodeDetail.setAuthenticationType(AccessCodeDetail.AuthenticationTypeEnum.EMAIL_OTP);
            accessCodeDetail.setEmailId("divya.boopathy+9@syncfusion.com");
            documentApi.addAuthentication(documentId, accessCodeDetail);
            assertTrue(true, "Email OTP Authentication added successfully to the document.");
        } catch (ApiException e) {
            assertTrue(false, "API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(16)
    public void testAddAuthenticationNegative() throws ApiException {
        try {
            AccessCodeDetail accessCodeDetail = new AccessCodeDetail();
            accessCodeDetail.setAuthenticationType(AccessCodeDetail.AuthenticationTypeEnum.EMAIL_OTP);
            accessCodeDetail.setEmailId("invalid-email");
            documentApi.addAuthentication("invalid-documentId", accessCodeDetail);
            Assertions.fail("Expected ApiException due to invalid email or document ID, but it was not thrown.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("The field EmailId is invalid."));
            assertTrue(e.getMessage().contains("The field documentId is invalid."));
        }
    }

    @Test
    @Order(17)
    public void testChangeAccessCodePositive() throws Exception {
        System.out.println(documentId);
        AccessCodeDetails accessCodeDetails = new AccessCodeDetails();
        accessCodeDetails.setAccessCode("543210");
        String emailId = "divya.boopathy+30@syncfusion.com";
        Integer zorder = 1;
        documentApi.changeAccessCode(documentId, accessCodeDetails, emailId, zorder);
        assertTrue(true, "Access code changed successfully.");
    }

    @Test
    @Order(18)
    public void testChangeAccessCodeNegative() {
        AccessCodeDetails accessCodeDetails = new AccessCodeDetails();
        accessCodeDetails.setAccessCode("");
        String emailId = "divya.boopathy+9@syncfusion.com";
        Integer zorder = 2;
        try {
            documentApi.changeAccessCode(documentId, accessCodeDetails, emailId, zorder);
            Assertions.fail("Expected ApiException due to invalid data (document ID, email, or access code), but it was not thrown.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("The AccessCode field is required"));
        }
    }

    @Test
    @Order(19)
    public void testChangeAccessCodeNegativeWithInvalidZorder() {
        AccessCodeDetails accessCodeDetails = new AccessCodeDetails();
        accessCodeDetails.setAccessCode("123456");
        String emailId = "divya.boopathy@syncfusion.com";
        Integer zorder = 5;
        try {
            documentApi.changeAccessCode(documentId, accessCodeDetails, emailId, zorder);
            Assertions.fail("Expected ApiException due to invalid zorder (negative value), but it was not thrown.");
        } catch (ApiException e) {
            Assertions.assertEquals(403, e.getCode());
            assertTrue(e.getMessage().contains("Forbidden"));
        }
    }

    @Test
    @Order(20)
    public void testAddTagsPositive() throws Exception {
        System.out.println(documentId);
        DocumentTags documentTags = new DocumentTags();
        documentTags.setDocumentId(documentId);
        documentTags.addTagsItem("test");
        documentTags.addTagsItem("api");
        documentApi.addTag(documentTags);
        assertNotNull(documentTags);
        assertTrue(documentTags.getTags().contains("test"));
        assertTrue(documentTags.getTags().contains("api"));
    }

    @Test
    @Order(21)
    public void testAddTagsNegativeEmptyTags() {
        DocumentTags documentTags = new DocumentTags();
        documentTags.setDocumentId(documentId);
        documentTags.addTagsItem("");
        documentTags.addTagsItem("");
        try {
            documentApi.addTag(documentTags);
            Assertions.fail("Expected ApiException due to invalid document ID, but no exception was thrown.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Label cannot be null or empty"));
        }
    }

    @Test
    @Order(22)
    public void testRemindDocumentPositive() throws ApiException
    {
        ReminderMessage reminderMessage = new ReminderMessage();
        reminderMessage.setMessage("Please sign this soon");
        List<String> receiverEmails = new ArrayList<>();
        receiverEmails.add("divya.boopathy+37@syncfusion.com");
        documentApi.remindDocument(documentId, receiverEmails, reminderMessage);
        System.out.println("Reminder sent successfully!");
        assertTrue(true, "Reminder sent successfully to the receiver.");
    }

    @Test
    @Order(23)
    public void testRemindDocumentNegative()
    {
        ReminderMessage reminderMessage = new ReminderMessage();
        reminderMessage.setMessage("Please sign this soon");
        List<String> receiverEmails = new ArrayList<>();
        receiverEmails.add("invalid-email@domain");
        try
        {
            documentApi.remindDocument(documentId, receiverEmails, reminderMessage);
            Assertions.fail("Expected ApiException due to invalid document ID or email format, but no exception was thrown.");
        }
        catch (ApiException e)
        {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("The field receiverEmails is invalid."));
        }
    }

    @Test
    @Order(24)
    public void testGetDocumentPropertiesPositive()throws ApiException {
        try
        {
            DocumentProperties getPropertiesResponse = documentApi.getProperties(documentId);
            assertNotNull(getPropertiesResponse);
        }
        catch (ApiException e)
        {
            Assertions.fail("API call failed: " + e.getMessage());
        }
    }

    @Test
    @Order(25)
    public void testGetDocumentPropertiesNegative() {
        String documentId = "invalid-document-id";
        try {
            DocumentProperties getPropertiesResponse = documentApi.getProperties(documentId);
            Assertions.fail("Expected ApiException due to invalid document ID, but it was not thrown.");
        } catch (ApiException e) {
            System.err.println("Expected error occurred: " + e.getMessage());
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Provide valid document id"));
        }
    }

    @Test
    @Order(26)
    public void testDeleteTagsPositive() throws ApiException {
        DocumentTags documentTags = new DocumentTags();
        documentTags.setDocumentId(documentId);
        ArrayList<String> tags = new ArrayList<>();
        tags.add("test");
        tags.add("api");
        documentTags.setTags(tags);
        documentApi.deleteTag(documentTags);
        assertNotNull(documentTags, "The document tags should not be null.");
    }

    @Test
    @Order(27)
    public void testDeleteTagsNegative() {
        DocumentTags documentTags = new DocumentTags();
        documentTags.setDocumentId("invalid-document-id");
        ArrayList<String> tags = new ArrayList<>();
        tags.add("test");
        tags.add("api");
        documentTags.setTags(tags);
        try {
            documentApi.deleteTag(documentTags);
            Assertions.fail("Expected ApiException due to invalid document ID or tags, but it was not thrown.");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Provide valid document id"));
        }
    }

    @Test
    @Order(28)
    public void testDownloadDocumentPositive() throws Exception {
        String onBehalfof = "divya.boopathy+22@syncfusion.com";
        File documentStream = documentApi.downloadDocument(documentId, onBehalfof);
        assertNotNull(documentStream, "Downloaded document should not be null");
        System.out.println("Document downloaded successfully!");
    }

    @Test
    @Order(29)
    public void testDownloadDocumentWithInvalidId() throws Exception {
        String invalidDocumentId = "invalid-document-id";
        String onBehalfof = "divya.boopathy+22@syncfusion.com";
        try {
            File documentStream = documentApi.downloadDocument(invalidDocumentId, onBehalfof);
            Assertions.fail("Document download should have failed for invalid document ID");
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("Provide valid document id"));
            System.out.println("Error occurred as expected: " + e.getMessage());
        }
    }

    @Test
    @Order(30)
    public void testExtendExpiryPositive() throws Exception {
        try {
            LocalDate currentDate = LocalDate.now();
            LocalDate newExpiryDate = currentDate.plusMonths(3);
            String newExpiryDateStr = newExpiryDate.toString();
            ExtendExpiry extendExpiry = new ExtendExpiry();
            extendExpiry.setNewExpiryValue(newExpiryDateStr);
            documentApi.extendExpiry(documentId, extendExpiry);
            assertNull(null);
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(31)
    public void testExtendExpiryNegative() throws Exception {
        try {
            String newExpiryDate = LocalDate.now(ZoneOffset.UTC).plusMonths(3)
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            String documentId = "WrongDocumentId";
            ExtendExpiry extendExpiry = new ExtendExpiry();
            extendExpiry.setNewExpiryValue(newExpiryDate);
            documentApi.extendExpiry(documentId, extendExpiry);
            fail("Expected ApiException for invalid document ID, but none was thrown.");
        } catch (ApiException e) {
            Assertions.assertEquals(404, e.getCode());
            Assertions.assertTrue(e.getResponseBody().contains("Invalid Document ID"));
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(32)
    public void testListDocumentsPositive() throws Exception {
            try {
                Integer page = 1;
                Integer pageSize = 10;
                DocumentRecords listDocumentsResponse = documentApi.listDocuments(
                        page,
                        null,
                        null,
                        null,
                        pageSize,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                );
                Assertions.assertNotNull(listDocumentsResponse);
                Assertions.assertTrue(listDocumentsResponse.getResult().size() > 0);
                System.out.println("Documents: " + listDocumentsResponse);
            } catch (ApiException e) {
                System.err.println("Error occurred: " + e.getMessage());
                e.printStackTrace();
                fail("API Exception occurred: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Unexpected error: " + e.getMessage());
                e.printStackTrace();
                fail("Unexpected exception occurred: " + e.getMessage());
            }
        }

    @Test
    @Order(33)
    public void testListDocumentsWithInvalidPageSize() {
        try {
            Integer page = -1;
            Integer invalidPageSize = 250;
            DocumentRecords listDocumentsResponse = documentApi.listDocuments(
                    page,
                    null,
                    null,
                    null,
                    invalidPageSize,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null
            );
            fail("Expected an ApiException to be thrown due to invalid page size.");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("Page number should be greater than 0"));
            assertTrue(e.getMessage().contains("Provide a valid page size between 1 and 100"));
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(34)
    public void testListTeamDocumentsPositive() {
        try {
            Integer page = 1;
            String transmitType = "Sent";
            Integer pageSize = 10;
            OffsetDateTime startDate = OffsetDateTime.parse("2024-01-01T00:00:00Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            List<String> status = new ArrayList<>();
            status.add("None");
            OffsetDateTime endDate = OffsetDateTime.parse("2024-12-31T23:59:59Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            String searchKey = "document title";
            List<String> labels = new ArrayList<>();
            labels.add("Tags");
            Long nextCursor = 233445L;
            TeamDocumentRecords teamDocumentsResponse = documentApi.teamDocuments(
                    page,
                    null,
                    null,
                    transmitType,
                    pageSize,
                    startDate,
                    status,
                    endDate,
                    searchKey,
                    labels,
                    nextCursor,
                    null
            );
            assertNotNull(teamDocumentsResponse);
            assertTrue(teamDocumentsResponse.getResult().size() >= 0);
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(35)
    public void testListTeamDocumentsNegative() {
        try {
            Integer page = 1;
            List<String> userId = new ArrayList<>();
            userId.add(null);
            List<String> teamId = new ArrayList<>();
            teamId.add(null);
            String transmitType = "Sent";
            Integer pageSize = 10;
            OffsetDateTime startDate = OffsetDateTime.parse("2024-01-01T00:00:00Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            List<String> status = new ArrayList<>();
            status.add("None");
            OffsetDateTime endDate = OffsetDateTime.parse("2024-12-31T23:59:59Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            String searchkey = "document title";
            List<String> labels = new ArrayList<>();
            labels.add("Tags");
            Long nextCursor = 233445L;
            List<String> brandIDs = new ArrayList<>();
            TeamDocumentRecords teamDocumentsResponse = documentApi.teamDocuments(
                    page,
                    userId,
                    teamId,
                    transmitType,
                    pageSize,
                    startDate,
                    status,
                    endDate,
                    searchkey,
                    labels,
                    nextCursor,
                    null
            );
            fail("Expected an exception due to invalid teamId or userId, but no exception was thrown.");
        } catch (ApiException e) {
            System.err.println("API Exception occurred: " + e.getMessage());
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Please provide valid team ID") || e.getMessage().contains("Please provide valid user ID"));
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(36)
    public void testListBehalfDocumentsPositive() {
        try {
            Integer page = 1;
            String pageType = "BehalfOfOthers";
            Integer pageSize = 10;
            OffsetDateTime startDate = OffsetDateTime.parse("2023-01-01T00:00:00+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            List<String> status = new ArrayList<>();
            status.add("None");
            OffsetDateTime endDate = OffsetDateTime.parse("2023-12-31T23:59:59+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            String searchKey = "documents";
            List<String> labels = new ArrayList<>();
            labels.add("Tags");
            Long nextCursor = 1689815402493L;
            BehalfDocumentRecords behalfDocumentsResponse = documentApi.behalfDocuments(
                    page,
                    pageType,
                    null,
                    null,
                    pageSize,
                    startDate,
                    status,
                    endDate,
                    searchKey,
                    labels,
                    nextCursor,
                    null
            );
            assertNotNull(behalfDocumentsResponse);
            assertNotNull(behalfDocumentsResponse.getResult());
            assertTrue(behalfDocumentsResponse.getResult().size() >= 0);
            System.out.println("Documents on behalf retrieved successfully:");
            System.out.println(behalfDocumentsResponse);
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(37)
    public void testListBehalfDocumentNegativeWithInvalidData() {
        try {
            Integer page = 1;
            String pageType = "InvalidPageType";
            List<String> emailAddress = new ArrayList<>();
            emailAddress.add("invalid-email");
            List<String> signers = new ArrayList<>();
            signers.add("invalid-signer");
            Integer pageSize = 10;
            OffsetDateTime startDate = OffsetDateTime.parse("2023-01-01T00:00:00+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            List<String> status = new ArrayList<>();
            status.add("None");
            OffsetDateTime endDate = OffsetDateTime.parse("2023-12-31T23:59:59+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            String searchkey = "nonexistent document";
            List<String> labels = new ArrayList<>();
            labels.add("InvalidTag");
            Long nextCursor = 1689815402493L;
            List<String> brandIds = new ArrayList<>();
            brandIds.add("INVALID_BRAND_ID");
            BehalfDocumentRecords behalfDocumentsResponse = documentApi.behalfDocuments(
                    page,
                    pageType,
                    emailAddress,
                    signers,
                    pageSize,
                    startDate,
                    status,
                    endDate,
                    searchkey,
                    labels,
                    nextCursor,
                    brandIds
            );
            assertNull(behalfDocumentsResponse);
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("The value 'InvalidPageType' is not valid for PageType")|| e.getMessage().contains("The field EmailAddress is invalid"));
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

      @Test
      @Order(38)
    public void testListBehalfDocumentsWithInvalidPageAndPageSize() {
        try {
            Integer page = 150;
            String pageType = "BehalfOfOthers";
            List<String> emailAddress = new ArrayList<>();
            emailAddress.add("sdktesting121@syncfusion.com");
            List<String> signers = new ArrayList<>();
            signers.add("sdktesting+2@syncfusion.com");
            signers.add("sdktesting+3@syncfusion.com");
            Integer pageSize = 500;
            OffsetDateTime startDate = OffsetDateTime.parse("2023-01-01T00:00:00+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            List<String> status = new ArrayList<>();
            status.add("None");
            OffsetDateTime endDate = OffsetDateTime.parse("2023-12-31T23:59:59+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            String searchkey = "documents";
            List<String> labels = new ArrayList<>();
            labels.add("Tags");
            Long nextCursor = 1689815402493L;
            List<String> brandIds = new ArrayList<>();
            brandIds.add("YOUR_BRAND_ID");
            BehalfDocumentRecords behalfDocumentsResponse = documentApi.behalfDocuments(
                    page,
                    pageType,
                    emailAddress,
                    signers,
                    pageSize,
                    startDate,
                    status,
                    endDate,
                    searchkey,
                    labels,
                    nextCursor,
                    brandIds
            );
            assertNull(behalfDocumentsResponse);
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Provide a valid page size between 1 and 100"));
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(39)
    public void testChangeRecipientPositive() {
        try {
            String oldSignerEmail = "divya.boopathy+9@syncfusion.com";
            String reason = "Wrongly sent";
            String newSignerName = "Test Signer";
            String newSignerEmail = "divya.boopathy+new@syncfusion.com";
            ChangeRecipient changeRecipient = new ChangeRecipient();
            changeRecipient.setOldSignerEmail(oldSignerEmail);
            changeRecipient.setReason(reason);
            changeRecipient.setNewSignerName(newSignerName);
            changeRecipient.setNewSignerEmail(newSignerEmail);
            documentApi.changeRecipient(documentId, changeRecipient);
            assertTrue(true, "Recipient change should succeed.");
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(40)
    public void testChangeRecipientNegative() {
        try {
            String documentId = "INVALID_DOCUMENT_ID";
            String oldSignerEmail = "divya.boopathy+9@syncfusion.com";
            String reason = "Wrongly sent";
            String newSignerName = "Test Signer";
            String newSignerEmail = "divya.boopathy+new@syncfusion.com";
            ChangeRecipient changeRecipient = new ChangeRecipient();
            changeRecipient.setOldSignerEmail(oldSignerEmail);
            changeRecipient.setReason(reason);
            changeRecipient.setNewSignerName(newSignerName);
            changeRecipient.setNewSignerEmail(newSignerEmail);
            documentApi.changeRecipient(documentId, changeRecipient);
            fail("Expected an ApiException to be thrown due to invalid document ID or signer email.");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("The field documentId is invalid"));
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(41)
    public void testRevokeDocumentPositive() throws Exception
    {
        RevokeDocument revokeDocument = new RevokeDocument();
        revokeDocument.setMessage("This is document revoke message");
        documentApi.revokeDocument(documentId, revokeDocument);
        assertTrue(true, "Document revocation successful.");
    }

    @Test
    @Order(42)
    public void testRevokeDocumentNegative()
    {
        RevokeDocument revokeDocument = new RevokeDocument();
        revokeDocument.setMessage("This is document revoke message");
        String documentId = "Invalid_DOCUMENT_ID";
        try
        {
            documentApi.revokeDocument(documentId, revokeDocument);
            Assertions.fail("Expected ApiException due to invalid document ID, but no exception was thrown.");
        }
        catch (ApiException e)
        {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Provide valid document id"));
        }
    }

    @Test
    @Order(43)
    public void testDeleteDocumentPositive() throws ApiException {
        Boolean deletePermanently = false;
        documentApi.deleteDocument(documentId, deletePermanently);
        System.out.println("Document deleted successfully!");
        assertTrue(true, "Document deleted successfully.");
    }

    @Test
    @Order(44)
    public void testDeleteNonExistentDocument() {
        String documentId = "Invalid_DOCUMENT_ID";
        Boolean deletePermanently = false;
        try {
            documentApi.deleteDocument(documentId, deletePermanently);
            assertTrue(false);
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Provide valid document id"));
        }
    }

    @Test
    @Order(45)
    public void testSendDocumentWithImageField() {
        try {
            String imagePath = "examples/documents/logo.jpg";
            String base64Image = imageToBase64(imagePath);
            FormField imageField = new FormField();
            imageField.setName("image_Test");
            imageField.setFieldType(FieldTypeEnum.IMAGE);
            imageField.setFont(FormField.FontEnum.HELVETICA);
            imageField.setPageNumber(1);
            imageField.setIsRequired(true);
            imageField.setValue(base64Image);
            imageField.setImageInfo(new ImageInfo().title("Image Test").allowedFileExtensions(".jpg").description("Image for testing"));
            imageField.setBounds(new Rectangle().x(50f).y(50f).width(100f).height(150f));
            DocumentSigner signer = new DocumentSigner();
            signer.setName("Test Signer");
            signer.setEmailAddress("divya.boopathy+2@syncfusion.com");
            signer.setSignerOrder(1);
            signer.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            signer.setAuthenticationType(DocumentSigner.AuthenticationTypeEnum.ACCESS_CODE);
            signer.setAuthenticationCode("123456");
            signer.setFormFields(Collections.singletonList(imageField));
            signer.setPrivateMessage("This is private message for signer");
            SendForSign sendDocumentRequest = new SendForSign();
            sendDocumentRequest.setTitle("Document SDK API");
            sendDocumentRequest.setFiles(Collections.singletonList(new File("examples/documents/agreement.pdf")));
            sendDocumentRequest.setSigners(Collections.singletonList(signer));
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            Assertions.assertNotNull(sendDocument);
            Assertions.assertNotNull(sendDocument.getDocumentId());
            Assertions.assertTrue(sendDocument instanceof DocumentCreated);
            System.out.println("Test Doc ID: " + sendDocument.getDocumentId());
        } catch (ApiException e) {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(46)
    public void testSendDocumentCheckboxFieldToCheckedAndReadOnly() throws Exception {
        try {
            FormField checkboxField = new FormField();
            checkboxField.setId("CheckBox");
            checkboxField.setName("CheckBox");
            checkboxField.setFieldType(FieldTypeEnum.CHECK_BOX);
            checkboxField.setFont(FormField.FontEnum.HELVETICA);
            checkboxField.setValue("on");
            checkboxField.setPageNumber(1);
            checkboxField.setIsReadOnly(true);
            checkboxField.setBounds(new Rectangle().x(50f).y(50f).width(100f).height(150f));
            List<FormField> formFields = new ArrayList<>();
            formFields.add(checkboxField);
            DocumentSigner signer = new DocumentSigner();
            signer.setName("Test Signer");
            signer.setEmailAddress("divya.boopathy+4@syncfusion.com");
            signer.setSignerOrder(1);
            signer.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            signer.setAuthenticationType(DocumentSigner.AuthenticationTypeEnum.ACCESS_CODE);
            signer.setAuthenticationCode("123456");
            signer.setFormFields(formFields);
            signer.setPrivateMessage("This is private message for signer");
            SendForSign sendDocumentRequest = new SendForSign();
            sendDocumentRequest.setTitle("Document SDK API");
            List<File> files = new ArrayList<>();
            files.add(new File("examples/documents/agreement.pdf"));
            sendDocumentRequest.setFiles(files);
            List<DocumentSigner> signers = new ArrayList<>();
            signers.add(signer);
            sendDocumentRequest.setSigners(signers);
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            Assertions.assertNotNull(sendDocument);
            Assertions.assertNotNull(sendDocument.getDocumentId());
            Assertions.assertTrue(sendDocument instanceof DocumentCreated);
        } catch (ApiException e) {
            System.err.println("\nException when calling BoldSign API: " + e.getMessage());
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nException when calling BoldSign: " + e.getMessage());
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Test
    @Order(47)
    public void testSendDocumentAddGroupCheckboxes() {

        try {
            FormField checkBox1 = new FormField()
                    .id("CheckBox1")
                    .name("CheckBox1")
                    .fieldType(FieldTypeEnum.CHECK_BOX)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isRequired(true)
                    .bounds(new Rectangle());

            FormField checkBox2 = new FormField()
                    .id("CheckBox2")
                    .name("CheckBox2")
                    .fieldType(FieldTypeEnum.CHECK_BOX)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isRequired(true)
                    .bounds(new Rectangle());

            FormField checkBox3 = new FormField()
                    .id("CheckBox3")
                    .name("CheckBox3")
                    .fieldType(FieldTypeEnum.CHECK_BOX)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isRequired(true)
                    .bounds(new Rectangle());

            FormField checkBox4 = new FormField()
                    .id("CheckBox4")
                    .name("CheckBox4")
                    .fieldType(FieldTypeEnum.CHECK_BOX)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isRequired(true)
                    .bounds(new Rectangle());
            DocumentSigner signer = new DocumentSigner()
                    .name("Test Signer")
                    .emailAddress("girisankar.syncfusion@gmail.com")
                    .signerOrder(1)
                    .signerType(DocumentSigner.SignerTypeEnum.SIGNER)
                    .authenticationType(DocumentSigner.AuthenticationTypeEnum.ACCESS_CODE)
                    .authenticationCode("123456")
                    .formFields(Arrays.asList(checkBox1, checkBox2, checkBox3, checkBox4));
            SendForSign sendDocumentRequest = new SendForSign()
                    .title("Document SDK API")
                    .files(Arrays.asList(new File("examples/documents/agreement.pdf")))
                    .signers(Arrays.asList(signer));
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            assertNotNull(sendDocument);
            assertTrue(sendDocument instanceof DocumentCreated);
            assertNotNull(sendDocument.getDocumentId());
            String createdDocumentId = sendDocument.getDocumentId();
            System.out.println("Test Document ID: " + createdDocumentId);
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    @Order(48)
    public void testReplaceFillableFields() {
        try {
            FormField signField = new FormField()
                    .name("Sign")
                    .fieldType(FieldTypeEnum.SIGNATURE)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isRequired(true)
                    .bounds(new Rectangle());
            DocumentSigner signer = new DocumentSigner()
                    .name("Test Signer")
                    .emailAddress("divya.boopathy+3@syncfusion.com")
                    .signerOrder(1)
                    .signerType(DocumentSigner.SignerTypeEnum.SIGNER)
                    .authenticationType(DocumentSigner.AuthenticationTypeEnum.ACCESS_CODE)
                    .authenticationCode("123456")
                    .formFields(new ArrayList<FormField>() {{
                        add(signField);
                    }})
                    .privateMessage("This is private message for signer");
            File file = new File("examples/documents/agreement.pdf");
            ArrayList<File> files = new ArrayList<>();
            files.add(file);
            ArrayList<DocumentSigner> signers = new ArrayList<>();
            signers.add(signer);
            SendForSign sendDocumentRequest = new SendForSign()
                    .title("Document SDK API")
                    .files(files)
                    .signers(signers)
                    .autoDetectFields(true);
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            assertNotNull(sendDocument);
            assertTrue(sendDocument instanceof DocumentCreated);
            assertNotNull(sendDocument.getDocumentId());
            String createdDocumentId = sendDocument.getDocumentId();
            System.out.println("Test Document ID: " + createdDocumentId);
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    @Order(49)
    public void testSendDocumentTextField() {
        try {
            FormField textField = new FormField()
                    .id("textValue")
                    .fieldType(FieldTypeEnum.TEXT_BOX)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isReadOnly(true)
                    .validationType(FormField.ValidationTypeEnum.NUMBERS_ONLY)
                    .bounds(new Rectangle());
            DocumentSigner signer = new DocumentSigner()
                    .name("Test Signer")
                    .emailAddress("divya.boopathy+7@syncfusion.com")
                    .signerOrder(1)
                    .signerType(DocumentSigner.SignerTypeEnum.SIGNER)
                    .formFields(new ArrayList<FormField>() {{
                        add(textField);
                    }});
            File file = new File("examples/documents/agreement.pdf");
            ArrayList<File> files = new ArrayList<>();
            files.add(file);
            ArrayList<DocumentSigner> signers = new ArrayList<>();
            signers.add(signer);
            SendForSign sendDocumentRequest = new SendForSign()
                    .title("Document SDK API")
                    .files(files)
                    .signers(signers)
                    .autoDetectFields(true);
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            assertNotNull(sendDocument);
            assertTrue(sendDocument instanceof DocumentCreated);
            assertNotNull(sendDocument.getDocumentId());
            createdDocumentId = sendDocument.getDocumentId();
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    @Order(50)
    public void testPrefillingReadonlyFields() {
        try {
            PrefillField prefillField = new PrefillField()
                    .id("textValue")
                    .value("123456789");
            PrefillFieldRequest prefillFieldRequest = new PrefillFieldRequest()
                    .fields(new ArrayList<PrefillField>() {{
                        add(prefillField);
                    }});
            if (createdDocumentId == null) {
                fail("Document ID not found. Ensure the send document test case is run before this.");
            }
            documentApi.prefillFields(createdDocumentId, prefillFieldRequest);
        } catch (ApiException e) {
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(51)
    public void testSendDocumentDisableEmail() {
        try {
            if (createdDocumentId == null) {
                Assertions.fail("Document ID not found. Ensure the send document test case is run before this.");
            }
            FormField textField = new FormField()
                    .id("textValue")
                    .fieldType(FormField.FieldTypeEnum.TEXT_BOX)
                    .font(FormField.FontEnum.HELVETICA)
                    .pageNumber(1)
                    .isReadOnly(true)
                    .validationType(FormField.ValidationTypeEnum.NUMBERS_ONLY)
                    .bounds(new Rectangle().x(50f).y(50f).width(100f).height(150f));
            DocumentSigner signer = new DocumentSigner()
                    .name("Test Signer")
                    .emailAddress("divya.boopathy+8@syncfusion.com")
                    .signerOrder(1)
                    .signerType(DocumentSigner.SignerTypeEnum.SIGNER)
                    .formFields(new ArrayList<FormField>() {{
                        add(textField);
                    }});
            ArrayList<DocumentSigner> signers = new ArrayList<>();
            signers.add(signer);
            File file1 = new File("examples/documents/agreement.pdf");
            List<File> files = new ArrayList<>();
            files.add(file1);
            SendForSign sendDocumentRequest = new SendForSign()
                    .title("Document SDK API")
                    .files(files)
                    .disableEmails(true)
                    .signers(signers);
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            Assertions.assertNotNull(sendDocument);
            Assertions.assertTrue(sendDocument instanceof DocumentCreated);
            Assertions.assertNotNull(sendDocument.getDocumentId());
            createdDocumentId = sendDocument.getDocumentId();
        } catch (ApiException e) {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(52)
    public void testSendDocumentOnBehalf() {
        try {
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(50f);
            bounds.setWidth(200f);
            bounds.setHeight(25f);
            formField.setBounds(bounds);
            DocumentSigner documentSigner = new DocumentSigner();
            documentSigner.setName("Test Signer");
            documentSigner.setEmailAddress("divya.boopathy+6@syncfusion.com");
            documentSigner.setSignerOrder(1);
            documentSigner.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            documentSigner.setFormFields(Arrays.asList(formField));
            SendForSign sendForSign = new SendForSign();
            sendForSign.setTitle("SDK Document Test case");
            sendForSign.setMessage("Testing document from SDK integration test case");
            List<File> files = Arrays.asList(new File("examples/documents/agreement.pdf"));
            sendForSign.setFiles(files);
            sendForSign.setDisableExpiryAlert(false);
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(false);
            sendForSign.setReminderSettings(reminderSettings);
            sendForSign.setEnableReassign(true);
            sendForSign.setMessage("Please sign this.");
            sendForSign.setSigners(Arrays.asList(documentSigner));
            sendForSign.setEnablePrintAndSign(false);
            sendForSign.setAutoDetectFields(false);
            sendForSign.setOnBehalfOf("divya.boopathy+5@syncfusion.com");
            sendForSign.setEnableSigningOrder(false);
            sendForSign.setUseTextTags(false);
            sendForSign.setTitle("Agreement");
            sendForSign.setHideDocumentId(false);
            sendForSign.setExpiryValue(60L);
            sendForSign.setDisableEmails(false);
            sendForSign.setDisableSMS(false);
            DocumentCreated sendDocumentResponse = documentApi.sendDocument(sendForSign);
            Assertions.assertNotNull(sendDocumentResponse);
            Assertions.assertTrue(sendDocumentResponse instanceof DocumentCreated);
            Assertions.assertNotNull(sendDocumentResponse.getDocumentId());
        } catch (ApiException e) {
            e.printStackTrace();
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(53)
    public void testSendDocumentWithFileUrl() {
        try {
            SendForSign sendDocumentRequest = new SendForSign();
            sendDocumentRequest.setTitle("Document SDK API");
            String[] fileUrls = new String[] {
                    "https://fir-demo-html.web.app/test-document1.pdf",
                    "https://fir-demo-html.web.app/BasicTags1.pdf"
            };
            List<URI> fileUriList = new ArrayList<>();
            fileUriList.add(URI.create("https://fir-demo-html.web.app/BasicTags1.pdf"));
            sendDocumentRequest.setFileUrls(fileUriList);
            List<FormField> formFields = new ArrayList<>();
            FormField signatureField = new FormField();
            signatureField.setName("Sign");
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setFont(FormField.FontEnum.HELVETICA);
            signatureField.setPageNumber(1);
            signatureField.setIsRequired(true);
            signatureField.setBounds(new Rectangle().x(50f).y(50f).width(100f).height(150f));
            formFields.add(signatureField);
            DocumentSigner signer = new DocumentSigner();
            signer.setName("Test Signer");
            signer.setEmailAddress("divya.boopathy+3@syncfusion.com");
            signer.setSignerOrder(1);
            signer.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            signer.setAuthenticationType(DocumentSigner.AuthenticationTypeEnum.ACCESS_CODE);
            signer.setAuthenticationCode("123456");
            signer.setFormFields(formFields);
            signer.setPrivateMessage("This is private message for signer");
            List<DocumentSigner> signers = new ArrayList<>();
            signers.add(signer);
            sendDocumentRequest.setSigners(signers);
            DocumentCreated sendDocument = documentApi.sendDocument(sendDocumentRequest);
            Assertions.assertNotNull(sendDocument);
            Assertions.assertNotNull(sendDocument.getDocumentId());
            Assertions.assertTrue(sendDocument instanceof DocumentCreated);
            System.out.println("Document sent successfully with document ID: " + sendDocument.getDocumentId());
        } catch (ApiException e) {
            System.err.println("\nException when calling BoldSign API: " + e.getMessage());
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nException when calling BoldSign: " + e.getMessage());
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Test
    @Order(54)
    public void testCreateEmbeddedRequestUrlDocument() {
        try {
            Rectangle rectangle = new Rectangle();
            rectangle.setX(50f);
            rectangle.setY(50f);
            rectangle.setWidth(200f);
            rectangle.setHeight(30f);
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            formField.setBounds(rectangle);
            DocumentSigner documentSigner = new DocumentSigner();
            documentSigner.setName("Signer Name 1");
            documentSigner.setEmailAddress("signer1@boldsign.dev");
            documentSigner.setSignerOrder(1);
            documentSigner.setSignerType(DocumentSigner.SignerTypeEnum.SIGNER);
            documentSigner.setAuthenticationCode("1123");
            documentSigner.setPrivateMessage("This is private message for signer");
            documentSigner.setFormFields(Arrays.asList(formField));
            documentSigner.setLocale(DocumentSigner.LocaleEnum.EN);
            EmbeddedDocumentRequest embeddedDocumentRequest = new EmbeddedDocumentRequest();
            embeddedDocumentRequest.setTitle("Sent from API Java SDK");
            embeddedDocumentRequest.setShowToolbar(true);
            embeddedDocumentRequest.setShowNavigationButtons(true);
            embeddedDocumentRequest.setShowPreviewButton(true);
            embeddedDocumentRequest.setShowSendButton(true);
            embeddedDocumentRequest.setShowSaveButton(true);
            embeddedDocumentRequest.setSendViewOption(EmbeddedDocumentRequest.SendViewOptionEnum.PREPARE_PAGE);
            embeddedDocumentRequest.setLocale(EmbeddedDocumentRequest.LocaleEnum.EN);
            embeddedDocumentRequest.setShowTooltip(false);
            embeddedDocumentRequest.setRedirectUrl(URI.create("https://boldsign.dev/sign/redirect"));
            embeddedDocumentRequest.setMessage("This is document message sent from API Java SDK");
            embeddedDocumentRequest.setEnableSigningOrder(false);
            embeddedDocumentRequest.setSigners(Arrays.asList(documentSigner));
            File file = new File("examples/documents/agreement.pdf");
            if (!file.exists()) {
                Assertions.fail("The specified file does not exist: " + file.getAbsolutePath());
            }
            embeddedDocumentRequest.setFiles(Arrays.asList(file));
            EmbeddedSendCreated response = documentApi.createEmbeddedRequestUrlDocument(embeddedDocumentRequest);
            Assertions.assertNotNull(response.getSendUrl(), "Embedded document URL should not be null.");
            System.out.println("Embedded Document URL: " + response.getSendUrl());
        } catch (ApiException e) {
            Assertions.fail("API call failed: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("An unexpected error occurred: " + e.getMessage());
        }
    }
}