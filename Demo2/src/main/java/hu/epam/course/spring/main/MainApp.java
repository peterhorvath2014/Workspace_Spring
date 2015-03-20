package hu.epam.course.spring.main;

import hu.epam.course.spring.service.AccountService;
import hu.epam.course.spring.service.factorymethod.IPaymentMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config/application-context.xml");

		AccountService acc1 = (AccountService) context
				.getBean("accountService");

		System.out.println("Welcome message mode: "+acc1.getInnerConfig().WELCOME_FROM_INNER_BEAN);
		
		System.out.println(acc1.displayActiveAccountInfo());
		
		System.out.println("Acc1 timeout: "+acc1.getTimeOutValue());
		
		
		IPaymentMethod cardPaymentMethod = (IPaymentMethod) context
				.getBean("cardPayment");
		
		IPaymentMethod cashPaymentMethod = (IPaymentMethod) context
				.getBean("cashPayment");
		
		System.out.println("Payment message: "+cardPaymentMethod.getPaymentMethod());
		System.out.println("Payment message: "+cashPaymentMethod.getPaymentMethod());

		((ClassPathXmlApplicationContext) context).close();
	}
}
