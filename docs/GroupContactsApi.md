# GroupContactsApi

All URIs are relative to *https://api.boldsign.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGroupContact**](GroupContactsApi.md#createGroupContact) | **POST** /v1/contactGroups/create | Create a new Group Contact. |
| [**deleteGroupContact**](GroupContactsApi.md#deleteGroupContact) | **DELETE** /v1/contactGroups/delete | Deletes a Group Contact. |
| [**getGroupContact**](GroupContactsApi.md#getGroupContact) | **GET** /v1/contactGroups/get | Get Summary of the Group Contact. |
| [**groupContactList**](GroupContactsApi.md#groupContactList) | **GET** /v1/contactGroups/list | List Group Contacts. |
| [**updateGroupContact**](GroupContactsApi.md#updateGroupContact) | **PUT** /v1/contactGroups/update | Update the Group Contact. |


<a id="createGroupContact"></a>
# **createGroupContact**
> CreateGroupContactResponse createGroupContact(groupContactDetails)

Create a new Group Contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.GroupContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    GroupContactsApi apiInstance = new GroupContactsApi(apiClient);

    GroupContactDetails groupContactDetails = new GroupContactDetails(); // GroupContactDetails | The group contact details.
    
    try {
      CreateGroupContactResponse result = apiInstance.createGroupContact(groupContactDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupContactsApi#createGroupContact");
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
| **groupContactDetails** | [**GroupContactDetails**](GroupContactDetails.md)| The group contact details. | [optional] |

### Return type

[**CreateGroupContactResponse**](CreateGroupContactResponse.md)

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
| **400** | Bad Request |  -  |

<a id="deleteGroupContact"></a>
# **deleteGroupContact**
> deleteGroupContact(groupId)

Deletes a Group Contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.GroupContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    GroupContactsApi apiInstance = new GroupContactsApi(apiClient);

    String groupId = "groupId_example"; // String | The group contact id.
    
    try {
      apiInstance.deleteGroupContact(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupContactsApi#deleteGroupContact");
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
| **groupId** | **String**| The group contact id. | |

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

<a id="getGroupContact"></a>
# **getGroupContact**
> GetGroupContactDetails getGroupContact(groupId)

Get Summary of the Group Contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.GroupContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    GroupContactsApi apiInstance = new GroupContactsApi(apiClient);

    String groupId = "groupId_example"; // String | Group Contact Id.
    
    try {
      GetGroupContactDetails result = apiInstance.getGroupContact(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupContactsApi#getGroupContact");
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
| **groupId** | **String**| Group Contact Id. | |

### Return type

[**GetGroupContactDetails**](GetGroupContactDetails.md)

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

<a id="groupContactList"></a>
# **groupContactList**
> GroupContactsList groupContactList(page, pageSize, searchKey, contactType, directories)

List Group Contacts.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.GroupContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    GroupContactsApi apiInstance = new GroupContactsApi(apiClient);

    Integer page = 1; // Integer | Page index specified in get user group contact list request. Default value is 1.
    Integer pageSize = 10; // Integer | Page size specified in get user group contact list request. Default value is 10.
    String searchKey = "searchKey_example"; // String | Group Contacts can be listed by the search  based on the Name or Email
    String contactType = "MyContacts"; // String | Group Contact type whether the contact is my contacts or all contacts. Default value is AllContacts.
    List<String> directories = Arrays.asList(); // List<String> | Group Contacts can be listed by the search  based on the directories
    
    try {
      GroupContactsList result = apiInstance.groupContactList(page, pageSize, searchKey, contactType, directories);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupContactsApi#groupContactList");
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
| **page** | **Integer**| Page index specified in get user group contact list request. Default value is 1. | [default to 1] |
| **pageSize** | **Integer**| Page size specified in get user group contact list request. Default value is 10. | [optional] [default to 10] |
| **searchKey** | **String**| Group Contacts can be listed by the search  based on the Name or Email | [optional] |
| **contactType** | **String**| Group Contact type whether the contact is my contacts or all contacts. Default value is AllContacts. | [optional] [enum: MyContacts, AllContacts] |
| **directories** | [**List&lt;String&gt;**](String.md)| Group Contacts can be listed by the search  based on the directories | [optional] |

### Return type

[**GroupContactsList**](GroupContactsList.md)

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

<a id="updateGroupContact"></a>
# **updateGroupContact**
> updateGroupContact(groupId, updateGroupContact)

Update the Group Contact.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.GroupContactsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    GroupContactsApi apiInstance = new GroupContactsApi(apiClient);

    String groupId = "groupId_example"; // String | The group contact ID.
    UpdateGroupContact updateGroupContact = new UpdateGroupContact(); // UpdateGroupContact | The group contact details.
    
    try {
      apiInstance.updateGroupContact(groupId, updateGroupContact);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupContactsApi#updateGroupContact");
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
| **groupId** | **String**| The group contact ID. | |
| **updateGroupContact** | [**UpdateGroupContact**](UpdateGroupContact.md)| The group contact details. | |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |

