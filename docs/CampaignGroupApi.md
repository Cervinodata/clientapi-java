# CampaignGroupApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaignGroupAdReportPerOrganisationPerDay**](CampaignGroupApi.md#getCampaignGroupAdReportPerOrganisationPerDay) | **GET** /data/campaign-group-ad-report-per-organisation-per-day/{organisationUuids} | Return campaign group ad report per organisation per day
[**getCampaignGroupAnalyticsReportPerOrganisationPerDay**](CampaignGroupApi.md#getCampaignGroupAnalyticsReportPerOrganisationPerDay) | **GET** /data/campaign-group-analytics-report-per-organisation-per-day/{organisationUuids} | Return campaign group analytics report per organisation per day
[**getCampaignGroupReportPerOrganisationPerDay**](CampaignGroupApi.md#getCampaignGroupReportPerOrganisationPerDay) | **GET** /data/campaign-group-report-per-organisation-per-day/{organisationUuids} | Return campaign group report per organisation per day


<a name="getCampaignGroupAdReportPerOrganisationPerDay"></a>
# **getCampaignGroupAdReportPerOrganisationPerDay**
> String getCampaignGroupAdReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group ad report per organisation per day

Campaign group ad report per organisation per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.CampaignGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CampaignGroupApi apiInstance = new CampaignGroupApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getCampaignGroupAdReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupAdReportPerOrganisationPerDay");
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
 **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids |
 **fromDate** | **LocalDate**| From date | [optional]
 **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD]
 **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json]

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
**400** | Invalid Organisation uuids supplied |  -  |
**404** | Organisation uuids not found |  -  |

<a name="getCampaignGroupAnalyticsReportPerOrganisationPerDay"></a>
# **getCampaignGroupAnalyticsReportPerOrganisationPerDay**
> String getCampaignGroupAnalyticsReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group analytics report per organisation per day

Campaign group analytics report per organisation per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.CampaignGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CampaignGroupApi apiInstance = new CampaignGroupApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getCampaignGroupAnalyticsReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupAnalyticsReportPerOrganisationPerDay");
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
 **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids |
 **fromDate** | **LocalDate**| From date | [optional]
 **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD]
 **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json]

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
**400** | Invalid Organisation uuids supplied |  -  |
**404** | Organisation uuids not found |  -  |

<a name="getCampaignGroupReportPerOrganisationPerDay"></a>
# **getCampaignGroupReportPerOrganisationPerDay**
> String getCampaignGroupReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group report per organisation per day

Campaign group report per organisation per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.CampaignGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CampaignGroupApi apiInstance = new CampaignGroupApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getCampaignGroupReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupReportPerOrganisationPerDay");
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
 **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids |
 **fromDate** | **LocalDate**| From date | [optional]
 **dateFormat** | **String**| Outputted date format | [optional] [enum: YYYY-MM-DD, YYYYMMDD]
 **format** | **String**| Output format (use csv for large result sets) | [optional] [enum: csv, json]

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
**400** | Invalid Organisation uuids supplied |  -  |
**404** | Organisation uuids not found |  -  |

