package command;

public class Lights {
	
	private boolean lightsOn;
	
	public void turnOn() {
		System.out.println("Lights are on");
		this.lightsOn = true;
	}
	
	public void turnOff() {
		System.out.println("Lights are off");
		this.lightsOn = false;
	}
	
}
