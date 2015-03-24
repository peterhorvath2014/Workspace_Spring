package com.epam.course.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.course.dao.AccountDAO;
import com.epam.course.model.Account;

@Service("accountService")
public class DefaultAccountService implements AccountService, InitializingBean,
		DisposableBean {

	@Autowired
	private AccountDAO accountDAO;

	private DefaultAccountService() {
		System.out.println("privát");
	}

	@Override
	public Account getExampleAccount() {
		return accountDAO.getExapleAccount();
	}

	@Override
	public String toString() {
		return "DefaultAccountService [accountDAO=" + accountDAO + "]";
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("PostConstruct");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterProp");
	}

}
