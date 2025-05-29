# IdentityVerificationApi

All URIs are relative to *https://api.boldsign.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmbeddedVerificationUrl**](IdentityVerificationApi.md#createEmbeddedVerificationUrl) | **POST** /v1/identityVerification/createEmbeddedVerificationUrl | Generate a URL that embeds manual ID verification for the specified document signer into your application. |
| [**image**](IdentityVerificationApi.md#image) | **POST** /v1/identityVerification/image | Retrieve the uploaded ID verification document or selfie image for the specified document signer using the file ID. |
| [**report**](IdentityVerificationApi.md#report) | **POST** /v1/identityVerification/report | Retrieve the ID verification report for the specified document signer. |


<a id="createEmbeddedVerificationUrl"></a>
# **createEmbeddedVerificationUrl**
> EmbeddedFileLink createEmbeddedVerificationUrl(documentId, embeddedFileDetails)

Generate a URL that embeds manual ID verification for the specified document signer into your application.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.IdentityVerificationApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    IdentityVerificationApi apiInstance = new IdentityVerificationApi(apiClient);

    String documentId = "documentId_example"; // String | The document id.
    EmbeddedFileDetails embeddedFileDetails = new EmbeddedFileDetails(); // EmbeddedFileDetails | The embedded verification link request.
    
    try {
      EmbeddedFileLink result = apiInstance.createEmbeddedVerificationUrl(documentId, embeddedFileDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityVerificationApi#createEmbeddedVerificationUrl");
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
| **documentId** | **String**| The document id. | |
| **embeddedFileDetails** | [**EmbeddedFileDetails**](EmbeddedFileDetails.md)| The embedded verification link request. | [optional] |

### Return type

[**EmbeddedFileLink**](EmbeddedFileLink.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="image"></a>
# **image**
> File image(documentId, downloadImageRequest)

Retrieve the uploaded ID verification document or selfie image for the specified document signer using the file ID.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.IdentityVerificationApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    IdentityVerificationApi apiInstance = new IdentityVerificationApi(apiClient);

    String documentId = "documentId_example"; // String | The document id.
    DownloadImageRequest downloadImageRequest = new DownloadImageRequest(); // DownloadImageRequest | The download image request.
    
    try {
      File result = apiInstance.image(documentId, downloadImageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityVerificationApi#image");
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
| **documentId** | **String**| The document id. | |
| **downloadImageRequest** | [**DownloadImageRequest**](DownloadImageRequest.md)| The download image request. | |

### Return type

[**File**](File.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/octet-stream, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |

<a id="report"></a>
# **report**
> IdReport report(documentId, verificationDataRequest)

Retrieve the ID verification report for the specified document signer.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.IdentityVerificationApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    IdentityVerificationApi apiInstance = new IdentityVerificationApi(apiClient);

    String documentId = "documentId_example"; // String | The document id.
    VerificationDataRequest verificationDataRequest = new VerificationDataRequest(); // VerificationDataRequest | The download image request.
    
    try {
      IdReport result = apiInstance.report(documentId, verificationDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityVerificationApi#report");
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
| **documentId** | **String**| The document id. | |
| **verificationDataRequest** | [**VerificationDataRequest**](VerificationDataRequest.md)| The download image request. | |

### Return type

[**IdReport**](IdReport.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |

