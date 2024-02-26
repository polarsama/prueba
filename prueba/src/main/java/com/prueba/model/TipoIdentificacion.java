package com.prueba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TipoIdentificacion {

    @Id
    private Integer tipoIdentificacionID;

    private String abreviatura;

}
