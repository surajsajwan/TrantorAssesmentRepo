package com.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cust_tbl")
public class CustomerEntity {

	@Id
	@NotBlank
	@Size(max = 10, min = 10, message = "criteria not met")
	private String phno;
	@NotBlank
	@Size(max = 15, min = 5, message = "criteria not met")
	private String name;
	private String custtype;
	private String country;
	private String state;
	private String city;
	@NotBlank
	private String street;
	private String created_by;
	private Date created_on;
	private String updated_by;
	private Date updated_on;

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCusttype() {
		return custtype;
	}

	public void setCusttype(String custtype) {
		this.custtype = custtype;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(@NotBlank @Size(max = 10, min = 10, message = "criteria not met") String phno,
			@NotBlank @Size(max = 15, min = 5, message = "criteria not met") String name, String custtype,
			String country, String state, @NotBlank String city, @NotBlank String street, String created_by,
			Date created_on, String updated_by, Date updated_on) {
		super();
		this.phno = phno;
		this.name = name;
		this.custtype = custtype;
		this.country = country;
		this.state = state;
		this.city = city;
		this.street = street;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

}
