package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.City;
import com.demo.entities.CityEntity;

@Repository("cityRepository")
public interface CityRepository extends CrudRepository<City, Integer> {

	@Query("select new com.demo.entities.CityEntity(id, name) from City where state.id = :id")
	public List<CityEntity> findByState(@Param("id") int id);

}