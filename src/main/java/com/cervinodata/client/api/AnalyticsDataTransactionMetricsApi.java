/*
 * Cervinodata API documentation
 * <div style='margin: 2em 0;'> <p> Before you get going with the Cervinodata API, set up Cervinodata (read the support page here: <a href='https://support.cervinodata.com/hc/en-nl/articles/360004363237' target='_blank'>How to set up the Cervinodata API</a>). </p> <h3>To use the Cervinodata API, you need all of the following:</h3> <p> <ol> <li>An active Cervinodata account, you can start a free trial <a href='https://app.cervinodata.com/register' target='_blank'>here</a></li> <li>At least one connection to a platform (check <a href='https://app.cervinodata.com/data-sources-connections' target='_blank'>here</a>)</li> <li>At least one account switched ON (check <a href='https://app.cervinodata.com/accounts' target='_blank'>here</a>)</li> <li>At least one data refresh executed (check <a href='https://app.cervinodata.com/manual-data-refresh' target='_blank'>here</a>)</li> <li>An active API token (check <a href='https://app.cervinodata.com/settings#/api' target='_blank'>here</a>)</li> </ol> </p> <p> Note that limits apply for <a href='https://support.cervinodata.com/hc/articles/360014265139' target='_blank'>Free plan users</a>. </p> <p> If you wish to automate your Cervinodata API connection, check out the list of client API's at <a href='https://github.com/Cervinodata' target='_blank'>https://github.com/Cervinodata</a>. </p> </div>
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@cervinodata.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cervinodata.client.api;

import com.cervinodata.client.ApiCallback;
import com.cervinodata.client.ApiClient;
import com.cervinodata.client.ApiException;
import com.cervinodata.client.ApiResponse;
import com.cervinodata.client.Configuration;
import com.cervinodata.client.Pair;
import com.cervinodata.client.ProgressRequestBody;
import com.cervinodata.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsDataTransactionMetricsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AnalyticsDataTransactionMetricsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnalyticsDataTransactionMetricsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getGA4ReportPerCampaignPerOrganisationPerProperty
     * @param organisationUuids Organisation uuids (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGA4ReportPerCampaignPerOrganisationPerPropertyCall(List<String> organisationUuids, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/ga4-report-per-campaign-per-organisation-per-property/{organisationUuids}"
            .replace("{" + "organisationUuids" + "}", localVarApiClient.escapeString(localVarApiClient.collectionPathParameterToString("csv", organisationUuids)));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/csv"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGA4ReportPerCampaignPerOrganisationPerPropertyValidateBeforeCall(List<String> organisationUuids, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'organisationUuids' is set
        if (organisationUuids == null) {
            throw new ApiException("Missing the required parameter 'organisationUuids' when calling getGA4ReportPerCampaignPerOrganisationPerProperty(Async)");
        }

        return getGA4ReportPerCampaignPerOrganisationPerPropertyCall(organisationUuids, _callback);

    }

    /**
     * Return GA4 report per campaign per organisation per property
     * GA4 report per campaign per organisation per property
     * @param organisationUuids Organisation uuids (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public String getGA4ReportPerCampaignPerOrganisationPerProperty(List<String> organisationUuids) throws ApiException {
        ApiResponse<String> localVarResp = getGA4ReportPerCampaignPerOrganisationPerPropertyWithHttpInfo(organisationUuids);
        return localVarResp.getData();
    }

    /**
     * Return GA4 report per campaign per organisation per property
     * GA4 report per campaign per organisation per property
     * @param organisationUuids Organisation uuids (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getGA4ReportPerCampaignPerOrganisationPerPropertyWithHttpInfo(List<String> organisationUuids) throws ApiException {
        okhttp3.Call localVarCall = getGA4ReportPerCampaignPerOrganisationPerPropertyValidateBeforeCall(organisationUuids, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Return GA4 report per campaign per organisation per property (asynchronously)
     * GA4 report per campaign per organisation per property
     * @param organisationUuids Organisation uuids (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGA4ReportPerCampaignPerOrganisationPerPropertyAsync(List<String> organisationUuids, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGA4ReportPerCampaignPerOrganisationPerPropertyValidateBeforeCall(organisationUuids, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth
     * @param organisationUuids Organisation uuids (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthCall(List<String> organisationUuids, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/ga4-report-per-campaign-per-organisation-per-property-per-month/{organisationUuids}"
            .replace("{" + "organisationUuids" + "}", localVarApiClient.escapeString(localVarApiClient.collectionPathParameterToString("csv", organisationUuids)));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/csv"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthValidateBeforeCall(List<String> organisationUuids, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'organisationUuids' is set
        if (organisationUuids == null) {
            throw new ApiException("Missing the required parameter 'organisationUuids' when calling getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth(Async)");
        }

        return getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthCall(organisationUuids, _callback);

    }

    /**
     * Return GA4 report per campaign per organisation per property per month
     * GA4 report per campaign per organisation per property per month
     * @param organisationUuids Organisation uuids (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public String getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonth(List<String> organisationUuids) throws ApiException {
        ApiResponse<String> localVarResp = getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthWithHttpInfo(organisationUuids);
        return localVarResp.getData();
    }

    /**
     * Return GA4 report per campaign per organisation per property per month
     * GA4 report per campaign per organisation per property per month
     * @param organisationUuids Organisation uuids (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthWithHttpInfo(List<String> organisationUuids) throws ApiException {
        okhttp3.Call localVarCall = getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthValidateBeforeCall(organisationUuids, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Return GA4 report per campaign per organisation per property per month (asynchronously)
     * GA4 report per campaign per organisation per property per month
     * @param organisationUuids Organisation uuids (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Organisation uuids supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Organisation uuids not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthAsync(List<String> organisationUuids, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGA4ReportPerCampaignPerOrganisationPerPropertyPerMonthValidateBeforeCall(organisationUuids, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
