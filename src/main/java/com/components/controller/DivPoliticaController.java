package com.components.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.components.model.DivPolitica;
import com.components.repository.DivPoliticaRepository;


@RestController
@RequestMapping({ "/DivPolitica" })
public class DivPoliticaController {
private DivPoliticaRepository repository;
    
	DivPoliticaController(DivPoliticaRepository repository) {
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
	
	@GetMapping(path = { "/p/{provincia}" })
	public List<String> findByProvincia(@PathVariable String provincia) {
		return repository.findByProvincia(provincia);
	}

	@PostMapping
	public DivPolitica create(@RequestBody DivPolitica div) {
		return repository.save(div);
	}
}
