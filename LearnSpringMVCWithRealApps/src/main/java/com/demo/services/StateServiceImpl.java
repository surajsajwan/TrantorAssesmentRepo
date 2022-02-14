package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.StateEntity;
import com.demo.repositories.StateRepository;

@Service("stateService")
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<StateEntity> findByCountry(int id) {
		return stateRepository.findByCountry(id);
	}

}