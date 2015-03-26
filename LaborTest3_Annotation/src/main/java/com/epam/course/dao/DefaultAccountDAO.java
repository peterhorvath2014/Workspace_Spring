package com.epam.course.dao;

import org.springframework.stereotype.Repository;

import com.epam.course.model.Account;

@Repository
public class DefaultAccountDAO implements AccountDAO {
	private Account account;
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public Account getExapleAccount() {
		return account;
	}

	@Override
	public String toString() {
		return "DefaultAccountDAO [account=" + account + "]";
	}
	
}
