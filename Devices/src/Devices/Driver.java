package Devices;

public class Driver {
	public static void main(String[] args) {
		Phone nokia = new Phone(100);
		
		nokia.playGame();
		nokia.makeCall();
		nokia.charging();
	}
}
