
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
    "GetBA_LocationsResponse"
})
public class Example {

    @JsonProperty("GetBA_LocationsResponse")
    private GetBALocationsResponse getBALocationsResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The getBALocationsResponse
     */
    @JsonProperty("GetBA_LocationsResponse")
    public GetBALocationsResponse getGetBALocationsResponse() {
        return getBALocationsResponse;
    }

    /**
     * 
     * @param getBALocationsResponse
     *     The GetBA_LocationsResponse
     */
    @JsonProperty("GetBA_LocationsResponse")
    public void setGetBALocationsResponse(GetBALocationsResponse getBALocationsResponse) {
        this.getBALocationsResponse = getBALocationsResponse;
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
