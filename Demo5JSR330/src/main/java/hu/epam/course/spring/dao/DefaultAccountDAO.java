package hu.epam.course.spring.dao;

import hu.epam.course.spring.model.Account;
import hu.epam.course.spring.model.User;
import hu.epam.course.spring.service.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.slf4j.Logger;

@Named
public class DefaultAccountDAO implements AccountDAO {

	@Log
	Logger logger;

	private List<Account> accountList = new ArrayList<Account>();

	@PostConstruct
	public void init() {
		logger.debug("@PostConstruct: In init method");
		for (int i = 0; i < 10; i++) {
			Account a = new Account();
			a.setAccountName("Account" + i);
			a.setAccountNumber("10000000-11111111-1222222" + i);
			a.setBalance(i * 100);
			a.setOwner(new User("User" + i, i, new Date()));
			accountList.add(a);
		}

	}

	@PreDestroy
	public void destroy() {
		logger.debug("@PreDestroy: In destroy method");
		accountList = null;
	}

	public int getActiveAccountNumber() {
		return accountList.size();
	}

	public List<Account> listAccounts() {
		logger.debug("In listAccounts method");
		return accountList;
	}

}
