
package com.hazard.engineer;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "avatar",
    "available",
    "created_at",
    "current_login_at",
    "email",
    "email_verified",
    "id",
    "last_login_at",
    "level",
    "name",
    "public_name",
    "updated_at",
    "_links"
})
public class EngineerAssigned {

    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("current_login_at")
    private String currentLoginAt;
    @JsonProperty("email")
    private String email;
    @JsonProperty("email_verified")
    private Boolean emailVerified;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("last_login_at")
    private String lastLoginAt;
    @JsonProperty("level")
    private String level;
    @JsonProperty("name")
    private String name;
    @JsonProperty("public_name")
    private String publicName;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("_links")
    private com.hazard.engineer.Links Links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The avatar
     */
    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    /**
     * 
     * @param avatar
     *     The avatar
     */
    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 
     * @return
     *     The available
     */
    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
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
     *     The currentLoginAt
     */
    @JsonProperty("current_login_at")
    public String getCurrentLoginAt() {
        return currentLoginAt;
    }

    /**
     * 
     * @param currentLoginAt
     *     The current_login_at
     */
    @JsonProperty("current_login_at")
    public void setCurrentLoginAt(String currentLoginAt) {
        this.currentLoginAt = currentLoginAt;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The emailVerified
     */
    @JsonProperty("email_verified")
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * 
     * @param emailVerified
     *     The email_verified
     */
    @JsonProperty("email_verified")
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

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
     *     The lastLoginAt
     */
    @JsonProperty("last_login_at")
    public String getLastLoginAt() {
        return lastLoginAt;
    }

    /**
     * 
     * @param lastLoginAt
     *     The last_login_at
     */
    @JsonProperty("last_login_at")
    public void setLastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    /**
     * 
     * @return
     *     The level
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The publicName
     */
    @JsonProperty("public_name")
    public String getPublicName() {
        return publicName;
    }

    /**
     * 
     * @param publicName
     *     The public_name
     */
    @JsonProperty("public_name")
    public void setPublicName(String publicName) {
        this.publicName = publicName;
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
     *     The Links
     */
    @JsonProperty("_links")
    public com.hazard.engineer.Links getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(com.hazard.engineer.Links Links) {
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
