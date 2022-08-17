package com.idat.service;

import java.util.List;

import com.idat.dto.pizzaDTO;


public interface pizzaService {
	List<pizzaDTO> listarPizzas();
	pizzaDTO obtenerPizzalId(Integer id);
}
