package com.idat.service;

import java.util.List;

import com.idat.dto.clienteDTO;

public interface clienteService {

	List<clienteDTO> listarClientes();
	clienteDTO obtenerClientelId(Integer id);
}
