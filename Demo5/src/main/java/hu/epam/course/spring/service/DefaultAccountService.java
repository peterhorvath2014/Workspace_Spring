package hu.epam.course.spring.service;

import hu.epam.course.spring.dao.AccountDAO;
import hu.epam.course.spring.model.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DefaultAccountService implements AccountService {
	
	private AccountDAO accountDAO;

	private int timeOut;

	@Autowired
	public DefaultAccountService(AccountDAO accountDAO, @Value("${timeout}") int timeOut) {
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
				 for(Account a : accountDAO.listAccounts()){
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

	public int getTimeOutValue() {
		// TODO Auto-generated method stub
		return timeOut;
	}
}
