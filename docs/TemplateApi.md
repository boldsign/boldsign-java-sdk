# TemplateApi

All URIs are relative to *https://api.boldsign.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTag**](TemplateApi.md#addTag) | **PATCH** /v1/template/addTags | Add the Tags in Templates. |
| [**createEmbeddedRequestUrlTemplate**](TemplateApi.md#createEmbeddedRequestUrlTemplate) | **POST** /v1/template/createEmbeddedRequestUrl | Generates a send URL using a template which embeds document sending process into your application. |
| [**createEmbeddedTemplateUrl**](TemplateApi.md#createEmbeddedTemplateUrl) | **POST** /v1/template/createEmbeddedTemplateUrl | Generates a create URL to embeds template create process into your application. |
| [**createTemplate**](TemplateApi.md#createTemplate) | **POST** /v1/template/create | Creates a new template. |
| [**deleteTemplate**](TemplateApi.md#deleteTemplate) | **DELETE** /v1/template/delete | Deletes a template. |
| [**deleteTag**](TemplateApi.md#deleteTag) | **DELETE** /v1/template/deleteTags | Delete the Tags in Templates. |
| [**download**](TemplateApi.md#download) | **GET** /v1/template/download | Download the template. |
| [**editTemplate**](TemplateApi.md#editTemplate) | **PUT** /v1/template/edit | Edit and updates an existing template. |
| [**getEmbeddedTemplateEditUrl**](TemplateApi.md#getEmbeddedTemplateEditUrl) | **POST** /v1/template/getEmbeddedTemplateEditUrl | Generates a edit URL to embeds template edit process into your application. |
| [**getProperties**](TemplateApi.md#getProperties) | **GET** /v1/template/properties | Get summary of the template. |
| [**listTemplates**](TemplateApi.md#listTemplates) | **GET** /v1/template/list | List all the templates. |
| [**mergeAndSend**](TemplateApi.md#mergeAndSend) | **POST** /v1/template/mergeAndSend | Send the document by merging multiple templates. |
| [**mergeCreateEmbeddedRequestUrlTemplate**](TemplateApi.md#mergeCreateEmbeddedRequestUrlTemplate) | **POST** /v1/template/mergeCreateEmbeddedRequestUrl | Generates a merge request URL using a template that combines document merging and sending processes into your application. |
| [**sendUsingTemplate**](TemplateApi.md#sendUsingTemplate) | **POST** /v1/template/send | Send a document for signature using a Template. |


<a id="addTag"></a>
# **addTag**
> addTag(templateTag)

Add the Tags in Templates.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    TemplateTag templateTag = new TemplateTag(); // TemplateTag | ContainsTemplateId and Label Names for AddingTags.
    
    try {
      apiInstance.addTag(templateTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#addTag");
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
| **templateTag** | [**TemplateTag**](TemplateTag.md)| ContainsTemplateId and Label Names for AddingTags. | [optional] |

### Return type

null (empty response body)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/xml, text/plain, application/octet-stream, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |

<a id="createEmbeddedRequestUrlTemplate"></a>
# **createEmbeddedRequestUrlTemplate**
> EmbeddedSendCreated createEmbeddedRequestUrlTemplate(templateId, embeddedSendTemplateFormRequest)

Generates a send URL using a template which embeds document sending process into your application.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    String templateId = "templateId_example"; // String | The template id.
    EmbeddedSendTemplateFormRequest embeddedSendTemplateFormRequest = new EmbeddedSendTemplateFormRequest(); // EmbeddedSendTemplateFormRequest | Embedded send template json request.
    
    try {
      EmbeddedSendCreated result = apiInstance.createEmbeddedRequestUrlTemplate(templateId, embeddedSendTemplateFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createEmbeddedRequestUrlTemplate");
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
| **templateId** | **String**| The template id. | |
| **embeddedSendTemplateFormRequest** | [**EmbeddedSendTemplateFormRequest**](EmbeddedSendTemplateFormRequest.md)| Embedded send template json request. | [optional] |

### Return type

[**EmbeddedSendCreated**](EmbeddedSendCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | Unprocessable Content |  -  |
| **401** | Unauthorized |  -  |

<a id="createEmbeddedTemplateUrl"></a>
# **createEmbeddedTemplateUrl**
> EmbeddedTemplateCreated createEmbeddedTemplateUrl(embeddedCreateTemplateRequest)

Generates a create URL to embeds template create process into your application.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    EmbeddedCreateTemplateRequest embeddedCreateTemplateRequest = new EmbeddedCreateTemplateRequest(); // EmbeddedCreateTemplateRequest | The create embedded template request body.
    
    try {
      EmbeddedTemplateCreated result = apiInstance.createEmbeddedTemplateUrl(embeddedCreateTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createEmbeddedTemplateUrl");
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
| **embeddedCreateTemplateRequest** | [**EmbeddedCreateTemplateRequest**](EmbeddedCreateTemplateRequest.md)| The create embedded template request body. | [optional] |

### Return type

[**EmbeddedTemplateCreated**](EmbeddedTemplateCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable Content |  -  |

<a id="createTemplate"></a>
# **createTemplate**
> TemplateCreated createTemplate(createTemplateRequest)

Creates a new template.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest(); // CreateTemplateRequest | The create template request body.
    
    try {
      TemplateCreated result = apiInstance.createTemplate(createTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createTemplate");
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
| **createTemplateRequest** | [**CreateTemplateRequest**](CreateTemplateRequest.md)| The create template request body. | [optional] |

### Return type

[**TemplateCreated**](TemplateCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Content |  -  |

<a id="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(templateId, onBehalfOf)

Deletes a template.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    String templateId = "templateId_example"; // String | The template id.
    String onBehalfOf = "onBehalfOf_example"; // String | The on behalfof email address.
    
    try {
      apiInstance.deleteTemplate(templateId, onBehalfOf);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#deleteTemplate");
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
| **templateId** | **String**| The template id. | |
| **onBehalfOf** | **String**| The on behalfof email address. | [optional] |

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

<a id="deleteTag"></a>
# **deleteTag**
> deleteTag(templateTag)

Delete the Tags in Templates.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    TemplateTag templateTag = new TemplateTag(); // TemplateTag | Contains TemplateId and LabelNames for Adding Tags.
    
    try {
      apiInstance.deleteTag(templateTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#deleteTag");
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
| **templateTag** | [**TemplateTag**](TemplateTag.md)| Contains TemplateId and LabelNames for Adding Tags. | [optional] |

### Return type

null (empty response body)

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
| **400** | Bad Request |  -  |

<a id="download"></a>
# **download**
> File download(templateId, onBehalfOf)

Download the template.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    String templateId = "templateId_example"; // String | Template Id.
    String onBehalfOf = "onBehalfOf_example"; // String | The on behalfof email address.
    
    try {
      File result = apiInstance.download(templateId, onBehalfOf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#download");
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
| **templateId** | **String**| Template Id. | |
| **onBehalfOf** | **String**| The on behalfof email address. | [optional] |

### Return type

[**File**](File.md)

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
| **400** | Bad Request |  -  |

<a id="editTemplate"></a>
# **editTemplate**
> editTemplate(templateId, editTemplateRequest)

Edit and updates an existing template.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    String templateId = "templateId_example"; // String | The template id.
    EditTemplateRequest editTemplateRequest = new EditTemplateRequest(); // EditTemplateRequest | The edit template request body.
    
    try {
      apiInstance.editTemplate(templateId, editTemplateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#editTemplate");
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
| **templateId** | **String**| The template id. | |
| **editTemplateRequest** | [**EditTemplateRequest**](EditTemplateRequest.md)| The edit template request body. | |

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
| **400** | Bad Request |  -  |
| **422** | Unprocessable Content |  -  |
| **401** | Unauthorized |  -  |

<a id="getEmbeddedTemplateEditUrl"></a>
# **getEmbeddedTemplateEditUrl**
> EmbeddedTemplateEdited getEmbeddedTemplateEditUrl(templateId, embeddedTemplateEditRequest)

Generates a edit URL to embeds template edit process into your application.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    String templateId = "templateId_example"; // String | The template id.
    EmbeddedTemplateEditRequest embeddedTemplateEditRequest = new EmbeddedTemplateEditRequest(); // EmbeddedTemplateEditRequest | The embedded edit template request body.
    
    try {
      EmbeddedTemplateEdited result = apiInstance.getEmbeddedTemplateEditUrl(templateId, embeddedTemplateEditRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getEmbeddedTemplateEditUrl");
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
| **templateId** | **String**| The template id. | |
| **embeddedTemplateEditRequest** | [**EmbeddedTemplateEditRequest**](EmbeddedTemplateEditRequest.md)| The embedded edit template request body. | [optional] |

### Return type

[**EmbeddedTemplateEdited**](EmbeddedTemplateEdited.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |

<a id="getProperties"></a>
# **getProperties**
> TemplateProperties getProperties(templateId)

Get summary of the template.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    String templateId = "templateId_example"; // String | Template Id.
    
    try {
      TemplateProperties result = apiInstance.getProperties(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getProperties");
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
| **templateId** | **String**| Template Id. | |

### Return type

[**TemplateProperties**](TemplateProperties.md)

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

<a id="listTemplates"></a>
# **listTemplates**
> TemplateRecords listTemplates(page, templateType, pageSize, searchKey, onBehalfOf, createdBy, templateLabels, startDate, endDate, brandIds)

List all the templates.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    Integer page = 1; // Integer | 
    String templateType = "mytemplates"; // String | 
    Integer pageSize = 10; // Integer | 
    String searchKey = "searchKey_example"; // String | 
    List<String> onBehalfOf = Arrays.asList(); // List<String> | The sender identity's email used to filter the templates returned in the API. The API will return templates that were sent on behalf of the specified email address.
    List<String> createdBy = Arrays.asList(); // List<String> | The templates can be listed by the creator of the template.
    List<String> templateLabels = Arrays.asList(); // List<String> | Labels of the template.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start date of the template
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End date of the template
    List<String> brandIds = Arrays.asList(); // List<String> | BrandId(s) of the template.
    
    try {
      TemplateRecords result = apiInstance.listTemplates(page, templateType, pageSize, searchKey, onBehalfOf, createdBy, templateLabels, startDate, endDate, brandIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#listTemplates");
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
| **page** | **Integer**|  | [default to 1] |
| **templateType** | **String**|  | [optional] [enum: mytemplates, sharedtemplate, all] |
| **pageSize** | **Integer**|  | [optional] [default to 10] |
| **searchKey** | **String**|  | [optional] |
| **onBehalfOf** | [**List&lt;String&gt;**](String.md)| The sender identity&#39;s email used to filter the templates returned in the API. The API will return templates that were sent on behalf of the specified email address. | [optional] |
| **createdBy** | [**List&lt;String&gt;**](String.md)| The templates can be listed by the creator of the template. | [optional] |
| **templateLabels** | [**List&lt;String&gt;**](String.md)| Labels of the template. | [optional] |
| **startDate** | **OffsetDateTime**| Start date of the template | [optional] |
| **endDate** | **OffsetDateTime**| End date of the template | [optional] |
| **brandIds** | [**List&lt;String&gt;**](String.md)| BrandId(s) of the template. | [optional] |

### Return type

[**TemplateRecords**](TemplateRecords.md)

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

<a id="mergeAndSend"></a>
# **mergeAndSend**
> DocumentCreated mergeAndSend(mergeAndSendForSignForm)

Send the document by merging multiple templates.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    MergeAndSendForSignForm mergeAndSendForSignForm = new MergeAndSendForSignForm(); // MergeAndSendForSignForm | The merge and send details as JSON.
    
    try {
      DocumentCreated result = apiInstance.mergeAndSend(mergeAndSendForSignForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#mergeAndSend");
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
| **mergeAndSendForSignForm** | [**MergeAndSendForSignForm**](MergeAndSendForSignForm.md)| The merge and send details as JSON. | [optional] |

### Return type

[**DocumentCreated**](DocumentCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | Unprocessable Content |  -  |
| **401** | Unauthorized |  -  |

<a id="mergeCreateEmbeddedRequestUrlTemplate"></a>
# **mergeCreateEmbeddedRequestUrlTemplate**
> EmbeddedSendCreated mergeCreateEmbeddedRequestUrlTemplate(embeddedMergeTemplateFormRequest)

Generates a merge request URL using a template that combines document merging and sending processes into your application.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    EmbeddedMergeTemplateFormRequest embeddedMergeTemplateFormRequest = new EmbeddedMergeTemplateFormRequest(); // EmbeddedMergeTemplateFormRequest | Embedded merge and send template json request.
    
    try {
      EmbeddedSendCreated result = apiInstance.mergeCreateEmbeddedRequestUrlTemplate(embeddedMergeTemplateFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#mergeCreateEmbeddedRequestUrlTemplate");
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
| **embeddedMergeTemplateFormRequest** | [**EmbeddedMergeTemplateFormRequest**](EmbeddedMergeTemplateFormRequest.md)| Embedded merge and send template json request. | [optional] |

### Return type

[**EmbeddedSendCreated**](EmbeddedSendCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | Unprocessable Content |  -  |
| **401** | Unauthorized |  -  |

<a id="sendUsingTemplate"></a>
# **sendUsingTemplate**
> DocumentCreated sendUsingTemplate(templateId, sendForSignFromTemplateForm)

Send a document for signature using a Template.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.TemplateApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    TemplateApi apiInstance = new TemplateApi(apiClient);

    String templateId = "templateId_example"; // String | The template id.
    SendForSignFromTemplateForm sendForSignFromTemplateForm = new SendForSignFromTemplateForm(); // SendForSignFromTemplateForm | The send template details as JSON.
    
    try {
      DocumentCreated result = apiInstance.sendUsingTemplate(templateId, sendForSignFromTemplateForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#sendUsingTemplate");
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
| **templateId** | **String**| The template id. | |
| **sendForSignFromTemplateForm** | [**SendForSignFromTemplateForm**](SendForSignFromTemplateForm.md)| The send template details as JSON. | [optional] |

### Return type

[**DocumentCreated**](DocumentCreated.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable Content |  -  |

