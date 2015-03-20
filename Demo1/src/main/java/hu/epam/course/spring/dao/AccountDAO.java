package hu.epam.course.spring.dao;

import hu.epam.course.spring.model.Account;

public interface AccountDAO {

	int getActiveAccountNumber();
	
	Account getExampleAccount();
}
