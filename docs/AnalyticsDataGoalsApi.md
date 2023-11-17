# AnalyticsDataGoalsApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnalyticsGoalReportPerCampaignPerDay**](AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerCampaignPerDay) | **GET** /data/analytics-goal-report-per-campaign-per-day/{organisationUuid} | Return analytics goal report per campaign per day by organisation |
| [**getAnalyticsGoalReportPerChannelGroupPerDay**](AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerChannelGroupPerDay) | **GET** /data/analytics-goal-report-per-channel-group-per-day/{organisationUuid} | Return analytics goal report per channel group per day by organisation |
| [**getAnalyticsGoalReportPerDevicePerDay**](AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerDevicePerDay) | **GET** /data/analytics-goal-report-per-device-per-day/{organisationUuid} | Return analytics goal report per device per day by organisation |
| [**getAnalyticsGoalReportPerSourceMediumPerDay**](AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerSourceMediumPerDay) | **GET** /data/analytics-goal-report-per-source-medium-per-day/{organisationUuid} | Return analytics goal report per source medium per day by organisation |


<a id="getAnalyticsGoalReportPerCampaignPerDay"></a>
# **getAnalyticsGoalReportPerCampaignPerDay**
> String getAnalyticsGoalReportPerCampaignPerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics goal report per campaign per day by organisation

Analytics goal report per campaign per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataGoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataGoalsApi apiInstance = new AnalyticsDataGoalsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsGoalReportPerCampaignPerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataGoalsApi#getAnalyticsGoalReportPerCampaignPerDay");
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

<a id="getAnalyticsGoalReportPerChannelGroupPerDay"></a>
# **getAnalyticsGoalReportPerChannelGroupPerDay**
> String getAnalyticsGoalReportPerChannelGroupPerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics goal report per channel group per day by organisation

Analytics goal report per channel group per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataGoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataGoalsApi apiInstance = new AnalyticsDataGoalsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsGoalReportPerChannelGroupPerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataGoalsApi#getAnalyticsGoalReportPerChannelGroupPerDay");
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

<a id="getAnalyticsGoalReportPerDevicePerDay"></a>
# **getAnalyticsGoalReportPerDevicePerDay**
> String getAnalyticsGoalReportPerDevicePerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics goal report per device per day by organisation

Analytics goal report per device per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataGoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataGoalsApi apiInstance = new AnalyticsDataGoalsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsGoalReportPerDevicePerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataGoalsApi#getAnalyticsGoalReportPerDevicePerDay");
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

<a id="getAnalyticsGoalReportPerSourceMediumPerDay"></a>
# **getAnalyticsGoalReportPerSourceMediumPerDay**
> String getAnalyticsGoalReportPerSourceMediumPerDay(organisationUuid, fromDate, dateFormat, format)

Return analytics goal report per source medium per day by organisation

Analytics goal report per source medium per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AnalyticsDataGoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataGoalsApi apiInstance = new AnalyticsDataGoalsApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    java.time.LocalDate fromDate = new java.time.LocalDate(); // java.time.LocalDate | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAnalyticsGoalReportPerSourceMediumPerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataGoalsApi#getAnalyticsGoalReportPerSourceMediumPerDay");
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

