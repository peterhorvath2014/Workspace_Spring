package hu.epam.course.spring.dao;

import hu.epam.course.spring.model.Account;

import java.util.List;

public interface AccountDAO {

	int getActiveAccountNumber();
	
	List<Account> listAccounts();
}
