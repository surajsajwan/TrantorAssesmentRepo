package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Country;
import com.demo.repositories.CountryRepository;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Iterable<Country> findAll() {
		return countryRepository.findAll();
	}

	@Override
	public Country find(int id) {
		return countryRepository.findById(id).get();
	}

}