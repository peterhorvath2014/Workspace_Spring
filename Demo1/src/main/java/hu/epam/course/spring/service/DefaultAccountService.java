package hu.epam.course.spring.service;

import hu.epam.course.spring.dao.AccountDAO;
import hu.epam.course.spring.dao.UserDAO;
import hu.epam.course.spring.model.Role;
import hu.epam.course.spring.model.User;

import java.util.List;
import java.util.Map;

public class DefaultAccountService implements AccountService {

	private AccountDAO accountDAO;
	
	private UserDAO userDAO;

	private int timeOut;

	public DefaultAccountService(AccountDAO accountDAO,UserDAO userDAO, int timeOut) {
		this.accountDAO = accountDAO;
		this.timeOut = timeOut;
		this.userDAO = userDAO;
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
						+ accountDAO.getExampleAccount().getOwner().getName());
		return builder.toString();
	}
	
	public Map<User,List<Role>> getUsersAndRoles(){
		return userDAO.getUsersRolesMap();
	}

	@Override
	public int getTimeOutValue() {
		return timeOut;
	}

}
