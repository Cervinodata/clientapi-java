# cervinodata-java-client

Cervinodata API documentation
- API version: 1.0.0
  - Build date: 2021-02-12T10:03:24.993Z[GMT]

<div style='margin: 2em 0;'>
 <p>
 Before you get going with the Cervinodata API, set up Cervinodata (read the support page here: <a href='https://support.cervinodata.com/hc/en-nl/articles/360004363237' target='_blank'>How to set up the Cervinodata API</a>).
 </p>
<h3>To use the Cervinodata API, you need all of the following:</h3>
<p>
<ol>
<li>An active Cervinodata account, you can start a free trial <a href='https://app.cervinodata.com/register' target='_blank'>here</a></li>
<li>At least one connection to a platform (check <a href='https://app.cervinodata.com/data-sources-connections' target='_blank'>here</a>)</li>
<li>At least one account switched ON (check <a href='https://app.cervinodata.com/accounts' target='_blank'>here</a>)</li>
<li>At least one data refresh executed (check <a href='https://app.cervinodata.com/manual-data-refresh' target='_blank'>here</a>)</li>
<li>An active API token (check <a href='https://app.cervinodata.com/settings#/api' target='_blank'>here</a>)</li>
</ol>
</p>
<p>
Note that limits apply for <a href='https://support.cervinodata.com/hc/articles/360014265139' target='_blank'>Free plan users</a>.
</p>
<p>
If you wish to automate your Cervinodata API connection, check out the list of client API's at <a href='https://github.com/Cervinodata' target='_blank'>https://github.com/Cervinodata</a>.
</p>
</div>


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.cervinodata</groupId>
  <artifactId>cervinodata-java-client</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.cervinodata:cervinodata-java-client:0.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/cervinodata-java-client-0.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://app.cervinodata.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvertisingDataApi* | [**getAdAccountReportPerOrganisationPerDay**](docs/AdvertisingDataApi.md#getAdAccountReportPerOrganisationPerDay) | **GET** /data/ad-account-report-per-organisation-per-day/{organisationUuids} | Return ad account report per organisation per day
*AdvertisingDataApi* | [**getAdAccounts**](docs/AdvertisingDataApi.md#getAdAccounts) | **GET** /data/ad-accounts/{organisationUuid} | Return ad accounts by organisation
*AdvertisingDataApi* | [**getAdCampaignReportPerDay**](docs/AdvertisingDataApi.md#getAdCampaignReportPerDay) | **GET** /data/ad-campaign-report-per-day/{organisationUuid} | Return ad campaign report per day by organisation
*AdvertisingDataApi* | [**getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](docs/AdvertisingDataApi.md#getAdCampaignReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/ad-campaign-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return ad campaign report per organisation per account per campaign per device per day
*AdvertisingDataApi* | [**getAdCampaignReportPerOrganisationPerAccountPerDay**](docs/AdvertisingDataApi.md#getAdCampaignReportPerOrganisationPerAccountPerDay) | **GET** /data/ad-campaign-report-per-organisation-per-account-per-day/{organisationUuids} | Return ad campaign report per organisation per account per day
*AdvertisingDataApi* | [**getAdCampaigns**](docs/AdvertisingDataApi.md#getAdCampaigns) | **GET** /data/ad-campaigns/{organisationUuid} | Return ad campaigns by organisation
*AdvertisingDataApi* | [**getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/AdvertisingDataApi.md#getBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/bing-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return bing ads extended report per organisation per account per campaign per day
*AdvertisingDataApi* | [**getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay**](docs/AdvertisingDataApi.md#getFacebookAdCustomConversionReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/facebook-ad-custom-conversion-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return facebook ad custom conversion report per organisation per account per campaign per day
*AdvertisingDataApi* | [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per day
*AdvertisingDataApi* | [**getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](docs/AdvertisingDataApi.md#getFacebookAdExtendedReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/facebook-ad-extended-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return facebook ad extended report per organisation per account per campaign per device per day
*AdvertisingDataApi* | [**getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay**](docs/AdvertisingDataApi.md#getGoogleAdsReportPerOrganisationPerAccountPerCampaignPerDevicePerDay) | **GET** /data/google-ads-report-per-organisation-per-account-per-campaign-per-device-per-day/{organisationUuids} | Return google ads report per organisation per account per campaign per device per day
*AdvertisingDataApi* | [**getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/AdvertisingDataApi.md#getLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/linkedin-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return linkedin ads extended report per organisation per account per campaign per day
*AdvertisingDataApi* | [**getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/AdvertisingDataApi.md#getSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/snapchat-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return snapchat ads extended report per organisation per account per campaign per day
*AdvertisingDataApi* | [**getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/AdvertisingDataApi.md#getTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/twitter-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return twitter ads extended report per organisation per account per campaign per day
*AnalyticsDataApi* | [**getViews**](docs/AnalyticsDataApi.md#getViews) | **GET** /data/views/{organisationUuid} | Return views by organisation
*AnalyticsDataDefaultMetricsApi* | [**getAnalyticsReportPerCampaignPerDay**](docs/AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerCampaignPerDay) | **GET** /data/analytics-report-per-campaign-per-day/{organisationUuid} | Return analytics report per campaign per day by organisation
*AnalyticsDataDefaultMetricsApi* | [**getAnalyticsReportPerChannelGroupPerDay**](docs/AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerChannelGroupPerDay) | **GET** /data/analytics-report-per-channel-group-per-day/{organisationUuid} | Return analytics report per channel group per day by organisation
*AnalyticsDataDefaultMetricsApi* | [**getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay**](docs/AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerDevicePerChannelGroupPerOrganisationPerViewPerDay) | **GET** /data/analytics-report-per-device-per-channel-group-per-organisation-per-view-per-day/{organisationUuids} | Return analytics report per device per channel group per organisation per view per day
*AnalyticsDataDefaultMetricsApi* | [**getAnalyticsReportPerDevicePerDay**](docs/AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerDevicePerDay) | **GET** /data/analytics-report-per-device-per-day/{organisationUuid} | Return analytics report per device per day by organisation
*AnalyticsDataDefaultMetricsApi* | [**getAnalyticsReportPerSourceMediumPerDay**](docs/AnalyticsDataDefaultMetricsApi.md#getAnalyticsReportPerSourceMediumPerDay) | **GET** /data/analytics-report-per-source-medium-per-day/{organisationUuid} | Return analytics report per source medium per day by organisation
*AnalyticsDataGoalsApi* | [**getAnalyticsGoalReportPerCampaignPerDay**](docs/AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerCampaignPerDay) | **GET** /data/analytics-goal-report-per-campaign-per-day/{organisationUuid} | Return analytics goal report per campaign per day by organisation
*AnalyticsDataGoalsApi* | [**getAnalyticsGoalReportPerChannelGroupPerDay**](docs/AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerChannelGroupPerDay) | **GET** /data/analytics-goal-report-per-channel-group-per-day/{organisationUuid} | Return analytics goal report per channel group per day by organisation
*AnalyticsDataGoalsApi* | [**getAnalyticsGoalReportPerDevicePerDay**](docs/AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerDevicePerDay) | **GET** /data/analytics-goal-report-per-device-per-day/{organisationUuid} | Return analytics goal report per device per day by organisation
*AnalyticsDataGoalsApi* | [**getAnalyticsGoalReportPerSourceMediumPerDay**](docs/AnalyticsDataGoalsApi.md#getAnalyticsGoalReportPerSourceMediumPerDay) | **GET** /data/analytics-goal-report-per-source-medium-per-day/{organisationUuid} | Return analytics goal report per source medium per day by organisation
*CampaignGroupApi* | [**getCampaignGroupAdReportPerOrganisationPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupAdReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-ad-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group ad report per organisation per campaign per day
*CampaignGroupApi* | [**getCampaignGroupAdReportPerOrganisationPerCampaignPerWeek**](docs/CampaignGroupApi.md#getCampaignGroupAdReportPerOrganisationPerCampaignPerWeek) | **GET** /data/campaign-group-ad-report-per-organisation-per-campaign-per-week/{organisationUuids} | Return campaign group ad report per organisation per campaign per week
*CampaignGroupApi* | [**getCampaignGroupAdReportPerOrganisationPerDay**](docs/CampaignGroupApi.md#getCampaignGroupAdReportPerOrganisationPerDay) | **GET** /data/campaign-group-ad-report-per-organisation-per-day/{organisationUuids} | Return campaign group ad report per organisation per day
*CampaignGroupApi* | [**getCampaignGroupAnalyticsReportPerOrganisationPerDay**](docs/CampaignGroupApi.md#getCampaignGroupAnalyticsReportPerOrganisationPerDay) | **GET** /data/campaign-group-analytics-report-per-organisation-per-day/{organisationUuids} | Return campaign group analytics report per organisation per day
*CampaignGroupApi* | [**getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupBingAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-bing-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group bing ads extended report per organisation per account per campaign per day
*CampaignGroupApi* | [**getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupDoubleClickBidManagerReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-doubleclick-bid-manager-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group doubleclick bid manager report per organisation per account per campaign per day
*CampaignGroupApi* | [**getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupDoubleClickCampaignManagerReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-doubleclick-campaign-manager-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group doubleclick campaign manager report per organisation per account per campaign per day
*CampaignGroupApi* | [**getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupFacebookAdExtendedReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-facebook-ad-extended-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group facebook ad extended report per organisation per campaign per day
*CampaignGroupApi* | [**getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupFacebookAdReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-facebook-ad-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group facebook ad report per organisation per campaign per day
*CampaignGroupApi* | [**getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupGoogleAdsReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-google-ads-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group google ads report per organisation per campaign per day
*CampaignGroupApi* | [**getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupLinkedInAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-linkedin-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group linkedin ads extended report per organisation per account per campaign per day
*CampaignGroupApi* | [**getCampaignGroupReportPerOrganisationPerDay**](docs/CampaignGroupApi.md#getCampaignGroupReportPerOrganisationPerDay) | **GET** /data/campaign-group-report-per-organisation-per-day/{organisationUuids} | Return campaign group report per organisation per day
*CampaignGroupApi* | [**getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupSnapchatAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-snapchat-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group snapchat ads extended report per organisation per account per campaign per day
*CampaignGroupApi* | [**getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupTwitterAdsExtendedReportPerOrganisationPerAccountPerCampaignPerDay) | **GET** /data/campaign-group-twitter-ads-extended-report-per-organisation-per-account-per-campaign-per-day/{organisationUuids} | Return campaign group twitter ads extended report per organisation per account per campaign per day
*CampaignGroupApi* | [**getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay**](docs/CampaignGroupApi.md#getCampaignGroupVideoReportPerOrganisationPerCampaignPerDay) | **GET** /data/campaign-group-video-report-per-organisation-per-campaign-per-day/{organisationUuids} | Return campaign group video report per organisation per campaign per day
*CampaignGroupApi* | [**getCampaignGroupVideoReportPerOrganisationPerDay**](docs/CampaignGroupApi.md#getCampaignGroupVideoReportPerOrganisationPerDay) | **GET** /data/campaign-group-video-report-per-organisation-per-day/{organisationUuids} | Return campaign group video report per organisation per day
*GenericDataApi* | [**getCampaignGroups**](docs/GenericDataApi.md#getCampaignGroups) | **GET** /data/campaign-groups | Return campaign groups
*GenericDataApi* | [**getOrganisations**](docs/GenericDataApi.md#getOrganisations) | **GET** /data/organisations | Return organisations


## Documentation for Models



## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@cervinodata.com

