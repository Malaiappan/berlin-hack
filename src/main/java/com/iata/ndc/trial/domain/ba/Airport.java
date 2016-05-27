
package com.iata.ndc.trial.domain.ba;

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
    "AirportName",
    "AirportCode",
    "Position"
})
public class Airport {

    @JsonProperty("AirportName")
    private String airportName;
    @JsonProperty("AirportCode")
    private String airportCode;
    @JsonProperty("Position")
    private Position position;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The airportName
     */
    @JsonProperty("AirportName")
    public String getAirportName() {
        return airportName;
    }

    /**
     * 
     * @param airportName
     *     The AirportName
     */
    @JsonProperty("AirportName")
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    /**
     * 
     * @return
     *     The airportCode
     */
    @JsonProperty("AirportCode")
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * 
     * @param airportCode
     *     The AirportCode
     */
    @JsonProperty("AirportCode")
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
