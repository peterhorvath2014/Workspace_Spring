package com.epam.course.custom;

public class CommandManagerNew {
	protected CommandNew commandToExecute;
	
	public void process() {
		CommandNew command = createCommand();
		
		command.execute();
		System.out.println("Command result: " + command.getResult());
	}
	
	protected CommandNew createCommand() {
		return null;
	}
}
