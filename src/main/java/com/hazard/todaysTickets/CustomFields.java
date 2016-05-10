
package com.hazard.todaysTickets;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
    "functional_area",
    "jj_country",
    "jj_category",
    "jj_severity",
    "jj_issuetype",
    "jj_subcategory"
})
public class CustomFields {

    @JsonProperty("priority")
    private Object priority;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("product")
    private Object product;
    @JsonProperty("case_type")
    private Object caseType;
    @JsonProperty("customer_has_last_reply")
    private Boolean customerHasLastReply;
    @JsonProperty("has_sent_pending_notification")
    private Boolean hasSentPendingNotification;
    @JsonProperty("jira_id")
    private Object jiraId;
    @JsonProperty("jira_url")
    private Object jiraUrl;
    @JsonProperty("support_center")
    private String supportCenter;
    @JsonProperty("enterprise_customer")
    private Object enterpriseCustomer;
    @JsonProperty("lob")
    private Object lob;
    @JsonProperty("desk_case_number")
    private String deskCaseNumber;
    @JsonProperty("functional_area")
    private Object functionalArea;
    @JsonProperty("jj_country")
    private Object jjCountry;
    @JsonProperty("jj_category")
    private Object jjCategory;
    @JsonProperty("jj_severity")
    private Object jjSeverity;
    @JsonProperty("jj_issuetype")
    private Object jjIssuetype;
    @JsonProperty("jj_subcategory")
    private Object jjSubcategory;
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
    public Object getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
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
    public Object getJiraId() {
        return jiraId;
    }

    /**
     * 
     * @param jiraId
     *     The jira_id
     */
    @JsonProperty("jira_id")
    public void setJiraId(Object jiraId) {
        this.jiraId = jiraId;
    }

    /**
     * 
     * @return
     *     The jiraUrl
     */
    @JsonProperty("jira_url")
    public Object getJiraUrl() {
        return jiraUrl;
    }

    /**
     * 
     * @param jiraUrl
     *     The jira_url
     */
    @JsonProperty("jira_url")
    public void setJiraUrl(Object jiraUrl) {
        this.jiraUrl = jiraUrl;
    }

    /**
     * 
     * @return
     *     The supportCenter
     */
    @JsonProperty("support_center")
    public String getSupportCenter() {
        return supportCenter;
    }

    /**
     * 
     * @param supportCenter
     *     The support_center
     */
    @JsonProperty("support_center")
    public void setSupportCenter(String supportCenter) {
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

    /**
     * 
     * @return
     *     The jjCountry
     */
    @JsonProperty("jj_country")
    public Object getJjCountry() {
        return jjCountry;
    }

    /**
     * 
     * @param jjCountry
     *     The jj_country
     */
    @JsonProperty("jj_country")
    public void setJjCountry(Object jjCountry) {
        this.jjCountry = jjCountry;
    }

    /**
     * 
     * @return
     *     The jjCategory
     */
    @JsonProperty("jj_category")
    public Object getJjCategory() {
        return jjCategory;
    }

    /**
     * 
     * @param jjCategory
     *     The jj_category
     */
    @JsonProperty("jj_category")
    public void setJjCategory(Object jjCategory) {
        this.jjCategory = jjCategory;
    }

    /**
     * 
     * @return
     *     The jjSeverity
     */
    @JsonProperty("jj_severity")
    public Object getJjSeverity() {
        return jjSeverity;
    }

    /**
     * 
     * @param jjSeverity
     *     The jj_severity
     */
    @JsonProperty("jj_severity")
    public void setJjSeverity(Object jjSeverity) {
        this.jjSeverity = jjSeverity;
    }

    /**
     * 
     * @return
     *     The jjIssuetype
     */
    @JsonProperty("jj_issuetype")
    public Object getJjIssuetype() {
        return jjIssuetype;
    }

    /**
     * 
     * @param jjIssuetype
     *     The jj_issuetype
     */
    @JsonProperty("jj_issuetype")
    public void setJjIssuetype(Object jjIssuetype) {
        this.jjIssuetype = jjIssuetype;
    }

    /**
     * 
     * @return
     *     The jjSubcategory
     */
    @JsonProperty("jj_subcategory")
    public Object getJjSubcategory() {
        return jjSubcategory;
    }

    /**
     * 
     * @param jjSubcategory
     *     The jj_subcategory
     */
    @JsonProperty("jj_subcategory")
    public void setJjSubcategory(Object jjSubcategory) {
        this.jjSubcategory = jjSubcategory;
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
