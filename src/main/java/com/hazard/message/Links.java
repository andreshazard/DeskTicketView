
package com.hazard.message;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "self",
    "splits",
    "outbound_mailbox",
    "case",
    "customer",
    "sent_by",
    "erased_by",
    "attachments"
})
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("splits")
    private Object splits;
    @JsonProperty("outbound_mailbox")
    private OutboundMailbox outboundMailbox;
    @JsonProperty("case")
    private Case _case;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("sent_by")
    private SentBy sentBy;
    @JsonProperty("erased_by")
    private Object erasedBy;
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
    public Self getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The splits
     */
    @JsonProperty("splits")
    public Object getSplits() {
        return splits;
    }

    /**
     * 
     * @param splits
     *     The splits
     */
    @JsonProperty("splits")
    public void setSplits(Object splits) {
        this.splits = splits;
    }

    /**
     * 
     * @return
     *     The outboundMailbox
     */
    @JsonProperty("outbound_mailbox")
    public OutboundMailbox getOutboundMailbox() {
        return outboundMailbox;
    }

    /**
     * 
     * @param outboundMailbox
     *     The outbound_mailbox
     */
    @JsonProperty("outbound_mailbox")
    public void setOutboundMailbox(OutboundMailbox outboundMailbox) {
        this.outboundMailbox = outboundMailbox;
    }

    /**
     * 
     * @return
     *     The _case
     */
    @JsonProperty("case")
    public Case getCase() {
        return _case;
    }

    /**
     * 
     * @param _case
     *     The case
     */
    @JsonProperty("case")
    public void setCase(Case _case) {
        this._case = _case;
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
     *     The sentBy
     */
    @JsonProperty("sent_by")
    public SentBy getSentBy() {
        return sentBy;
    }

    /**
     * 
     * @param sentBy
     *     The sent_by
     */
    @JsonProperty("sent_by")
    public void setSentBy(SentBy sentBy) {
        this.sentBy = sentBy;
    }

    /**
     * 
     * @return
     *     The erasedBy
     */
    @JsonProperty("erased_by")
    public Object getErasedBy() {
        return erasedBy;
    }

    /**
     * 
     * @param erasedBy
     *     The erased_by
     */
    @JsonProperty("erased_by")
    public void setErasedBy(Object erasedBy) {
        this.erasedBy = erasedBy;
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
