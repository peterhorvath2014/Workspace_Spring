package com.epam.course.model;

public class Account {
	private String accountName;
	private String accountNumber;
	private double balance;
	private User owner;

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + ", owner=" + owner
				+ "]";
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

}
