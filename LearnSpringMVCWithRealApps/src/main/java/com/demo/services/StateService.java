package com.demo.services;

import java.util.List;
import com.demo.entities.StateEntity;

public interface StateService {

	public List<StateEntity> findByCountry(int id);

}