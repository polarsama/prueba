package com.prueba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Amparos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer amparoID;

    private Integer codigo;

    private String nombre;

}
