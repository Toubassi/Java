import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
  private ArrayList<Item> menu;
  private ArrayList<Order> orders;
  private Scanner scanner;

  public CoffeeKiosk() {
    this.menu = new ArrayList<Item>();
    this.orders = new ArrayList<Order>();
    this.scanner = new Scanner(System.in);
  }

  public void addMenuItem(String name, double price) {
    int index = menu.size();
    Item newItem = new Item(name, price, index);
    menu.add(newItem);
  }

  public void displayMenu() {
    System.out.println("\nCafe Java Menu");

    for (int i = 0; i < menu.size(); i++) { // second fix
      Item item = menu.get(i);
      System.out.printf(
          "%d %s - $%.2f%n",
          item.getIndex(),
          item.getName(),
          item.getPrice());
    }
  }

  public void newOrder() {
    System.out.println("Please enter the customer name:");
    String customerName = scanner.nextLine();

    Order order = new Order(customerName);

    displayMenu();

    System.out.println("\nEnter a menu item index or q to finish:");
    String itemNumber = scanner.nextLine();

    while (!itemNumber.equalsIgnoreCase("q")) { // third fix 
      try {
        int index = Integer.parseInt(itemNumber);

        if (index >= 0 && index < menu.size()) {
          Item selectedItem = menu.get(index);
          order.addItem(selectedItem);
          System.out.println(selectedItem.getName() + " added.");
        } else {
          System.out.println("That menu index does not exist.");
        }
      } catch (NumberFormatException exception) {
        System.out.println("Please enter a valid menu index or q.");
      }

      System.out.println("Enter another menu item index or q to finish:");
      itemNumber = scanner.nextLine();
    }

    orders.add(order);
    order.displayOrder();
  }
}
