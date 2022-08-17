package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.dto.clienteDTO;
import com.idat.service.clienteServiceImpl;

@Controller
@RequestMapping( path = "/cliente/v1")
public class clienteController {
	@Autowired
	clienteServiceImpl service;

	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<clienteDTO>>  listar() {
		return new ResponseEntity<List<clienteDTO>>(service.listarClientes(), HttpStatus.OK) ;
	}
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<clienteDTO> obtenerId(@PathVariable Integer id) {
		clienteDTO e =service.obtenerClientelId(id);
		if(e != null) {
			return  new ResponseEntity<clienteDTO>(service.obtenerClientelId(id),HttpStatus.OK);
		}
		return  new ResponseEntity<clienteDTO>(HttpStatus.NOT_FOUND);
	}
}
