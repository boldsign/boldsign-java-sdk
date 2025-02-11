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

public class CustomFieldCreate
{
    public static void main(String[] args)
    {
        try
        {
            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setApiKey("YOUR_API_KEY");
            CustomFieldApi customFieldApi =new CustomFieldApi(apiClient);
            CustomFormField customFormField =new CustomFormField();
            customFormField.setFieldType(FieldTypeEnum.SIGNATURE);
            customFormField.setWidth(60f);
            customFormField.setHeight(60f);
            customFormField.setIsRequired(true);
            customFormField.setIsReadOnly(true);
            customFormField.setValue("string");
            customFormField.setCharacterLimit(0);
            customFormField.setPlaceHolder("string");
            customFormField.setValidationType(ValidationTypeEnum.NUMBERS_ONLY);
            customFormField.setValidationCustomRegex("string");
            customFormField.setValidationCustomRegexMessage("string");
            customFormField.setTextAlign(TextAlignEnum.CENTER);
            customFormField.setTextDirection(TextDirectionEnum.LTR);
            customFormField.setCharacterSpacing(0f);
            customFormField.setIdPrefix("string");
            customFormField.setRestrictIdPrefixChange(false);
            BrandCustomFieldDetails brandCustomFieldDetails = new BrandCustomFieldDetails();
            brandCustomFieldDetails.setFieldName("string");
            brandCustomFieldDetails.setFieldDescription("string");
            brandCustomFieldDetails.setFieldOrder(1);
            brandCustomFieldDetails.setBrandId("YOUR_BRAND_ID");
            brandCustomFieldDetails.setSharedField(true);
            brandCustomFieldDetails.setFormField(customFormField);
            CustomFieldMessage createdCustomField = customFieldApi.createCustomField(brandCustomFieldDetails);
            System.out.println("Custom field created successfully: " + createdCustomField.getCustomFieldId());
        }
        catch (ApiException e)
        {
            System.err.println("Exception when calling CustomFieldApi#createCustomField");
        }
    }
}