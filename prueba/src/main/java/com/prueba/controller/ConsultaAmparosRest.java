package com.prueba.controller;

import com.prueba.request.AmparoRequest;
import com.prueba.response.AmparosResponse;
import com.prueba.service.IAmparosService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
public class ConsultaAmparosRest {

    private final IAmparosService service;

    @PostMapping("consultarAmparos")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<AmparosResponse> findAmparos(@RequestBody @Valid AmparoRequest request) {
        return ResponseEntity.ok(service.calcularAmparos(request));
    }

}
