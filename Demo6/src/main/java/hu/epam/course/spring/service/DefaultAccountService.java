package hu.epam.course.spring.service;

import hu.epam.course.spring.dao.AccountDAO;
import hu.epam.course.spring.model.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultAccountService implements AccountService {
	
	
	private AccountDAO accountDAO;
	
	@Autowired
	public DefaultAccountService(AccountDAO accountDAO){
		this.accountDAO = accountDAO;
	}

	public String displayActiveAccountInfo() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account informations: ")
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
}
