package com.ifountain.client.opsgenie.model.user;

import com.ifountain.client.model.BaseResponse;

import java.text.ParseException;
import java.util.Map;

/**
 * Represents OpsGenie service response for add user request.
 *
 * @author Mustafa Sener
 * @version 09.04.2013 17:03
 * @see com.ifountain.client.opsgenie.IUserOpsGenieClient#addUser(AddUserRequest)
 */
public class AddUserResponse extends BaseResponse{
    private String id;
    /**
     * Id of the added user
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the added user
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void deserialize(Map<String, Object> data) throws ParseException {
        super.deserialize(data);
        id = (String) data.get("id");
    }
}
