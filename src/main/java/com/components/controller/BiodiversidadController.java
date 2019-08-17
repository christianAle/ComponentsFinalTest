package com.components.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.components.model.BIODIVERSIDAD;
import com.components.repository.BiodiversidadRepository;


@RestController
@RequestMapping({ "/Bio" })
public class BiodiversidadController {
	private BiodiversidadRepository repository;

	BiodiversidadController(BiodiversidadRepository repository) {
		this.repository = repository;
	}
    
	@GetMapping
	public List findAll() {
		return repository.findAll();
	}
	
	@GetMapping(path = { "/{nombre}" })
	public List<String> findById(@PathVariable String nombre) {
		return repository.findByCountry(nombre);
	}
	 
	@PostMapping
	public BIODIVERSIDAD create(@RequestBody BIODIVERSIDAD bio) {
		return repository.save(bio);
	}
}
