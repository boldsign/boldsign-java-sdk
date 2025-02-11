import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.PrefillField;
import com.boldsign.model.PrefillFieldRequest;
import java.util.Arrays;
 
public class DocumentPrefillFieldDropdown
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            DocumentApi documentApi = new DocumentApi(apiClient);
            PrefillField prefillField = new PrefillField();
            prefillField.setId("dropdown_7uulo");
            prefillField.setValue("PREFILL_VALUE");
            PrefillFieldRequest prefillFieldRequest = new PrefillFieldRequest();
            prefillFieldRequest.setFields(Arrays.asList(prefillField));
            String documentId = "YOUR_DOUCUMENT_ID";
            documentApi.prefillFields(documentId, prefillFieldRequest);
            System.out.println("Fields have been prefilled successfully.");
        }
        catch (ApiException e)
        {
            System.err.println("Error occurred while pre-filling fields: " + e.getMessage());
        }
    }
}