package hu.epam.course.spring.service;

import hu.epam.course.spring.configuration.SystemConfig;

public interface AccountService {

	String displayActiveAccountInfo();
	
	int getTimeOutValue();
	
	SystemConfig getSystemConfig();
}
