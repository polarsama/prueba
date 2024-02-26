package com.prueba.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AmparosAsegurados {

    @Id
    private Integer amparosAseguradosID;

    @ManyToOne
    @JoinColumn(name = "aseguradosID")
    private Aseguradora aseguradora;

    @ManyToOne
    @JoinColumn(name = "amparoID")
    private Amparos amparo;

}
