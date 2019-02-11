package com.techtalentsouth.CAShoeStore.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String name; 
	private String city; 
	private String state; 
	private String message;
	
	
	
	public Customer() {
		
	}

	

	public Customer(String name, String city, String state, String message) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.message = message;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", message=" + message
				+ "]";
	}



	
	
	

}
