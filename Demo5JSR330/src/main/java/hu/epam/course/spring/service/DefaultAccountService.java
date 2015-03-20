package hu.epam.course.spring.service;

import hu.epam.course.spring.configuration.SystemConfig;
import hu.epam.course.spring.dao.AccountDAO;
import hu.epam.course.spring.model.Account;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Named
@Scope("singleton")
public class DefaultAccountService implements AccountService {

	private AccountDAO accountDAO;

	private int timeOut;

	@Autowired
	SystemConfig systemConfig;

	@Inject
	public DefaultAccountService(AccountDAO accountDAO,
			@Value("${timeout}") int timeOut) {
		this.accountDAO = accountDAO;
		this.timeOut = timeOut;
	}

	public String displayActiveAccountInfo() {
		StringBuilder builder = new StringBuilder();
		builder.append("Application config timeout is: ").append(timeOut)
				.append("\n").append("Account informations: ").append("\n");
		for (Account a : accountDAO.listAccounts()) {
			builder.append("Account name: ").append(a.getAccountName())
					.append(" Account number : ").append(a.getAccountNumber())
					.append(" Account owner: ").append(a.getOwner().getName())
					.append("\n");
		}

		return builder.toString();
	}

	public int getTimeOutValue() {
		// TODO Auto-generated method stub
		return timeOut;
	}

	public SystemConfig getSystemConfig() {
		return systemConfig;
	}

}
