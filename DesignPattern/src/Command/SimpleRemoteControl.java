package Command;

public class SimpleRemoteControl {
	private Command[] slots;
	private Command undoCommand;
	
	public SimpleRemoteControl() {
		slots = new Command[4];
		Command noCommand = new NoCommand();
		for(int i = 0; i < slots.length; ++i) {
			slots[i] = noCommand;
		}
	}
	
	public void setCommand(int number, Command command) {
		if(buttonValidationCheck(number)) {
			slots[number] = command;
		}
	}
	
	public void buttonWasPressed(int number) {
		if(buttonValidationCheck(number)) {
				slots[number].execute();
				undoCommand = slots[number];
		}
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
	
	private boolean buttonValidationCheck(int number) {
		if(number > 4 && number < 0) {
			System.out.println("Invalid Button");
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----------- Remote Control -----------\n");
		for(int i = 0; i < slots.length; ++i) {
			stringBuffer.append("[slot "+ i + "] : " + slots[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}
}
