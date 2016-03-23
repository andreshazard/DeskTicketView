
package com.hazard.customer;

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
    "first_name",
    "last_name",
    "company",
    "company_name",
    "title",
    "external_id",
    "locked_until",
    "created_at",
    "updated_at",
    "access_company_cases",
    "access_private_portal",
    "background",
    "language",
    "uid",
    "phone_numbers",
    "addresses",
    "avatar",
    "emails",
    "custom_fields",
    "_links"
})
public class CustomerInfo {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("company")
    private String company;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonProperty("locked_until")
    private Object lockedUntil;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("access_company_cases")
    private Boolean accessCompanyCases;
    @JsonProperty("access_private_portal")
    private Boolean accessPrivatePortal;
    @JsonProperty("background")
    private Object background;
    @JsonProperty("language")
    private Object language;
    @JsonProperty("uid")
    private Object uid;
    @JsonProperty("phone_numbers")
    private List<Object> phoneNumbers = new ArrayList<Object>();
    @JsonProperty("addresses")
    private List<Object> addresses = new ArrayList<Object>();
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("emails")
    private List<Email> emails = new ArrayList<Email>();
    @JsonProperty("custom_fields")
    private CustomFields customFields;
    @JsonProperty("_links")
    private com.hazard.customer.Links Links;
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
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The companyName
     */
    @JsonProperty("company_name")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 
     * @param companyName
     *     The company_name
     */
    @JsonProperty("company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
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
     *     The accessCompanyCases
     */
    @JsonProperty("access_company_cases")
    public Boolean getAccessCompanyCases() {
        return accessCompanyCases;
    }

    /**
     * 
     * @param accessCompanyCases
     *     The access_company_cases
     */
    @JsonProperty("access_company_cases")
    public void setAccessCompanyCases(Boolean accessCompanyCases) {
        this.accessCompanyCases = accessCompanyCases;
    }

    /**
     * 
     * @return
     *     The accessPrivatePortal
     */
    @JsonProperty("access_private_portal")
    public Boolean getAccessPrivatePortal() {
        return accessPrivatePortal;
    }

    /**
     * 
     * @param accessPrivatePortal
     *     The access_private_portal
     */
    @JsonProperty("access_private_portal")
    public void setAccessPrivatePortal(Boolean accessPrivatePortal) {
        this.accessPrivatePortal = accessPrivatePortal;
    }

    /**
     * 
     * @return
     *     The background
     */
    @JsonProperty("background")
    public Object getBackground() {
        return background;
    }

    /**
     * 
     * @param background
     *     The background
     */
    @JsonProperty("background")
    public void setBackground(Object background) {
        this.background = background;
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
     *     The uid
     */
    @JsonProperty("uid")
    public Object getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(Object uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The phoneNumbers
     */
    @JsonProperty("phone_numbers")
    public List<Object> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * 
     * @param phoneNumbers
     *     The phone_numbers
     */
    @JsonProperty("phone_numbers")
    public void setPhoneNumbers(List<Object> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * 
     * @return
     *     The addresses
     */
    @JsonProperty("addresses")
    public List<Object> getAddresses() {
        return addresses;
    }

    /**
     * 
     * @param addresses
     *     The addresses
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Object> addresses) {
        this.addresses = addresses;
    }

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
     *     The emails
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * 
     * @param emails
     *     The emails
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
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
    public com.hazard.customer.Links getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(com.hazard.customer.Links Links) {
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
