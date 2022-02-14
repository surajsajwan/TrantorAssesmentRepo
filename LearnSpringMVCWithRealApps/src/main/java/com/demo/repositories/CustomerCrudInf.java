package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.entities.CustomerEntity;

public interface CustomerCrudInf extends CrudRepository<CustomerEntity, String>{

}
