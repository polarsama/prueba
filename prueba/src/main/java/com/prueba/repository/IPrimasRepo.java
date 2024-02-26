package com.prueba.repository;

import com.prueba.model.Primas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPrimasRepo extends JpaRepository<Primas, Integer> {

    @Query(value = "SELECT * FROM primas p WHERE :age BETWEEN p.edadMinima AND p.edadMaxima;", nativeQuery=true)
    List<Primas> findPrimasByAge(Integer age);

}
