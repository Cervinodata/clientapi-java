# AnalyticsDataApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getViews**](AnalyticsDataApi.md#getViews) | **GET** /data/views/{organisationUuid} | Return views by organisation


<a name="getViews"></a>
# **getViews**
> String getViews(organisationUuid, format)

Return views by organisation

Views by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataApi apiInstance = new AnalyticsDataApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    String format = "csv"; // String | Output format
    try {
      String result = apiInstance.getViews(organisationUuid, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataApi#getViews");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationUuid** | **String**| Organisation uuid |
 **format** | **String**| Output format | [optional] [enum: csv, json]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid Organisation uuid supplied |  -  |
**404** | Organisation uuid not found |  -  |

