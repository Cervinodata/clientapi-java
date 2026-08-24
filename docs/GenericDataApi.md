# GenericDataApi

All URIs are relative to *https://app.cervinodata.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrganisation**](GenericDataApi.md#createOrganisation) | **POST** /data/organisations | Create an organisation |
| [**deleteOrganisation**](GenericDataApi.md#deleteOrganisation) | **DELETE** /data/organisations/{organisationUuid} | Delete an organisation |
| [**getCampaignGroups**](GenericDataApi.md#getCampaignGroups) | **GET** /data/campaign-groups | Return campaign groups |
| [**getOrganisations**](GenericDataApi.md#getOrganisations) | **GET** /data/organisations | Return organisations |
| [**updateOrganisation**](GenericDataApi.md#updateOrganisation) | **PUT** /data/organisations/{organisationUuid} | Update an organisation |


<a id="createOrganisation"></a>
# **createOrganisation**
> Object createOrganisation(createOrganisationRequest)

Create an organisation

Create a new organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.GenericDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    GenericDataApi apiInstance = new GenericDataApi(defaultClient);
    CreateOrganisationRequest createOrganisationRequest = new CreateOrganisationRequest(); // CreateOrganisationRequest | 
    try {
      Object result = apiInstance.createOrganisation(createOrganisationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenericDataApi#createOrganisation");
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
| **createOrganisationRequest** | [**CreateOrganisationRequest**](CreateOrganisationRequest.md)|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **422** | Validation error |  -  |

<a id="deleteOrganisation"></a>
# **deleteOrganisation**
> deleteOrganisation(organisationUuid)

Delete an organisation

Delete an organisation. Accounts belonging to the organisation are reassigned to the default organisation. The default organisation itself cannot be deleted.

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.GenericDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    GenericDataApi apiInstance = new GenericDataApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    try {
      apiInstance.deleteOrganisation(organisationUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenericDataApi#deleteOrganisation");
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

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **403** | No access |  -  |
| **404** | Organisation uuid not found |  -  |
| **422** | Default organisation cannot be deleted |  -  |

<a id="getCampaignGroups"></a>
# **getCampaignGroups**
> List&lt;Object&gt; getCampaignGroups()

Return campaign groups

campaign groups

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.GenericDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    GenericDataApi apiInstance = new GenericDataApi(defaultClient);
    try {
      List<Object> result = apiInstance.getCampaignGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenericDataApi#getCampaignGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a id="getOrganisations"></a>
# **getOrganisations**
> String getOrganisations(format)

Return organisations

organisations

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.GenericDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    GenericDataApi apiInstance = new GenericDataApi(defaultClient);
    String format = "csv"; // String | Output format
    try {
      String result = apiInstance.getOrganisations(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenericDataApi#getOrganisations");
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

<a id="updateOrganisation"></a>
# **updateOrganisation**
> Object updateOrganisation(organisationUuid, createOrganisationRequest)

Update an organisation

Update an existing organisation

### Example
```java
// Import classes:
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.auth.*;
import com.cervinodata.client.models.*;
import com.cervinodata.client.api.GenericDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app.cervinodata.com/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    GenericDataApi apiInstance = new GenericDataApi(defaultClient);
    String organisationUuid = "organisationUuid_example"; // String | Organisation uuid
    CreateOrganisationRequest createOrganisationRequest = new CreateOrganisationRequest(); // CreateOrganisationRequest | 
    try {
      Object result = apiInstance.updateOrganisation(organisationUuid, createOrganisationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenericDataApi#updateOrganisation");
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
| **createOrganisationRequest** | [**CreateOrganisationRequest**](CreateOrganisationRequest.md)|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **403** | No access |  -  |
| **404** | Organisation uuid not found |  -  |

