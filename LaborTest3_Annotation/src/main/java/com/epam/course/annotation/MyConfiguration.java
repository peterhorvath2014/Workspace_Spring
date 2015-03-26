package com.epam.course.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.epam.course.dao.AccountDAO;
import com.epam.course.dao.DefaultAccountDAO;
import com.epam.course.model.Account;
import com.epam.course.processor.DebugPropPostProcessor;

@Configuration
//@ImportResource("spring-config/dao-context.xml")
@PropertySource("properties/account.properties")
public class MyConfiguration {
	
	@Autowired
	private Environment env;
	
//	@Autowired
//	@Qualifier("propFilledAccountDAO")
//	private AccountDAO accountDAO;
	
	@Bean(name="debugPostProcessor")
	public DebugPropPostProcessor debugPostProcessor() {
		DebugPropPostProcessor debugPostProcessor = new DebugPropPostProcessor();
		List<String> debuggedProps = new ArrayList<String>();
		debuggedProps.add("account.accountName");
		debuggedProps.add("account.accountNumber");
		Class<?> debuggedClass = DefaultAccountDAO.class;
		
		debugPostProcessor.setDebuggedProps(debuggedProps);
		debugPostProcessor.setDebuggedClass(debuggedClass);
		
		return debugPostProcessor;
	}

//	@Bean
//	public AccountDAO accountDAO() {
//		DefaultAccountDAO defaultAccountDAO = new DefaultAccountDAO();
//		Account account = new Account();
//		account.setAccountName("ANJavaConfig");
//		account.setAccountNumber("333-333-333");
//		defaultAccountDAO.setAccount(account);
//		return defaultAccountDAO;
//	}
	
	@Bean(name="propFilledAccountDAO")
	public AccountDAO propFilledAccountDAO() {
		DefaultAccountDAO defaultAccountDAO = new DefaultAccountDAO();
		Account account = new Account();
		account.setAccountName(env.getProperty("accountName"));
		account.setAccountNumber(env.getProperty("accountNumber"));
		defaultAccountDAO.setAccount(account);
		return defaultAccountDAO;
	}

	/*@Bean(name = "accountService1")
	public AccountService accountService() {
		DefaultAccountService defaultAccountService = new DefaultAccountService();
		defaultAccountService.setAccountDAO(accountDAO);
		return defaultAccountService;
	}*/
}
