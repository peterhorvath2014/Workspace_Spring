package com.epam.course.model;

import java.util.Map;

public class User {
	private String name;
	private int userId;
	private Account account;
	private Map<AddressType, Address> addresses;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + ", addresses=" + addresses + "]";
	}

	public Map<AddressType, Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Map<AddressType, Address> addresses) {
		this.addresses = addresses;
	}

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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
