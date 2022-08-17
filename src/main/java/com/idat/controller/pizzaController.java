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

import com.idat.dto.pizzaDTO;
import com.idat.service.pizzaServiceImpl;

@Controller
@RequestMapping( path = "/pizza/v1")
public class pizzaController {
	@Autowired
	pizzaServiceImpl service;

	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<pizzaDTO>>  listar() {
		return new ResponseEntity<List<pizzaDTO>>(service.listarPizzas(), HttpStatus.OK) ;
	}
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<pizzaDTO> obtenerId(@PathVariable Integer id) {
		pizzaDTO e =service.obtenerPizzalId(id);
		if(e != null) {
			return  new ResponseEntity<pizzaDTO>(service.obtenerPizzalId(id),HttpStatus.OK);
		}
		return  new ResponseEntity<pizzaDTO>(HttpStatus.NOT_FOUND);
	}
}





