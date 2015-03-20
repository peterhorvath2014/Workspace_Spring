package hu.epam.course.spring.main;

import hu.epam.course.spring.model.Role;
import hu.epam.course.spring.model.User;
import hu.epam.course.spring.service.AccountService;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/application-context.xml","spring-config/application-context2.xml");

		AccountService acc1 = (AccountService) context
				.getBean("accountService");

		AccountService acc2 = (AccountService) context
				.getBean("accountService2");

		AccountService acc3 = (AccountService) context
				.getBean("accountService3");

		System.out.println(acc1.displayActiveAccountInfo());
		
		Map<User,List<Role>> usersRolesMap = acc1.getUsersAndRoles();
		
		for(User u: usersRolesMap.keySet()){
			System.out.println("User name: "+u.getName()+" : ");
			System.out.println("Contact infos: "+u.getContactInformations().getProperty("email") 
					+" / "+u.getContactInformations().getProperty("phone")); 
			for(Role r : usersRolesMap.get(u)){
				System.out.println("Role: "+r.getRoleName());
			}
		}

		System.out.println("Acc1 timeout: " + acc1.getTimeOutValue());

		System.out.println("Acc2 timeout: " + acc2.getTimeOutValue());
		System.out.println("Acc3 timeout: " + acc3.getTimeOutValue());

		((ClassPathXmlApplicationContext) context).close();
	}
}
