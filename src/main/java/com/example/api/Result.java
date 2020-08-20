package com.example.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    @JsonProperty("text")
    private final String text;

    @JsonCreator
    public Result(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
