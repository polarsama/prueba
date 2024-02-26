package com.prueba.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AmparoRequest {

    @NotEmpty
    private String tipoIdentificacion;

    @NotEmpty
    private String nroIdentificacion;

    @Min(1)
    @NotNull
    private Integer valorAsegurado;

}
