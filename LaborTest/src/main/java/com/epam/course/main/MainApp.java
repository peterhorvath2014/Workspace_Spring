package com.epam.course.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.course.service.AccountService;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/application-context.xml");
		
		AccountService accountService = (AccountService)context.getBean("defaultAccountService");
		
		System.out.println(accountService);
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
