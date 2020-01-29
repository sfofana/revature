package com.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Animal;

public interface AnimalService {

	public List<Animal> getAllAnimals();
	public Animal getAllAnimalsByID(int id);
	public Animal addAnimal(Animal animal);
	public Animal updateAnimal(Animal animal);
	public void deleteAnimal(int id);
	public List<Animal> getAnimalsByAge(int age);
}
