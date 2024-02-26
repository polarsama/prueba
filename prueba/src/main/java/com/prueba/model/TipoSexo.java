package com.prueba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TipoSexo {

    @Id
    private Integer sexoID;

    private String nombre;

}
