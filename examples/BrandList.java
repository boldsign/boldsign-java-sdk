import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.BrandingApi;
import com.boldsign.model.BrandingRecords;  
import com.boldsign.model.ViewBrandDetails; 
import java.util.List;

public class BrandList
{
    public static void main(String[] args) 
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            BrandingApi brandingApi = new BrandingApi(apiClient);
            BrandingRecords brandingRecords = brandingApi.brandList(); 
            List<ViewBrandDetails> brandList = brandingRecords.getResult();  
            if (brandList != null && !brandList.isEmpty()) 
            {
                for (ViewBrandDetails brand : brandList) 
                {
                    System.out.println("Brand Info: " + brand.toString());
                }
            } 
            else 
            {
                System.out.println("No brands found.");
            }
        } 
        catch (ApiException e) 
        {
            System.out.println("Error occurred while calling the API: " + e.getMessage());
        }
    }
}