package com.prueba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "primas")
public class Primas {

    @Id
    private Integer primasID;
    private String codigo;
    private Integer edadMinima;
    private Integer edadMaxima;
    private Double porcentajePrima;

}
