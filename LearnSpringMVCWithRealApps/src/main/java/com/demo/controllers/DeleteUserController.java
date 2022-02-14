package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entities.CustomerEntity;
import com.demo.repositories.CustomerCrudInf;
@Controller
@RequestMapping(path = "/duc")
public class DeleteUserController {
	@Autowired
	private CustomerCrudInf crudInf;
	@RequestMapping(method = RequestMethod.GET)
	public String delete() {
		return "demo/deleteuser";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String deleted(CustomerEntity customerEntity) {
		crudInf.delete(customerEntity);
		return "demo/deleted";
	}
}
