package com.ifountain.client.opsgenie.model.alert;

import com.ifountain.client.ClientConstants;
import com.ifountain.client.ClientValidationException;
import com.ifountain.client.opsgenie.model.beans.RenotifyRecipient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Container for the parameters to make a renotify alert api call.
 *
 * @author Sezgin Kucukkaraaslan
 * @version 11/26/12 4:17 PM
 * @see com.ifountain.client.opsgenie.IAlertOpsGenieClient#renotify(com.ifountain.client.opsgenie.model.alert.RenotifyRequest)
 */
public class RenotifyRequest extends BaseAlertRequestWithSource<RenotifyResponse> {
    private String user;
    private String note;
    private List<RenotifyRecipient> recipients;

    /**
     * Rest api uri of renotify alert operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/alert/renotify";
    }

    /**
     * Returns recipients that will renotified
     * @see RenotifyRecipient
     */
    public List<RenotifyRecipient> getRecipients() {
        return recipients;
    }

    /**
     * Sets recipients that will renotified
     * @see RenotifyRecipient
     */
    public void setRecipients(List<RenotifyRecipient> recipients) {
        this.recipients = recipients;
    }

    /**
     * The user who is performing the renotify alert operation.
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user who is performing the renotify alert operation.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Additional alert note.
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets additional alert note.
     */
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    /**
     * @see com.ifountain.client.model.BaseRequest#serialize()
     */
    public Map<String,Object> serialize() throws ClientValidationException {
        Map<String,Object> json = super.serialize();
        if (getUser() != null)
            json.put(ClientConstants.API.USER, getUser());
        if (getNote() != null)
            json.put(ClientConstants.API.NOTE, getNote());
        if (getRecipients() != null){
            List<String> recipientNames = new ArrayList<String>();
            for(RenotifyRecipient recipient:recipients){
                recipientNames.add(recipient.getRecipient());
            }
            json.put(ClientConstants.API.RECIPIENTS, recipientNames);
        }
        return json;
    }

    @Override
    /**
     * @see com.ifountain.client.model.BaseRequest#createResponse()
     */
    public RenotifyResponse createResponse() {
        return new RenotifyResponse();
    }
}
