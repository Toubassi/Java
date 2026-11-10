import java.util.ArrayList;

public class TestOrders {
  public static void main(String[] args) {
    // Menu Items
    Item item1 = new Item("Pizza", 5.00);
    Item item2 = new Item("Burger", 4.5);
    Item item3 = new Item("Shawerma", 3.5);
    Item item4 = new Item("Falafel", 1.25);

    Order order1 = new Order("Rami", 0.0, false);
    Order order2 = new Order("Jimmy", 0.0, false);
    Order order3 = new Order("Noah", 0.0, true);
    Order order4 = new Order("Sam", 0.0, false);
    order1.addItem(item1);
    order1.addItem(item2);
    order2.addItem(item3);
    order3.addItem(item4);
    order3.addItem(item1);
    order4.addItem(item4);
    order4.addItem(item2);

    order1.displayInfo();
    System.out.println("\n______________________________");
    order2.displayInfo();
    System.out.println("\n______________________________");
    order3.displayInfo();
    System.out.println("\n______________________________");
    order4.displayInfo();
  }
}

