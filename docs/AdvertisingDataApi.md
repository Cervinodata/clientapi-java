# AdvertisingDataApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdAccountReportPerOrganisationPerDay**](AdvertisingDataApi.md#getAdAccountReportPerOrganisationPerDay) | **GET** /data/ad-account-report-per-organisation-per-day/{organisationUuids} | Return ad account report per organisation per day
[**getAdAccounts**](AdvertisingDataApi.md#getAdAccounts) | **GET** /data/ad-accounts/{organisationUuid} | Return ad accounts by organisation
[**getAdCampaignReportPerDay**](AdvertisingDataApi.md#getAdCampaignReportPerDay) | **GET** /data/ad-campaign-report-per-day/{organisationUuid} | Return ad campaign report per day by organisation
[**getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](AdvertisingDataApi.md#getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/ad-campaign-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return ad campaign report per organisation per account per campaign per device per day
[**getAdCampaignReportPerOrganisationPerAccountPerDay**](AdvertisingDataApi.md#getAdCampaignReportPerOrganisationPerAccountPerDay) | **GET** /data/ad-campaign-report-per-organisation-per-account-per-day/{organisationUuids} | Return ad campaign report per organisation per account per day
[**getAdCampaigns**](AdvertisingDataApi.md#getAdCampaigns) | **GET** /data/ad-campaigns/{organisationUuid} | Return ad campaigns by organisation
[**getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/bing-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return bing ads extended report per organisation per account per campaign per day
[**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per day
[**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per device per day
[**getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](AdvertisingDataApi.md#getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/google-ads-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return google ads report per organisation per account per campaign per device per day
[**getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/linkedin-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return linkedin ads extended report per organisation per account per campaign per day
[**getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/snapchat-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return snapchat ads extended report per organisation per account per campaign per day
[**getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/twitter-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return twitter ads extended report per organisation per account per campaign per day


<a name="getAdAccountReportPerOrganisationPerDay"></a>
# **getAdAccountReportPerOrganisationPerDay**
> String getAdAccountReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format)

Return ad account report per organisation per day

Ad account report per organisation  per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAdAccountReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdAccountReportPerOrganisationPerDay");
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

<a name="getAdAccounts"></a>
# **getAdAccounts**
> String getAdAccounts(organisationUuid, format)

Return ad accounts by organisation

Ad accounts by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    String format = "format_example"; // String | Output format
    try {
      String result = apiInstance.getAdAccounts(organisationUuid, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdAccounts");
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

<a name="getAdCampaignReportPerDay"></a>
# **getAdCampaignReportPerDay**
> String getAdCampaignReportPerDay(organisationUuid, fromDate, dateFormat, format)

Return ad campaign report per day by organisation

Ad campaign report per day by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAdCampaignReportPerDay(organisationUuid, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdCampaignReportPerDay");
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
**400** | Invalid Organisation uuid supplied |  -  |
**404** | Organisation uuid not found |  -  |

<a name="getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay"></a>
# **getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**
> String getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay(organisationUuids, fromDate, dateFormat, format)

Return ad campaign report per organisation per account per campaign per device per day

Ad campaign report per organisation per account per campaign per device per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay");
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

<a name="getAdCampaignReportPerOrganisationPerAccountPerDay"></a>
# **getAdCampaignReportPerOrganisationPerAccountPerDay**
> String getAdCampaignReportPerOrganisationPerAccountPerDay(organisationUuids, fromDate, dateFormat, format)

Return ad campaign report per organisation per account per day

Ad campaign report per organisation per account per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAdCampaignReportPerOrganisationPerAccountPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdCampaignReportPerOrganisationPerAccountPerDay");
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

<a name="getAdCampaigns"></a>
# **getAdCampaigns**
> String getAdCampaigns(organisationUuid, fromDate, format)

Return ad campaigns by organisation

Ad campaigns by organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String format = "format_example"; // String | Output format
    try {
      String result = apiInstance.getAdCampaigns(organisationUuid, fromDate, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdCampaigns");
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
 **fromDate** | **LocalDate**| From date | [optional]
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

<a name="getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return bing ads extended report per organisation per account per campaign per day

Bing ads extended report per organisation per account per campaign per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return facebook ad extended report per organisation per account per campaign per day

Facebook ad extended report per organisation per account per campaign per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay"></a>
# **getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**
> String getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay(organisationUuids, fromDate, dateFormat, format)

Return facebook ad extended report per organisation per account per campaign per device per day

Facebook ad extended report per organisation per account per campaign per device per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay");
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

<a name="getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay"></a>
# **getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**
> String getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay(organisationUuids, fromDate, dateFormat, format)

Return google ads report per organisation per account per campaign per device per day

Campaign group google ads report per organisation per account per campaign per device per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay");
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

<a name="getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return linkedin ads extended report per organisation per account per campaign per day

Linkedin ads extended report per organisation per account per campaign per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return snapchat ads extended report per organisation per account per campaign per day

Snapchat ads extended report per organisation per account per campaign per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

<a name="getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return twitter ads extended report per organisation per account per campaign per day

Twitter ads extended report per organisation per account per campaign per day

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.AdvertisingDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdvertisingDataApi apiInstance = new AdvertisingDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    LocalDate fromDate = new LocalDate(); // LocalDate | From date
    String dateFormat = "dateFormat_example"; // String | Outputted date format
    String format = "format_example"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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

