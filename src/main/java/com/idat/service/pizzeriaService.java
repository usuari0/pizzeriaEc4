package com.idat.service;

import java.util.List;

import com.idat.dto.pizzeriaDTO;

public interface pizzeriaService {

	List<pizzeriaDTO> listarPizzerias();
	pizzeriaDTO obtenerPizzerialId(Integer id);
}
