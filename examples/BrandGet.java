import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.BrandingApi;
import com.boldsign.model.ViewBrandDetails;

public class BrandGet 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY"); 
            BrandingApi brandingApi = new BrandingApi(apiClient);
            String brandId = "YOUR_BRAND_ID";  
            ViewBrandDetails brandDetails = brandingApi.getBrand(brandId);  
            if (brandDetails != null) 
            {
                System.out.println("Brand Name: " + brandDetails);
            } 
            else 
            {
                System.out.println("Brand details not found.");
            }
        } 
        catch (ApiException e) 
        {
            System.err.println("Error occurred while calling the API: " + e.getMessage());
        }
    }
}