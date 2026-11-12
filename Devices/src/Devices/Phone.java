package Devices;

public class Phone extends Device {
	
	public Phone(int battery) {
		super(battery);
	}

	public void makeCall() {
		this.battery -= 5;
		System.out.println("You have made a call, and your remaining battery is: " + battery);
	}
	
	public void playGame() {
		this.battery -= 20;
		System.out.println("You have played a game, and your remaining battery is: " + battery);
	}
	
	public void charging() {
		this.battery += 50;
		System.out.println("Phone is charging, battery is: " + battery);
	}
}
