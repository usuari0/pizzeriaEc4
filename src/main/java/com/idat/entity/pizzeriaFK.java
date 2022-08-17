package com.idat.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class pizzeriaFK {
	@Column(name = "idpizza", nullable = false, unique = true)
	private Integer idpizza;
	
	@Column(name = "idpizzeria", nullable = false, unique = true)
	private Integer idpizzeria;
}
