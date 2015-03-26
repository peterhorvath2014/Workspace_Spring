package com.epam.course.processor;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class DebugPropPostProcessor implements BeanPostProcessor {
	private Class<?> debuggedClass;
	private List<String> debuggedProps;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if (bean.getClass().isAssignableFrom(debuggedClass)) {
			ExpressionParser parser = new SpelExpressionParser();
			
			System.out.println("Debuged bean: " + beanName);
			for (String prop: debuggedProps) {
				Expression expression = parser.parseExpression(prop);
				String propValue = expression.getValue(bean, String.class);
				
				System.out.println("Debugged propName: " + prop);
				System.out.println("Debugged propValue: " + propValue);
			}
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	public Class<?> getDebuggedClass() {
		return debuggedClass;
	}

	@Required
	public void setDebuggedClass(Class<?> debuggedClass) {
		this.debuggedClass = debuggedClass;
	}

	public List<String> getDebuggedProps() {
		return debuggedProps;
	}

	@Required
	public void setDebuggedProps(List<String> debuggedProps) {
		this.debuggedProps = debuggedProps;
	}
}
