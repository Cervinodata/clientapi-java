# AnalyticsDataProductMetricsApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGA4ReportPerProductNamePerOrganisationPerPropertyPerWeek**](AnalyticsDataProductMetricsApi.md#getGA4ReportPerProductNamePerOrganisationPerPropertyPerWeek) | **GET** /data/ga4-report-per-product-name-per-organisation-per-property-per-week/{organisationUuids} | Return GA4 report per product name per organisation per property per week |
| [**getGA4ReportPerProductSkuPerOrganisationPerPropertyPerWeek**](AnalyticsDataProductMetricsApi.md#getGA4ReportPerProductSkuPerOrganisationPerPropertyPerWeek) | **GET** /data/ga4-report-per-product-sku-per-organisation-per-property-per-week/{organisationUuids} | Return GA4 report per product sku per organisation per property per week |


<a id="getGA4ReportPerProductNamePerOrganisationPerPropertyPerWeek"></a>
# **getGA4ReportPerProductNamePerOrganisationPerPropertyPerWeek**
> String getGA4ReportPerProductNamePerOrganisationPerPropertyPerWeek(organisationUuids)

Return GA4 report per product name per organisation per property per week

GA4 report per product name per organisation per property per week

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataProductMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataProductMetricsApi apiInstance = new AnalyticsDataProductMetricsApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerProductNamePerOrganisationPerPropertyPerWeek(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataProductMetricsApi#getGA4ReportPerProductNamePerOrganisationPerPropertyPerWeek");
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

<a id="getGA4ReportPerProductSkuPerOrganisationPerPropertyPerWeek"></a>
# **getGA4ReportPerProductSkuPerOrganisationPerPropertyPerWeek**
> String getGA4ReportPerProductSkuPerOrganisationPerPropertyPerWeek(organisationUuids)

Return GA4 report per product sku per organisation per property per week

GA4 report per product sku per organisation per property per week

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataProductMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataProductMetricsApi apiInstance = new AnalyticsDataProductMetricsApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerProductSkuPerOrganisationPerPropertyPerWeek(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataProductMetricsApi#getGA4ReportPerProductSkuPerOrganisationPerPropertyPerWeek");
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

