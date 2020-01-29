package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AppDAO;
import com.app.model.SuperBeing;

@Service
public class SuperBeingServiceImpl implements SuperBeingService{

	@Autowired
	private AppDAO appDao;
	
	@Override
	public List<SuperBeing> getAllSuperBeings() {
		// TODO Auto-generated method stub
		return appDao.findAll();
	}

	@Override
	public SuperBeing getSuperBeingById(int id) {
		// TODO Auto-generated method stub
		return appDao.findById(id).get();
	}

	@Override
	public SuperBeing addSuperBeing(SuperBeing superBeing) {
		// TODO Auto-generated method stub
		return appDao.save(superBeing);
	}

	@Override
	public SuperBeing updateSuperBeing(SuperBeing superBeing) {
		// TODO Auto-generated method stub
		return appDao.save(superBeing);
	}

	@Override
	public void deleteSuperBeing(int id) {
		// TODO Auto-generated method stub
		appDao.deleteById(id);
	}

}
