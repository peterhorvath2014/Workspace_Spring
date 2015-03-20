package hu.epam.course.spring.main;

import hu.epam.course.spring.events.CustomMsgEvent;
import hu.epam.course.spring.service.AccountService;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config/application-context.xml");

		String question = context.getMessage("name.question", null,
				Locale.ENGLISH);
		String welcome = context.getMessage("welcome.message",
				new Object[] { "Bob" }, Locale.ENGLISH);

		System.out.println("Question: " + question);
		System.out.println("Welcome: " + welcome);

		AccountService acc1 = (AccountService) context
				.getBean("accountService");

		System.out.println(acc1.displayActiveAccountInfo());

		System.out.println("Acc1 timeout: " + acc1.getTimeOutValue());

		CustomMsgEvent customMsgEvent = new CustomMsgEvent(context,
				"Test message");

		context.publishEvent(customMsgEvent);
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
