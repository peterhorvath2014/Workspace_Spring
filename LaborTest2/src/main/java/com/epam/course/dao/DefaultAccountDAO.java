package com.epam.course.dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.epam.course.model.Account;

@Repository
public class DefaultAccountDAO implements AccountDAO {
	private Account account;
	
	@Value("${accountName}")
	private String accountName;
	
	@Value("${accountNumber}")
	private String accountNumber;
	
	@Override
	public Account getExapleAccount() {
		return account;
	}

	public DefaultAccountDAO() {
	}

	@Override
	public String toString() {
		return "DefaultAccountDAO [account=" + account + "]";
	}
	
	@PostConstruct
	public void postCreated() {
		this.account = new Account();
		account.setAccountName(accountName);
		account.setAccountNumber(accountNumber);
	}

}
