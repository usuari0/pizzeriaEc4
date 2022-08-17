package com.idat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
public class pizzeria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpizzeria;
	
	private String direccion;
	
	private String Sede;

	public Integer getIdpizzeria() {
		return idpizzeria;
	}

	public void setIdpizzeria(Integer idpizzeria) {
		this.idpizzeria = idpizzeria;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSede() {
		return Sede;
	}

	public void setSede(String sede) {
		Sede = sede;
	}
	
}
