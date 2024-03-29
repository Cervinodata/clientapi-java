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

import com.cervinodata.client.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsDataApi
 */
@Disabled
public class AnalyticsDataApiTest {

    private final AnalyticsDataApi api = new AnalyticsDataApi();

    /**
     * Return GA4 report per channel group per organisation per property
     *
     * GA4 report per channel group per organisation per property
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGA4ReportPerChannelGroupPerOrganisationPerPropertyTest() throws ApiException {
        List<String> organisationUuids = null;
        String response = api.getGA4ReportPerChannelGroupPerOrganisationPerProperty(organisationUuids);
        // TODO: test validations
    }

    /**
     * Return GA4 report per channel group per organisation per property per month
     *
     * GA4 report per channel group per organisation per property per month
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonthTest() throws ApiException {
        List<String> organisationUuids = null;
        String response = api.getGA4ReportPerChannelGroupPerOrganisationPerPropertyPerMonth(organisationUuids);
        // TODO: test validations
    }

    /**
     * Return GA4 report per channel group per product name per organisation per property per month
     *
     * GA4 report per channel group per product name per organisation per property per month
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonthTest() throws ApiException {
        List<String> organisationUuids = null;
        String response = api.getGA4ReportPerChannelGroupPerProductNamePerOrganisationPerPropertyPerMonth(organisationUuids);
        // TODO: test validations
    }

    /**
     * Return GA4 report per channel group per source medium per organisation per property per month
     *
     * GA4 report per channel group per source medium per organisation per property per month
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonthTest() throws ApiException {
        List<String> organisationUuids = null;
        String response = api.getGA4ReportPerChannelGroupPerSourceMediumPerOrganisationPerPropertyPerMonth(organisationUuids);
        // TODO: test validations
    }

    /**
     * Return views by organisation
     *
     * Views by organisation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getViewsTest() throws ApiException {
        String organisationUuid = null;
        String format = null;
        String response = api.getViews(organisationUuid, format);
        // TODO: test validations
    }

}
