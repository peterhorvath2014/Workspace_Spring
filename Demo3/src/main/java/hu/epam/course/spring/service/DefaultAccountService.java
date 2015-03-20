package hu.epam.course.spring.service;

import hu.epam.course.spring.dao.AccountDAO;

import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class DefaultAccountService implements AccountService, InitializingBean, DisposableBean,ApplicationContextAware,
ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
BeanNameAware {

	private AccountDAO accountDAO;

	private int timeOut;
	
	@Log
	private Logger logger;

	public DefaultAccountService(AccountDAO accountDAO, int timeOut) {
		this.accountDAO = accountDAO;
		this.timeOut = timeOut;
	}

	public String displayActiveAccountInfo() {
		
		logger.debug("In displayActiveAccountInfo method!");
		
		StringBuilder builder = new StringBuilder();
		builder.append("Account information: ")
				.append("\n")
				.append("Account name: ")
				.append(accountDAO.getExampleAccount().getAccountName())
				.append(" Account number : "
						+ accountDAO.getExampleAccount().getAccountNumber())
				.append(" Account owner: "
						+ accountDAO.getExampleAccount().getOwner().getName());
		return builder.toString();
	}

	@Override
	public int getTimeOutValue() {
		return timeOut;
	}

	@Override
	public void destroy() throws Exception {
		logger.debug("Account Service destroyed...");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("****AfterPropertiesSet called: {} / {} ****",accountDAO,timeOut);
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name is : "+name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean factory: "+beanFactory);
		
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("Bean classloader: "+classLoader);
		
	}

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("ApplicationEventPublisher: "+applicationEventPublisher);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("ApplicationContext : "+applicationContext);
	}
	
	public void customInit(){
		logger.debug("Custom init method called!");
	}
	
	public void customDestroy(){
		logger.debug("Custom destroy method called!");
	}

}
