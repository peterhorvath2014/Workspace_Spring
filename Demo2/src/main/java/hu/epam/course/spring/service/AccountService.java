package hu.epam.course.spring.service;

public interface AccountService {

	String displayActiveAccountInfo();
	
	int getTimeOutValue();
	
	hu.epam.course.spring.common.Configuration.InnerConfig getInnerConfig();
}
