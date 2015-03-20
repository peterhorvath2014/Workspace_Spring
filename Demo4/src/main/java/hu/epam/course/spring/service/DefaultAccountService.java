package hu.epam.course.spring.service;

import hu.epam.course.spring.dao.AccountDAO;

public class DefaultAccountService implements AccountService {

	private AccountDAO accountDAO;

	private int timeOut;

	public DefaultAccountService(AccountDAO accountDAO, int timeOut) {
		this.accountDAO = accountDAO;
		this.timeOut = timeOut;
	}

	public String displayActiveAccountInfo() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account information: ")
				.append("\n")
				.append("Account name: ")
				.append(accountDAO.getExampleAccount().getAccountName())
				.append(" Account number : "
						+ accountDAO.getExampleAccount().getAccountNumber())
				.append(" Account owner: "
						+ accountDAO.getExampleAccount().getOwner().getName())
			    .append(" Account birth date: "
						+ accountDAO.getExampleAccount().getOwner().getBirthDate());
		return builder.toString();
	}

	@Override
	public int getTimeOutValue() {
		// TODO Auto-generated method stub
		return timeOut;
	}
}
