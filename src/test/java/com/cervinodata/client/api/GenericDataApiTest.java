/*
 * Cervinodata API documentation
 * <div style='margin: 2em 0;'><p>Before you get going with the Cervinodata API, set up Cervinodata (read the support page here: <a href='https://support.cervinodata.com/hc/en-nl/articles/360004363237' target='_blank'>How to set up the Cervinodata API</a>).</p> <h3>To use the Cervinodata API, you need all of the following:</h3> <p> <ol> <li>An active Cervinodata account, you can start a free trial <a href='https://app.cervinodata.com/register' target='_blank'>here</a></li> <li>At least one connection to a platform (check <a href='https://app.cervinodata.com/pages/data-sources/connections' target='_blank'>here</a>)</li> <li>At least one account switched ON (check <a href='https://app.cervinodata.com/pages/data-sources/accounts' target='_blank'>here</a>)</li> <li>At least one data refresh executed (check <a href='https://app.cervinodata.com/pages/data-destinations-api/data-collection' target='_blank'>here</a>)</li> <li>An active API token (check <a href='https://app.cervinodata.com/settings#/api' target='_blank'>here</a>)</li> </ol> </p> <p> If you wish to automate your Cervinodata API connection, check out the list of client API's at <a href='https://github.com/Cervinodata' target='_blank'>https://github.com/Cervinodata</a>. </p> </div>
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GenericDataApi
 */
@Ignore
public class GenericDataApiTest {

    private final GenericDataApi api = new GenericDataApi();

    
    /**
     * Return campaign groups
     *
     * campaign groups
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignGroupsTest() throws ApiException {
        List<Object> response = api.getCampaignGroups();

        // TODO: test validations
    }
    
    /**
     * Return organisations
     *
     * organisations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationsTest() throws ApiException {
        String format = null;
        String response = api.getOrganisations(format);

        // TODO: test validations
    }
    
}
