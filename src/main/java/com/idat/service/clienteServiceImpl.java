package com.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.dto.clienteDTO;
import com.idat.dto.pizzaDTO;
import com.idat.entity.cliente;
import com.idat.entity.pizza;
import com.idat.repository.clienteRepository;
import com.idat.repository.pizzaRepository;

@Service
public class clienteServiceImpl implements clienteService{


	@Autowired
	clienteRepository repository;
	
	@Override
	public List<clienteDTO> listarClientes() {
		List<clienteDTO> listar = new ArrayList<>();
		
		clienteDTO dto = null;
		
		List<cliente> c = repository.findAll();
		
		for(cliente p: c) {
			
			dto = new clienteDTO();
			
			dto.setIdCliente(dto.getIdCliente());
			dto.setNombreCliente(dto.getNombreCliente());
			dto.setApellidoCliente(dto.getApellidoCliente());
			dto.setDireccion(dto.getDireccion());
			dto.setNroCelular(dto.getNroCelular());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public clienteDTO obtenerClientelId(Integer id) {
		cliente client = repository.findById(id).orElse(null);
		clienteDTO dto = new clienteDTO();
		
		dto.setIdCliente(client.getIdCliente());
		dto.setNombreCliente(client.getNombreCliente());
		dto.setApellidoCliente(client.getApellidoCliente());
		dto.setDireccion(client.getDireccion());
		dto.setNroCelular(client.getNroCelular());
		
		return dto;
	}

}
