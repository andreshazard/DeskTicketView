
package com.hazard.desk_ticket;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "self",
    "first",
    "last",
    "previous",
    "next"
})
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("first")
    private First first;
    @JsonProperty("last")
    private Last last;
    @JsonProperty("previous")
    private Object previous;
    @JsonProperty("next")
    private Object next;
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
     *     The first
     */
    @JsonProperty("first")
    public First getFirst() {
        return first;
    }

    /**
     * 
     * @param first
     *     The first
     */
    @JsonProperty("first")
    public void setFirst(First first) {
        this.first = first;
    }

    /**
     * 
     * @return
     *     The last
     */
    @JsonProperty("last")
    public Last getLast() {
        return last;
    }

    /**
     * 
     * @param last
     *     The last
     */
    @JsonProperty("last")
    public void setLast(Last last) {
        this.last = last;
    }

    /**
     * 
     * @return
     *     The previous
     */
    @JsonProperty("previous")
    public Object getPrevious() {
        return previous;
    }

    /**
     * 
     * @param previous
     *     The previous
     */
    @JsonProperty("previous")
    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    /**
     * 
     * @return
     *     The next
     */
    @JsonProperty("next")
    public Object getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    @JsonProperty("next")
    public void setNext(Object next) {
        this.next = next;
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
