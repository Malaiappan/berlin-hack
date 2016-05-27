
package com.iata.ndc.trial.domain.ba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "CountryName",
    "CountryCode",
    "City"
})
public class Country {

    @JsonProperty("CountryName")
    private String countryName;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("City")
    private List<City> city = new ArrayList<City>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The countryName
     */
    @JsonProperty("CountryName")
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The CountryName
     */
    @JsonProperty("CountryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The CountryCode
     */
    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("City")
    public List<City> getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The City
     */
    @JsonProperty("City")
    public void setCity(List<City> city) {
        this.city = city;
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
