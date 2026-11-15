public class CoffeeKioskApp {
  public static void main(String[] args) {
    CoffeeKiosk kiosk = new CoffeeKiosk();

    kiosk.addMenuItem("Coffee", 2.00);
    kiosk.addMenuItem("Tea", 1.50);
    kiosk.addMenuItem("Sandwich", 5.50);
    kiosk.addMenuItem("Muffin", 3.00);

    kiosk.newOrder();
  }
}
