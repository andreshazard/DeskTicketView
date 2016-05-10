
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
    "total_entries",
    "page",
    "_links",
    "_embedded"
})
public class TodaysTickets {

    @JsonProperty("total_entries")
    private Integer totalEntries;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("_links")
    private com.hazard.todaysTickets.Links Links;
    @JsonProperty("_embedded")
    private com.hazard.todaysTickets.Embedded Embedded;
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
    public com.hazard.todaysTickets.Links getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(com.hazard.todaysTickets.Links Links) {
        this.Links = Links;
    }

    /**
     * 
     * @return
     *     The Embedded
     */
    @JsonProperty("_embedded")
    public com.hazard.todaysTickets.Embedded getEmbedded() {
        return Embedded;
    }

    /**
     * 
     * @param Embedded
     *     The _embedded
     */
    @JsonProperty("_embedded")
    public void setEmbedded(com.hazard.todaysTickets.Embedded Embedded) {
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
