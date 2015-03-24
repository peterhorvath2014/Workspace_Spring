package com.epam.course.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.epam.course.model.Account;

@Repository
@Scope(value="singleton") //ez fölösleges
public class DefaultAccountDAO implements AccountDAO {
	private Account account;
	
	@Override
	public Account getExapleAccount() {
		return account;
	}

	public DefaultAccountDAO() {
		this.account = new Account();
		account.setAccountName("test");
		account.setAccountNumber("555-555-555");
	}

	@Override
	public String toString() {
		return "DefaultAccountDAO [account=" + account + "]";
	}

}
