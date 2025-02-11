import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import com.boldsign.ApiClient;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;

public class DocumentDownload
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            String documentId = "DOCUMENT_ID";
            String onBehalfof = "david@cubeflakes.com";
            File documentStream = documentApi.downloadDocument(documentId, onBehalfof);
            saveFile(documentStream, "path/to/save/document.pdf");
            System.out.println("Document downloaded successfully!");
        } 
        catch (Exception e) 
        {
            System.err.println("Error occurred while calling the API: " + e.getMessage());
        }
    }
    private static void saveFile(File sourceFile, String destinationPath) throws IOException {
        if (sourceFile != null) {
            Path destPath = new File(destinationPath).toPath();
            Files.copy(sourceFile.toPath(), destPath);
            System.out.println("File saved to " + destinationPath);
        } else {
            System.out.println("No document stream available.");
        }
    }
           
}