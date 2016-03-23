
package com.hazard.replies;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "total_entries",
    "page",
    "_links",
    "_embedded"
})
public class RepliesFromTicket {

    @JsonProperty("total_entries")
    private Integer totalEntries;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("_links")
    private com.hazard.replies.Links Links;
    @JsonProperty("_embedded")
    private com.hazard.replies.Embedded Embedded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The totalEntries
     */
    @JsonProperty("total_entries")
    public Integer getTotalEntries() {
        return totalEntries;
    }

    /**
     * 
     * @param totalEntries
     *     The total_entries
     */
    @JsonProperty("total_entries")
    public void setTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
    }

    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The Links
     */
    @JsonProperty("_links")
    public com.hazard.replies.Links getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(com.hazard.replies.Links Links) {
        this.Links = Links;
    }

    /**
     * 
     * @return
     *     The Embedded
     */
    @JsonProperty("_embedded")
    public com.hazard.replies.Embedded getEmbedded() {
        return Embedded;
    }

    /**
     * 
     * @param Embedded
     *     The _embedded
     */
    @JsonProperty("_embedded")
    public void setEmbedded(com.hazard.replies.Embedded Embedded) {
        this.Embedded = Embedded;
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
