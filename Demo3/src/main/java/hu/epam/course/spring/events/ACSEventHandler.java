package hu.epam.course.spring.events;

import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

public class ACSEventHandler implements
		ApplicationListener<ApplicationContextEvent> {

	@Override
	public void onApplicationEvent(ApplicationContextEvent applicationEvent) {
		
		System.out.println(" ApplicationContextEventListener (with hashcode) "
                + this.hashCode() + "\n received "
                + applicationEvent.getClass() + "\n at "
                + new Date(applicationEvent.getTimestamp())
                + "\n with Source as "
                + applicationEvent.getSource().getClass());

	}
}
