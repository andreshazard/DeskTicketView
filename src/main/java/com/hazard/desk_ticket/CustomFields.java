
package com.hazard.desk_ticket;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "priority",
    "status",
    "product",
    "case_type",
    "customer_has_last_reply",
    "has_sent_pending_notification",
    "jira_id",
    "jira_url",
    "support_center",
    "enterprise_customer",
    "lob",
    "desk_case_number",
    "functional_area"
})
public class CustomFields {

    @JsonProperty("priority")
    private Object priority;
    @JsonProperty("status")
    private String status;
    @JsonProperty("product")
    private Object product;
    @JsonProperty("case_type")
    private Object caseType;
    @JsonProperty("customer_has_last_reply")
    private Boolean customerHasLastReply;
    @JsonProperty("has_sent_pending_notification")
    private Boolean hasSentPendingNotification;
    @JsonProperty("jira_id")
    private String jiraId;
    @JsonProperty("jira_url")
    private String jiraUrl;
    @JsonProperty("support_center")
    private Object supportCenter;
    @JsonProperty("enterprise_customer")
    private Object enterpriseCustomer;
    @JsonProperty("lob")
    private Object lob;
    @JsonProperty("desk_case_number")
    private String deskCaseNumber;
    @JsonProperty("functional_area")
    private Object functionalArea;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public Object getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(Object priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The product
     */
    @JsonProperty("product")
    public Object getProduct() {
        return product;
    }

    /**
     * 
     * @param product
     *     The product
     */
    @JsonProperty("product")
    public void setProduct(Object product) {
        this.product = product;
    }

    /**
     * 
     * @return
     *     The caseType
     */
    @JsonProperty("case_type")
    public Object getCaseType() {
        return caseType;
    }

    /**
     * 
     * @param caseType
     *     The case_type
     */
    @JsonProperty("case_type")
    public void setCaseType(Object caseType) {
        this.caseType = caseType;
    }

    /**
     * 
     * @return
     *     The customerHasLastReply
     */
    @JsonProperty("customer_has_last_reply")
    public Boolean getCustomerHasLastReply() {
        return customerHasLastReply;
    }

    /**
     * 
     * @param customerHasLastReply
     *     The customer_has_last_reply
     */
    @JsonProperty("customer_has_last_reply")
    public void setCustomerHasLastReply(Boolean customerHasLastReply) {
        this.customerHasLastReply = customerHasLastReply;
    }

    /**
     * 
     * @return
     *     The hasSentPendingNotification
     */
    @JsonProperty("has_sent_pending_notification")
    public Boolean getHasSentPendingNotification() {
        return hasSentPendingNotification;
    }

    /**
     * 
     * @param hasSentPendingNotification
     *     The has_sent_pending_notification
     */
    @JsonProperty("has_sent_pending_notification")
    public void setHasSentPendingNotification(Boolean hasSentPendingNotification) {
        this.hasSentPendingNotification = hasSentPendingNotification;
    }

    /**
     * 
     * @return
     *     The jiraId
     */
    @JsonProperty("jira_id")
    public String getJiraId() {
        return jiraId;
    }

    /**
     * 
     * @param jiraId
     *     The jira_id
     */
    @JsonProperty("jira_id")
    public void setJiraId(String jiraId) {
        this.jiraId = jiraId;
    }

    /**
     * 
     * @return
     *     The jiraUrl
     */
    @JsonProperty("jira_url")
    public String getJiraUrl() {
        return jiraUrl;
    }

    /**
     * 
     * @param jiraUrl
     *     The jira_url
     */
    @JsonProperty("jira_url")
    public void setJiraUrl(String jiraUrl) {
        this.jiraUrl = jiraUrl;
    }

    /**
     * 
     * @return
     *     The supportCenter
     */
    @JsonProperty("support_center")
    public Object getSupportCenter() {
        return supportCenter;
    }

    /**
     * 
     * @param supportCenter
     *     The support_center
     */
    @JsonProperty("support_center")
    public void setSupportCenter(Object supportCenter) {
        this.supportCenter = supportCenter;
    }

    /**
     * 
     * @return
     *     The enterpriseCustomer
     */
    @JsonProperty("enterprise_customer")
    public Object getEnterpriseCustomer() {
        return enterpriseCustomer;
    }

    /**
     * 
     * @param enterpriseCustomer
     *     The enterprise_customer
     */
    @JsonProperty("enterprise_customer")
    public void setEnterpriseCustomer(Object enterpriseCustomer) {
        this.enterpriseCustomer = enterpriseCustomer;
    }

    /**
     * 
     * @return
     *     The lob
     */
    @JsonProperty("lob")
    public Object getLob() {
        return lob;
    }

    /**
     * 
     * @param lob
     *     The lob
     */
    @JsonProperty("lob")
    public void setLob(Object lob) {
        this.lob = lob;
    }

    /**
     * 
     * @return
     *     The deskCaseNumber
     */
    @JsonProperty("desk_case_number")
    public String getDeskCaseNumber() {
        return deskCaseNumber;
    }

    /**
     * 
     * @param deskCaseNumber
     *     The desk_case_number
     */
    @JsonProperty("desk_case_number")
    public void setDeskCaseNumber(String deskCaseNumber) {
        this.deskCaseNumber = deskCaseNumber;
    }

    /**
     * 
     * @return
     *     The functionalArea
     */
    @JsonProperty("functional_area")
    public Object getFunctionalArea() {
        return functionalArea;
    }

    /**
     * 
     * @param functionalArea
     *     The functional_area
     */
    @JsonProperty("functional_area")
    public void setFunctionalArea(Object functionalArea) {
        this.functionalArea = functionalArea;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
