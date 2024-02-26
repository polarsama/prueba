package com.prueba.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Aseguradora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aseguradosID;

    @ManyToOne
    @JoinColumn(name = "tipoIdentificacionID")
    private TipoIdentificacion tipoIdentificacion;

    private Integer numeroIdentificacion;

    private String apellidos;

    private String nombres;

    @ManyToOne
    @JoinColumn(name = "sexoID")
    private TipoSexo tipoSexo;

    private LocalDate fechaNacimiento;

}
