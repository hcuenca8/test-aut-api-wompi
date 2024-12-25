package com.arreglatech.autoconsult.models.params.features.calendly;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeetParams {

    @JsonProperty("name")
    private String name;

    @JsonProperty("location")
    private String location;

    @JsonProperty("important")
    private String important;


}
