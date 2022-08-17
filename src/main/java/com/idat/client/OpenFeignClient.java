package com.idat.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.entity.pizza;

@FeignClient(name="idat-pizzas", url="localhost:8080")
public interface OpenFeignClient {

	@GetMapping("/api/pizzeria/v1/listar")
	public List<pizza> listarPizzaSeleccionados();
}
