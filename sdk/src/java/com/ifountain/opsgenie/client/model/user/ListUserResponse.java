package com.ifountain.opsgenie.client.model.user;

import com.ifountain.opsgenie.client.model.beans.User;

import java.util.List;

/**
 * Represents OpsGenie service response for list user request.
 *
 * @see com.ifountain.opsgenie.client.IOpsGenieClient#listUsers(ListUserRequest)
 */
public class ListUserResponse {
    private List<User> users;

    /**
     * List of users
     * @see User
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Sets list of users
     * @see User
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
