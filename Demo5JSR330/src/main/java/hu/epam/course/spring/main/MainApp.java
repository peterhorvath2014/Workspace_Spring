package hu.epam.course.spring.main;

import hu.epam.course.spring.service.AccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config/application-context.xml");

		AccountService acc1 = (AccountService) context
				.getBean("accountService");

		System.out.println(acc1.displayActiveAccountInfo());
		
		System.out.println("TimeOut:"+acc1.getTimeOutValue());
		
		System.out.println("TimeOut from config:"+acc1.getSystemConfig().getTimeout());

		((ClassPathXmlApplicationContext) context).close();
	}
}
