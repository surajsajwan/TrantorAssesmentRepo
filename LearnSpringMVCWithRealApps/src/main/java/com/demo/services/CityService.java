package com.demo.services;

import java.util.List;

import com.demo.entities.CityEntity;

public interface CityService {

	public List<CityEntity> findByState(int id);

}