import java.util.ArrayList;

public class TestOrders {
  public static void main(String[] args) {
    // Menu Items
    Item item1 = new Item("Pizza", 5.00);
    Item item2 = new Item("Burger", 4.5);
    Item item3 = new Item("Shawerma", 3.5);
    Item item4 = new Item("Falafel", 1.25);

    Order order1 = new Order("Rami", 0.0, true);
    Order order2 = new Order("Jimmy", 0.0, false);
    Order order3 = new Order("Noah", 0.0, false);
    Order order4 = new Order("Sam", 0.0, false);
    order1.items.add(item1);

    // order1.items.add(item2);
    // order1.items.add(item4);
  
    order2.items.add(item3);
    order2.items.add(item3);

    
    for (int i = 0; i < order1.items.size(); i++) {
      order1.total += order1.items.get(i).price;
    }
    // for (int i = 0; i < order2.items.size(); i++) {
    //   order2.total += order2.items.get(i).price;
    // }
    // for (int i = 0; i < order3.items.size(); i++) {
    //   order3.total += order3.items.get(i).price;
    // }
    // for (int i = 0; i < order4.items.size(); i++) {
    //   order4.total += order4.items.get(i).price;
    // }

    System.out.printf("Name: %s\n", order1.name);
    System.out.printf("Total: %s\n", order1.total);
    System.out.printf("Ready: %s\n", order1.ready);
    System.out.println("__________________________________");
    // System.out.printf("Name: %s\n", order2.name);
    // System.out.printf("Total: %s\n", order2.total);
    // System.out.printf("Ready: %s\n", order2.ready);
    // System.out.println("__________________________________");
    // System.out.printf("Name: %s\n", order3.name);
    // System.out.printf("Total: %s\n", order3.total);
    // System.out.printf("Ready: %s\n", order3.ready);
    // System.out.println("__________________________________");
    // System.out.printf("Name: %s\n", order4.name);
    // System.out.printf("Total: %s\n", order4.total);
    // System.out.printf("Ready: %s\n", order4.ready);
    // System.out.println("__________________________________");
  }
}

