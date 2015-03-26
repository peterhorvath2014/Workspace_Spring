package com.epam.course.custom;

public class DefaultCommandNew implements CommandNew {
	private static int globalInstanceCounter = 0;
	private int instanceCounter = 0;
	private boolean executed;
	
	public DefaultCommandNew() {
		instanceCounter = ++globalInstanceCounter;
	}

	@Override
	public void execute() {
		executed = true; 
	}

	@Override
	public int getResult() {
		int ret = 0;
		if (executed) {
			ret = instanceCounter;
		}
		return ret;
	}

}
