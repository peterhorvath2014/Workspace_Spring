package hu.epam.course.spring.mi;

public class Command {

	private String state;

	
	public void execute(){
		System.out.println("Command executed: "+state);
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
}
