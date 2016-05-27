/*
 * Copyright (c) KLM Royal Dutch Airlines. All Rights Reserved.
 * ============================================================
 */
package com.iata.ndc.trial.domain.ba;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BALocationsResponseWrapper {

    @JsonProperty("GetBA_LocationsResponse")
    private GetBALocationsResponse getBALocationsResponse;

    /**
     * @return the getBALocationsResponse
     */
    public GetBALocationsResponse getGetBALocationsResponse() {
        return getBALocationsResponse;
    }

    /**
     * @param getBALocationsResponse the getBALocationsResponse to set
     */
    public void setGetBALocationsResponse(GetBALocationsResponse getBALocationsResponse) {
        this.getBALocationsResponse = getBALocationsResponse;
    }

}
