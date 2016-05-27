
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
    "CityName",
    "CityCode",
    "Position",
    "Airport"
})
public class City {

    @JsonProperty("CityName")
    private String cityName;
    @JsonProperty("CityCode")
    private String cityCode;
    @JsonProperty("Position")
    private Position position;
    @JsonProperty("Airport")
    private List<Airport> airport = new ArrayList<Airport>();
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The cityName
     */
    @JsonProperty("CityName")
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The CityName
     */
    @JsonProperty("CityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 
     * @return
     *     The cityCode
     */
    @JsonProperty("CityCode")
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 
     * @param cityCode
     *     The CityCode
     */
    @JsonProperty("CityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 
     * @return
     *     The position
     */
    @JsonProperty("Position")
    public Position getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The Position
     */
    @JsonProperty("Position")
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The airport
     */
    @JsonProperty("Airport")
    public List<Airport> getAirport() {
        return airport;
    }

    /**
     * 
     * @param airport
     *     The Airport
     */
    @JsonProperty("Airport")
    public void setAirport(List<Airport> airport) {
        this.airport = airport;
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
