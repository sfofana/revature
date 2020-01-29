package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.dao.AnimalDao;
import com.app.model.Animal;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalDao animalDao;
	
	@Override
	public List<Animal> getAllAnimals() {
		return animalDao.findAll();
	}

	@Override
	public Animal getAllAnimalsByID(int id) {
		return animalDao.findById(id).get();
	}

	@Override
	public Animal addAnimal(Animal animal) {
		return animalDao.save(animal);
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		return animalDao.save(animal);
	}

	@Override
	public void deleteAnimal(int id) {
		animalDao.deleteById(id);
		
	}

	@Override
	public List<Animal> getAnimalsByAge(int age) {
		return animalDao.findByAge(age);
	}

}
