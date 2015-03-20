package hu.epam.course.spring.service.factorymethod;

public class CardPayment implements IPaymentMethod {

	@Override
	public String getPaymentMethod() {
		return "Card payment";
	}

}
