package com.example.dto;

public class User {

	private String id;
	private String name;
	private String street;
	private String city;
	private Integer zipCode;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String name, String street, String city, Integer zipCode) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode
				+ "]";
	}

}
