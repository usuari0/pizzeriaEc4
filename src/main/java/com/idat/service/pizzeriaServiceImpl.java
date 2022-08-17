package com.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.dto.pizzaDTO;
import com.idat.dto.pizzeriaDTO;
import com.idat.entity.pizza;
import com.idat.entity.pizzeria;
import com.idat.repository.pizzaRepository;
import com.idat.repository.pizzeriaRepository;

@Service
public class pizzeriaServiceImpl implements pizzeriaService{

	@Autowired
	pizzeriaRepository repository;
	
	@Override
	public List<pizzeriaDTO> listarPizzerias() {
		List<pizzeriaDTO> listar = new ArrayList<>();
		
		pizzeriaDTO dto = null;
		
		List<pizzeria> c = repository.findAll();
		
		for(pizzeria p: c) {
			
			dto = new pizzeriaDTO();
			
			dto.setIdpizzeria(dto.getIdpizzeria());
			dto.setDireccion(dto.getDireccion());
			dto.setSede(dto.getSede());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public pizzeriaDTO obtenerPizzerialId(Integer id) {
		pizzeria pizz = repository.findById(id).orElse(null);
		pizzeriaDTO dto = new pizzeriaDTO();
		
		dto.setIdpizzeria(pizz.getIdpizzeria());
		dto.setDireccion(pizz.getDireccion());
		dto.setSede(pizz.getSede());
		
		return dto;
	}

}
