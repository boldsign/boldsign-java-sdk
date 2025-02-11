import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.CustomFieldApi;
import com.boldsign.model.CustomFieldMessage;
import com.boldsign.model.CustomFormField;
import com.boldsign.model.CustomFormField.FieldTypeEnum;
import com.boldsign.model.CustomFormField.TextAlignEnum;
import com.boldsign.model.CustomFormField.TextDirectionEnum;
import com.boldsign.model.CustomFormField.ValidationTypeEnum;
import com.boldsign.model.BrandCustomFieldDetails;

public class CustomFieldEdit
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            CustomFieldApi customFieldApi =new CustomFieldApi(apiClient);
            CustomFormField customFormField = new CustomFormField();
            customFormField.setFieldType(FieldTypeEnum.SIGNATURE);
            customFormField.setWidth(60f);
            customFormField.setHeight(60f);
            customFormField.setIsRequired(true);
            customFormField.setIsReadOnly(true);
            customFormField.setValue("new_value");
            customFormField.setCharacterLimit(0);
            customFormField.setPlaceHolder("new_placeholder");
            customFormField.setValidationType(ValidationTypeEnum.NUMBERS_ONLY);
            customFormField.setValidationCustomRegex("new_regex");
            customFormField.setValidationCustomRegexMessage("new validation message");
            customFormField.setTextAlign(TextAlignEnum.CENTER);
            customFormField.setTextDirection(TextDirectionEnum.LTR);
            customFormField.setCharacterSpacing(0f);
            customFormField.setIdPrefix("new_prefix");
            customFormField.setRestrictIdPrefixChange(false);
            BrandCustomFieldDetails brandCustomFieldDetails = new BrandCustomFieldDetails();
            brandCustomFieldDetails.setFieldName("Syncfusion");
            brandCustomFieldDetails.setFieldDescription("Newfield");
            brandCustomFieldDetails.setFieldOrder(1);
            brandCustomFieldDetails.setBrandId("YOUR_BRAND_ID");
            brandCustomFieldDetails.setSharedField(true);
            brandCustomFieldDetails.setFormField(customFormField);
            String customFieldIdToEdit = "YOUR_CUSTOMFIELD_ID";
            CustomFieldMessage editedCustomField = customFieldApi.editCustomField(customFieldIdToEdit, brandCustomFieldDetails);
            System.out.println("Custom field edited successfully: " + editedCustomField.getCustomFieldId());
        }
        catch (ApiException e)
        {
            System.err.println("Error message: "+ e.getMessage());
        }
    }
}