package command;

public class CommandMain {

	public static void main(String[] args) {
		
		
		Lights lights = new Lights();
		Command lightsOnCommand = new LightsOnCommand(lights);
		Command lightsOffCommand = new LightsOffCommand(lights);

		RemoteController remote = new RemoteController();
		
		remote.setCommand(lightsOnCommand);
		remote.pressButton();
		
		remote.setCommand(lightsOffCommand);
		remote.pressButton();
	}

}
