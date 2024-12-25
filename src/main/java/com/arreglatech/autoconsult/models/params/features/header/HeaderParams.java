package com.arreglatech.autoconsult.models.params.features.header;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HeaderParams {

    @JsonProperty("language")
    private String language;

}
