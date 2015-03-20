package hu.epam.course.spring.service;

import hu.epam.course.spring.dao.AccountDAO;
import hu.epam.course.spring.model.Account;

public class DefaultAccountService implements AccountService {

	private AccountDAO accountDAO;

	private int timeOut;
	
	private hu.epam.course.spring.common.Configuration.InnerConfig innerConfig;

	public DefaultAccountService(AccountDAO accountDAO, int timeOut) {
		this.accountDAO = accountDAO;
		this.timeOut = timeOut;
	}

	public String displayActiveAccountInfo() {
		StringBuilder builder = new StringBuilder();
		builder.append("Application config timeout is: ")
				.append(timeOut)
				.append("\n")
				.append("Account informations: ")
				.append("\n");
				 for(Account a : accountDAO.getAccountList()){
					 builder.append("Account name: ")
						.append(a.getAccountName())
						.append(" Account number : ")
						.append(a.getAccountNumber())
						.append(" Account owner: ")
						.append(a.getOwner().getName())
						.append("\n");
				 }
			
		return builder.toString();
	}

	@Override
	public int getTimeOutValue() {
		return timeOut;
	}

	public hu.epam.course.spring.common.Configuration.InnerConfig getInnerConfig() {
		return innerConfig;
	}

	public void setInnerConfig(
			hu.epam.course.spring.common.Configuration.InnerConfig innerConfig) {
		this.innerConfig = innerConfig;
	}
	
	
}
