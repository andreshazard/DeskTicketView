
package com.hazard.message;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "created_at",
    "updated_at",
    "sent_at",
    "erased_at",
    "hidden_by",
    "hidden_at",
    "body",
    "from",
    "to",
    "cc",
    "bcc",
    "client_type",
    "direction",
    "status",
    "subject",
    "hidden",
    "_links"
})
public class Message {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("sent_at")
    private String sentAt;
    @JsonProperty("erased_at")
    private Object erasedAt;
    @JsonProperty("hidden_by")
    private Object hiddenBy;
    @JsonProperty("hidden_at")
    private Object hiddenAt;
    @JsonProperty("body")
    private String body;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("cc")
    private String cc;
    @JsonProperty("bcc")
    private Object bcc;
    @JsonProperty("client_type")
    private String clientType;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("status")
    private String status;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("_links")
    private com.hazard.message.Links Links;
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
     *     The sentAt
     */
    @JsonProperty("sent_at")
    public String getSentAt() {
        return sentAt;
    }

    /**
     * 
     * @param sentAt
     *     The sent_at
     */
    @JsonProperty("sent_at")
    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * 
     * @return
     *     The erasedAt
     */
    @JsonProperty("erased_at")
    public Object getErasedAt() {
        return erasedAt;
    }

    /**
     * 
     * @param erasedAt
     *     The erased_at
     */
    @JsonProperty("erased_at")
    public void setErasedAt(Object erasedAt) {
        this.erasedAt = erasedAt;
    }

    /**
     * 
     * @return
     *     The hiddenBy
     */
    @JsonProperty("hidden_by")
    public Object getHiddenBy() {
        return hiddenBy;
    }

    /**
     * 
     * @param hiddenBy
     *     The hidden_by
     */
    @JsonProperty("hidden_by")
    public void setHiddenBy(Object hiddenBy) {
        this.hiddenBy = hiddenBy;
    }

    /**
     * 
     * @return
     *     The hiddenAt
     */
    @JsonProperty("hidden_at")
    public Object getHiddenAt() {
        return hiddenAt;
    }

    /**
     * 
     * @param hiddenAt
     *     The hidden_at
     */
    @JsonProperty("hidden_at")
    public void setHiddenAt(Object hiddenAt) {
        this.hiddenAt = hiddenAt;
    }

    /**
     * 
     * @return
     *     The body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 
     * @return
     *     The from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * 
     * @return
     *     The cc
     */
    @JsonProperty("cc")
    public String getCc() {
        return cc;
    }

    /**
     * 
     * @param cc
     *     The cc
     */
    @JsonProperty("cc")
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * 
     * @return
     *     The bcc
     */
    @JsonProperty("bcc")
    public Object getBcc() {
        return bcc;
    }

    /**
     * 
     * @param bcc
     *     The bcc
     */
    @JsonProperty("bcc")
    public void setBcc(Object bcc) {
        this.bcc = bcc;
    }

    /**
     * 
     * @return
     *     The clientType
     */
    @JsonProperty("client_type")
    public String getClientType() {
        return clientType;
    }

    /**
     * 
     * @param clientType
     *     The client_type
     */
    @JsonProperty("client_type")
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * 
     * @return
     *     The direction
     */
    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The direction
     */
    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
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
     *     The hidden
     */
    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The Links
     */
    @JsonProperty("_links")
    public com.hazard.message.Links getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(com.hazard.message.Links Links) {
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

}
