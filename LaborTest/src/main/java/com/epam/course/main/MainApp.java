package com.epam.course.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.course.model.Address;
import com.epam.course.service.AccountService;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config/application-context.xml");

		AccountService accountService = (AccountService) context
				.getBean("defaultAccountService");
		
		Address address1 = (Address) context.getBean("address2");
		Address address2 = (Address) context.getBean("address2");
		Address address3 = (Address) context.getBean("address3");
		Address address4 = (Address) context.getBean("address3");

		System.out.println(accountService);

		((ClassPathXmlApplicationContext) context).close();
	}

}
