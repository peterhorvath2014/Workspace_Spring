package hu.epam.course.spring.service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LoggerPostProcessor implements BeanPostProcessor {

	private static Logger processorLogger = LoggerFactory
			.getLogger(LoggerPostProcessor.class);
	private static Map<Class<?>, Logger> loggers = new HashMap<Class<?>, Logger>();
	private static Logger log = null;

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		Class<?> clazz = bean.getClass();

		for (Field field : clazz.getDeclaredFields()) {

			if (field.getAnnotation(Log.class) != null) {
				field.setAccessible(true);

				if (loggers.containsKey(clazz)) {

					log = loggers.get(clazz);
				} else {
					log = LoggerFactory.getLogger(clazz);
					loggers.put(clazz, log);
				}
				try {
					field.set(bean, log);
				} catch (Exception ex) {
					ex.printStackTrace();
					throw new RuntimeException(ex);
				}
				processorLogger.info("Logger injected to bean: " + clazz);
			}

		}
		return bean;
	}
}
