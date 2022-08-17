package com.idat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pizzeria")
public class pizzeriaDetail {
	@Id
	private clienteFK fk = new clienteFK();

	public clienteFK getFk() {
		return fk;
	}

	public void setFk(clienteFK fk) {
		this.fk = fk;
	}

	
}
