# AdvertisingDataApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdAccountReportPerOrganisationPerDay**](AdvertisingDataApi.md#getAdAccountReportPerOrganisationPerDay) | **GET** /data/ad-account-report-per-organisation-per-day/{organisationUuids} | Return ad account report per organisation per day |
| [**getAdAccounts**](AdvertisingDataApi.md#getAdAccounts) | **GET** /data/ad-accounts/{organisationUuid} | Return ad accounts by organisation |
| [**getAdCampaignReportPerDay**](AdvertisingDataApi.md#getAdCampaignReportPerDay) | **GET** /data/ad-campaign-report-per-day/{organisationUuid} | Return ad campaign report per day by organisation |
| [**getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](AdvertisingDataApi.md#getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/ad-campaign-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return ad campaign report per organisation per account per campaign per device per day |
| [**getAdCampaignReportPerOrganisationPerAccountPerDay**](AdvertisingDataApi.md#getAdCampaignReportPerOrganisationPerAccountPerDay) | **GET** /data/ad-campaign-report-per-organisation-per-account-per-day/{organisationUuids} | Return ad campaign report per organisation per account per day |
| [**getAdCampaigns**](AdvertisingDataApi.md#getAdCampaigns) | **GET** /data/ad-campaigns/{organisationUuid} | Return ad campaigns by organisation |
| [**getAdGroups**](AdvertisingDataApi.md#getAdGroups) | **GET** /data/ad-groups/{organisationUuid} | Return ad groups by organisation |
| [**getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerCreativePerDay**](AdvertisingDataApi.md#getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerCreativePerDay) | **GET** /data/adform-extended-report-per-organisation-per-account-per-campaign-per-creative-per-day/{organisationUuids} | Return adform extended report per organisation per account per campaign per creative per day |
| [**getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/adform-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return adform extended report per organisation per account per campaign per day |
| [**getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerLineItemPerDay**](AdvertisingDataApi.md#getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerLineItemPerDay) | **GET** /data/adform-extended-report-per-organisation-per-account-per-campaign-per-line-item-per-day/{organisationUuids} | Return adform extended report per organisation per account per campaign per line item per day |
| [**getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/bing-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return bing ads extended report per organisation per account per campaign per day |
| [**getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/facebook-ad-custom-conversion-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return facebook ad custom conversion report per organisation per account per campaign per day |
| [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDay**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-ad-group-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per ad group per day |
| [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDayPlus**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDayPlus) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-ad-group-per-day-plus/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per ad group per day plus |
| [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdPerDay**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdPerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-ad-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per ad per day |
| [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per day |
| [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDayPlus**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDayPlus) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-day-plus/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per day plus |
| [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per device per day |
| [**getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](AdvertisingDataApi.md#getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/google-ads-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return google ads report per organisation per account per campaign per device per day |
| [**getHashedAdCampaignReportPerOrganisationPerAccountPerDay**](AdvertisingDataApi.md#getHashedAdCampaignReportPerOrganisationPerAccountPerDay) | **GET** /data/hashed-ad-campaign-report-per-organisation-per-account-per-day/{organisationUuids} | Return hashed ad campaign report per organisation per account per day |
| [**getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/linkedin-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return linkedin ads extended report per organisation per account per campaign per day |
| [**getPinterestAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getPinterestAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/pinterest-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return pinterest ads extended report per organisation per account per campaign per day |
| [**getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/snapchat-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return snapchat ads extended report per organisation per account per campaign per day |
| [**getTikTokAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getTikTokAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/tiktok-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return tiktok ads extended report per organisation per account per campaign per day |
| [**getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](AdvertisingDataApi.md#getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/twitter-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return twitter ads extended report per organisation per account per campaign per day |


<a id="getAdAccountReportPerOrganisationPerDay"></a>
# **getAdAccountReportPerOrganisationPerDay**
> String getAdAccountReportPerOrganisationPerDay(organisationUuids, fromDate, dateFormat, format)

Return ad account report per organisation per day

Ad account report per organisation per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getAdAccounts"></a>
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
    String format = "csv"; // String | Output format
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuid** | **String**| Organisation uuid | |
| **format** | **String**| Output format | [optional] [enum: csv, json] |

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

<a id="getAdCampaignReportPerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuid** | **String**| Organisation uuid | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getAdCampaignReportPerOrganisationPerAccountPerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getAdCampaigns"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String format = "csv"; // String | Output format
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuid** | **String**| Organisation uuid | |
| **fromDate** | **DateTime**| From date | [optional] |
| **format** | **String**| Output format | [optional] [enum: csv, json] |

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

<a id="getAdGroups"></a>
# **getAdGroups**
> String getAdGroups(organisationUuid, fromDate, format)

Return ad groups by organisation

Ad groups by organisation

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String format = "csv"; // String | Output format
    try {
      String result = apiInstance.getAdGroups(organisationUuid, fromDate, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdGroups");
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
| **fromDate** | **DateTime**| From date | [optional] |
| **format** | **String**| Output format | [optional] [enum: csv, json] |

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

<a id="getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerCreativePerDay"></a>
# **getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerCreativePerDay**
> String getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerCreativePerDay(organisationUuids, fromDate, dateFormat, format)

Return adform extended report per organisation per account per campaign per creative per day

Adform extended report per organisation per account per campaign per creative per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerCreativePerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerCreativePerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return adform extended report per organisation per account per campaign per day

Adform extended report per organisation per account per campaign per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerLineItemPerDay"></a>
# **getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerLineItemPerDay**
> String getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerLineItemPerDay(organisationUuids, fromDate, dateFormat, format)

Return adform extended report per organisation per account per campaign per line item per day

Adform extended report per organisation per account per campaign per line item per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerLineItemPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getAdformExtendedReportPerOrganisationPerAccountPerCampaignPerLineItemPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay**
> String getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return facebook ad custom conversion report per organisation per account per campaign per day

Facebook ad custom conversion report per organisation per account per campaign per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDay"></a>
# **getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDay**
> String getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDay(organisationUuids, fromDate, dateFormat, format)

Return facebook ad extended report per organisation per account per campaign per ad group per day

Facebook ad extended report per organisation per account per campaign per ad group per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDayPlus"></a>
# **getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDayPlus**
> String getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDayPlus(organisationUuids, fromDate, dateFormat, format)

Return facebook ad extended report per organisation per account per campaign per ad group per day plus

Facebook ad extended report per organisation per account per campaign per ad group per day plus

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDayPlus(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdGroupPerDayPlus");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdPerDay"></a>
# **getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdPerDay**
> String getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdPerDay(organisationUuids, fromDate, dateFormat, format)

Return facebook ad extended report per organisation per account per campaign per ad per day

Facebook ad extended report per organisation per account per campaign per ad per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerAdPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDayPlus"></a>
# **getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDayPlus**
> String getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDayPlus(organisationUuids, fromDate, dateFormat, format)

Return facebook ad extended report per organisation per account per campaign per day plus

Facebook ad extended report per organisation per account per campaign per day plus

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDayPlus(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDayPlus");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getHashedAdCampaignReportPerOrganisationPerAccountPerDay"></a>
# **getHashedAdCampaignReportPerOrganisationPerAccountPerDay**
> String getHashedAdCampaignReportPerOrganisationPerAccountPerDay(organisationUuids, fromDate, dateFormat, format)

Return hashed ad campaign report per organisation per account per day

Hashed ad campaign report per organisation per account per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getHashedAdCampaignReportPerOrganisationPerAccountPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getHashedAdCampaignReportPerOrganisationPerAccountPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getPinterestAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getPinterestAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getPinterestAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return pinterest ads extended report per organisation per account per campaign per day

Pinterest ads extended report per organisation per account per campaign per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getPinterestAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getPinterestAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getTikTokAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
# **getTikTokAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**
> String getTikTokAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format)

Return tiktok ads extended report per organisation per account per campaign per day

TikTok ads extended report per organisation per account per campaign per day

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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
    try {
      String result = apiInstance.getTikTokAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay(organisationUuids, fromDate, dateFormat, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertisingDataApi#getTikTokAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay");
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
| **fromDate** | **DateTime**| From date | [optional] |
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

<a id="getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay"></a>
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
    DateTime fromDate = new DateTime(); // DateTime | From date
    String dateFormat = "YYYY-MM-DD"; // String | Outputted date format
    String format = "csv"; // String | Output format (use csv for large result sets)
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationUuids** | [**List&lt;String&gt;**](String.md)| Organisation uuids | |
| **fromDate** | **DateTime**| From date | [optional] |
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

