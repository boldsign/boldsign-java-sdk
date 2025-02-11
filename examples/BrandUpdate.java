import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.BrandingApi;
import java.io.File;

public class BrandUpdate 
{
    public static void main(String[] args) 
    {
        try 
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            BrandingApi brandingApi = new BrandingApi(apiClient);
            String brandId = "YOUR_BRAND_ID";  
            String brandname = "Syncfusion Updated";        
            File logoFile = new File("examples/documents/logo.jpg"); 
            String backgroundcolor = "blue";  
            String buttoncolor = "orange";  
            String buttonTextcolor = "black"; 
            String emailDisplayname = "{SenderName} from Syncfusion Updated"; 
            String disclaimerDescription = "Syncfusion Updated";  
            String disclaimerTitle = "Updated Disclaimer Title"; 
            String redirectUrl = "https://www.syncfusion.com/updated"; 
            Boolean isDefault = false; 
            Boolean canHideTagLine = true;
            Boolean combineAuditTrail = true;                          
            Boolean excludeAuditTrailFromEmail = false;
            String emailSignedDocument = "2"; 
            String documentTimeZone = "+06:30"; 
            Boolean showBuiltInFormFields = true;
            Boolean allowCustomFieldCreation = true;
            Boolean showSharedCustomFields = false;
            Boolean hideDecline = false;        
            Boolean hideSave = false;              
            String documentExpirySettingsExpiryDateType = "Days"; 
            Integer documentExpirySettingsExpiryValue = 15; 
            Boolean documentExpirySettingsEnableDefaultExpiryAlert = true;
            Boolean documentExpirySettingsEnableAutoReminder = true;                
            Integer documentExpirySettingsRemainderDays = 2; 
            Integer documentExpirySettingsReminderCount = 3; 
            String customDomainSettingsDomainName = "mail.updateddomain.com"; 
            String customDomainSettingsFromName = "notifications-updated";  
            brandingApi.editBrand
            (
                brandId, 
                brandname,      
                logoFile,                  
                backgroundcolor,                    
                buttoncolor,                      
                buttonTextcolor,                  
                emailDisplayname,
                disclaimerDescription,
                disclaimerTitle,                       
                redirectUrl,                    
                isDefault,                       
                canHideTagLine,                    
                combineAuditTrail,                          
                excludeAuditTrailFromEmail,                       
                emailSignedDocument,                    
                documentTimeZone,                       
                showBuiltInFormFields,                        
                allowCustomFieldCreation,                       
                showSharedCustomFields,                        
                hideDecline,        
                hideSave,            
                documentExpirySettingsExpiryDateType,                            
                documentExpirySettingsExpiryValue,  
                documentExpirySettingsEnableDefaultExpiryAlert,                        
                documentExpirySettingsEnableAutoReminder,  
                documentExpirySettingsRemainderDays,                        
                documentExpirySettingsReminderCount,                       
                customDomainSettingsDomainName,                            
                customDomainSettingsFromName
            );
            System.out.println("Brand updated successfully!");
        } 
        catch (ApiException e) 
        {
            System.out.println("Error occurred while calling the API: " + e.getMessage());
        }
    }
}