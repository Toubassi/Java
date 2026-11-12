package Devices;

public class Device {
	int battery;
	
	public Device(int battery){
		this.battery = 100;
	}
	public int remainingBattery(){
		int batteryLife = this.battery;
		return batteryLife;
	}
	
}
