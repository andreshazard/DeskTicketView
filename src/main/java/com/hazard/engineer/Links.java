
package com.hazard.engineer;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "self",
    "preferences",
    "searches",
    "groups",
    "macros",
    "filters",
    "integration_urls",
    "case_layout"
})
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("preferences")
    private Preferences preferences;
    @JsonProperty("searches")
    private Searches searches;
    @JsonProperty("groups")
    private Groups groups;
    @JsonProperty("macros")
    private Macros macros;
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("integration_urls")
    private IntegrationUrls integrationUrls;
    @JsonProperty("case_layout")
    private CaseLayout caseLayout;
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
     *     The preferences
     */
    @JsonProperty("preferences")
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * 
     * @param preferences
     *     The preferences
     */
    @JsonProperty("preferences")
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    /**
     * 
     * @return
     *     The searches
     */
    @JsonProperty("searches")
    public Searches getSearches() {
        return searches;
    }

    /**
     * 
     * @param searches
     *     The searches
     */
    @JsonProperty("searches")
    public void setSearches(Searches searches) {
        this.searches = searches;
    }

    /**
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public Groups getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    /**
     * 
     * @return
     *     The macros
     */
    @JsonProperty("macros")
    public Macros getMacros() {
        return macros;
    }

    /**
     * 
     * @param macros
     *     The macros
     */
    @JsonProperty("macros")
    public void setMacros(Macros macros) {
        this.macros = macros;
    }

    /**
     * 
     * @return
     *     The filters
     */
    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    /**
     * 
     * @param filters
     *     The filters
     */
    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    /**
     * 
     * @return
     *     The integrationUrls
     */
    @JsonProperty("integration_urls")
    public IntegrationUrls getIntegrationUrls() {
        return integrationUrls;
    }

    /**
     * 
     * @param integrationUrls
     *     The integration_urls
     */
    @JsonProperty("integration_urls")
    public void setIntegrationUrls(IntegrationUrls integrationUrls) {
        this.integrationUrls = integrationUrls;
    }

    /**
     * 
     * @return
     *     The caseLayout
     */
    @JsonProperty("case_layout")
    public CaseLayout getCaseLayout() {
        return caseLayout;
    }

    /**
     * 
     * @param caseLayout
     *     The case_layout
     */
    @JsonProperty("case_layout")
    public void setCaseLayout(CaseLayout caseLayout) {
        this.caseLayout = caseLayout;
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
