package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.CityEntity;
import com.demo.repositories.CityRepository;

@Service("cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<CityEntity> findByState(int id) {
		return cityRepository.findByState(id);
	}

}