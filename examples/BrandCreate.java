import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.BrandingApi;
import java.io.File;
 
public class BrandCreate
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            BrandingApi brandingApi = new BrandingApi(apiClient);
            String brandname ="Syncfusion";        
            File logoFile = new File("examples/documents/logo.jpg");                  
            String backgroundcolor = "red";                      
            String buttoncolor ="green";                      
            String buttonTextcolor = "white";                    
            String emailDisplayname ="{SenderName} from Syncfusion";
            String disclaimerDescription = "syncfusion";  
            String disclaimerTitle = "true";                        
            String redirectUrl = "https://www.syncfusion.com/";                      
            Boolean isDefault = true;                        
            Boolean canHideTagLine = true;                    
            Boolean combineAuditTrail = true;                          
            Boolean excludeAuditTrailFromEmail = false;                      
            String emailSignedDocument = "1";                      
            String documentTimeZone = "+05:30";                        
            Boolean showBuiltInFormFields = true;                        
            Boolean allowCustomFieldCreation = true;                        
            Boolean showSharedCustomFields = false;                        
            Boolean hideDecline = false;        
            Boolean hideSave = false;              
            String documentExpirySettingsExpiryDateType = "1";                            
            Integer documentExpirySettingsExpiryValue = 10;  
            Boolean documentExpirySettingsEnableDefaultExpiryAlert = true;                        
            Boolean documentExpirySettingsEnableAutoReminder = true;                
            Integer documentExpirySettingsRemainderDays = 1;                        
            Integer documentExpirySettingsReminderCount = 1;                        
            String customDomainSettingsDomainName = "mail.cubeflakes.com";                            
            String customDomainSettingsFromName = "notification";  
            brandingApi.createBrand
            (
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
            System.out.println("Brand created successfully!");
        }
        catch (ApiException e)
        {
            System.out.println("Error occurred while calling the API: " + e.getMessage());
        }
    }
}