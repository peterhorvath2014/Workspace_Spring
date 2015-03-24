package com.epam.course.main;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {

	private List<Class> observedClasses;
	
	public List<Class> getObservedClasses() {
		return observedClasses;
	}

	public void setObservedClasses(List<Class> observedClasses) {
		this.observedClasses = observedClasses;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("ppa: " + beanName);
		for (Class observedClass: observedClasses) {
			if (observedClass.isAssignableFrom(bean.getClass())) {
				System.out.println("AssignableFrom: " + beanName);
			}
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("ppbi: " + arg1);
		return arg0;
	}

}
