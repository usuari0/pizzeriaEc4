package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.entity.pizza;

public interface pizzaRepository extends JpaRepository<pizza, Integer> {

}
