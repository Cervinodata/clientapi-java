# AnalyticsDataDefaultMetricsApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnalyticsReportPerCampaignPerDay**](AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerCampaignPerDay) | **GET** /data/analytics-report-per-campaign-per-day/{organisationUuid} | Return analytics report per campaign per day by organisation |
| [**getAnalyticsReportPerChannelGroupPerDay**](AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerChannelGroupPerDay) | **GET** /data/analytics-report-per-channel-group-per-day/{organisationUuid} | Return analytics report per channel group per day by organisation |
| [**getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay**](AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay) | **GET** /data/analytics-report-per-device-per-channel-group-per-organisation-per-view-per-day/{organisationUuids} | Return analytics report per device per channel group per organisation per view per day |
| [**getAnalyticsReportPerDevicePerDay**](AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerDevicePerDay) | **GET** /data/analytics-report-per-device-per-day/{organisationUuid} | Return analytics report per device per day by organisation |
| [**getAnalyticsReportPerSourceMediumPerDay**](AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerSourceMediumPerDay) | **GET** /data/analytics-report-per-source-medium-per-day/{organisationUuid} | Return analytics report per source medium per day by organisation |
| [**getGA4ReportPerDevicePerChannelGroupPerOrganisationPerPropertyPerDay**](AnalyticsDataDefaultMetricsApi.md#getGA4ReportPerDevicePerChannelGroupPerOrganisationPerPropertyPerDay) | **GET** /data/ga4-report-per-device-per-channel-group-per-organisation-per-property-per-day/{organisationUuids} | Return GA4 report per device per channel group per organisation per property per day |


<a id="getAnalyticsReportPerCampaignPerDay"></a>
# **getAnalyticsReportPerCampaignPerDay**
> String getAnalyticsReportPerCampaignPerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics report per campaign per day by organisation

Analytics report per campaign per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataDefaultMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataDefaultMetricsApi apiInstance = new AnalyticsDataDefaultMetricsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsReportPerCampaignPerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataDefaultMetricsApi#getAnalyticsReportPerCampaignPerDay");
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
| **organisationUuid** | **String**| Organisation uuid | |
| **fromDate** | **java.time.LocalDate**| From date | [optional] |
| **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD] |
| **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json] |

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
| **200** | successful operation |  -  |
| **400** | Invalid Organisation uuid supplied |  -  |
| **404** | Organisation uuid not found |  -  |

<a id="getAnalyticsReportPerChannelGroupPerDay"></a>
# **getAnalyticsReportPerChannelGroupPerDay**
> String getAnalyticsReportPerChannelGroupPerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics report per channel group per day by organisation

Analytics report per channel group per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataDefaultMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataDefaultMetricsApi apiInstance = new AnalyticsDataDefaultMetricsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsReportPerChannelGroupPerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataDefaultMetricsApi#getAnalyticsReportPerChannelGroupPerDay");
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
| **organisationUuid** | **String**| Organisation uuid | |
| **fromDate** | **java.time.LocalDate**| From date | [optional] |
| **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD] |
| **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json] |

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
| **200** | successful operation |  -  |
| **400** | Invalid Organisation uuid supplied |  -  |
| **404** | Organisation uuid not found |  -  |

<a id="getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay"></a>
# **getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay**
> String getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay(organisationUuids, fromDate, dateFormat, format)

Return analytics report per device per channel group per organisation per view per day

Analytics report per device per channel group per organisation per view per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataDefaultMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataDefaultMetricsApi apiInstance = new AnalyticsDataDefaultMetricsApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataDefaultMetricsApi#getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay");
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
| **fromDate** | **java.time.LocalDate**| From date | [optional] |
| **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD] |
| **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json] |

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
| **200** | successful operation |  -  |
| **400** | Invalid Organisation uuids supplied |  -  |
| **404** | Organisation uuids not found |  -  |

<a id="getAnalyticsReportPerDevicePerDay"></a>
# **getAnalyticsReportPerDevicePerDay**
> String getAnalyticsReportPerDevicePerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics report per device per day by organisation

Analytics report per device per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataDefaultMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataDefaultMetricsApi apiInstance = new AnalyticsDataDefaultMetricsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsReportPerDevicePerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataDefaultMetricsApi#getAnalyticsReportPerDevicePerDay");
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
| **organisationUuid** | **String**| Organisation uuid | |
| **fromDate** | **java.time.LocalDate**| From date | [optional] |
| **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD] |
| **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json] |

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
| **200** | successful operation |  -  |
| **400** | Invalid Organisation uuid supplied |  -  |
| **404** | Organisation uuid not found |  -  |

<a id="getAnalyticsReportPerSourceMediumPerDay"></a>
# **getAnalyticsReportPerSourceMediumPerDay**
> String getAnalyticsReportPerSourceMediumPerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics report per source medium per day by organisation

Analytics report per source medium per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataDefaultMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataDefaultMetricsApi apiInstance = new AnalyticsDataDefaultMetricsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsReportPerSourceMediumPerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataDefaultMetricsApi#getAnalyticsReportPerSourceMediumPerDay");
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
| **organisationUuid** | **String**| Organisation uuid | |
| **fromDate** | **java.time.LocalDate**| From date | [optional] |
| **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD] |
| **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json] |

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
| **200** | successful operation |  -  |
| **400** | Invalid Organisation uuid supplied |  -  |
| **404** | Organisation uuid not found |  -  |

<a id="getGA4ReportPerDevicePerChannelGroupPerOrganisationPerPropertyPerDay"></a>
# **getGA4ReportPerDevicePerChannelGroupPerOrganisationPerPropertyPerDay**
> String getGA4ReportPerDevicePerChannelGroupPerOrganisationPerPropertyPerDay(organisationUuids, fromDate, dateFormat, format)

Return GA4 report per device per channel group per organisation per property per day

GA4 report per device per channel group per organisation per property per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataDefaultMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataDefaultMetricsApi apiInstance = new AnalyticsDataDefaultMetricsApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getGA4ReportPerDevicePerChannelGroupPerOrganisationPerPropertyPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataDefaultMetricsApi#getGA4ReportPerDevicePerChannelGroupPerOrganisationPerPropertyPerDay");
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
| **fromDate** | **java.time.LocalDate**| From date | [optional] |
| **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD] |
| **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json] |

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
| **200** | successful operation |  -  |
| **400** | Invalid Organisation uuids supplied |  -  |
| **404** | Organisation uuids not found |  -  |

