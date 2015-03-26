package com.epam.course.service;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

import com.epam.course.dao.AccountDAO;
import com.epam.course.model.Account;

@Service("accountService")
public class DefaultAccountService implements AccountService {

	private AccountDAO accountDAO;

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
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

	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy");
	}
}
