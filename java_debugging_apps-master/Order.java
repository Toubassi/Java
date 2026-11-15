import java.util.ArrayList;

public class Order {
  private String customerName;
  private ArrayList<Item> items;

  public Order(String customerName) {
    this.customerName = customerName;
    this.items = new ArrayList<Item>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public double getOrderTotal() {
    double total = 0.0;

    for (Item item : items) {
      total += item.getPrice();
    }

    if (total > 10) { // fourth fix
    	System.out.println("Because your total is more than 10 dollar, here is a 10% discount on us <3");
      total *= 0.90;
      return total;
    }

    return total;
  }

  public void displayOrder() {
    System.out.println("\nOrder for " + customerName);

    for (Item item : items) {
      System.out.printf("%s - $%.2f%n", item.getName(), item.getPrice());
    }

    System.out.printf("Total: $%.2f%n", getOrderTotal());
  }
}
