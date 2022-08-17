package com.idat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_cliente")
public class clienteDetail {
	@Id
	private clienteFK fk = new clienteFK();
	
	public clienteFK getFK() {
		return fk;
	}
	
	public void setFK(clienteFK fk) {
		this.fk = fk;
	}
}
