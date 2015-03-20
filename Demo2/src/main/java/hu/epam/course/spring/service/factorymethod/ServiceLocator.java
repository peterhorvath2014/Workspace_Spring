package hu.epam.course.spring.service.factorymethod;

public class ServiceLocator {

	private static final ServiceLocator locator = new ServiceLocator();

	public static ServiceLocator getLocator() {
		return locator;
	}
	
	public CardPayment getCardPayment(){
		return new CardPayment();
	}
	
	
	public CashPayment getCashPayment(){
		return new CashPayment();
	}
}
