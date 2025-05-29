package integration;

import com.boldsign.model.*;
import com.boldsign.ApiClient;
import com.boldsign.api.TemplateApi;
import com.boldsign.ApiException;
import org.junit.jupiter.api.*;
import java.io.File;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TemplateApiTest
{
    private static ApiClient apiClient;
    private static TemplateApi templateApi;
    private static String createdTemplateId;
    private static String createdTemplateId1;
    private static String createdTemplateId2;
    private static String createdTemplateId3;

    @BeforeAll
    public static void setupClass()
    {
        createdTemplateId=null;
        createdTemplateId1=null;
        createdTemplateId2=null;
        createdTemplateId3=null;
        String apiKey = System.getenv("API_KEY");
        String url = System.getenv("HOST_URL");
        apiClient = new ApiClient();
        apiClient.setBasePath(url);
        apiClient.setApiKey(apiKey);
        templateApi = new TemplateApi(apiClient);
    }

    @Test
    @Order(1)
    public void testCreateTemplatePositive() throws ApiException
    {
        try
        {
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            signatureField.setBounds(bounds);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Hr");
            templateRole.setDefaultSignerName("Mohammed Mushraf Abuthakir");
            templateRole.setDefaultSignerEmail("mohammedmushraf.abuthakir+6@syncfusion.com");
            templateRole.setSignerOrder(1);
            templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            templateRole.setLocale(TemplateRole.LocaleEnum.EN);
            templateRole.setFormFields(formFields);
            templateRole.setAllowRoleEdit(true);
            templateRole.setAllowRoleDelete(true);
            List<TemplateRole> roles = new ArrayList<>();
            roles.add(templateRole);
            CreateTemplateRequest templateRequest = new CreateTemplateRequest();
            templateRequest.setEnableReassign(true);
            templateRequest.setAllowNewRoles(true);
            templateRequest.setEnablePrintAndSign(false);
            templateRequest.setDocumentMessage("document message for signers");
            templateRequest.setEnableSigningOrder(false);
            templateRequest.setUseTextTags(false);
            templateRequest.setTitle("title of the template");
            templateRequest.setAllowMessageEditing(true);
            templateRequest.setDescription("testingDescription");
            templateRequest.setDocumentTitle("title of the document");
            templateRequest.setAllowNewFiles(true);
            templateRequest.setRoles(roles);
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            templateRequest.setFiles(files);
            TemplateCreated createTemplateResponse = templateApi.createTemplate(templateRequest);
            assertNotNull(createTemplateResponse);
            assertNotNull(createTemplateResponse.getTemplateId());
            createdTemplateId=createTemplateResponse.getTemplateId();
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
    public void testCreateTemplateWithoutSignerInfoPositive()throws ApiException
    {
        try
        {
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            signatureField.setBounds(bounds);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Hr");
            templateRole.setSignerOrder(1);
            templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            templateRole.setLocale(TemplateRole.LocaleEnum.EN);
            templateRole.setFormFields(formFields);
            templateRole.setAllowRoleEdit(true);
            templateRole.setAllowRoleDelete(true);
            List<TemplateRole> roles = new ArrayList<>();
            roles.add(templateRole);
            CreateTemplateRequest templateRequest = new CreateTemplateRequest();
            templateRequest.setEnableReassign(true);
            templateRequest.setAllowNewRoles(true);
            templateRequest.setEnablePrintAndSign(false);
            templateRequest.setDocumentMessage("document message for signers");
            templateRequest.setEnableSigningOrder(false);
            templateRequest.setUseTextTags(false);
            templateRequest.setTitle("title of the template");
            templateRequest.setAllowMessageEditing(true);
            templateRequest.setDescription("testingDescription");
            templateRequest.setDocumentTitle("title of the document");
            templateRequest.setAllowNewFiles(true);
            templateRequest.setRoles(roles);
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            templateRequest.setFiles(files);
            TemplateCreated createTemplateResponse = templateApi.createTemplate(templateRequest);
            assertNotNull(createTemplateResponse);
            assertNotNull(createTemplateResponse.getTemplateId());
            createdTemplateId1=createTemplateResponse.getTemplateId();
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(3)
    public void testCreateTemplateWith15RolesPositive() throws ApiException
    {
        try
        {
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            signatureField.setBounds(bounds);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            List<TemplateRole> roles = new ArrayList<>();
            for (int i = 1; i <= 15; i++)
            {
                TemplateRole templateRole = new TemplateRole();
                templateRole.setIndex(i);
                templateRole.setName("Role " + i);
                templateRole.setSignerOrder(i);
                templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
                templateRole.setLocale(TemplateRole.LocaleEnum.EN);
                templateRole.setFormFields(formFields);
                templateRole.setAllowRoleEdit(true);
                templateRole.setAllowRoleDelete(true);
                roles.add(templateRole);
            }
            CreateTemplateRequest templateRequest = new CreateTemplateRequest();
            templateRequest.setEnableReassign(true);
            templateRequest.setAllowNewRoles(true);
            templateRequest.setEnablePrintAndSign(false);
            templateRequest.setDocumentMessage("document message for signers");
            templateRequest.setEnableSigningOrder(true);
            templateRequest.setUseTextTags(false);
            templateRequest.setTitle("Template with 15 Roles");
            templateRequest.setAllowMessageEditing(true);
            templateRequest.setDescription("This is a template with 15 roles.");
            templateRequest.setDocumentTitle("Multi-role template");
            templateRequest.setAllowNewFiles(true);
            templateRequest.setRoles(roles);
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            templateRequest.setFiles(files);
            TemplateCreated createTemplateResponse = templateApi.createTemplate(templateRequest);
            assertNotNull(createTemplateResponse);
            assertNotNull(createTemplateResponse.getTemplateId());
            createdTemplateId2=createTemplateResponse.getTemplateId();
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(4)
    public void testCreateTemplateWithImageFieldPositive() throws ApiException
    {
        try
        {
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle signatureBounds = new Rectangle();
            signatureBounds.setX(50f);
            signatureBounds.setY(100f);
            signatureBounds.setWidth(100f);
            signatureBounds.setHeight(60f);
            signatureField.setBounds(signatureBounds);
            FormField imageField = new FormField();
            imageField.setFieldType(FormField.FieldTypeEnum.IMAGE);
            imageField.setPageNumber(1);
            Rectangle imageBounds = new Rectangle();
            imageBounds.setX(200f);
            imageBounds.setY(100f);
            imageBounds.setWidth(150f);
            imageBounds.setHeight(100f);
            imageField.setBounds(imageBounds);
            ImageInfo imageInfo = new ImageInfo();
            imageInfo.setTitle("Syncfusion");
            imageInfo.allowedFileExtensions(".png");
            imageField.setImageInfo(imageInfo);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            formFields.add(imageField);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Hr");
            templateRole.setDefaultSignerName("Alex Gayle");
            templateRole.setDefaultSignerEmail("alexgayle@boldsign.dev");
            templateRole.setSignerOrder(1);
            templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            templateRole.setLocale(TemplateRole.LocaleEnum.EN);
            templateRole.setFormFields(formFields);
            templateRole.setAllowRoleEdit(true);
            templateRole.setAllowRoleDelete(true);
            List<TemplateRole> roles = new ArrayList<>();
            roles.add(templateRole);
            CreateTemplateRequest templateRequest = new CreateTemplateRequest();
            templateRequest.setEnableReassign(true);
            templateRequest.setAllowNewRoles(true);
            templateRequest.setEnablePrintAndSign(false);
            templateRequest.setDocumentMessage("Document message for signers");
            templateRequest.setEnableSigningOrder(false);
            templateRequest.setUseTextTags(false);
            templateRequest.setTitle("Title of the Template");
            templateRequest.setAllowMessageEditing(true);
            templateRequest.setDescription("This is a description of the template.");
            templateRequest.setDocumentTitle("Title of the Document");
            templateRequest.setAllowNewFiles(true);
            templateRequest.setRoles(roles);
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            templateRequest.setFiles(files);
            TemplateCreated createTemplateResponse = templateApi.createTemplate(templateRequest);
            assertNotNull(createTemplateResponse);
            assertNotNull(createTemplateResponse.getTemplateId());
            createdTemplateId3=createTemplateResponse.getTemplateId();
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(5)
    public void testCreateTemplateWithMultipleFiles() throws ApiException
    {
        try
        {
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            signatureField.setBounds(bounds);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Hr");
            templateRole.setDefaultSignerName("Mohammed Mushraf Abuthakir");
            templateRole.setDefaultSignerEmail("mohammedmushraf.abuthakir+25@syncfusion.com");
            templateRole.setSignerOrder(1);
            templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            templateRole.setLocale(TemplateRole.LocaleEnum.EN);
            templateRole.setFormFields(formFields);
            templateRole.setAllowRoleEdit(true);
            templateRole.setAllowRoleDelete(true);
            List<TemplateRole> roles = new ArrayList<>();
            roles.add(templateRole);
            CreateTemplateRequest templateRequest = new CreateTemplateRequest();
            templateRequest.setEnableReassign(true);
            templateRequest.setAllowNewRoles(true);
            templateRequest.setEnablePrintAndSign(false);
            templateRequest.setDocumentMessage("document message for signers");
            templateRequest.setEnableSigningOrder(false);
            templateRequest.setUseTextTags(false);
            templateRequest.setTitle("title of the template");
            templateRequest.setAllowMessageEditing(true);
            templateRequest.setDescription("testingDescription");
            templateRequest.setDocumentTitle("title of the document");
            templateRequest.setAllowNewFiles(true);
            templateRequest.setRoles(roles);
            List<File> files = new ArrayList<>();
            File file1 = new File("examples/documents/agreement.pdf");
            File file2 = new File("examples/documents/agreement.pdf");
            File file3 = new File("examples/documents/agreement.pdf");
            files.add(file1);
            files.add(file2);
            files.add(file3);
            templateRequest.setFiles(files);
            TemplateCreated createTemplateResponse = templateApi.createTemplate(templateRequest);
            assertNotNull(createTemplateResponse);
            assertNotNull(createTemplateResponse.getTemplateId());
        } catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(6)
    public void testCreateTemplateNegativeWithEmptyTitle() throws ApiException
    {
        try {
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            signatureField.setBounds(bounds);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("HR");
            templateRole.setDefaultSignerName("Mohammed");
            templateRole.setDefaultSignerEmail("mohammedmushraf.abuthakir+6@syncfusion.com");
            templateRole.setSignerOrder(1);
            templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            templateRole.setLocale(TemplateRole.LocaleEnum.EN);
            templateRole.setFormFields(formFields);
            templateRole.setAllowRoleEdit(true);
            templateRole.setAllowRoleDelete(true);
            List<TemplateRole> roles = new ArrayList<>();
            CreateTemplateRequest templateRequest = new CreateTemplateRequest();
            templateRequest.setEnableReassign(true);
            templateRequest.setAllowNewRoles(true);
            templateRequest.setEnablePrintAndSign(false);
            templateRequest.setDocumentMessage("document message for signers");
            templateRequest.setEnableSigningOrder(false);
            templateRequest.setUseTextTags(false);
            templateRequest.setTitle("");
            templateRequest.setAllowMessageEditing(true);
            templateRequest.setDescription("testingDescription");
            templateRequest.setDocumentTitle("title of the document");
            templateRequest.setAllowNewFiles(true);
            templateRequest.setRoles(roles); // Empty roles list
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            templateRequest.setFiles(files);
            TemplateCreated createTemplateResponse = templateApi.createTemplate(templateRequest);
            Assertions.fail("Template creation should have failed due to empty title and empty role.");
        }
        catch (ApiException e)
        {
            Assertions.assertTrue(e.getMessage().contains("The Title field is required."));
        }
    }

    @Test
    @Order(7)
    public void testCreateTemplateNegativeWithEmptyRole() throws ApiException
    {
        try
        {
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            signatureField.setBounds(bounds);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("");
            templateRole.setDefaultSignerName("Mohammed");
            templateRole.setDefaultSignerEmail("mohammedmushraf.abuthakir+6@syncfusion.com");
            templateRole.setSignerOrder(1);
            templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            templateRole.setLocale(TemplateRole.LocaleEnum.EN);
            templateRole.setFormFields(formFields);
            templateRole.setAllowRoleEdit(true);
            templateRole.setAllowRoleDelete(true);
            List<TemplateRole> roles = new ArrayList<>();
            CreateTemplateRequest templateRequest = new CreateTemplateRequest();
            templateRequest.setEnableReassign(true);
            templateRequest.setAllowNewRoles(true);
            templateRequest.setEnablePrintAndSign(false);
            templateRequest.setDocumentMessage("document message for signers");
            templateRequest.setEnableSigningOrder(false);
            templateRequest.setUseTextTags(false);
            templateRequest.setTitle("");
            templateRequest.setAllowMessageEditing(true);
            templateRequest.setDescription("testingDescription");
            templateRequest.setDocumentTitle("title of the document");
            templateRequest.setAllowNewFiles(true);
            templateRequest.setRoles(roles);
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            templateRequest.setFiles(files);
            TemplateCreated createTemplateResponse = templateApi.createTemplate(templateRequest);
            Assertions.fail("Template creation should have failed due to empty title and empty role.");
        }
        catch (ApiException e)
        {
            Assertions.assertTrue(e.getMessage().contains("The Title field is required."));
        }
    }

    @Test
    @Order(8)
    public void testListTemplatesPositive() throws ApiException
    {
        try
        {
            Integer page = 1;
            String templateType = "MyTemplates";
            Integer pageSize = 10;
            String searchkey = "Tests";
            List<String> onBehalfof = new ArrayList<>();//Arrays.asList("mohammedmushraf.abuthakir+26@syncfusion.com");
            onBehalfof.add("mohammedmushraf.abuthakir+26@syncfusion.com");
            List<String> createdBy = new ArrayList<>();//Arrays.asList("mohammedmushraf.abuthakir@syncfusion.com");
            createdBy.add("mohammedmushraf.abuthakir@syncfusion.com");
            List<String> templateLabels = new ArrayList<>();//Arrays.asList("null");
            templateLabels.add("null");
            OffsetDateTime startDate = OffsetDateTime.parse("2023-01-01T00:00:00+00:00");
            OffsetDateTime endDate = OffsetDateTime.parse("2023-12-31T23:59:59+00:00");
            List<String> brandIds = new ArrayList<>();//asList("1200c48a-c97c-4933-ab73-db377bf4a7a7");
            brandIds.add("1200c48a-c97c-4933-ab73-db377bf4a7a8");
            TemplateRecords listTemplatesResponse = templateApi.listTemplates(
                    page, templateType, pageSize, searchkey, onBehalfof, createdBy, templateLabels, startDate, endDate, brandIds
            );
            assertNotNull(listTemplatesResponse);
            assertNotNull(listTemplatesResponse.getResult());
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(9)
    public void testListTemplatesNegativeWithEmptyTemplateType() throws ApiException
    {
        try {
            Integer invalidPage = 1;
            String validTemplateType = "invalid";
            Integer validPageSize = 10;
            String validSearchKey = "Page number should be greater than 0";
            List<String> validOnBehalfof = new ArrayList<>();
            validOnBehalfof.add("mohammedmushraf.abuthakir+26@syncfusion.com");
            List<String> validCreatedBy = new ArrayList<>();
            validCreatedBy.add("mohammedmushraf.abuthakir@syncfusion.com");
            List<String> validTemplateLabels = new ArrayList<>();
            validTemplateLabels.add("null");
            OffsetDateTime validStartDate = OffsetDateTime.parse("2025-01-01T23:59:59+00:00");
            OffsetDateTime validEndDate = OffsetDateTime.parse("2025-01-30T00:00:00+00:00");
            List<String> validBrandIds = new ArrayList<>();
            validBrandIds.add("f7cfc68a-23c4-4614-9910-83bff4610076");
            TemplateRecords listTemplatesResponse = templateApi.listTemplates(
                    invalidPage, validTemplateType, validPageSize, validSearchKey, validOnBehalfof, validCreatedBy, validTemplateLabels, validStartDate, validEndDate, validBrandIds
            );
            Assertions.fail("Expected ApiException was not thrown due to invalid parameters");
        }
        catch (ApiException e)
        {
            Assertions.assertTrue(e.getMessage().contains("The value 'invalid' is not valid for TemplateType."));
        }
    }

    @Test
    @Order(10)
    public void testListTemplatesNegativeWithInvalidPageAndPageSize() throws ApiException
    {
        try {
            Integer invalidPage = -1;
            String validTemplateType = "MyTemplates";
            Integer validPageSize = -10;
            String validSearchKey = "Page number should be greater than 0";
            List<String> validOnBehalfof = new ArrayList<>();
            validOnBehalfof.add("mohammedmushraf.abuthakir+26@syncfusion.com");
            List<String> validCreatedBy = new ArrayList<>();
            validCreatedBy.add("mohammedmushraf.abuthakir@syncfusion.com");
            List<String> validTemplateLabels = new ArrayList<>();
            validTemplateLabels.add("null");
            OffsetDateTime validStartDate = OffsetDateTime.parse("2025-01-01T23:59:59+00:00");
            OffsetDateTime validEndDate = OffsetDateTime.parse("2025-01-30T00:00:00+00:00");
            List<String> validBrandIds = new ArrayList<>();
            validBrandIds.add("f7cfc68a-23c4-4614-9910-83bff4610076");
            TemplateRecords listTemplatesResponse = templateApi.listTemplates(
                    invalidPage, validTemplateType, validPageSize, validSearchKey, validOnBehalfof, validCreatedBy, validTemplateLabels, validStartDate, validEndDate, validBrandIds
            );
            Assertions.fail("Expected ApiException was not thrown due to invalid parameters");
        }
        catch (ApiException e)
        {
            Assertions.assertTrue(e.getMessage().contains("Page number should be greater than 0"));
            Assertions.assertTrue(e.getMessage().contains("Provide a valid page size between 1 and 100"));
        }
    }

    @Test
    @Order(11)
    public void testDownloadTemplatePositive() throws ApiException
    {
        try
        {
            String templateId = createdTemplateId;
            String onBehalfof = "mohammedmushraf.abuthakir+6@syncfusion.com";
            File templateFile = templateApi.download(templateId, onBehalfof);
            assertNotNull(templateFile);
            assertTrue(templateFile.exists());
            assertTrue(templateFile.length() > 0);
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(12)
    public void testDownloadTemplateNegative() throws ApiException
    {
        try
        {
            String invalidTemplateId = "be00c74c-232d-4ee1-ad1e-d8230e539093";
            String onBehalfof = "alexgayle+3@boldsign.dev";
            templateApi.download(invalidTemplateId, onBehalfof);
            fail("Expected API exception due to invalid template ID.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Template Id does not exist or does not belong to this organization"));
        }
    }

    @Test
    @Order(13)
    public void testTemplateDetailsPositive() throws ApiException
    {
        try
        {
            String templateId = createdTemplateId;
            TemplateProperties templatePropertiesResponse = templateApi.getProperties(templateId);
            assertNotNull(templatePropertiesResponse, "Template properties should not be null.");
            System.out.println(templatePropertiesResponse);
            assertNotNull(templatePropertiesResponse.getTitle(), "Template title should not be null.");
            assertNotNull(templatePropertiesResponse.getTemplateId(), "Template ID should not be null.");
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(14)
    public void testTemplateDetailsNegative() throws ApiException
    {
        try
        {
            String invalidTemplateId = "88273e04-e518-4b93-a11e-caf132c1e047";
            templateApi.getProperties(invalidTemplateId);
            fail("Expected API exception due to invalid template ID.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Template Id does not exist or does not belong to this organization"));
        }
    }

    @Test
    @Order(15)
    public void testTemplateEditPositive() throws ApiException
    {
        Rectangle bounds = new Rectangle();
        bounds.setX(50f);
        bounds.setY(100f);
        bounds.setWidth(100f);
        bounds.setHeight(60f);
        FormField formField = new FormField();
        formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
        formField.setPageNumber(1);
        formField.setBounds(bounds);
        TemplateRole role = new TemplateRole();
        role.setIndex(1);
        role.setName("Manager");
        role.setDefaultSignerName("Mohammed");
        role.setDefaultSignerEmail("mohammedmushraf.abuthakir+1@syncfusion.com");
        role.setSignerOrder(1);
        role.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
        role.setFormFields(Arrays.asList(formField));
        EditTemplateRequest editTemplateRequest = new EditTemplateRequest();
        editTemplateRequest.setTitle("A new title for template");
        editTemplateRequest.setEnableSigningOrder(false);
        editTemplateRequest.setRoles(Arrays.asList(role));
        String templateId = createdTemplateId;
        templateApi.editTemplate(templateId, editTemplateRequest);
        assertNotNull(editTemplateRequest.getTitle());
        assertEquals("A new title for template", editTemplateRequest.getTitle());
        assertFalse(editTemplateRequest.getEnableSigningOrder());
        assertNotNull(editTemplateRequest.getRoles());
        assertFalse(editTemplateRequest.getRoles().isEmpty());
    }

    @Test
    @Order(16)
    public void testTemplateEditNegative() throws ApiException
    {
        Rectangle bounds = new Rectangle();
        bounds.setX(50f);
        bounds.setY(100f);
        bounds.setWidth(100f);
        bounds.setHeight(60f);
        FormField formField = new FormField();
        formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
        formField.setPageNumber(1);
        formField.setBounds(bounds);
        TemplateRole role = new TemplateRole();
        role.setIndex(1);
        role.setName("Manager");
        role.setDefaultSignerName("Mohammed");
        role.setDefaultSignerEmail("mohammedmushraf.abuthakir+1@syncfusion.com");
        role.setSignerOrder(1);
        role.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
        EditTemplateRequest editTemplateRequest = new EditTemplateRequest();
        editTemplateRequest.setTitle("A new title for template");
        editTemplateRequest.setEnableSigningOrder(false);
        editTemplateRequest.setRoles(Arrays.asList(role));
        String validTemplateId = "15a36fb2-2537-4f69-83a7-3f2394ec93dg";
        try
        {
            templateApi.editTemplate(validTemplateId, editTemplateRequest);
            fail("Expected ApiException due to missing required form fields, but no exception was thrown.");
        }
        catch (ApiException e)
        {
            assertEquals(403, e.getCode());
            assertTrue(e.getMessage().contains("Invalid template id"));
        }
    }

    @Test
    @Order(17)
    public void TemplateAddTagPositive() throws ApiException
    {
        TemplateTag templateTag = new TemplateTag();
        templateTag.setTemplateId(createdTemplateId);
        ArrayList<String> documentLabels = new ArrayList<>();
        documentLabels.add("test");
        documentLabels.add("api");
        templateTag.setDocumentLabels(documentLabels);
        ArrayList<String> templateLabels = new ArrayList<>();
        templateLabels.add("test");
        templateLabels.add("api");
        templateTag.setTemplateLabels(templateLabels);
        try
        {
            templateApi.addTag(templateTag);
            assertTrue(true);
        }
        catch (ApiException e)
        {
            fail("Tag addition failed with error: " + e.getMessage());
        }
    }

    @Test
    @Order(18)
    public void TemplateAddTagNegativeWithEmptyLabels() throws ApiException
    {
        TemplateTag templateTag = new TemplateTag();
        templateTag.setTemplateId(createdTemplateId);
        ArrayList<String> documentLabels = new ArrayList<>();
        documentLabels.add("");
        documentLabels.add("");
        templateTag.setDocumentLabels(documentLabels);
        ArrayList<String> templateLabels = new ArrayList<>();
        templateLabels.add("");
        templateLabels.add("");
        templateTag.setTemplateLabels(templateLabels);
        try
        {
            templateApi.addTag(templateTag);
            Assertions.fail("Tag addition should have failed due to null labels.");
        }
        catch (ApiException e)
        {
            System.out.println("Expected error occurred: " + e.getMessage());
            Assertions.assertTrue(e.getMessage().contains("Label cannot be null or empty"));
        }
    }

    @Test
    @Order(19)
    public void TemplateAddTagNegativeWithInvalidTemplateId() throws ApiException
    {
        TemplateTag templateTag = new TemplateTag();
        templateTag.setTemplateId("e5c8103c-e418-4268-9d47-e41b8b7f2f59");
        ArrayList<String> documentLabels = new ArrayList<>();
        documentLabels.add("test");
        documentLabels.add("api");
        templateTag.setDocumentLabels(documentLabels);
        ArrayList<String> templateLabels = new ArrayList<>();
        templateLabels.add("test");
        templateLabels.add("api");
        templateTag.setTemplateLabels(templateLabels);
        try
        {
            templateApi.addTag(templateTag);
            fail("Expected ApiException was not thrown.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Template Id does not exist or does not belong to this organization"));
        }
    }

    @Test
    @Order(20)
    public void TemplateDeleteTagPositive() throws ApiException
    {
        TemplateTag templateTag = new TemplateTag();
        templateTag.setTemplateId(createdTemplateId);
        ArrayList<String> documentLabels = new ArrayList<>();
        documentLabels.add("test");
        documentLabels.add("api");
        templateTag.setDocumentLabels(documentLabels);
        ArrayList<String> templateLabels = new ArrayList<>();
        templateLabels.add("test");
        templateLabels.add("api");
        templateTag.setTemplateLabels(templateLabels);
        try
        {
            templateApi.deleteTag(templateTag);
            System.out.println("Tag deleted successfully.");
        }
        catch (ApiException e)
        {
            fail("Tag deletion failed with error: " + e.getMessage());
        }
    }

    @Test
    @Order(21)
    public void testTemplateDeleteTagWithInvalidTemplateIdNegative() throws ApiException
    {
        TemplateTag templateTag = new TemplateTag();
        templateTag.setTemplateId("e5c8103c-e418-4268-9d47-e41b8b7f2f5p");
        ArrayList<String> documentLabels = new ArrayList<>();
        documentLabels.add("test");
        documentLabels.add("api");
        templateTag.setDocumentLabels(documentLabels);
        ArrayList<String> templateLabels = new ArrayList<>();
        templateLabels.add("test");
        templateLabels.add("api");
        templateTag.setTemplateLabels(templateLabels);
        try
        {
            templateApi.deleteTag(templateTag);
            fail("Expected ApiException was not thrown.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Template Id does not exist or does not belong to this organization"));
        }
    }

    @Test
    @Order(22)
    public void testTemplateDeleteTagWithEmptyLabelsNegative() throws ApiException
    {
        TemplateTag templateTag = new TemplateTag();
        templateTag.setTemplateId(createdTemplateId);
        ArrayList<String> documentLabels = new ArrayList<>();
        documentLabels.add("");
        documentLabels.add("");
        templateTag.setDocumentLabels(documentLabels);
        ArrayList<String> templateLabels = new ArrayList<>();
        templateLabels.add("");
        templateLabels.add("");
        templateTag.setTemplateLabels(templateLabels);
        try
        {
            templateApi.deleteTag(templateTag);
            fail("Expected ApiException was not thrown.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Label cannot be null or empty"));
        }
    }

    @Test
    @Order(23)
    public void testSendDocumentFromTemplateWithFile()
    {
        try
        {
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(100f);
            bounds.setY(50f);
            bounds.setWidth(100f);
            bounds.setHeight(100f);
            formField.setBounds(bounds);
            Role role = new Role();
            role.setRoleIndex(50);
            role.setSignerName("Richard");
            role.setSignerEmail("mohammedmushraf.abuthakir+29292@syncfusion.com");
            role.setSignerOrder(1);
            role.setEnableEmailOTP(false);
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setSignerRole("Manager");
            role.setPrivateMessage("Please check and sign the document");
            role.setFormFields(Arrays.asList(formField));
            SendForSignFromTemplateForm sendForSignFromTemplate = new SendForSignFromTemplateForm();
            File file = new File("examples/documents/agreement.pdf");
            sendForSignFromTemplate.setFiles(Arrays.asList(file));
            sendForSignFromTemplate.setTitle("Invitation form");
            sendForSignFromTemplate.setMessage("Kindly review and sign this.");
            sendForSignFromTemplate.setRoles(Arrays.asList(role));
            sendForSignFromTemplate.setLabels(Arrays.asList("Invitation", "Form", "Test"));
            sendForSignFromTemplate.setDisableEmails(false);
            sendForSignFromTemplate.setDisableSMS(false);
            sendForSignFromTemplate.setHideDocumentId(true);
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(false);
            sendForSignFromTemplate.setReminderSettings(reminderSettings);
            sendForSignFromTemplate.setExpiryValue(60L);
            sendForSignFromTemplate.setDisableExpiryAlert(true);
            sendForSignFromTemplate.setEnablePrintAndSign(true);
            sendForSignFromTemplate.setEnableReassign(true);
            sendForSignFromTemplate.setEnableSigningOrder(true);
            templateApi.sendUsingTemplate(createdTemplateId, sendForSignFromTemplate);
        } catch (ApiException e)
        {
            fail("Error occurred during API call: " + e.getMessage());
        }
    }
    @Test
    @Order(24)
    public void testSendDocumentFromTemplateWithoutFile()
    {
        try
        {
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(100f);
            bounds.setY(50f);
            bounds.setWidth(100f);
            bounds.setHeight(100f);
            formField.setBounds(bounds);
            Role role = new Role();
            role.setRoleIndex(50);
            role.setSignerName("Richard");
            role.setSignerEmail("mohammedmushraf.abuthakir+29292@syncfusion.com");
            role.setSignerOrder(1);
            role.setEnableEmailOTP(false);
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setSignerRole("Manager");
            role.setPrivateMessage("Please check and sign the document");
            role.setFormFields(Arrays.asList(formField));
            SendForSignFromTemplateForm sendForSignFromTemplate = new SendForSignFromTemplateForm();
            sendForSignFromTemplate.setTitle("Invitation form");
            sendForSignFromTemplate.setMessage("Kindly review and sign this.");
            sendForSignFromTemplate.setRoles(Arrays.asList(role));
            sendForSignFromTemplate.setLabels(Arrays.asList("Invitation", "Form", "Test"));
            sendForSignFromTemplate.setDisableEmails(false);
            sendForSignFromTemplate.setDisableSMS(false);
            sendForSignFromTemplate.setHideDocumentId(true);
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(false);
            sendForSignFromTemplate.setReminderSettings(reminderSettings);
            sendForSignFromTemplate.setExpiryValue(60L);
            sendForSignFromTemplate.setDisableExpiryAlert(true);
            sendForSignFromTemplate.setEnablePrintAndSign(true);
            sendForSignFromTemplate.setEnableReassign(true);
            sendForSignFromTemplate.setEnableSigningOrder(true);
            templateApi.sendUsingTemplate(createdTemplateId, sendForSignFromTemplate);
        } catch (ApiException e)
        {
            fail("Error occurred during API call: " + e.getMessage());
        }
    }

    @Test
    @Order(25)
    public void testTemplateSendDocumentWithMultipleCCs() throws ApiException
    {
        try
        {
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(100f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(50f);
            formField.setBounds(bounds);
            Role role = new Role();
            role.setRoleIndex(50);
            role.setSignerName("Alex Gayle");
            role.setSignerOrder(1);
            role.setSignerEmail("alexgayle@boldsign.dev");
            role.setPrivateMessage("Please check and sign the document.");
            role.setAuthenticationCode("281028");
            role.setEnableEmailOTP(false);
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setSignerRole("Hr");
            role.setFormFields(Arrays.asList(formField));
            role.setLocale(Role.LocaleEnum.EN);
            SendForSignFromTemplateForm sendForSignFromTemplate = new SendForSignFromTemplateForm();
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            sendForSignFromTemplate.setFiles(files);
            sendForSignFromTemplate.setTitle("Invitation form");
            sendForSignFromTemplate.setMessage("Kindly review and sign this.");
            sendForSignFromTemplate.setRoles(Arrays.asList(role));
            sendForSignFromTemplate.setLabels(Arrays.asList("Invitation"));
            sendForSignFromTemplate.setDisableEmails(true);
            sendForSignFromTemplate.setDisableSMS(false);
            sendForSignFromTemplate.setHideDocumentId(false);
            List<String> ccEmails = new ArrayList<>();
            ccEmails.add("mohammedmushraf.abuthakir+5@syncfusion.com");
            ccEmails.add("mohammedmushraf.abuthakir+8@syncfusion.com");
            ccEmails.add("mohammedmushraf.abuthakir+9@syncfusion.com");
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(false);
            sendForSignFromTemplate.setReminderSettings(reminderSettings);
            sendForSignFromTemplate.setExpiryDays(180);
            sendForSignFromTemplate.setExpiryValue(60L);
            sendForSignFromTemplate.setDisableExpiryAlert(true);
            sendForSignFromTemplate.setEnablePrintAndSign(true);
            sendForSignFromTemplate.setEnableReassign(true);
            sendForSignFromTemplate.setEnableSigningOrder(true);
            sendForSignFromTemplate.setRoleRemovalIndices(Arrays.asList(1, 2));
            String templateId = createdTemplateId;
            templateApi.sendUsingTemplate(templateId, sendForSignFromTemplate);
        }
        catch (ApiException e)
        {
            fail("API call failed: " + e.getMessage());
        }
    }

    @Test
    @Order(26)
    public void testTemplateSendDocumentNegative() throws ApiException
    {
        try
        {
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(100f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(50f);
            formField.setBounds(bounds);
            Role role = new Role();
            role.setRoleIndex(50);
            role.setSignerName("Mohammed");
            role.setSignerOrder(1);
            role.setSignerEmail("mohammedmushraf.abuthakir+90@syncfusion.com");
            role.setPrivateMessage("Please check and sign the document.");
            role.setAuthenticationCode("281028");
            role.setEnableEmailOTP(false);
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setSignerRole("Manager");
            role.setFormFields(Arrays.asList(formField));
            role.setLocale(Role.LocaleEnum.EN);
            SendForSignFromTemplateForm sendForSignFromTemplate = new SendForSignFromTemplateForm();
            List<File> files = new ArrayList<>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            sendForSignFromTemplate.setFiles(files);
            sendForSignFromTemplate.setTitle("Invitation form");
            sendForSignFromTemplate.setMessage("Kindly review and sign this.");
            sendForSignFromTemplate.setRoles(Arrays.asList(role));
            sendForSignFromTemplate.setLabels(Arrays.asList("Invitation"));
            sendForSignFromTemplate.setDisableEmails(false);
            sendForSignFromTemplate.setDisableSMS(false);
            sendForSignFromTemplate.setHideDocumentId(true);
            ReminderSettings reminderSettings = new ReminderSettings();
            reminderSettings.setReminderDays(3);
            reminderSettings.setReminderCount(5);
            reminderSettings.setEnableAutoReminder(false);
            sendForSignFromTemplate.setReminderSettings(reminderSettings);
            sendForSignFromTemplate.setExpiryDays(180);
            sendForSignFromTemplate.setExpiryValue(60L);
            sendForSignFromTemplate.setDisableExpiryAlert(true);
            sendForSignFromTemplate.setEnablePrintAndSign(true);
            sendForSignFromTemplate.setEnableReassign(true);
            sendForSignFromTemplate.setEnableSigningOrder(true);
            sendForSignFromTemplate.setRoleRemovalIndices(Arrays.asList(1, 2));
            String invalidTemplateId = "invalid-template-id-12345";
            templateApi.sendUsingTemplate(invalidTemplateId, sendForSignFromTemplate);
            fail("API call should have failed due to invalid template ID.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Provide valid document id."));
        }
    }

    @Test
    @Order(27)
    public void testSendDocumentUsingMultipleTemplates() {
        try {
            FormField formField = new FormField();
            formField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            formField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(100f);
            bounds.setY(50f);
            bounds.setWidth(100f);
            bounds.setHeight(100f);
            formField.setBounds(bounds);
            Role role = new Role();
            role.setRoleIndex(3);
            role.setSignerName("Divya");
            role.setSignerEmail("divya.boopathy+9989@syncfusion.com");
            role.setSignerOrder(1);
            role.setSignerType(Role.SignerTypeEnum.SIGNER);
            role.setSignerRole("Manager");
            role.setFormFields(Collections.singletonList(formField));
            MergeAndSendForSignForm mergeAndSendForm = new MergeAndSendForSignForm();
            mergeAndSendForm.setTitle("Invitation form");
            mergeAndSendForm.setMessage("Kindly review and sign this.");
            mergeAndSendForm.setRoles(Collections.singletonList(role));
            mergeAndSendForm.setTemplateIds(Arrays.asList(createdTemplateId, createdTemplateId3));
            templateApi.mergeAndSend(mergeAndSendForm);
        } catch (ApiException e) {
            System.err.println("API Exception occurred: " + e.getMessage());
            fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected Exception occurred: " + e.getMessage());
            fail("Unexpected Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(28)
    public void testDeleteTemplatePositive() throws ApiException
    {
        try
        {
            String templateId = createdTemplateId;
            templateApi.deleteTemplate(templateId, null);
        }
        catch (ApiException e)
        {
            fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(29)
    public void testDeleteTemplateNegative() throws ApiException
    {
        try
        {
            String invalidTemplateId = "0b372f38-873c-4f3f-ac42-e4c9cbdad1f0";
            templateApi.deleteTemplate(invalidTemplateId, null);
            fail("Expected API exception due to invalid template ID.");
        }
        catch (ApiException e)
        {
            assertEquals(400, e.getCode());
            assertTrue(e.getMessage().contains("Template Id does not exist or does not belong to this organization"));
        }
    }

    @Test
    @Order(30)
    public void testCreateEmbeddedTemplatePositive()
    {
        try
        {
            EmbeddedCreateTemplateRequest createRequest = new EmbeddedCreateTemplateRequest();
            List<File> files = new ArrayList<File>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            FormField signatureField = new FormField();
            signatureField.setFieldType(FormField.FieldTypeEnum.SIGNATURE);
            signatureField.setPageNumber(1);
            Rectangle bounds = new Rectangle();
            bounds.setX(50f);
            bounds.setY(100f);
            bounds.setWidth(100f);
            bounds.setHeight(60f);
            signatureField.setBounds(bounds);
            List<FormField> formFields = new ArrayList<>();
            formFields.add(signatureField);
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Hr");
            templateRole.setDefaultSignerName("Mohammed Mushraf Abuthakir");
            templateRole.setDefaultSignerEmail("mohammedmushraf.abuthakir+6@syncfusion.com");
            templateRole.setSignerOrder(1);
            templateRole.setSignerType(TemplateRole.SignerTypeEnum.SIGNER);
            templateRole.setLocale(TemplateRole.LocaleEnum.EN);
            templateRole.setFormFields(formFields);
            templateRole.setAllowRoleEdit(true);
            templateRole.setAllowRoleDelete(true);
            List<TemplateRole> roles = new ArrayList<>();
            roles.add(templateRole);
            createRequest.setRoles(roles);
            createRequest.setShowToolbar(true);
            createRequest.setShowNavigationButtons(true);
            createRequest.setShowSaveButton(true);
            createRequest.setShowPreviewButton(true);
            createRequest.setShowCreateButton(true);
            createRequest.setShowTooltip(true);
            createRequest.setFiles(files);
            createRequest.setTitle("Invitation form");
            createRequest.setDescription("testingDescription");
            createRequest.setDocumentTitle("title of the document");
            createRequest.setLocale(EmbeddedCreateTemplateRequest.LocaleEnum.EN);
            createRequest.setViewOption(EmbeddedCreateTemplateRequest.ViewOptionEnum.PREPARE_PAGE);
            EmbeddedTemplateCreated createdTemplate = templateApi.createEmbeddedTemplateUrl(createRequest);
            Assertions.assertNotNull(createdTemplate);
            Assertions.assertNotNull(createdTemplate.getTemplateId());
            assertFalse(createdTemplate.getTemplateId().isEmpty());
        }
        catch (ApiException e)
        {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(31)
    public void testCreateEmbeddedTemplateWithEmptyTitleNegative() throws ApiException
    {
        try
        {
            EmbeddedCreateTemplateRequest createRequest = new EmbeddedCreateTemplateRequest();
            List<File> files = new ArrayList<File>();
            File file = new File("examples/documents/agreement.pdf");
            files.add(file);
            createRequest.setShowToolbar(true);
            createRequest.setShowNavigationButtons(true);
            createRequest.setShowSaveButton(true);
            createRequest.setShowPreviewButton(true);
            createRequest.setShowCreateButton(true);
            createRequest.setShowTooltip(true);
            createRequest.setFiles(files);
            createRequest.setTitle("");
            createRequest.setLocale(EmbeddedCreateTemplateRequest.LocaleEnum.EN);
            createRequest.setViewOption(EmbeddedCreateTemplateRequest.ViewOptionEnum.PREPARE_PAGE);
            EmbeddedTemplateCreated createdTemplate = templateApi.createEmbeddedTemplateUrl(createRequest);
            Assertions.fail("API call should have failed due to invalid template title (empty title).");
        }
        catch (ApiException e)
        {
            Assertions.assertTrue(e.getMessage().contains("The Title field is required."));
        }
    }

    @Test
    @Order(32)
    public void testEditEmbeddedTemplatePositive()
    {
        try
        {
            String templateId = createdTemplateId3;
            EmbeddedTemplateEditRequest embeddedTemplateEditRequest = new EmbeddedTemplateEditRequest();
            embeddedTemplateEditRequest.setShowToolbar(true);
            embeddedTemplateEditRequest.setShowNavigationButtons(false);
            embeddedTemplateEditRequest.setShowSaveButton(false);
            embeddedTemplateEditRequest.setShowPreviewButton(true);
            embeddedTemplateEditRequest.setShowCreateButton(false);
            embeddedTemplateEditRequest.setShowTooltip(false);
            EmbeddedTemplateEdited editUrl = templateApi.getEmbeddedTemplateEditUrl(templateId, embeddedTemplateEditRequest);
            System.out.println("Embedded Template Edit URL: " + editUrl.getEditUrl());
            assertEquals(editUrl.getEditUrl(), editUrl.getEditUrl());
        }
        catch (ApiException e)
        {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(33)
    public void testEditEmbeddedTemplateNegative()
    {
        try
        {
            String templateId = "7892a8c6-104c-43a7-87e8-b8ff0d56d036";
            EmbeddedTemplateEditRequest embeddedTemplateEditRequest = new EmbeddedTemplateEditRequest();
            embeddedTemplateEditRequest.setShowToolbar(true);
            embeddedTemplateEditRequest.setShowNavigationButtons(false);
            embeddedTemplateEditRequest.setShowSaveButton(false);
            embeddedTemplateEditRequest.setShowPreviewButton(true);
            embeddedTemplateEditRequest.setShowCreateButton(false);
            embeddedTemplateEditRequest.setShowTooltip(false);
            EmbeddedTemplateEdited editUrl = templateApi.getEmbeddedTemplateEditUrl(templateId, embeddedTemplateEditRequest);
            Assertions.fail("Expected ApiException due to invalid template ID, but no exception was thrown.");
        }
        catch (ApiException e)
        {
            Assertions.assertTrue(e.getMessage().contains("Invalid template id"));
        }
    }

    @Test
    @Order(34)
    public void testCreateEmbeddedTemplateRequestLink()
    {
        try
        {
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Manager");
            EmbeddedCreateTemplateRequest embeddedCreateTemplateRequest = new EmbeddedCreateTemplateRequest();
            embeddedCreateTemplateRequest.setTitle("API template");
            embeddedCreateTemplateRequest.setDescription("API template description");
            embeddedCreateTemplateRequest.setDocumentTitle("API document title");
            embeddedCreateTemplateRequest.setDocumentMessage("API document message description");
            embeddedCreateTemplateRequest.setAllowMessageEditing(true);
            embeddedCreateTemplateRequest.setRoles(Arrays.asList(templateRole));
            embeddedCreateTemplateRequest.setShowToolbar(true);
            embeddedCreateTemplateRequest.setShowNavigationButtons(true);
            embeddedCreateTemplateRequest.setShowPreviewButton(true);
            embeddedCreateTemplateRequest.setShowSendButton(true);
            embeddedCreateTemplateRequest.setShowSaveButton(true);
            embeddedCreateTemplateRequest.setLocale(EmbeddedCreateTemplateRequest.LocaleEnum.EN);
            embeddedCreateTemplateRequest.setShowTooltip(false);
            embeddedCreateTemplateRequest.setViewOption(EmbeddedCreateTemplateRequest.ViewOptionEnum.PREPARE_PAGE);
            File file = new File("examples/documents/agreement.pdf");
            embeddedCreateTemplateRequest.setFiles(Arrays.asList(file));
            EmbeddedTemplateCreated embeddedTemplateCreated = templateApi.createEmbeddedTemplateUrl(embeddedCreateTemplateRequest);
            URI embeddedTemplateUrl = embeddedTemplateCreated.getCreateUrl();
            Assertions.assertNotNull(embeddedTemplateUrl);
        }
        catch (ApiException e)
        {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(35)
    public void testCreateEmbeddedTemplateRequestLinkWithEmptyTitleNegative()
    {
        try
        {
            TemplateRole templateRole = new TemplateRole();
            templateRole.setIndex(1);
            templateRole.setName("Manager");
            EmbeddedCreateTemplateRequest embeddedCreateTemplateRequest = new EmbeddedCreateTemplateRequest();
            embeddedCreateTemplateRequest.setTitle("");
            embeddedCreateTemplateRequest.setDescription("API template description");
            embeddedCreateTemplateRequest.setDocumentTitle("API document title");
            embeddedCreateTemplateRequest.setDocumentMessage("API document message description");
            embeddedCreateTemplateRequest.setAllowMessageEditing(true);
            embeddedCreateTemplateRequest.setRoles(Arrays.asList(templateRole));
            embeddedCreateTemplateRequest.setShowToolbar(true);
            embeddedCreateTemplateRequest.setShowNavigationButtons(true);
            embeddedCreateTemplateRequest.setShowPreviewButton(true);
            embeddedCreateTemplateRequest.setShowSendButton(true);
            embeddedCreateTemplateRequest.setShowSaveButton(true);
            embeddedCreateTemplateRequest.setLocale(EmbeddedCreateTemplateRequest.LocaleEnum.EN);
            embeddedCreateTemplateRequest.setShowTooltip(false);
            embeddedCreateTemplateRequest.setViewOption(EmbeddedCreateTemplateRequest.ViewOptionEnum.PREPARE_PAGE);
            File file = new File("examples/documents/agreement.pdf");
            embeddedCreateTemplateRequest.setFiles(Arrays.asList(file));
            EmbeddedTemplateCreated embeddedTemplateCreated = templateApi.createEmbeddedTemplateUrl(embeddedCreateTemplateRequest);
            Assertions.fail("API call should have failed due to invalid data (empty title and empty file list).");
        }
        catch (ApiException e)
        {
            Assertions.assertTrue(e.getMessage().contains("The Title field is required."));
        }
    }
}