package hu.epam.course.spring.dao;

import hu.epam.course.spring.model.Role;
import hu.epam.course.spring.model.User;

import java.util.List;
import java.util.Map;

public class DefaultUserDAO implements UserDAO {

	private Map<User,List<Role>> usersAndRoles;

	@Override
	public Map<User, List<Role>> getUsersRolesMap() {
		return usersAndRoles;
	}

	public Map<User, List<Role>> getUsersAndRoles() {
		return usersAndRoles;
	}

	public void setUsersAndRoles(Map<User, List<Role>> usersAndRoles) {
		this.usersAndRoles = usersAndRoles;
	}
	
	
	
	
}

