package com.prueba.service.impl;

import com.prueba.model.Amparos;
import com.prueba.model.Aseguradora;
import com.prueba.model.Primas;
import com.prueba.repository.IAmparosRepo;
import com.prueba.repository.IAseguradosRepo;
import com.prueba.repository.IPrimasRepo;
import com.prueba.request.AmparoRequest;
import com.prueba.response.AmparosResponse;
import com.prueba.response.LiquidacionResponse;
import com.prueba.service.IAmparosService;
import com.prueba.utils.Calculates;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AmparosServiceImpl implements IAmparosService {

    private final IAseguradosRepo repo;
    private final IPrimasRepo primasRepo;
    private final IAmparosRepo amparosRepo;

    @Override
    public AmparosResponse calcularAmparos(AmparoRequest request) {
        AmparosResponse response = new AmparosResponse();
        List<LiquidacionResponse> liquidacionResponses = new ArrayList<>();

        Optional<Aseguradora> aseguradora = repo.findAseguradoraByNumeroIdentificacion(Integer.parseInt(request.getNroIdentificacion().replace(".", "")));

        if (aseguradora.isPresent()) {
            LocalDate fechaNacimiento = aseguradora.get().getFechaNacimiento();
            Integer edad = LocalDate.now().getYear() - fechaNacimiento.getYear();
            List<Primas> primas = primasRepo.findPrimasByAge(edad);

            primas.forEach(item -> {
                Optional<Amparos> amparos = amparosRepo.findById(Integer.parseInt(item.getCodigo()));
                amparos.ifPresent(amparo -> liquidacionResponses.add(new LiquidacionResponse(amparo.getCodigo(), amparo.getNombre(), Calculates.calculateAmparo(request.getValorAsegurado(), item.getPorcentajePrima()))));
            });
        }

        return null;
    }
}
