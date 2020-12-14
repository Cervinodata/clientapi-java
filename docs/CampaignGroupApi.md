# CampaignGroupApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaignGroupAdReportPerOrganisationPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupAdReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-ad-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group ad report per organisation per campaign per day
[**getCampaignGroupAdReportPerOrganisationPerDay**](CampaignGroupApi.md#getCampaignGroupAdReportPerOrganisationPerDay) | **GET** /data/campaign-group-ad-report-per-organisation-per-day/{organisationUuids} | Return campaign group ad report per organisation per day
[**getCampaignGroupAnalyticsReportPerOrganisationPerDay**](CampaignGroupApi.md#getCampaignGroupAnalyticsReportPerOrganisationPerDay) | **GET** /data/campaign-group-analytics-report-per-organisation-per-day/{organisationUuids} | Return campaign group analytics report per organisation per day
[**getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-bing-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group bing ads extended report per organisation per account per campaign per day
[**getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-doubleclick-bid-manager-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group doubleclick bid manager report per organisation per account per campaign per day
[**getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-doubleclick-campaign-manager-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group doubleclick campaign manager report per organisation per account per campaign per day
[**getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-facebook-ad-extended-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group facebook ad extended report per organisation per campaign per day
[**getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-facebook-ad-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group facebook ad report per organisation per campaign per day
[**getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-google-ads-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group google ads report per organisation per campaign per day
[**getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-linkedin-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group linkedin ads extended report per organisation per account per campaign per day
[**getCampaignGroupReportPerOrganisationPerDay**](CampaignGroupApi.md#getCampaignGroupReportPerOrganisationPerDay) | **GET** /data/campaign-group-report-per-organisation-per-day/{organisationUuids} | Return campaign group report per organisation per day
[**getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-snapchat-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group snapchat ads extended report per organisation per account per campaign per day
[**getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-twitter-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group twitter ads extended report per organisation per account per campaign per day
[**getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay**](CampaignGroupApi.md#getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-video-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group video report per organisation per campaign per day
[**getCampaignGroupVideoReportPerOrganisationPerDay**](CampaignGroupApi.md#getCampaignGroupVideoReportPerOrganisationPerDay) | **GET** /data/campaign-group-video-report-per-organisation-per-day/{organisationUuids} | Return campaign group video report per organisation per day


<a name="getCampaignGroupAdReportPerOrganisationPerCampaignPerDay"></a>
# **getCampaignGroupAdReportPerOrganisationPerCampaignPerDay**
> String getCampaignGroupAdReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group ad report per organisation per campaign per day

Campaign group ad report per organisation per campaign per day

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
      String result = apiInstance.getCampaignGroupAdReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupAdReportPerOrganisationPerCampaignPerDay");
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

<a name="getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group bing ads extended report per organisation per account per campaign per day

Campaign group bing ads extended report per organisation per account per campaign per day

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
      String result = apiInstance.getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay**
> String getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group doubleclick bid manager report per organisation per account per campaign per day

Campaign group doubleclick bid manager report per organisation per account per campaign per day

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
      String result = apiInstance.getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay**
> String getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group doubleclick campaign manager report per organisation per account per campaign per day

Campaign group doubleclick campaign manager report per organisation per account per campaign per day

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
      String result = apiInstance.getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay"></a>
# **getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay**
> String getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group facebook ad extended report per organisation per campaign per day

Campaign group facebook ad extended report per organisation per campaign per day

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
      String result = apiInstance.getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay");
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

<a name="getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay"></a>
# **getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay**
> String getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group facebook ad report per organisation per campaign per day

Campaign group facebook ad report per organisation  per campaign per day

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
      String result = apiInstance.getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay");
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

<a name="getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay"></a>
# **getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay**
> String getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group google ads report per organisation per campaign per day

Campaign group google ads report per organisation  per campaign per day

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
      String result = apiInstance.getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay");
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

<a name="getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group linkedin ads extended report per organisation per account per campaign per day

Campaign group linkedin ads extended report per organisation per account per campaign per day

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
      String result = apiInstance.getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group snapchat ads extended report per organisation per account per campaign per day

Campaign group snapchat ads extended report per organisation per account per campaign per day

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
      String result = apiInstance.getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group twitter ads extended report per organisation per account per campaign per day

Campaign group twitter ads extended report per organisation per account per campaign per day

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
      String result = apiInstance.getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay"></a>
# **getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay**
> String getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group video report per organisation per campaign per day

Campaign group video report per organisation per campaign per day

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
      String result = apiInstance.getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay");
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

<a name="getCampaignGroupVideoReportPerOrganisationPerDay"></a>
# **getCampaignGroupVideoReportPerOrganisationPerDay**
> String getCampaignGroupVideoReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format)

Return campaign group video report per organisation per day

Campaign group video report per organisation per day

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
      String result = apiInstance.getCampaignGroupVideoReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupApi#getCampaignGroupVideoReportPerOrganisationPerDay");
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

