package Command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		System.out.println(remote);
		
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		Command[] commands = {lightOn, garageDoorOpenCommand};
		
		Command macroCommand = new MacroCommand(commands);
		remote.setCommand(0, macroCommand);
		remote.buttonWasPressed(0);
		remote.undoButtonWasPressed();
		
		/*
		remote.setCommand(1,lightOn);
		remote.setCommand(0,garageDoorOpenCommand);
		System.out.println(remote);
		
		remote.buttonWasPressed(1);
		remote.buttonWasPressed(0);
		*/
	}
}