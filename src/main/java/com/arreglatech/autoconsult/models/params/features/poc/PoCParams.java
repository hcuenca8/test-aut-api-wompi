package com.arreglatech.autoconsult.models.params.features.poc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PoCParams {

    @JsonProperty("attribute1")
    private int attribute1;

    @JsonProperty("attribute2")
    private boolean attribute2;

    @JsonProperty("attribute3")
    private String attribute3;
}
