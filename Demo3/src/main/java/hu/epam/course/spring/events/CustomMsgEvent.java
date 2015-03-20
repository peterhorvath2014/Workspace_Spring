package hu.epam.course.spring.events;

import org.springframework.context.ApplicationEvent;

public class CustomMsgEvent extends ApplicationEvent {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4055384852802156057L;
	
	final String msg;

    public String getMsg() {
        return msg;
    }

    public CustomMsgEvent(Object source, final String msg) {
        super(source);
        this.msg = msg;
        System.out.println("Created a Custom event");
    }

    @Override
    public String toString() {
        return "CustomMsgEvent msg: " + this.msg;
    }

}