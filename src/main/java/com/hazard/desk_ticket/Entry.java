
package com.hazard.desk_ticket;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "external_id",
    "blurb",
    "priority",
    "locked_until",
    "label_ids",
    "active_at",
    "changed_at",
    "created_at",
    "updated_at",
    "first_opened_at",
    "opened_at",
    "first_resolved_at",
    "resolved_at",
    "status",
    "active_notes_count",
    "active_attachments_count",
    "has_pending_interactions",
    "has_failed_interactions",
    "description",
    "language",
    "received_at",
    "type",
    "labels",
    "subject",
    "route_status",
    "custom_fields",
    "_links"
})
public class Entry implements Comparable {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonProperty("blurb")
    private String blurb;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("locked_until")
    private Object lockedUntil;
    @JsonProperty("label_ids")
    private List<Integer> labelIds = new ArrayList<Integer>();
    @JsonProperty("active_at")
    private String activeAt;
    @JsonProperty("changed_at")
    private String changedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("first_opened_at")
    private String firstOpenedAt;
    @JsonProperty("opened_at")
    private String openedAt;
    @JsonProperty("first_resolved_at")
    private Object firstResolvedAt;
    @JsonProperty("resolved_at")
    private Object resolvedAt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("active_notes_count")
    private Integer activeNotesCount;
    @JsonProperty("active_attachments_count")
    private Integer activeAttachmentsCount;
    @JsonProperty("has_pending_interactions")
    private Boolean hasPendingInteractions;
    @JsonProperty("has_failed_interactions")
    private Boolean hasFailedInteractions;
    @JsonProperty("description")
    private String description;
    @JsonProperty("language")
    private Object language;
    @JsonProperty("received_at")
    private String receivedAt;
    @JsonProperty("type")
    private String type;
    @JsonProperty("labels")
    private List<String> labels = new ArrayList<String>();
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("route_status")
    private String routeStatus;
    @JsonProperty("custom_fields")
    private CustomFields customFields;
    @JsonProperty("_links")
    private Links_ Links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The externalId
     */
    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    /**
     * 
     * @param externalId
     *     The external_id
     */
    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    /**
     * 
     * @return
     *     The blurb
     */
    @JsonProperty("blurb")
    public String getBlurb() {
        return blurb;
    }

    /**
     * 
     * @param blurb
     *     The blurb
     */
    @JsonProperty("blurb")
    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    /**
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The lockedUntil
     */
    @JsonProperty("locked_until")
    public Object getLockedUntil() {
        return lockedUntil;
    }

    /**
     * 
     * @param lockedUntil
     *     The locked_until
     */
    @JsonProperty("locked_until")
    public void setLockedUntil(Object lockedUntil) {
        this.lockedUntil = lockedUntil;
    }

    /**
     * 
     * @return
     *     The labelIds
     */
    @JsonProperty("label_ids")
    public List<Integer> getLabelIds() {
        return labelIds;
    }

    /**
     * 
     * @param labelIds
     *     The label_ids
     */
    @JsonProperty("label_ids")
    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    /**
     * 
     * @return
     *     The activeAt
     */
    @JsonProperty("active_at")
    public String getActiveAt() {
        return activeAt;
    }

    /**
     * 
     * @param activeAt
     *     The active_at
     */
    @JsonProperty("active_at")
    public void setActiveAt(String activeAt) {
        this.activeAt = activeAt;
    }

    /**
     * 
     * @return
     *     The changedAt
     */
    @JsonProperty("changed_at")
    public String getChangedAt() {
        return changedAt;
    }

    /**
     * 
     * @param changedAt
     *     The changed_at
     */
    @JsonProperty("changed_at")
    public void setChangedAt(String changedAt) {
        this.changedAt = changedAt;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The firstOpenedAt
     */
    @JsonProperty("first_opened_at")
    public String getFirstOpenedAt() {
        return firstOpenedAt;
    }

    /**
     * 
     * @param firstOpenedAt
     *     The first_opened_at
     */
    @JsonProperty("first_opened_at")
    public void setFirstOpenedAt(String firstOpenedAt) {
        this.firstOpenedAt = firstOpenedAt;
    }

    /**
     * 
     * @return
     *     The openedAt
     */
    @JsonProperty("opened_at")
    public String getOpenedAt() {
        return openedAt;
    }

    /**
     * 
     * @param openedAt
     *     The opened_at
     */
    @JsonProperty("opened_at")
    public void setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
    }

    /**
     * 
     * @return
     *     The firstResolvedAt
     */
    @JsonProperty("first_resolved_at")
    public Object getFirstResolvedAt() {
        return firstResolvedAt;
    }

    /**
     * 
     * @param firstResolvedAt
     *     The first_resolved_at
     */
    @JsonProperty("first_resolved_at")
    public void setFirstResolvedAt(Object firstResolvedAt) {
        this.firstResolvedAt = firstResolvedAt;
    }

    /**
     * 
     * @return
     *     The resolvedAt
     */
    @JsonProperty("resolved_at")
    public Object getResolvedAt() {
        return resolvedAt;
    }

    /**
     * 
     * @param resolvedAt
     *     The resolved_at
     */
    @JsonProperty("resolved_at")
    public void setResolvedAt(Object resolvedAt) {
        this.resolvedAt = resolvedAt;
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
     *     The activeNotesCount
     */
    @JsonProperty("active_notes_count")
    public Integer getActiveNotesCount() {
        return activeNotesCount;
    }

    /**
     * 
     * @param activeNotesCount
     *     The active_notes_count
     */
    @JsonProperty("active_notes_count")
    public void setActiveNotesCount(Integer activeNotesCount) {
        this.activeNotesCount = activeNotesCount;
    }

    /**
     * 
     * @return
     *     The activeAttachmentsCount
     */
    @JsonProperty("active_attachments_count")
    public Integer getActiveAttachmentsCount() {
        return activeAttachmentsCount;
    }

    /**
     * 
     * @param activeAttachmentsCount
     *     The active_attachments_count
     */
    @JsonProperty("active_attachments_count")
    public void setActiveAttachmentsCount(Integer activeAttachmentsCount) {
        this.activeAttachmentsCount = activeAttachmentsCount;
    }

    /**
     * 
     * @return
     *     The hasPendingInteractions
     */
    @JsonProperty("has_pending_interactions")
    public Boolean getHasPendingInteractions() {
        return hasPendingInteractions;
    }

    /**
     * 
     * @param hasPendingInteractions
     *     The has_pending_interactions
     */
    @JsonProperty("has_pending_interactions")
    public void setHasPendingInteractions(Boolean hasPendingInteractions) {
        this.hasPendingInteractions = hasPendingInteractions;
    }

    /**
     * 
     * @return
     *     The hasFailedInteractions
     */
    @JsonProperty("has_failed_interactions")
    public Boolean getHasFailedInteractions() {
        return hasFailedInteractions;
    }

    /**
     * 
     * @param hasFailedInteractions
     *     The has_failed_interactions
     */
    @JsonProperty("has_failed_interactions")
    public void setHasFailedInteractions(Boolean hasFailedInteractions) {
        this.hasFailedInteractions = hasFailedInteractions;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public Object getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(Object language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The receivedAt
     */
    @JsonProperty("received_at")
    public String getReceivedAt() {
        return receivedAt;
    }

    /**
     * 
     * @param receivedAt
     *     The received_at
     */
    @JsonProperty("received_at")
    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The subject
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The routeStatus
     */
    @JsonProperty("route_status")
    public String getRouteStatus() {
        return routeStatus;
    }

    /**
     * 
     * @param routeStatus
     *     The route_status
     */
    @JsonProperty("route_status")
    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
    }

    /**
     * 
     * @return
     *     The customFields
     */
    @JsonProperty("custom_fields")
    public CustomFields getCustomFields() {
        return customFields;
    }

    /**
     * 
     * @param customFields
     *     The custom_fields
     */
    @JsonProperty("custom_fields")
    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    /**
     * 
     * @return
     *     The Links
     */
    @JsonProperty("_links")
    public Links_ getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(Links_ Links) {
        this.Links = Links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public int compareTo(Object otherTicketObject) {
        Entry otherTicket = (Entry) otherTicketObject;
        return this.getCreatedAt().compareTo(otherTicket.getCreatedAt());
    }

}
