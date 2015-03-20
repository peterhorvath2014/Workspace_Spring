package hu.epam.course.spring.main;

import hu.epam.course.spring.config.ApplicationConfig;
import hu.epam.course.spring.configurable.ServiceHolder;
import hu.epam.course.spring.service.AccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfig.class);

		AccountService acc1 = (AccountService) context
				.getBean("defaultAccountService");

		System.out.println(acc1.displayActiveAccountInfo());
		
		/*
		Environment c = (Environment) context
				.getBean("environment");
		
		System.out.println("TIME: "+c.getProperty("timeout"));
		*/
		
		ApplicationConfig c = (ApplicationConfig) context
				.getBean("applicationConfig");
		
		System.out.println("TIME: "+c.getTimeout());
		
		// With configurable
		ServiceHolder h = new ServiceHolder();
		
		Assert.notNull(h.getAccService());
		
		((AnnotationConfigApplicationContext) context).close();

	}
}
