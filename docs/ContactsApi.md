# ContactsApi

All URIs are relative to *https://api.boldsign.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contactUserList**](ContactsApi.md#contactUserList) | **GET** /v1/contacts/list | List Contact document. |
| [**createContact**](ContactsApi.md#createContact) | **POST** /v1/contacts/create | Create the new Contact. |
| [**deleteContacts**](ContactsApi.md#deleteContacts) | **DELETE** /v1/contacts/delete | Deletes a contact. |
| [**getContact**](ContactsApi.md#getContact) | **GET** /v1/contacts/get | Get summary of the contact. |
| [**updateContact**](ContactsApi.md#updateContact) | **PUT** /v1/contacts/update | Update the contact. |


<a id="contactUserList"></a>
# **contactUserList**
> ContactsList contactUserList(page, pageSize, searchKey, contactType)

List Contact document.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.ContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    ContactsApi apiInstance = new ContactsApi(apiClient);

    Integer page = 1; // Integer | Page index specified in get user contact list request. Default value is 1.
    Integer pageSize = 10; // Integer | Page size specified in get user contact list request. Default value is 10.
    String searchKey = "searchKey_example"; // String | Contacts can be listed by the search  based on the Name or Email
    String contactType = "MyContacts"; // String | Contact type whether the contact is My Contacts or All Contacts. Default value is AllContacts.
    
    try {
      ContactsList result = apiInstance.contactUserList(page, pageSize, searchKey, contactType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactUserList");
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
| **page** | **Integer**| Page index specified in get user contact list request. Default value is 1. | [default to 1] |
| **pageSize** | **Integer**| Page size specified in get user contact list request. Default value is 10. | [optional] [default to 10] |
| **searchKey** | **String**| Contacts can be listed by the search  based on the Name or Email | [optional] |
| **contactType** | **String**| Contact type whether the contact is My Contacts or All Contacts. Default value is AllContacts. | [optional] [enum: MyContacts, AllContacts] |

### Return type

[**ContactsList**](ContactsList.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |

<a id="createContact"></a>
# **createContact**
> CreateContactResponse createContact(contactDetails)

Create the new Contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.ContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    ContactsApi apiInstance = new ContactsApi(apiClient);

    List<ContactDetails> contactDetails = Arrays.asList(); // List<ContactDetails> | The contact details.
    
    try {
      CreateContactResponse result = apiInstance.createContact(contactDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createContact");
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
| **contactDetails** | [**List&lt;ContactDetails&gt;**](ContactDetails.md)| The contact details. | [optional] |

### Return type

[**CreateContactResponse**](CreateContactResponse.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/prs.odatatestxx-odata, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |

<a id="deleteContacts"></a>
# **deleteContacts**
> deleteContacts(id)

Deletes a contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.ContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    ContactsApi apiInstance = new ContactsApi(apiClient);

    String id = "id_example"; // String | The contact id.
    
    try {
      apiInstance.deleteContacts(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#deleteContacts");
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
| **id** | **String**| The contact id. | |

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

<a id="getContact"></a>
# **getContact**
> ContactsDetails getContact(id)

Get summary of the contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.ContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    ContactsApi apiInstance = new ContactsApi(apiClient);

    String id = "id_example"; // String | Contact Id.
    
    try {
      ContactsDetails result = apiInstance.getContact(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContact");
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
| **id** | **String**| Contact Id. | |

### Return type

[**ContactsDetails**](ContactsDetails.md)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateContact"></a>
# **updateContact**
> updateContact(id, contactDetails)

Update the contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.ContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    ContactsApi apiInstance = new ContactsApi(apiClient);

    String id = "id_example"; // String | The contactId.
    ContactDetails contactDetails = new ContactDetails(); // ContactDetails | The contact details.
    
    try {
      apiInstance.updateContact(id, contactDetails);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateContact");
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
| **id** | **String**| The contactId. | [optional] |
| **contactDetails** | [**ContactDetails**](ContactDetails.md)| The contact details. | [optional] |

### Return type

null (empty response body)

### Authorization

[X-API-KEY](../README.md#X-API-KEY), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/prs.odatatestxx-odata, application/json-patch+json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |

