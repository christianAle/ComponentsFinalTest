package com.components.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.components.model.RIG;
import com.components.repository.RigRepository;

@RestController
@RequestMapping({ "/RIG" })
public class RIGController {
	private RigRepository repository;
    
	RIGController(RigRepository repository) {
		this.repository = repository;
  }
	
	@GetMapping
	public List findAll() {
		return repository.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public ResponseEntity<RIG> findById(@PathVariable long id) {
		return repository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public RIG create(@RequestBody RIG rig) {
		return repository.save(rig);
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		return repository.findById(id).map(record -> {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}
}
