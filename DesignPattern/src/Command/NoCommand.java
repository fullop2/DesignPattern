package Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("No Command");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("No Command");
	}

}
