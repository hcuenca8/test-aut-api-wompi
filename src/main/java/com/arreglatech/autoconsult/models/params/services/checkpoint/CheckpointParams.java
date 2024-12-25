package com.arreglatech.autoconsult.models.params.services.checkpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckpointParams {

    @JsonProperty("step")
    private String step;

    @JsonProperty("abandon")
    private String abandon;

}
