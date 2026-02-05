# SenderIdentitiesApi

All URIs are relative to *https://api.boldsign.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSenderIdentities**](SenderIdentitiesApi.md#createSenderIdentities) | **POST** /v1/senderIdentities/create | Creates sender identity. |
| [**deleteSenderIdentities**](SenderIdentitiesApi.md#deleteSenderIdentities) | **DELETE** /v1/senderIdentities/delete | Deletes sender identity. |
| [**getSenderIdentityProperties**](SenderIdentitiesApi.md#getSenderIdentityProperties) | **GET** /v1/senderIdentities/properties | Gets sender identity by ID or email. |
| [**listSenderIdentities**](SenderIdentitiesApi.md#listSenderIdentities) | **GET** /v1/senderIdentities/list | Lists sender identity. |
| [**reRequestSenderIdentities**](SenderIdentitiesApi.md#reRequestSenderIdentities) | **POST** /v1/senderIdentities/rerequest | Rerequests denied sender identity. |
| [**resendInvitationSenderIdentities**](SenderIdentitiesApi.md#resendInvitationSenderIdentities) | **POST** /v1/senderIdentities/resendInvitation | Resends sender identity invitation. |
| [**updateSenderIdentities**](SenderIdentitiesApi.md#updateSenderIdentities) | **POST** /v1/senderIdentities/update | Updates sender identity. |


<a id="createSenderIdentities"></a>
# **createSenderIdentities**
> SenderIdentityCreated createSenderIdentities(createSenderIdentityRequest)

Creates sender identity.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.SenderIdentitiesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    SenderIdentitiesApi apiInstance = new SenderIdentitiesApi(apiClient);

    CreateSenderIdentityRequest createSenderIdentityRequest = new CreateSenderIdentityRequest(); // CreateSenderIdentityRequest | The create sender identity request.
    
    try {
      SenderIdentityCreated result = apiInstance.createSenderIdentities(createSenderIdentityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdentitiesApi#createSenderIdentities");
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
| **createSenderIdentityRequest** | [**CreateSenderIdentityRequest**](CreateSenderIdentityRequest.md)| The create sender identity request. | |

### Return type

[**SenderIdentityCreated**](SenderIdentityCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |

<a id="deleteSenderIdentities"></a>
# **deleteSenderIdentities**
> deleteSenderIdentities(email)

Deletes sender identity.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.SenderIdentitiesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    SenderIdentitiesApi apiInstance = new SenderIdentitiesApi(apiClient);

    String email = "email_example"; // String | The email address.
    
    try {
      apiInstance.deleteSenderIdentities(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdentitiesApi#deleteSenderIdentities");
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
| **email** | **String**| The email address. | |

### Return type

null (empty response body)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="getSenderIdentityProperties"></a>
# **getSenderIdentityProperties**
> SenderIdentityViewModel getSenderIdentityProperties(id, email)

Gets sender identity by ID or email.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.SenderIdentitiesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    SenderIdentitiesApi apiInstance = new SenderIdentitiesApi(apiClient);

    String id = "id_example"; // String | The sender identity id.
    String email = "email_example"; // String | The sender identity email.
    
    try {
      SenderIdentityViewModel result = apiInstance.getSenderIdentityProperties(id, email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdentitiesApi#getSenderIdentityProperties");
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
| **id** | **String**| The sender identity id. | [optional] |
| **email** | **String**| The sender identity email. | [optional] |

### Return type

[**SenderIdentityViewModel**](SenderIdentityViewModel.md)

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

<a id="listSenderIdentities"></a>
# **listSenderIdentities**
> SenderIdentityList listSenderIdentities(page, pageSize, search, brandIds)

Lists sender identity.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.SenderIdentitiesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    SenderIdentitiesApi apiInstance = new SenderIdentitiesApi(apiClient);

    Integer page = 1; // Integer | Page index specified in get sender identity request.
    Integer pageSize = 10; // Integer | Page size specified in get sender identity list request.
    String search = "search_example"; // String | Users can be listed by the search key present in the sender identity like sender identity name and email address
    List<String> brandIds = Arrays.asList(); // List<String> | A list of brand IDs to filter associated with the sender identity.
    
    try {
      SenderIdentityList result = apiInstance.listSenderIdentities(page, pageSize, search, brandIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdentitiesApi#listSenderIdentities");
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
| **page** | **Integer**| Page index specified in get sender identity request. | [default to 1] |
| **pageSize** | **Integer**| Page size specified in get sender identity list request. | [optional] [default to 10] |
| **search** | **String**| Users can be listed by the search key present in the sender identity like sender identity name and email address | [optional] |
| **brandIds** | [**List&lt;String&gt;**](String.md)| A list of brand IDs to filter associated with the sender identity. | [optional] |

### Return type

[**SenderIdentityList**](SenderIdentityList.md)

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

<a id="reRequestSenderIdentities"></a>
# **reRequestSenderIdentities**
> reRequestSenderIdentities(email)

Rerequests denied sender identity.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.SenderIdentitiesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    SenderIdentitiesApi apiInstance = new SenderIdentitiesApi(apiClient);

    String email = "email_example"; // String | The email address.
    
    try {
      apiInstance.reRequestSenderIdentities(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdentitiesApi#reRequestSenderIdentities");
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
| **email** | **String**| The email address. | |

### Return type

null (empty response body)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="resendInvitationSenderIdentities"></a>
# **resendInvitationSenderIdentities**
> resendInvitationSenderIdentities(email)

Resends sender identity invitation.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.SenderIdentitiesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    SenderIdentitiesApi apiInstance = new SenderIdentitiesApi(apiClient);

    String email = "email_example"; // String | The email address.
    
    try {
      apiInstance.resendInvitationSenderIdentities(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdentitiesApi#resendInvitationSenderIdentities");
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
| **email** | **String**| The email address. | |

### Return type

null (empty response body)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateSenderIdentities"></a>
# **updateSenderIdentities**
> updateSenderIdentities(email, editSenderIdentityRequest)

Updates sender identity.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.SenderIdentitiesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    SenderIdentitiesApi apiInstance = new SenderIdentitiesApi(apiClient);

    String email = "email_example"; // String | The email address.
    EditSenderIdentityRequest editSenderIdentityRequest = new EditSenderIdentityRequest(); // EditSenderIdentityRequest | The create sender identity request.
    
    try {
      apiInstance.updateSenderIdentities(email, editSenderIdentityRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdentitiesApi#updateSenderIdentities");
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
| **email** | **String**| The email address. | |
| **editSenderIdentityRequest** | [**EditSenderIdentityRequest**](EditSenderIdentityRequest.md)| The create sender identity request. | |

### Return type

null (empty response body)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

