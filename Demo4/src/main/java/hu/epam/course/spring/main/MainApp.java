package hu.epam.course.spring.main;

import hu.epam.course.spring.editor.DomainName;
import hu.epam.course.spring.mi.CommandManager;
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

		DomainName dname = (DomainName) context.getBean("domainNameTest");

		System.out.println(dname.domainNameIsValid("www.epam.com"));
		
		CommandManager cManager = (CommandManager) context
				.getBean("commandManager");
		
		System.out.println(cManager.process("state1"));
		
		System.out.println(cManager.process("state2"));

		((ClassPathXmlApplicationContext) context).close();
	}
}
