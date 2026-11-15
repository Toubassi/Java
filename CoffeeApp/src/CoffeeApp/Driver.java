package CoffeeApp;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	CoffeeKiosk kiosk = new CoffeeKiosk();
	
	kiosk.addMenuItem("Banana", 2.00);
	kiosk.addMenuItem("Coffe", 5.00);
	kiosk.addMenuItem("Cup Cake", 7.25);
	kiosk.addMenuItem("Tea", 2.00);
	
//	kiosk.displayMenu();
	
	kiosk.newOrder();
	}
}
