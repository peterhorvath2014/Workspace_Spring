package hu.epam.course.spring.dao;

import hu.epam.course.spring.model.Account;

public class DefaultAccountDAO implements AccountDAO {

	
	private Account acc;
	
	@Override
	public int getActiveAccountNumber() {
		return 10;
	}

	@Override
	public Account getExampleAccount() {
		return acc;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
}
