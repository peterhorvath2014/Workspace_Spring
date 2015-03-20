package com.epam.course.dao;

import com.epam.course.model.Account;

public class DefaultAccountDAO implements AccountDAO {
	private Account account;
	
	@Override
	public Account getExapleAccount() {
		return account;
	}

	public DefaultAccountDAO(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "DefaultAccountDAO [account=" + account + "]";
	}

}
