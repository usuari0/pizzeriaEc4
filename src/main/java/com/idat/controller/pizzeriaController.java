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

import com.idat.dto.pizzeriaDTO;
import com.idat.service.pizzeriaServiceImpl;

@Controller
@RequestMapping( path = "/pizzeria/v1")
public class pizzeriaController {
	@Autowired
	pizzeriaServiceImpl service;

	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<pizzeriaDTO>>  listar() {
		return new ResponseEntity<List<pizzeriaDTO>>(service.listarPizzerias(), HttpStatus.OK) ;
	}
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<pizzeriaDTO> obtenerId(@PathVariable Integer id) {
		pizzeriaDTO e =service.obtenerPizzerialId(id);
		if(e != null) {
			return  new ResponseEntity<pizzeriaDTO>(service.obtenerPizzerialId(id),HttpStatus.OK);
		}
		return  new ResponseEntity<pizzeriaDTO>(HttpStatus.NOT_FOUND);
	}
}
