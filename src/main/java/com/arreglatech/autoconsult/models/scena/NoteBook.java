package com.arreglatech.autoconsult.models.scena;

import com.arreglatech.autoconsult.models.params.features.calendly.MeetParams;
import com.arreglatech.autoconsult.models.params.features.customer.CustomerParams;
import com.arreglatech.autoconsult.models.params.features.header.HeaderParams;
import com.arreglatech.autoconsult.models.params.features.poc.PoCParams;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Data
public class NoteBook {

    @JsonProperty("customer")
    private CustomerParams paramsCustomer;

    @JsonProperty("header")
    private HeaderParams paramsHeader;

    @JsonProperty("meet")
    private MeetParams paramsMeet;

    @JsonProperty("poc")
    private PoCParams paramsPoC;

    private List<PoCParams> lstParamsPoC;

    public void setParamsPoC(PoCParams paramsPoC) {
        //this.paramsPoC = paramsPoC;
        if(paramsPoC != null){
            this.getLstParamsPoC().add(paramsPoC);
        }
    }

    public List<PoCParams> getLstParamsPoC() {
        if(this.lstParamsPoC == null){
            this.lstParamsPoC = new ArrayList<>();
        }
        return lstParamsPoC;
    }


}
