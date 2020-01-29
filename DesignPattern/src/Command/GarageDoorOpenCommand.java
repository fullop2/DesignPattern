package Command;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.open();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.close();
	}

}
