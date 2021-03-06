package com.hack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author lnurullina
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DtpResponse {

    private Dtp responseData;
    private String error;

    public Dtp getResponseData() {
        return responseData;
    }

    public void setResponseData(Dtp responseData) {
        this.responseData = responseData;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
