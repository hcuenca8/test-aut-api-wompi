package com.wompi.api.models.scena;


import com.wompi.api.models.params.NegocioParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wompi.api.models.responses.consultar.negocio.ConsultarNegocioResponse;
import lombok.Data;

@Data
public class NoteBook {

    @JsonProperty("negocio")
    private NegocioParams paramsNegocio;

    private ConsultarNegocioResponse consultarNegocioResponse;

}
