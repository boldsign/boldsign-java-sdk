package integration;

import com.boldsign.ApiClient;
import com.boldsign.Configuration;
import com.boldsign.api.BrandingApi;
import com.boldsign.api.CustomFieldApi;
import com.boldsign.model.*;
import com.boldsign.ApiException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomFieldApiTest
{
    private static ApiClient apiClient;
    private static BrandingApi brandingApi;
    private static CustomFieldApi customFieldApi;
    private static String createdCustomFieldId;
    private static String customFieldName;
    private static String createdBrandId;

    private static String randomNumbers()
    {
        Random rand = new Random();
        int rangeStart = (int) Math.pow(10, 3 - 1);
        int rangeEnd = (int) (Math.pow(10, 3) - 1);
        int randomNum = rand.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        return String.valueOf(randomNum);
    }

    @BeforeAll
    public static void setUp() throws Exception
    {
        createdBrandId=null;
        createdCustomFieldId=null;
        customFieldName=null;
        String apiKey = System.getenv("API_KEY");
        String url = System.getenv("HOST_URL");
        apiClient = new ApiClient();
        apiClient.setBasePath(url);
        apiClient.setApiKey(apiKey);
        brandingApi = new BrandingApi(apiClient);
        customFieldApi = new CustomFieldApi(apiClient);
        customFieldName = "Test Custom Field" + randomNumbers();
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
            assertTrue(createBrandingResponse instanceof BrandCreated);
            createdBrandId = createBrandingResponse.getBrandId();
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
    public void testCreateCustomFieldPositive() throws ApiException
    {
        CustomFormField customFormField = new CustomFormField();
        customFormField.setFieldType(CustomFormField.FieldTypeEnum.SIGNATURE);
        customFormField.setWidth(60f);
        customFormField.setHeight(60f);
        customFormField.setIsRequired(true);
        customFormField.setIsReadOnly(true);
        customFormField.setValue("string");
        customFormField.setCharacterLimit(0);
        customFormField.setPlaceHolder("string");
        customFormField.setValidationType(CustomFormField.ValidationTypeEnum.NUMBERS_ONLY);
        customFormField.setValidationCustomRegex("string");
        customFormField.setValidationCustomRegexMessage("string");
        customFormField.setTextAlign(CustomFormField.TextAlignEnum.CENTER);
        customFormField.setTextDirection(CustomFormField.TextDirectionEnum.LTR);
        customFormField.setCharacterSpacing(0f);
        customFormField.setIdPrefix("string");
        customFormField.setRestrictIdPrefixChange(false);
        BrandCustomFieldDetails brandCustomFieldDetails = new BrandCustomFieldDetails();
        brandCustomFieldDetails.setFieldName(customFieldName);
        brandCustomFieldDetails.setFieldDescription("string");
        brandCustomFieldDetails.setFieldOrder(1);
        brandCustomFieldDetails.setBrandId(createdBrandId);
        brandCustomFieldDetails.setSharedField(true);
        brandCustomFieldDetails.setFormField(customFormField);
        CustomFieldMessage createdCustomField = customFieldApi.createCustomField(brandCustomFieldDetails);
        Assertions.assertNotNull(createdCustomField, "CustomFieldMessage should not be null");
        Assertions.assertNotNull(createdCustomField.getCustomFieldId(), "Custom field ID should be returned");
        createdCustomFieldId= createdCustomField.getCustomFieldId();
    }

    @Test
    @Order(3)
    public void testCreateCustomFieldNegative() throws ApiException
    {
        CustomFormField customFormField = new CustomFormField();
        customFormField.setFieldType(CustomFormField.FieldTypeEnum.SIGNATURE);
        customFormField.setWidth(60f);
        customFormField.setHeight(60f);
        customFormField.setIsRequired(true);
        customFormField.setIsReadOnly(true);
        customFormField.setValue("string");
        customFormField.setCharacterLimit(0);
        customFormField.setPlaceHolder("string");
        customFormField.setValidationType(CustomFormField.ValidationTypeEnum.NUMBERS_ONLY);
        customFormField.setValidationCustomRegex("string");
        customFormField.setValidationCustomRegexMessage("string");
        customFormField.setTextAlign(CustomFormField.TextAlignEnum.CENTER);
        customFormField.setTextDirection(CustomFormField.TextDirectionEnum.LTR);
        customFormField.setCharacterSpacing(0f);
        customFormField.setIdPrefix("string");
        customFormField.setRestrictIdPrefixChange(false);
        BrandCustomFieldDetails brandCustomFieldDetails = new BrandCustomFieldDetails();
        brandCustomFieldDetails.setFieldName(customFieldName);
        brandCustomFieldDetails.setFieldDescription("string");
        brandCustomFieldDetails.setFieldOrder(1);
        brandCustomFieldDetails.setBrandId("1200c48a-c97c-4933-ab73-db377bf4a7b7");
        brandCustomFieldDetails.setSharedField(true);
        brandCustomFieldDetails.setFormField(customFormField);
        try
        {
            CustomFieldMessage createdCustomField = customFieldApi.createCustomField(brandCustomFieldDetails);
            Assertions.fail("Expected ApiException was not thrown");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode(), "Expected status code 400 for Bad Request");
            assertTrue(e.getResponseBody().contains("Invalid brand id"), "Expected error message to contain 'Invalid brand ID'");
        }
    }

        @Test
        @Order(4)
        public void testEditCustomFieldPositive() throws ApiException
        {
            CustomFormField customFormField = new CustomFormField();
            customFormField.setFieldType(CustomFormField.FieldTypeEnum.SIGNATURE);
            customFormField.setWidth(60f);
            customFormField.setHeight(60f);
            customFormField.setIsRequired(true);
            customFormField.setIsReadOnly(true);
            customFormField.setValue("new_value");
            customFormField.setCharacterLimit(0);
            customFormField.setPlaceHolder("new_placeholder");
            customFormField.setValidationType(CustomFormField.ValidationTypeEnum.NUMBERS_ONLY);
            customFormField.setValidationCustomRegex("new_regex");
            customFormField.setValidationCustomRegexMessage("new validation message");
            customFormField.setTextAlign(CustomFormField.TextAlignEnum.CENTER);
            customFormField.setTextDirection(CustomFormField.TextDirectionEnum.LTR);
            customFormField.setCharacterSpacing(0f);
            customFormField.setIdPrefix("new_prefix");
            customFormField.setRestrictIdPrefixChange(false);
            BrandCustomFieldDetails brandCustomFieldDetails = new BrandCustomFieldDetails();
            brandCustomFieldDetails.setFieldName("Syncfusion");
            brandCustomFieldDetails.setFieldDescription("Newfield");
            brandCustomFieldDetails.setFieldOrder(1);
            brandCustomFieldDetails.setBrandId(createdBrandId);
            brandCustomFieldDetails.setSharedField(true);
            brandCustomFieldDetails.setFormField(customFormField);
            String customFieldIdToEdit =createdCustomFieldId;
            CustomFieldMessage editedCustomField = customFieldApi.editCustomField(customFieldIdToEdit, brandCustomFieldDetails);
            Assertions.assertNotNull(editedCustomField, "CustomFieldMessage should not be null");
            Assertions.assertEquals(customFieldIdToEdit, editedCustomField.getCustomFieldId(), "Custom Field ID should match");
            System.out.println("Custom field edited successfully: " + editedCustomField.getCustomFieldId());
        }

    @Test
    @Order(5)
    public void testEditCustomFieldNegative()throws ApiException
    {
        CustomFormField customFormField = new CustomFormField();
        customFormField.setFieldType(CustomFormField.FieldTypeEnum.SIGNATURE);
        customFormField.setWidth(60f);
        customFormField.setHeight(60f);
        customFormField.setIsRequired(true);
        customFormField.setIsReadOnly(false);
        customFormField.setValue("SignatureField");
        customFormField.setCharacterLimit(100);
        customFormField.setPlaceHolder("Sign here");
        customFormField.setValidationType(CustomFormField.ValidationTypeEnum.NUMBERS_ONLY);
        customFormField.setValidationCustomRegex("\\d{1,}");
        customFormField.setValidationCustomRegexMessage("Only numbers allowed");
        customFormField.setTextAlign(CustomFormField.TextAlignEnum.CENTER);
        customFormField.setTextDirection(CustomFormField.TextDirectionEnum.LTR);
        customFormField.setCharacterSpacing(1f);
        customFormField.setIdPrefix("CF_");
        customFormField.setRestrictIdPrefixChange(false);
        BrandCustomFieldDetails brandCustomFieldDetails = new BrandCustomFieldDetails();
        brandCustomFieldDetails.setFieldName("Syncfusion");
        brandCustomFieldDetails.setFieldDescription("Valid description for custom field update");
        brandCustomFieldDetails.setFieldOrder(1);
        brandCustomFieldDetails.setBrandId(createdBrandId);
        brandCustomFieldDetails.setSharedField(true);
        brandCustomFieldDetails.setFormField(customFormField);
        String customFieldIdToEdit = "92dc14e7-dce5-4ae5-84c0-e1ffdb0aa28e";
        try
        {
            CustomFieldMessage editedCustomField = customFieldApi.editCustomField(customFieldIdToEdit, brandCustomFieldDetails);
            Assertions.fail("Expected ApiException due to invalid custom field ID, but got: " + editedCustomField);
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("The custom field ID you provided does not exist. Please provide a valid ID."));
        }
    }

    @Test
    @Order(6)
    public void testListCustomFieldsPositive() throws ApiException
    {
        String brandId =createdBrandId;
        CustomFieldCollection customFieldsListResponse = customFieldApi.customFieldsList(brandId);
        Assertions.assertNotNull(customFieldsListResponse, "Response should not be null");
        Assertions.assertNotNull(customFieldsListResponse.getResult(), "Custom fields list should not be null");
        Assertions.assertTrue(customFieldsListResponse.getResult().size() > 0, "Custom fields should be present");
        System.out.println("Custom fields retrieved successfully: " + customFieldsListResponse.getResult().size());
    }

    @Test
    @Order(7)
    public void testListCustomFieldsNegative()throws ApiException
    {
        String invalidBrandId = "1200c48a-c97c-4933-ab73-db377bf4a7a8";
        try
        {
            customFieldApi.customFieldsList(invalidBrandId);
            Assertions.fail("Expected ApiException due to invalid brand ID");
        }
        catch (ApiException e)
        {
            Assertions.assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Invalid brand id"));
            System.out.println("Expected error occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(8)
    public void testCreateEmbeddedCustomFieldPositive() throws ApiException
    {
        String brandId = createdBrandId;
        String linkValidTillStr = "2025-02-10T09%3A12%3A28Z";
        String decodedLinkValidTillStr = URLDecoder.decode(linkValidTillStr, StandardCharsets.UTF_8);
        OffsetDateTime linkValidTill = OffsetDateTime.parse(decodedLinkValidTillStr, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        EmbeddedCustomFieldCreated embeddedCustomFieldResponse = customFieldApi.embedCustomField(brandId, linkValidTill);
        Assertions.assertNotNull(embeddedCustomFieldResponse, "Embedded custom field response should not be null");
        Assertions.assertNotNull(embeddedCustomFieldResponse.getCreateUrl(), "Custom field ID should be returned");
    }

    @Test
    @Order(9)
    public void testCreateEmbeddedCustomFieldNegative()throws ApiException
    {
        String brandId = "1200c48a-c97c-4933-ab73-db377bf4a7a8";
        String linkValidTillStr = "2025-02-10T09%3A12%3A28Z";
        String decodedLinkValidTillStr = URLDecoder.decode(linkValidTillStr, StandardCharsets.UTF_8);
        OffsetDateTime linkValidTill = OffsetDateTime.parse(decodedLinkValidTillStr, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        try
        {
            EmbeddedCustomFieldCreated embeddedCustomFieldResponse = customFieldApi.embedCustomField(brandId, linkValidTill);
            Assertions.fail("Expected ApiException due to invalid brand ID, but the request was successful.");
        }
        catch (ApiException e)
        {
            assertTrue(e.getCode() == 400 , "Expected error code 400: " + e.getCode());
            assertTrue(e.getMessage().contains("Invalid brand id"));
        }
    }

    @Test
    @Order(10)
    public void testDeleteCustomField() throws ApiException
    {
        String customFieldId = createdCustomFieldId;
        customFieldApi.deleteCustomField(customFieldId);
    }

    @Test
    @Order(11)
    public void testDeleteCustomFieldNegative()throws ApiException
    {
        String invalidCustomFieldId = "92dc14e7-dce5-4ae5-84c0-e1ffdb0aa28e";
        try
        {
            customFieldApi.deleteCustomField(invalidCustomFieldId);
            Assertions.fail("Expected ApiException due to invalid custom field ID, but the field was deleted.");
        }
        catch (ApiException e)
        {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The custom field ID you provided does not exist. Please provide a valid ID."));
        }
    }
}