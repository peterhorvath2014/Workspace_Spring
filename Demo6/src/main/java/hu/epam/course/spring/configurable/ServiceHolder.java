package hu.epam.course.spring.configurable;

import hu.epam.course.spring.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class ServiceHolder {

	@Autowired
	private AccountService accService;

	public AccountService getAccService() {
		return accService;
	}
}
