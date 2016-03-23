
package com.hazard.desk_ticket;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "self",
    "message",
    "customer",
    "labels",
    "assigned_user",
    "assigned_group",
    "locked_by",
    "history",
    "case_links",
    "macro_preview",
    "replies",
    "feedbacks",
    "draft",
    "notes",
    "attachments"
})
public class Links_ {

    @JsonProperty("self")
    private Self_ self;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("labels")
    private Labels labels;
    @JsonProperty("assigned_user")
    private AssignedUser assignedUser;
    @JsonProperty("assigned_group")
    private AssignedGroup assignedGroup;
    @JsonProperty("locked_by")
    private Object lockedBy;
    @JsonProperty("history")
    private History history;
    @JsonProperty("case_links")
    private CaseLinks caseLinks;
    @JsonProperty("macro_preview")
    private MacroPreview macroPreview;
    @JsonProperty("replies")
    private Replies replies;
    @JsonProperty("feedbacks")
    private Object feedbacks;
    @JsonProperty("draft")
    private Draft draft;
    @JsonProperty("notes")
    private Notes notes;
    @JsonProperty("attachments")
    private Attachments attachments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The self
     */
    @JsonProperty("self")
    public Self_ getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    @JsonProperty("self")
    public void setSelf(Self_ self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The customer
     */
    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer
     *     The customer
     */
    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public Labels getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The assignedUser
     */
    @JsonProperty("assigned_user")
    public AssignedUser getAssignedUser() {
        return assignedUser;
    }

    /**
     * 
     * @param assignedUser
     *     The assigned_user
     */
    @JsonProperty("assigned_user")
    public void setAssignedUser(AssignedUser assignedUser) {
        this.assignedUser = assignedUser;
    }

    /**
     * 
     * @return
     *     The assignedGroup
     */
    @JsonProperty("assigned_group")
    public AssignedGroup getAssignedGroup() {
        return assignedGroup;
    }

    /**
     * 
     * @param assignedGroup
     *     The assigned_group
     */
    @JsonProperty("assigned_group")
    public void setAssignedGroup(AssignedGroup assignedGroup) {
        this.assignedGroup = assignedGroup;
    }

    /**
     * 
     * @return
     *     The lockedBy
     */
    @JsonProperty("locked_by")
    public Object getLockedBy() {
        return lockedBy;
    }

    /**
     * 
     * @param lockedBy
     *     The locked_by
     */
    @JsonProperty("locked_by")
    public void setLockedBy(Object lockedBy) {
        this.lockedBy = lockedBy;
    }

    /**
     * 
     * @return
     *     The history
     */
    @JsonProperty("history")
    public History getHistory() {
        return history;
    }

    /**
     * 
     * @param history
     *     The history
     */
    @JsonProperty("history")
    public void setHistory(History history) {
        this.history = history;
    }

    /**
     * 
     * @return
     *     The caseLinks
     */
    @JsonProperty("case_links")
    public CaseLinks getCaseLinks() {
        return caseLinks;
    }

    /**
     * 
     * @param caseLinks
     *     The case_links
     */
    @JsonProperty("case_links")
    public void setCaseLinks(CaseLinks caseLinks) {
        this.caseLinks = caseLinks;
    }

    /**
     * 
     * @return
     *     The macroPreview
     */
    @JsonProperty("macro_preview")
    public MacroPreview getMacroPreview() {
        return macroPreview;
    }

    /**
     * 
     * @param macroPreview
     *     The macro_preview
     */
    @JsonProperty("macro_preview")
    public void setMacroPreview(MacroPreview macroPreview) {
        this.macroPreview = macroPreview;
    }

    /**
     * 
     * @return
     *     The replies
     */
    @JsonProperty("replies")
    public Replies getReplies() {
        return replies;
    }

    /**
     * 
     * @param replies
     *     The replies
     */
    @JsonProperty("replies")
    public void setReplies(Replies replies) {
        this.replies = replies;
    }

    /**
     * 
     * @return
     *     The feedbacks
     */
    @JsonProperty("feedbacks")
    public Object getFeedbacks() {
        return feedbacks;
    }

    /**
     * 
     * @param feedbacks
     *     The feedbacks
     */
    @JsonProperty("feedbacks")
    public void setFeedbacks(Object feedbacks) {
        this.feedbacks = feedbacks;
    }

    /**
     * 
     * @return
     *     The draft
     */
    @JsonProperty("draft")
    public Draft getDraft() {
        return draft;
    }

    /**
     * 
     * @param draft
     *     The draft
     */
    @JsonProperty("draft")
    public void setDraft(Draft draft) {
        this.draft = draft;
    }

    /**
     * 
     * @return
     *     The notes
     */
    @JsonProperty("notes")
    public Notes getNotes() {
        return notes;
    }

    /**
     * 
     * @param notes
     *     The notes
     */
    @JsonProperty("notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    /**
     * 
     * @return
     *     The attachments
     */
    @JsonProperty("attachments")
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * 
     * @param attachments
     *     The attachments
     */
    @JsonProperty("attachments")
    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
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
