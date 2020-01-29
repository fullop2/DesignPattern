package Command;

public class MacroCommand implements Command {
	
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		// TODO Auto-generated constructor stub
		this.commands = commands; 
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(Command command : commands)
			command.execute();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(Command command : commands)
			command.undo();
	}

}
