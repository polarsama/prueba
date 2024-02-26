package com.prueba.response;

import lombok.Data;

import java.util.List;

@Data
public class AmparosResponse {

    private String tipoIdentificacion;
    private Integer nroIdentificacion;
    private Integer valorAsegurado;
    private List<LiquidacionResponse> liquidacion;
    private Integer valorTotal;

}
