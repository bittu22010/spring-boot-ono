package com.studentapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@	Entity
public class Address {
	@Id 
	
	@GeneratedValue(generator = "address_seq",strategy= GenerationType.AUTO)
	@SequenceGenerator(name = "stud_gen",sequenceName ="address_seq", initialValue =1 ,allocationSize =1)
	private Integer addressId;
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
		
		
		
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
