import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.CustomFieldApi;
import com.boldsign.model.CustomFieldCollection;

public class CustomFieldList
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            CustomFieldApi customFieldApi =new CustomFieldApi(apiClient);
            String brandId = "YOUR_BRAND_ID";
            CustomFieldCollection customFieldsListResponse = customFieldApi.customFieldsList(brandId);
            if (customFieldsListResponse != null && customFieldsListResponse.getResult() != null)
            {
                customFieldsListResponse.getResult().forEach(customField -> {
                    System.out.println("Custom Field ID: " + customField.getCustomFieldId());
                    });
            }
            else
            {
                System.out.println("No custom fields found for this brand.");
            }
        }
        catch (ApiException e)
        {
            System.err.println("Error message: " +e.getMessage());
        }
    }
}