package com.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.dto.pizzaDTO;
import com.idat.entity.pizza;
import com.idat.repository.pizzaRepository;

@Service
public class pizzaServiceImpl implements pizzaService{

	@Autowired
	pizzaRepository repository;
	
	@Override
	public List<pizzaDTO> listarPizzas() {
		List<pizzaDTO> listar = new ArrayList<>();
		
		pizzaDTO dto = null;
		
		List<pizza> c = repository.findAll();
		
		for(pizza p: c) {
			
			dto = new pizzaDTO();
			
			dto.setIdPizza(dto.getIdPizza());
			dto.setNombrePizza(dto.getNombrePizza());
			dto.setDescripcion(dto.getDescripcion());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public pizzaDTO obtenerPizzalId(Integer id) {
		pizza pizz = repository.findById(id).orElse(null);
		pizzaDTO dto = new pizzaDTO();
		
		dto.setIdPizza(pizz.getIdPizza());
		dto.setNombrePizza(pizz.getNombrePizza());
		dto.setDescripcion(pizz.getDescripcion());
		
		return dto;
	}

}
