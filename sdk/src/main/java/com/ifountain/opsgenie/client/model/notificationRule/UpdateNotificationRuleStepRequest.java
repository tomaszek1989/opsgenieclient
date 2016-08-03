package com.ifountain.opsgenie.client.model.notificationRule;

import java.util.HashMap;
import java.util.Map;

import com.ifountain.opsgenie.client.OpsGenieClientConstants;
import com.ifountain.opsgenie.client.OpsGenieClientValidationException;
import com.ifountain.opsgenie.client.model.BaseRequest;
import com.ifountain.opsgenie.client.model.beans.Contact.Method;
import com.ifountain.opsgenie.client.model.beans.NotificationRuleStep;
/**
 * Container for the parameters to make an update notificationRuleStep api call.
 *
 * @see com.ifountain.opsgenie.client.INotificationRuleStepOpsGenieClient#updateNotificationRuleStep(UpdateNotificationRuleStepRequest)
 */
public class UpdateNotificationRuleStepRequest extends BaseRequest<UpdateNotificationRuleStepResponse> {
	private String username;
	private String userId;
	private String ruleId;
	private String id;

	private Method method;
	private String to;
	private Integer sendAfter;
	public static UpdateNotificationRuleStepRequest fromUpdateNotificationRuleStep(NotificationRuleStep step,String ruleId){
		if(step == null)
			return null;
		UpdateNotificationRuleStepRequest request = new UpdateNotificationRuleStepRequest();
		request.setId(step.getId());
		request.setMethod(step.getMethod());
		request.setSendAfter(step.getSendAfter());
		request.setTo(step.getTo());
		request.setRuleId(ruleId);
		return request;
	}
	
	/**
	 * Rest api uri of updating notificationRuleStep operation.
	 */
	@Override
	public String getEndPoint() {
		return "/v1/json/user/notificationRule/step";
	}
	@Override
	/**
	 * @see com.ifountain.opsgenie.client.model.BaseRequest#serialize()
	 */
	public Map serialize() throws OpsGenieClientValidationException {
		Map json = new HashMap();
		if (getApiKey() != null) 
			json.put(OpsGenieClientConstants.API.API_KEY, getApiKey());
		if (getUsername() != null) 
			json.put(OpsGenieClientConstants.API.USERNAME, getUsername());
		if (getUserId() != null) 
			json.put(OpsGenieClientConstants.API.USER_ID, getUserId());
		if (getRuleId() != null) 
			json.put(OpsGenieClientConstants.API.RULE_ID, getRuleId());
		if (getId() != null) 
			json.put(OpsGenieClientConstants.API.ID, getId());
		if (getMethod() != null) 
			json.put(OpsGenieClientConstants.API.METHOD, getMethod().value());
		if (getTo() != null) 
			json.put(OpsGenieClientConstants.API.TO, getTo());
		if(getSendAfter() != null)
			json.put(OpsGenieClientConstants.API.SEND_AFTER, getSendAfter());
		return json;
	}

	@Override
	/**
	 * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
	 */
	public UpdateNotificationRuleStepResponse createResponse() {
		return new UpdateNotificationRuleStepResponse();
	}
	/**
	 * Id of notificationRuleStep to be updated
	 */
	public String getId() {
		return id;
	}
	/**
	 * Sets Id of notificationRuleStep to be updated
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * UserName of notificationRuleStep to be updated
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Sets UserName of notificationRuleStep to be updated
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * userId of notificationRuleStep to be updated
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * Sets userId of notificationRuleStep to be updated
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * to of notificationRuleStep to be updated
	 */
	public String getTo() {
		return to;
	}
	/**
	 * Sets to of notificationRuleStep to be updated
	 */
	public void setTo(String to) {
		this.to = to;
	}
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public Method getMethod() {
		return method;
	}
	public void setMethod(Method method) {
		this.method = method;
	}
	public Integer getSendAfter() {
		return sendAfter;
	}
	public void setSendAfter(Integer sendAfter) {
		this.sendAfter = sendAfter;
	}
	

}
