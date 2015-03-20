package hu.epam.course.spring.model;

import java.util.Date;

public class User {

	private String name;
	
	private int userId;
	
	private Date birthDate;
	
	
	public User(String name, int userId, Date birthDate){
		this.name = name;
		this.userId = userId;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
