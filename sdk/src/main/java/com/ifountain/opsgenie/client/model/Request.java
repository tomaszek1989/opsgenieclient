package com.ifountain.opsgenie.client.model;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Interface for OpsGenie service api requests.
 *
 * @author Sezgin Kucukkaraaslan
 * @version 5/30/12 9:40 AM
 * @see com.ifountain.opsgenie.client.IOpsGenieClient
 * @see com.ifountain.opsgenie.client.OpsGenieClient
 */
public interface Request {
    /**
     * Returns the request's rest api uri.
     */
	@JsonIgnore
    public String getEndPoint();
}
