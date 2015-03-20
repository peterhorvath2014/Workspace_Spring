package com.epam.course.model;

public class Address {
	private String country;
	private String zip;
	private String city;
	private String street;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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

	@Override
	public String toString() {
		return "Address [country=" + country + ", zip="
				+ zip + ", city=" + city + ", street=" + street + "]";
	}
}
