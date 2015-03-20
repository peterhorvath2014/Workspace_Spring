package com.epam.course.service;

import com.epam.course.dao.AccountDAO;
import com.epam.course.model.Account;

public class DefaultAccountService implements AccountService {
	private AccountDAO accountDAO;
	
	public DefaultAccountService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public Account getExampleAccount() {
		return accountDAO.getExapleAccount();
	}

	@Override
	public String toString() {
		return "DefaultAccountService [accountDAO=" + accountDAO + "]";
	}

}
