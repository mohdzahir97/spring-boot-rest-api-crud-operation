package com.codeforcspringbootrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	private String state;
	private String region;
	
	

	public User() {
		super();
	}
	public User(int id, String name, String city, String state, String region) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.region = region;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		System.out.println(name);
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", region=" + region + "]";
	}
}
