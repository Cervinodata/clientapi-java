# ProductDataApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth_0**](ProductDataApi.md#getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth_0) | **GET** /data/ga4-report-per-channel-group-per-product-name-per-organisation-per-property-per-month/{organisationUuids} | Return GA4 report per channel group per product name per organisation per property per month |


<a id="getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth_0"></a>
# **getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth_0**
> String getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth_0(organisationUuids)

Return GA4 report per channel group per product name per organisation per property per month

GA4 report per channel group per product name per organisation per property per month

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.ProductDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductDataApi apiInstance = new ProductDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth_0(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductDataApi#getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth_0");
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
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Organisation uuids supplied |  -  |
| **404** | Organisation uuids not found |  -  |

