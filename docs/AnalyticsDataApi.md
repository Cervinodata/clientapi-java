# AnalyticsDataApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGA4ReportPerChannelGroupPerOrganisationPerProperty**](AnalyticsDataApi.md#getGA4ReportPerChannelGroupPerOrganisationPerProperty) | **GET** /data/ga4-report-per-channel-group-per-organisation-per-property/{organisationUuids} | Return GA4 report per channel group per organisation per property |
| [**getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth**](AnalyticsDataApi.md#getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth) | **GET** /data/ga4-report-per-channel-group-per-organisation-per-property-per-month/{organisationUuids} | Return GA4 report per channel group per organisation per property per month |
| [**getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth**](AnalyticsDataApi.md#getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth) | **GET** /data/ga4-report-per-channel-group-per-product-name-per-organisation-per-property-per-month/{organisationUuids} | Return GA4 report per channel group per product name per organisation per property per month |
| [**getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth**](AnalyticsDataApi.md#getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth) | **GET** /data/ga4-report-per-channel-group-per-source-medium-per-organisation-per-property-per-month/{organisationUuids} | Return GA4 report per channel group per source medium per organisation per property per month |
| [**getViews**](AnalyticsDataApi.md#getViews) | **GET** /data/views/{organisationUuid} | Return views by organisation |


<a id="getGA4ReportPerChannelGroupPerOrganisationPerProperty"></a>
# **getGA4ReportPerChannelGroupPerOrganisationPerProperty**
> String getGA4ReportPerChannelGroupPerOrganisationPerProperty(organisationUuids)

Return GA4 report per channel group per organisation per property

GA4 report per channel group per organisation per property

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
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerChannelGroupPerOrganisationPerProperty(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataApi#getGA4ReportPerChannelGroupPerOrganisationPerProperty");
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

<a id="getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth"></a>
# **getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth**
> String getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth(organisationUuids)

Return GA4 report per channel group per organisation per property per month

GA4 report per channel group per organisation per property per month

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
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataApi#getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth");
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

<a id="getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth"></a>
# **getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth**
> String getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth(organisationUuids)

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
import com.cervinodata.client.api.AnalyticsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalyticsDataApi apiInstance = new AnalyticsDataApi(defaultClient);
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataApi#getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth");
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

<a id="getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth"></a>
# **getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth**
> String getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth(organisationUuids)

Return GA4 report per channel group per source medium per organisation per property per month

GA4 report per channel group per source medium per organisation per property per month

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
    List<String> organisationUuids = Arrays.asList(); // List<String> | Organisation uuids
    try {
      String result = apiInstance.getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth(organisationUuids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsDataApi#getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth");
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

<a id="getViews"></a>
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

