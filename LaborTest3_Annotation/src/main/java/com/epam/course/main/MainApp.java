package com.epam.course.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.course.annotation.MyConfiguration;
import com.epam.course.service.AccountService;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				MyConfiguration.class);

		/*AccountService accountService = (AccountService) context
				.getBean("accountService1");

		System.out.println(accountService.getExampleAccount().toString());*/

		context.close();
	}

}
