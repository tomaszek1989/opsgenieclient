package com.ifountain.opsgenie.client.model.alert;

import com.ifountain.opsgenie.client.OpsGenieClientConstants;
import com.ifountain.opsgenie.client.OpsGenieClientValidationException;

/**
 * Container for the parameters to make a list alert recipient api call.
 *
 * @author Sezgin Kucukkaraaslan
 * @see com.ifountain.opsgenie.client.IAlertOpsGenieClient#listAlertRecipients(ListAlertRecipientsRequest)
 * @deprecated As of release 2.8.0, will not be supported
 */
@Deprecated
public class ListAlertRecipientsRequest extends BaseAlertRequestWithId<ListAlertRecipientsResponse, ListAlertRecipientsRequest> {
    /**
     * Rest api uri of get alert operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/alert/recipient";
    }

    @Override
    public void validate() throws OpsGenieClientValidationException {
        if (!(this.getId() != null || this.getAlias() != null || this.getTinyId() != null))
            throw OpsGenieClientValidationException.missingMultipleMandatoryProperty(OpsGenieClientConstants.API.ID,
                    OpsGenieClientConstants.API.ALIAS, OpsGenieClientConstants.API.TINY_ID);
        super.validate();
    }

    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    @Override
    public ListAlertRecipientsResponse createResponse() {
        return new ListAlertRecipientsResponse();
    }
}
