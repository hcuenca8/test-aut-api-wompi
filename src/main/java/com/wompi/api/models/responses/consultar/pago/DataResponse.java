package com.wompi.api.models.responses.consultar.pago;


import com.google.gson.annotations.SerializedName;
import com.wompi.api.models.responses.consultar.negocio.TokenResponse;
import lombok.Data;

@Data
public class DataResponse {

    @SerializedName("status")
    private String status;

}
