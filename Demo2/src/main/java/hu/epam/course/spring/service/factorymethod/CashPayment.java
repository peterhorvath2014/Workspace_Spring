package hu.epam.course.spring.service.factorymethod;

public class CashPayment implements IPaymentMethod {

	@Override
	public String getPaymentMethod() {
		return "Cash payment";
	}

}
