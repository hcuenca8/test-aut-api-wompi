package com.arreglatech.autoconsult.models.params.features.customer;

import com.arreglatech.autoconsult.models.params.services.checkpoint.CheckpointParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerParams {

    @JsonProperty("id")
    private String id;

    @JsonProperty("checkpoint")
    private CheckpointParams paramsCheckpoint;

    @JsonProperty("mail")
    private String mail;

}
