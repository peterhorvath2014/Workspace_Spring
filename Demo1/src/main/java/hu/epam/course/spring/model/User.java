package hu.epam.course.spring.model;

import java.util.List;
import java.util.Properties;


public class User {

	private String name;

	private int userId;
	
	private List<Address> addresses;
	
	private Properties contactInformations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Properties getContactInformations() {
		return contactInformations;
	}

	public void setContactInformations(Properties contactInformations) {
		this.contactInformations = contactInformations;
	}
	
}
