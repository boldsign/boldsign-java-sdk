# PlanApi

All URIs are relative to *https://api.boldsign.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiCreditsCount**](PlanApi.md#apiCreditsCount) | **GET** /v1/plan/apiCreditsCount | Gets the Api credits details. |


<a id="apiCreditsCount"></a>
# **apiCreditsCount**
> BillingViewModel apiCreditsCount()

Gets the Api credits details.

### Example
```java
// Import classes:
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.auth.*;
import com.boldsign.models.*;
import com.boldsign.api.PlanApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setApiKey("YOUR_API_KEY");

    PlanApi apiInstance = new PlanApi(apiClient);

    
    try {
      BillingViewModel result = apiInstance.apiCreditsCount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#apiCreditsCount");
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

[**BillingViewModel**](BillingViewModel.md)

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

