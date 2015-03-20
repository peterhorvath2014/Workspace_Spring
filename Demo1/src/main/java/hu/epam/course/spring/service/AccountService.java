package hu.epam.course.spring.service;

import hu.epam.course.spring.model.Role;
import hu.epam.course.spring.model.User;

import java.util.List;
import java.util.Map;

public interface AccountService {

	String displayActiveAccountInfo();
	
	int getTimeOutValue();
	
	Map<User,List<Role>> getUsersAndRoles();
}
