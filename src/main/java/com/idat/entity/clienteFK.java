package com.idat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class clienteFK implements Serializable{
	@Column(name = "idpizza", nullable = false, unique = true)
	private Integer idpizza;
	
	@Column(name = "idcliente", nullable = false, unique = true)
	private Integer idcliente;
}
