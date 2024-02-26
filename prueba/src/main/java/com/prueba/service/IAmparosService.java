package com.prueba.service;

import com.prueba.request.AmparoRequest;
import com.prueba.response.AmparosResponse;

public interface IAmparosService {

    AmparosResponse calcularAmparos(AmparoRequest request);

}
