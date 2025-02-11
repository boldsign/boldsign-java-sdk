import com.boldsign.ApiClient;
import com.boldsign.api.DocumentApi;
import com.boldsign.ApiException;
import com.boldsign.Configuration;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DocumentDownloadAttachment 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            String documentId = "DOCUMENT_ID";
            String attachmentId = "YOUR_ATTACHMENT_ID";
            String onBehalfof = "david@cubeflakes.com";
            File documentFile = documentApi.downloadAttachment(documentId, attachmentId, onBehalfof);
            String outputFilePath = "downloaded_attachment.pdf"; 
            Files.copy(documentFile.toPath(), Paths.get(outputFilePath));
            System.out.println("Attachment downloaded and saved successfully at: " + outputFilePath);
        } 
        catch (ApiException e) 
        {
            System.err.println("API call failed: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}