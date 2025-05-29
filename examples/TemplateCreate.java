import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TemplateCreate
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
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
            System.out.println("Template created successfully: " + createTemplateResponse.getTemplateId());
        }
        catch (ApiException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}