package com.app.service;

import java.util.List;

import com.app.model.SuperBeing;

public interface SuperBeingService {

	public List<SuperBeing> getAllSuperBeings();
	public SuperBeing getSuperBeingById(int id);
	public SuperBeing addSuperBeing(SuperBeing superBeing);
	public SuperBeing updateSuperBeing(SuperBeing superBeing);
	public void deleteSuperBeing(int id);
}
