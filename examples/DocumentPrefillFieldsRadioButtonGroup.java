import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.PrefillField;
import com.boldsign.model.PrefillFieldRequest;
import java.util.Arrays;

public class DocumentPrefillFieldsRadioButtonGroup 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            PrefillField prefillField = new PrefillField();
            prefillField.setId("radioChild_TSvn52");  
            prefillField.setValue("PREFILL_VALUE");  
            PrefillFieldRequest prefillFieldRequest = new PrefillFieldRequest();
            prefillFieldRequest.setFields(Arrays.asList(prefillField));  
            String documentId = "DOCUMENT_ID";  
            documentApi.prefillFields(documentId, prefillFieldRequest);
            System.out.println("Fields prefilled successfully in the document!");
        } catch (ApiException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}