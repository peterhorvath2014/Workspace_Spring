package hu.epam.course.spring.mi;

public abstract class CommandManager {
	
	public Command process(String commandState) {
		Command command = createCommand();
		command.setState(commandState);
		command.execute();
		return command;
	}

	// <public|protected> [abstract] <return-type> theMethodName(no-arguments);
	protected abstract Command createCommand();
}