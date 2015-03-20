package hu.epam.course.spring.dao;

import hu.epam.course.spring.model.Role;
import hu.epam.course.spring.model.User;

import java.util.List;
import java.util.Map;

public interface UserDAO {
	Map<User,List<Role>> getUsersRolesMap();
}
