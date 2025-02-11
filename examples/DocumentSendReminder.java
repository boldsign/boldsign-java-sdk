import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.ReminderMessage;
import java.util.ArrayList;
import java.util.List;

public class DocumentSendReminder 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            ReminderMessage reminderMessage = new ReminderMessage();
            reminderMessage.setMessage("Please sign this soon");
            String documentId = "DOCUMENT_ID";
            List<String> receiverEmails = new ArrayList<>();
            receiverEmails.add("luthercooper@cubeflakes.com"); 
            documentApi.remindDocument(documentId, receiverEmails, reminderMessage);
            System.out.println("Reminder sent successfully!");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}