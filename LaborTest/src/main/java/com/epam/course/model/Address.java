package com.epam.course.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Address implements BeanFactoryAware, ApplicationContextAware {
	private String country;
	private String zip;
	private String city;
	private String street;
	public static String ADDRESS_TYPE_MAILING = "M";
	public static String ADDRESS_TYPE_PERMANENT = "P";

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

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println(applicationContext.getDisplayName());		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
System.out.println("BeanFactory: " + arg0);		
	}

}
