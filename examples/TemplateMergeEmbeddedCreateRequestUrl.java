import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.TemplateApi;
import com.boldsign.model.EmbeddedMergeTemplateFormRequest;
import com.boldsign.model.EmbeddedSendCreated;
import com.boldsign.model.Role;

public class TemplateMergeEmbeddedCreateRequestUrl{
    public static void main(String[] args){
        try{
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            TemplateApi templateApi = new TemplateApi(apiClient);
            Role role1 = new Role();
            role1.setSignerEmail("sivaramani.sivaraj@syncfusion.com");
            role1.setSignerName("sivaramani");
            role1.setSignerType(Role.SignerTypeEnum.SIGNER);
            role1.setSignerRole("Manager");
            role1.setSignerOrder(1);
            role1.setRoleIndex(1);

            Role role2 = new Role();
            role2.setSignerEmail("david@gamil.com");
            role2.setSignerName("david");
            role2.setSignerType(Role.SignerTypeEnum.SIGNER);
            role2.setSignerRole("Team Lead");
            role2.setSignerOrder(2);
            role2.setRoleIndex(2);

            List<File> files = new ArrayList<File>();
            File file1 = new File("examples/documents/agreement.pdf");
            files.add(file1);
            
            EmbeddedMergeTemplateFormRequest embeddedMergeTemplateFormRequest = new EmbeddedMergeTemplateFormRequest();
            embeddedMergeTemplateFormRequest.setFiles(files);
            embeddedMergeTemplateFormRequest.setTitle("Template Merge request URL");
            embeddedMergeTemplateFormRequest.setRoles(Arrays.asList(role1,role2));
            embeddedMergeTemplateFormRequest.setTemplateIds(Arrays.asList("YOUR_TEMPLATE_ID1","YOUR_TEMPLATE_ID2"));

            EmbeddedSendCreated embeddedTemplateRequestUrl = templateApi.mergeCreateEmbeddedRequestUrlTemplate(embeddedMergeTemplateFormRequest);
            System.out.println(embeddedTemplateRequestUrl.getSendUrl());

       }
        catch (ApiException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}