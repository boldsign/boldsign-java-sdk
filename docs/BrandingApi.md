# BrandingApi

All URIs are relative to *https://api.boldsign.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandList**](BrandingApi.md#brandList) | **GET** /v1/brand/list | List all the brands. |
| [**createBrand**](BrandingApi.md#createBrand) | **POST** /v1/brand/create | Create the brand. |
| [**deleteBrand**](BrandingApi.md#deleteBrand) | **DELETE** /v1/brand/delete | Delete the brand. |
| [**editBrand**](BrandingApi.md#editBrand) | **POST** /v1/brand/edit | Edit the brand. |
| [**getBrand**](BrandingApi.md#getBrand) | **GET** /v1/brand/get | Get the specific brand details. |
| [**resetDefaultBrand**](BrandingApi.md#resetDefaultBrand) | **POST** /v1/brand/resetdefault | Reset default brand. |


<a id="brandList"></a>
# **brandList**
> BrandingRecords brandList()

List all the brands.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.BrandingApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    BrandingApi apiInstance = new BrandingApi(apiClient);

    
    try {
      BrandingRecords result = apiInstance.brandList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandingApi#brandList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BrandingRecords**](BrandingRecords.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="createBrand"></a>
# **createBrand**
> BrandCreated createBrand(brandName, brandLogo, backgroundColor, buttonColor, buttonTextColor, emailDisplayName, disclaimerDescription, disclaimerTitle, redirectUrl, isDefault, canHideTagLine, combineAuditTrail, combineAttachments, excludeAuditTrailFromEmail, emailSignedDocument, documentTimeZone, showBuiltInFormFields, allowCustomFieldCreation, showSharedCustomFields, hideDecline, hideSave, documentExpirySettingsExpiryDateType, documentExpirySettingsExpiryValue, documentExpirySettingsEnableDefaultExpiryAlert, documentExpirySettingsEnableAutoReminder, documentExpirySettingsReminderDays, documentExpirySettingsReminderCount, customDomainSettingsDomainName, customDomainSettingsFromName, signatureFrameSettingsEnableSignatureFrame, signatureFrameSettingsShowRecipientName, signatureFrameSettingsShowRecipientEmail, signatureFrameSettingsShowTimeStamp)

Create the brand.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.BrandingApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    BrandingApi apiInstance = new BrandingApi(apiClient);

    String brandName = "brandName_example"; // String | 
    File brandLogo = new File("/path/to/file"); // File | 
    String backgroundColor = "backgroundColor_example"; // String | 
    String buttonColor = "buttonColor_example"; // String | 
    String buttonTextColor = "buttonTextColor_example"; // String | 
    String emailDisplayName = "emailDisplayName_example"; // String | 
    String disclaimerDescription = "disclaimerDescription_example"; // String | 
    String disclaimerTitle = "disclaimerTitle_example"; // String | 
    String redirectUrl = "redirectUrl_example"; // String | 
    Boolean isDefault = false; // Boolean | 
    Boolean canHideTagLine = false; // Boolean | 
    Boolean combineAuditTrail = false; // Boolean | 
    Boolean combineAttachments = false; // Boolean | 
    Boolean excludeAuditTrailFromEmail = false; // Boolean | 
    String emailSignedDocument = "Attachment"; // String | 
    String documentTimeZone = "documentTimeZone_example"; // String | 
    Boolean showBuiltInFormFields = true; // Boolean | 
    Boolean allowCustomFieldCreation = false; // Boolean | 
    Boolean showSharedCustomFields = false; // Boolean | 
    Boolean hideDecline = true; // Boolean | This option prevents signers to decline the document during the signing process.
    Boolean hideSave = true; // Boolean | This option prevents signers to save their changes during the signing process and continue signing later.
    String documentExpirySettingsExpiryDateType = "Days"; // String | This property represents the type for the expiry date
    Integer documentExpirySettingsExpiryValue = 56; // Integer | This property is used to set the expiry value based on the expiry type
    Boolean documentExpirySettingsEnableDefaultExpiryAlert = true; // Boolean | This property will send the expiry alert email before the day of expiry for the pending signers.
    Boolean documentExpirySettingsEnableAutoReminder = true; // Boolean | When auto reminder is enabled, you can select how often to remind in terms of days and select the maximum number of reminders.
    Integer documentExpirySettingsReminderDays = 56; // Integer | Remind in terms of days.
    Integer documentExpirySettingsReminderCount = 56; // Integer | Number of reminder count.
    String customDomainSettingsDomainName = "customDomainSettingsDomainName_example"; // String | 
    String customDomainSettingsFromName = "customDomainSettingsFromName_example"; // String | 
    Boolean signatureFrameSettingsEnableSignatureFrame = false; // Boolean | 
    Boolean signatureFrameSettingsShowRecipientName = false; // Boolean | 
    Boolean signatureFrameSettingsShowRecipientEmail = false; // Boolean | 
    Boolean signatureFrameSettingsShowTimeStamp = false; // Boolean | 
    
    try {
      BrandCreated result = apiInstance.createBrand(brandName, brandLogo, backgroundColor, buttonColor, buttonTextColor, emailDisplayName, disclaimerDescription, disclaimerTitle, redirectUrl, isDefault, canHideTagLine, combineAuditTrail, combineAttachments, excludeAuditTrailFromEmail, emailSignedDocument, documentTimeZone, showBuiltInFormFields, allowCustomFieldCreation, showSharedCustomFields, hideDecline, hideSave, documentExpirySettingsExpiryDateType, documentExpirySettingsExpiryValue, documentExpirySettingsEnableDefaultExpiryAlert, documentExpirySettingsEnableAutoReminder, documentExpirySettingsReminderDays, documentExpirySettingsReminderCount, customDomainSettingsDomainName, customDomainSettingsFromName, signatureFrameSettingsEnableSignatureFrame, signatureFrameSettingsShowRecipientName, signatureFrameSettingsShowRecipientEmail, signatureFrameSettingsShowTimeStamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandingApi#createBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandName** | **String**|  | |
| **brandLogo** | **File**|  | |
| **backgroundColor** | **String**|  | [optional] |
| **buttonColor** | **String**|  | [optional] |
| **buttonTextColor** | **String**|  | [optional] |
| **emailDisplayName** | **String**|  | [optional] |
| **disclaimerDescription** | **String**|  | [optional] |
| **disclaimerTitle** | **String**|  | [optional] |
| **redirectUrl** | **String**|  | [optional] |
| **isDefault** | **Boolean**|  | [optional] [default to false] |
| **canHideTagLine** | **Boolean**|  | [optional] [default to false] |
| **combineAuditTrail** | **Boolean**|  | [optional] [default to false] |
| **combineAttachments** | **Boolean**|  | [optional] [default to false] |
| **excludeAuditTrailFromEmail** | **Boolean**|  | [optional] [default to false] |
| **emailSignedDocument** | **String**|  | [optional] [default to Attachment] [enum: Attachment, DocumentLink] |
| **documentTimeZone** | **String**|  | [optional] |
| **showBuiltInFormFields** | **Boolean**|  | [optional] [default to true] |
| **allowCustomFieldCreation** | **Boolean**|  | [optional] [default to false] |
| **showSharedCustomFields** | **Boolean**|  | [optional] [default to false] |
| **hideDecline** | **Boolean**| This option prevents signers to decline the document during the signing process. | [optional] |
| **hideSave** | **Boolean**| This option prevents signers to save their changes during the signing process and continue signing later. | [optional] |
| **documentExpirySettingsExpiryDateType** | **String**| This property represents the type for the expiry date | [optional] [enum: Days, Hours, SpecificDateTime] |
| **documentExpirySettingsExpiryValue** | **Integer**| This property is used to set the expiry value based on the expiry type | [optional] |
| **documentExpirySettingsEnableDefaultExpiryAlert** | **Boolean**| This property will send the expiry alert email before the day of expiry for the pending signers. | [optional] |
| **documentExpirySettingsEnableAutoReminder** | **Boolean**| When auto reminder is enabled, you can select how often to remind in terms of days and select the maximum number of reminders. | [optional] |
| **documentExpirySettingsReminderDays** | **Integer**| Remind in terms of days. | [optional] |
| **documentExpirySettingsReminderCount** | **Integer**| Number of reminder count. | [optional] |
| **customDomainSettingsDomainName** | **String**|  | [optional] |
| **customDomainSettingsFromName** | **String**|  | [optional] |
| **signatureFrameSettingsEnableSignatureFrame** | **Boolean**|  | [optional] [default to false] |
| **signatureFrameSettingsShowRecipientName** | **Boolean**|  | [optional] [default to false] |
| **signatureFrameSettingsShowRecipientEmail** | **Boolean**|  | [optional] [default to false] |
| **signatureFrameSettingsShowTimeStamp** | **Boolean**|  | [optional] [default to false] |

### Return type

[**BrandCreated**](BrandCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/octet-stream, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Content |  -  |

<a id="deleteBrand"></a>
# **deleteBrand**
> BrandingMessage deleteBrand(brandId)

Delete the brand.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.BrandingApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    BrandingApi apiInstance = new BrandingApi(apiClient);

    String brandId = "brandId_example"; // String | 
    
    try {
      BrandingMessage result = apiInstance.deleteBrand(brandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandingApi#deleteBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**|  | |

### Return type

[**BrandingMessage**](BrandingMessage.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/octet-stream, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="editBrand"></a>
# **editBrand**
> BrandCreated editBrand(brandId, brandName, brandLogo, backgroundColor, buttonColor, buttonTextColor, emailDisplayName, disclaimerDescription, disclaimerTitle, redirectUrl, isDefault, canHideTagLine, combineAuditTrail, combineAttachments, excludeAuditTrailFromEmail, emailSignedDocument, documentTimeZone, showBuiltInFormFields, allowCustomFieldCreation, showSharedCustomFields, hideDecline, hideSave, documentExpirySettingsExpiryDateType, documentExpirySettingsExpiryValue, documentExpirySettingsEnableDefaultExpiryAlert, documentExpirySettingsEnableAutoReminder, documentExpirySettingsReminderDays, documentExpirySettingsReminderCount, customDomainSettingsDomainName, customDomainSettingsFromName, signatureFrameSettingsEnableSignatureFrame, signatureFrameSettingsShowRecipientName, signatureFrameSettingsShowRecipientEmail, signatureFrameSettingsShowTimeStamp)

Edit the brand.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.BrandingApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    BrandingApi apiInstance = new BrandingApi(apiClient);

    String brandId = "brandId_example"; // String | 
    String brandName = "brandName_example"; // String | 
    File brandLogo = new File("/path/to/file"); // File | 
    String backgroundColor = "backgroundColor_example"; // String | 
    String buttonColor = "buttonColor_example"; // String | 
    String buttonTextColor = "buttonTextColor_example"; // String | 
    String emailDisplayName = "emailDisplayName_example"; // String | 
    String disclaimerDescription = "disclaimerDescription_example"; // String | 
    String disclaimerTitle = "disclaimerTitle_example"; // String | 
    String redirectUrl = "redirectUrl_example"; // String | 
    Boolean isDefault = false; // Boolean | 
    Boolean canHideTagLine = false; // Boolean | 
    Boolean combineAuditTrail = false; // Boolean | 
    Boolean combineAttachments = false; // Boolean | 
    Boolean excludeAuditTrailFromEmail = false; // Boolean | 
    String emailSignedDocument = "Attachment"; // String | 
    String documentTimeZone = "documentTimeZone_example"; // String | 
    Boolean showBuiltInFormFields = true; // Boolean | 
    Boolean allowCustomFieldCreation = false; // Boolean | 
    Boolean showSharedCustomFields = false; // Boolean | 
    Boolean hideDecline = true; // Boolean | This option prevents signers to decline the document during the signing process.
    Boolean hideSave = true; // Boolean | This option prevents signers to save their changes during the signing process and continue signing later.
    String documentExpirySettingsExpiryDateType = "Days"; // String | This property represents the type for the expiry date
    Integer documentExpirySettingsExpiryValue = 56; // Integer | This property is used to set the expiry value based on the expiry type
    Boolean documentExpirySettingsEnableDefaultExpiryAlert = true; // Boolean | This property will send the expiry alert email before the day of expiry for the pending signers.
    Boolean documentExpirySettingsEnableAutoReminder = true; // Boolean | When auto reminder is enabled, you can select how often to remind in terms of days and select the maximum number of reminders.
    Integer documentExpirySettingsReminderDays = 56; // Integer | Remind in terms of days.
    Integer documentExpirySettingsReminderCount = 56; // Integer | Number of reminder count.
    String customDomainSettingsDomainName = "customDomainSettingsDomainName_example"; // String | 
    String customDomainSettingsFromName = "customDomainSettingsFromName_example"; // String | 
    Boolean signatureFrameSettingsEnableSignatureFrame = false; // Boolean | 
    Boolean signatureFrameSettingsShowRecipientName = false; // Boolean | 
    Boolean signatureFrameSettingsShowRecipientEmail = false; // Boolean | 
    Boolean signatureFrameSettingsShowTimeStamp = false; // Boolean | 
    
    try {
      BrandCreated result = apiInstance.editBrand(brandId, brandName, brandLogo, backgroundColor, buttonColor, buttonTextColor, emailDisplayName, disclaimerDescription, disclaimerTitle, redirectUrl, isDefault, canHideTagLine, combineAuditTrail, combineAttachments, excludeAuditTrailFromEmail, emailSignedDocument, documentTimeZone, showBuiltInFormFields, allowCustomFieldCreation, showSharedCustomFields, hideDecline, hideSave, documentExpirySettingsExpiryDateType, documentExpirySettingsExpiryValue, documentExpirySettingsEnableDefaultExpiryAlert, documentExpirySettingsEnableAutoReminder, documentExpirySettingsReminderDays, documentExpirySettingsReminderCount, customDomainSettingsDomainName, customDomainSettingsFromName, signatureFrameSettingsEnableSignatureFrame, signatureFrameSettingsShowRecipientName, signatureFrameSettingsShowRecipientEmail, signatureFrameSettingsShowTimeStamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandingApi#editBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**|  | |
| **brandName** | **String**|  | [optional] |
| **brandLogo** | **File**|  | [optional] |
| **backgroundColor** | **String**|  | [optional] |
| **buttonColor** | **String**|  | [optional] |
| **buttonTextColor** | **String**|  | [optional] |
| **emailDisplayName** | **String**|  | [optional] |
| **disclaimerDescription** | **String**|  | [optional] |
| **disclaimerTitle** | **String**|  | [optional] |
| **redirectUrl** | **String**|  | [optional] |
| **isDefault** | **Boolean**|  | [optional] [default to false] |
| **canHideTagLine** | **Boolean**|  | [optional] [default to false] |
| **combineAuditTrail** | **Boolean**|  | [optional] [default to false] |
| **combineAttachments** | **Boolean**|  | [optional] [default to false] |
| **excludeAuditTrailFromEmail** | **Boolean**|  | [optional] [default to false] |
| **emailSignedDocument** | **String**|  | [optional] [default to Attachment] [enum: Attachment, DocumentLink] |
| **documentTimeZone** | **String**|  | [optional] |
| **showBuiltInFormFields** | **Boolean**|  | [optional] [default to true] |
| **allowCustomFieldCreation** | **Boolean**|  | [optional] [default to false] |
| **showSharedCustomFields** | **Boolean**|  | [optional] [default to false] |
| **hideDecline** | **Boolean**| This option prevents signers to decline the document during the signing process. | [optional] |
| **hideSave** | **Boolean**| This option prevents signers to save their changes during the signing process and continue signing later. | [optional] |
| **documentExpirySettingsExpiryDateType** | **String**| This property represents the type for the expiry date | [optional] [enum: Days, Hours, SpecificDateTime] |
| **documentExpirySettingsExpiryValue** | **Integer**| This property is used to set the expiry value based on the expiry type | [optional] |
| **documentExpirySettingsEnableDefaultExpiryAlert** | **Boolean**| This property will send the expiry alert email before the day of expiry for the pending signers. | [optional] |
| **documentExpirySettingsEnableAutoReminder** | **Boolean**| When auto reminder is enabled, you can select how often to remind in terms of days and select the maximum number of reminders. | [optional] |
| **documentExpirySettingsReminderDays** | **Integer**| Remind in terms of days. | [optional] |
| **documentExpirySettingsReminderCount** | **Integer**| Number of reminder count. | [optional] |
| **customDomainSettingsDomainName** | **String**|  | [optional] |
| **customDomainSettingsFromName** | **String**|  | [optional] |
| **signatureFrameSettingsEnableSignatureFrame** | **Boolean**|  | [optional] [default to false] |
| **signatureFrameSettingsShowRecipientName** | **Boolean**|  | [optional] [default to false] |
| **signatureFrameSettingsShowRecipientEmail** | **Boolean**|  | [optional] [default to false] |
| **signatureFrameSettingsShowTimeStamp** | **Boolean**|  | [optional] [default to false] |

### Return type

[**BrandCreated**](BrandCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/octet-stream, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Content |  -  |

<a id="getBrand"></a>
# **getBrand**
> ViewBrandDetails getBrand(brandId)

Get the specific brand details.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.BrandingApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    BrandingApi apiInstance = new BrandingApi(apiClient);

    String brandId = "brandId_example"; // String | 
    
    try {
      ViewBrandDetails result = apiInstance.getBrand(brandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandingApi#getBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**|  | |

### Return type

[**ViewBrandDetails**](ViewBrandDetails.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Content |  -  |

<a id="resetDefaultBrand"></a>
# **resetDefaultBrand**
> BrandingMessage resetDefaultBrand(brandId)

Reset default brand.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.BrandingApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    BrandingApi apiInstance = new BrandingApi(apiClient);

    String brandId = "brandId_example"; // String | 
    
    try {
      BrandingMessage result = apiInstance.resetDefaultBrand(brandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandingApi#resetDefaultBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**|  | |

### Return type

[**BrandingMessage**](BrandingMessage.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/octet-stream, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

