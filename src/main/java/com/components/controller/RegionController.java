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
import com.components.model.REGION;
import com.components.repository.DivPoliticaRepository;
import com.components.repository.RegionRepository;

@RestController
@RequestMapping({ "/Region" })
public class RegionController {
	private RegionRepository repository;

	RegionController(RegionRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List findAll() {
		return repository.findAll();
	}

	@GetMapping(path = { "/{pais}" })
	public  List<String> findByCountry(@PathVariable String pais) {
		return repository.findByCountry(pais);
	}

	@PostMapping
	public REGION create(@RequestBody REGION rig) {
		return repository.save(rig);
	}
}
