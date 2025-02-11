import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.BrandingApi;

public class BrandDelete 
{
    public static void main(String[] args) {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            BrandingApi brandingApi = new BrandingApi(apiClient);
            String brandId = "YOUR_BRAND_ID";  
            brandingApi.deleteBrand(brandId);
            System.out.println("Brand deleted successfully!");
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred while calling the API: " + e.getMessage());
        }
    }
}