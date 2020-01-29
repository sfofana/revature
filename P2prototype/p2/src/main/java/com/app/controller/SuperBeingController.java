package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.SuperBeing;
import com.app.service.SuperBeingService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SuperBeingController {

	@Autowired
	private SuperBeingService service;
	
	@GetMapping("/superBeing")
	public List<SuperBeing> getAllSuperBeings() {
		return service.getAllSuperBeings();
	}

	@GetMapping("/superBeing/{id}")
	public SuperBeing getSuperBeingById(@PathVariable("id") int id) {
		return service.getSuperBeingById(id);
	}

	@PostMapping("/superBeing")
	public SuperBeing addSuperBeing(@RequestBody SuperBeing superBeing) {
		return service.addSuperBeing(superBeing);
	}

	@PutMapping("/superBeing")
	public SuperBeing updateSuperBeing(@RequestBody SuperBeing superBeing) {
		return service.updateSuperBeing(superBeing);
	}

	@DeleteMapping("/superBeing/{id}")
	public void deleteSuperBeing(@PathVariable("id") int id) {
		service.deleteSuperBeing(id);
	}
}
