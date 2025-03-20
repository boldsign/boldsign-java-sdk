package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.BrandingApi;
import com.boldsign.model.BrandCreated;
import com.boldsign.model.BrandingMessage;
import com.boldsign.model.BrandingRecords;
import com.boldsign.model.ViewBrandDetails;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BrandApiTest
{
    private static ApiClient apiClient;
    private static BrandingApi brandingApi;
    private static String createdBrandId;

    @BeforeAll
    public static void setup()
    {
        createdBrandId = null;
        String APIKey = System.getenv("API_KEY");
        String url = System.getenv("HOST_URL");
        apiClient = new ApiClient();
        apiClient.setApiKey(APIKey);
        apiClient.setBasePath(url);
        brandingApi = new BrandingApi(apiClient);
    }

    @Test
    @Order(1)
    public void testCreateBrandPositive() throws ApiException
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
            System.err.println("\nException when calling BoldSign API: " + e);
            fail("API Exception occurred: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.err.println("\nUnexpected exception when calling BoldSign: " + e);
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
    public void testCreateBrandNegative() throws ApiException
    {
        try
        {
            String brandname = "";
            File logoFile = new File("examples/documents/logo.jpg");
            String backgroundcolor = "red";
            String buttoncolor = "green";
            String buttonTextcolor = "white";
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
            brandingApi.createBrand(
                    brandname,
                    logoFile,
                    backgroundcolor,
                    buttoncolor,
                    buttonTextcolor,
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
            fail("Expected ApiException was not thrown due to invalid redirect URL.");
        }
        catch (ApiException e)
        {
            System.out.println("Expected error occurred while calling the API: " + e.getMessage());
            e.printStackTrace();
            assertTrue(e.getMessage().contains("The Brand name is required"));
        }
    }

    @Test
    @Order(3)
    public void EditBrandPositive() throws ApiException
    {
        String BrandId = BrandApiTest.createdBrandId;
        String updatedBrandName = "Syncfusion Updated";
        File updatedBrandLogo = new File("examples/documents/logo.jpg");
        String updatedBackgroundColor = "blue";
        String updatedButtonColor = "orange";
        String updatedButtonTextColor = "black";
        String updatedEmailDisplayname = "{SenderName} from Updated Syncfusion";
        String updatedDisclaimerDescription = "Syncfusion Updated";
        String updatedDisclaimerTitle = "Updated DiscalimerTitle";
        String updatedRedirectUrl = "https://www.syncfusion.com/updated";
        Boolean updatedIsDefault = false;
        Boolean updatedCanHideTagLine = true;
        Boolean updatedCombineAuditTrail = true;
        Boolean updatedExcludeAuditTrailFromEmail = false;
        String updatedEmailSignedDocument = "2";
        String updatedDocumentTimeZone = "+06:30";
        Boolean updatedShowBuiltInFormFields = true;
        Boolean updatedAllowCustomFieldCreation = true;
        Boolean updatedShowSharedCustomFields = false;
        Boolean updatedHideDecline = false;
        Boolean updatedHideSave = false;
        String updatedDocumentExpirySettingsExpiryDateType = "Days";
        Integer updatedDocumentExpirySettingsExpiryValue = 15;
        Boolean updatedDocumentExpirySettingsEnableDefaultExpiryAlert = true;
        Boolean updatedDocumentExpirySettingsEnableAutoReminder = true;
        Integer updatedDocumentExpirySettingsRemainderDays = 2;
        Integer updatedDocumentExpirySettingsReminderCount = 3;
        String updatedCustomDomainSettingsDomainName = "mail.updateddomain.com";
        String updatedCustomDomainSettingsFromName = "notifications-updated";

        try
        {
            BrandCreated updatedBrandingResponse = brandingApi.editBrand(
                    BrandId,
                    updatedBrandName,
                    updatedBrandLogo,
                    updatedBackgroundColor,
                    updatedButtonColor,
                    updatedButtonTextColor,
                    updatedEmailDisplayname,
                    updatedDisclaimerDescription,
                    updatedDisclaimerTitle,
                    updatedRedirectUrl,
                    updatedIsDefault,
                    updatedCanHideTagLine,
                    updatedCombineAuditTrail,
                    updatedExcludeAuditTrailFromEmail,
                    updatedEmailSignedDocument,
                    updatedDocumentTimeZone,
                    updatedShowBuiltInFormFields,
                    updatedAllowCustomFieldCreation,
                    updatedShowSharedCustomFields,
                    updatedHideDecline,
                    updatedHideSave,
                    updatedDocumentExpirySettingsExpiryDateType,
                    updatedDocumentExpirySettingsExpiryValue,
                    updatedDocumentExpirySettingsEnableDefaultExpiryAlert,
                    updatedDocumentExpirySettingsEnableAutoReminder,
                    updatedDocumentExpirySettingsRemainderDays,
                    updatedDocumentExpirySettingsReminderCount,
                    updatedCustomDomainSettingsDomainName,
                    updatedCustomDomainSettingsFromName
            );
            assertNotNull(updatedBrandingResponse, "Response should not be null");
            assertEquals(BrandId, updatedBrandingResponse.getBrandId(), "Brand ID should be the same after update");
            assertTrue(updatedBrandingResponse instanceof BrandCreated, "Response should be an instance of BrandCreated");
        }
        catch (ApiException e)
        {
            System.out.println("\nException when calling BoldSign API: " + e);
            fail("API Exception occurred: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("\nUnexpected exception occurred: " + e);
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(4)
    public void testEditBrandNegative() throws ApiException
    {
        String invalidBrandId = "9edbb750-3f6c-490d-a897-7397bd1c793e";
        String updatedBrandName = "Syncfusion Updated";
        File updatedBrandLogo = new File("examples/documents/logo.jpg");
        String updatedBackgroundColor = "blue";
        String updatedButtonColor = "orange";
        String updatedButtonTextColor = "black";
        String updatedEmailDisplayname = "{SenderName} from Updated Syncfusion";
        String updatedDisclaimerDescription = "Syncfusion Updated";
        String updatedDisclaimerTitle = "Updated DiscalimerTitle";
        String updatedRedirectUrl = "https://www.syncfusion.com/updated";
        Boolean updatedIsDefault = false;
        Boolean updatedCanHideTagLine = true;
        Boolean updatedCombineAuditTrail = true;
        Boolean updatedExcludeAuditTrailFromEmail = false;
        String updatedEmailSignedDocument = "2";
        String updatedDocumentTimeZone = "+06:30";
        Boolean updatedShowBuiltInFormFields = true;
        Boolean updatedAllowCustomFieldCreation = true;
        Boolean updatedShowSharedCustomFields = false;
        Boolean updatedHideDecline = false;
        Boolean updatedHideSave = false;
        String updatedDocumentExpirySettingsExpiryDateType = "Days";
        Integer updatedDocumentExpirySettingsExpiryValue = 15;
        Boolean updatedDocumentExpirySettingsEnableDefaultExpiryAlert = true;
        Boolean updatedDocumentExpirySettingsEnableAutoReminder = true;
        Integer updatedDocumentExpirySettingsRemainderDays = 2;
        Integer updatedDocumentExpirySettingsReminderCount = 3;
        String updatedCustomDomainSettingsDomainName = "mail.updateddomain.com";
        String updatedCustomDomainSettingsFromName = "notifications-updated";

        try {

            BrandCreated updatedBrandingResponse = brandingApi.editBrand(
                    invalidBrandId,
                    updatedBrandName,
                    updatedBrandLogo,
                    updatedBackgroundColor,
                    updatedButtonColor,
                    updatedButtonTextColor,
                    updatedEmailDisplayname,
                    updatedDisclaimerDescription,
                    updatedDisclaimerTitle,
                    updatedRedirectUrl,
                    updatedIsDefault,
                    updatedCanHideTagLine,
                    updatedCombineAuditTrail,
                    updatedExcludeAuditTrailFromEmail,
                    updatedEmailSignedDocument,
                    updatedDocumentTimeZone,
                    updatedShowBuiltInFormFields,
                    updatedAllowCustomFieldCreation,
                    updatedShowSharedCustomFields,
                    updatedHideDecline,
                    updatedHideSave,
                    updatedDocumentExpirySettingsExpiryDateType,
                    updatedDocumentExpirySettingsExpiryValue,
                    updatedDocumentExpirySettingsEnableDefaultExpiryAlert,
                    updatedDocumentExpirySettingsEnableAutoReminder,
                    updatedDocumentExpirySettingsRemainderDays,
                    updatedDocumentExpirySettingsReminderCount,
                    updatedCustomDomainSettingsDomainName,
                    updatedCustomDomainSettingsFromName
            );
            fail("Expected an ApiException to be thrown due to invalid brand ID");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode(), "Expected status code 400 for bad request");
            assertTrue(e.getMessage().contains("Failed to save the brand"), "Expected message to contain 'invalid brand id'");
        }
        catch (Exception e)
        {
            System.out.println("\nUnexpected exception when calling BoldSign API: " + e);
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(5)
    public void testBrandListPositive() throws ApiException
    {
        try
        {
            BrandingRecords brandingListResponse = brandingApi.brandList();
            assertNotNull(brandingListResponse);
            assertTrue(brandingListResponse.getResult().size() > 0, "Brand list should contain at least one brand");
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
        catch (Exception e)
        {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(6)
    public void testGetBrandPositive() throws ApiException
    {
        String validBrandId = createdBrandId;
        ViewBrandDetails getBrandResponse = brandingApi.getBrand(validBrandId);
        assertNotNull(getBrandResponse, "Response should not be null");
        assertEquals(validBrandId, getBrandResponse.getBrandId(), "Brand ID should match the provided ID");
        assertNotNull(getBrandResponse.getBrandName(), "Brand name should not be null");
    }

    @Test
    @Order(7)
    public void testGetBrandNegative()throws ApiException
    {
        try
        {
            String brandId = "4531c498-c769-4d01-8b33-a7a06660ee00";
            brandingApi.getBrand(brandId);
            fail("API did not throw an exception for invalid brand ID");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode(), "Status code should be 400");
            assertTrue(e.getMessage().contains("Given brand ID does not exist, please provide a valid brand ID."));
        }
        catch (Exception e)
        {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(8)
    public void testResetDefaultBrandPositive()
    {
        try
        {
            String brandId = createdBrandId;
            BrandingMessage getBrandResponse = brandingApi.resetDefaultBrand(brandId);
            assertNotNull(getBrandResponse, "Response should not be null");
            assertEquals("The default brand has been updated successfully", getBrandResponse.getMessage(), "Message should confirm the reset was successful");
            assertTrue(getBrandResponse instanceof BrandingMessage, "Response should be an instance of BrandingMessage");
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
        catch (Exception e)
        {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(9)
    public void ResetDefaultBrandNegative() throws ApiException
    {
        try
        {
            String brandId = "4531c498-c769-4d01-8b33-a7a06660ee0d";
            brandingApi.resetDefaultBrand(brandId);
            fail("Expected ApiException to be thrown due to invalid brand ID");

        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Failed to reset the default brand"));
        }
        catch (Exception e)
        {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(10)
    public void testDeleteBrandPositive() throws ApiException
    {
        String brandId =createdBrandId;
        BrandingMessage deleteBrandResponse = brandingApi.deleteBrand(brandId);
        assertNotNull(deleteBrandResponse);
        assertEquals("The brand has been deleted successfully", deleteBrandResponse.getMessage());
        assertTrue(deleteBrandResponse instanceof BrandingMessage);
    }

    @Test
    @Order(11)
    public void testDeleteBrandNegative() throws ApiException
    {
        String brandId = "2c90f4d1-6c2a-4ea7-b722-995bd40985b5d";
        try
        {
            BrandingMessage deleteBrandResponse = brandingApi.deleteBrand(brandId);
            fail("Expected ApiException was not thrown");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode(), "Expected status code 400 for Bad Request");
            assertTrue(e.getResponseBody().startsWith("{\"errors\":{\"brandId\":[\"Provide a valid brand ID\"]},"),
                    "Expected error message to contain 'Provide a valid brand ID'");
        }
        catch (Exception e)
        {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }
}