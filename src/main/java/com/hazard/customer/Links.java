
package com.hazard.customer;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "self",
    "cases",
    "company",
    "facebook_user",
    "twitter_user",
    "locked_by"
})
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("cases")
    private Cases cases;
    @JsonProperty("company")
    private Company company;
    @JsonProperty("facebook_user")
    private Object facebookUser;
    @JsonProperty("twitter_user")
    private Object twitterUser;
    @JsonProperty("locked_by")
    private Object lockedBy;
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
     *     The cases
     */
    @JsonProperty("cases")
    public Cases getCases() {
        return cases;
    }

    /**
     * 
     * @param cases
     *     The cases
     */
    @JsonProperty("cases")
    public void setCases(Cases cases) {
        this.cases = cases;
    }

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The facebookUser
     */
    @JsonProperty("facebook_user")
    public Object getFacebookUser() {
        return facebookUser;
    }

    /**
     * 
     * @param facebookUser
     *     The facebook_user
     */
    @JsonProperty("facebook_user")
    public void setFacebookUser(Object facebookUser) {
        this.facebookUser = facebookUser;
    }

    /**
     * 
     * @return
     *     The twitterUser
     */
    @JsonProperty("twitter_user")
    public Object getTwitterUser() {
        return twitterUser;
    }

    /**
     * 
     * @param twitterUser
     *     The twitter_user
     */
    @JsonProperty("twitter_user")
    public void setTwitterUser(Object twitterUser) {
        this.twitterUser = twitterUser;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
