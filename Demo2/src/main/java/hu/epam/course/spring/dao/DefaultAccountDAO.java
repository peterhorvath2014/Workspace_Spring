package hu.epam.course.spring.dao;

import java.util.List;

import hu.epam.course.spring.model.Account;

public class DefaultAccountDAO implements AccountDAO {

	
	private List<Account> accountList;
	
	@Override
	public int getActiveAccountNumber() {
		return accountList.size();
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
}
