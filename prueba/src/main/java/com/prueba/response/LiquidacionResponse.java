package com.prueba.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LiquidacionResponse {

    private Integer codigoAmparo;
    private String nombreAmparo;
    private Integer valorPrima;

}
