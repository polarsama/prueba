package com.prueba.repository;

import com.prueba.model.Aseguradora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAseguradosRepo extends JpaRepository<Aseguradora, Integer> {

    Optional<Aseguradora> findAseguradoraByNumeroIdentificacion(Integer numeroIdentificacion);

}
