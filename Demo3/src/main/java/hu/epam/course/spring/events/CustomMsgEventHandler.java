package hu.epam.course.spring.events;

import java.util.Date;

import org.springframework.context.ApplicationListener;

public class CustomMsgEventHandler implements
		ApplicationListener<CustomMsgEvent> {

	@Override
	public void onApplicationEvent(CustomMsgEvent event) {
		
		System.out.println(" CustomMsgEventHandler (with hashcode) "
                + this.hashCode() + "\n received "
                + event.getClass() + "\n at "
                + new Date(event.getTimestamp())
                + "\n with Source as "
                + event.getSource().getClass());

	}
}
