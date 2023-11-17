# AnalyticsDataTransactionMetricsApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGA4ReportPerCampaignPerOrganisationPerProperty**](AnalyticsDataTransactionMetricsApi.md#getGA4ReportPerCampaignPerOrganisationPerProperty) | **GET** /data/ga4-report-per-campaign-per-organisation-per-property/{organisationUuids} | Return GA4 report per campaign per organisation per property |
| [**getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth**](AnalyticsDataTransactionMetricsApi.md#getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth) | **GET** /data/ga4-report-per-campaign-per-organisation-per-property-per-month/{organisationUuids} | Return GA4 report per campaign per organisation per property per month |


<a id="getGA4ReportPerCampaignPerOrganisationPerProperty"></a>
# **getGA4ReportPerCampaignPerOrganisationPerProperty**
> String getGA4ReportPerCampaignPerOrganisationPerProperty(organisationUuids)

Return GA4 report per campaign per organisation per property

GA4 report per campaign per organisation per property

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataTransactionMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataTransactionMetricsApi apiInstance = new AnalyticsDataTransactionMetricsApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerCampaignPerOrganisationPerProperty(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataTransactionMetricsApi#getGA4ReportPerCampaignPerOrganisationPerProperty");
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

<a id="getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth"></a>
# **getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth**
> String getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth(organisationUuids)

Return GA4 report per campaign per organisation per property per month

GA4 report per campaign per organisation per property per month

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataTransactionMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataTransactionMetricsApi apiInstance = new AnalyticsDataTransactionMetricsApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataTransactionMetricsApi#getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth");
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

