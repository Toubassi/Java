import java.util.ArrayList;

public class Order {
  String name;
  double total;
  boolean ready;
  ArrayList<Item> items = new ArrayList<>();

  Order(){
    name = "Guest";

  }

  Order(String name, double total, boolean ready){
    this.name = name;
    this.total = total;
    this.ready = ready;
  }
  
  // public double getTotal(){
  //   for (int i = 0; i < this.items.size(); i++){
  //     this.total += this.items.get(i).getPrice();
  //   }
  //   return getTotal();
  // }

  public double getTotal(Order order) {
    double total = 0.0;
    for (Item item : order.items) {
      total += item.getPrice();
    }
    return total;
  }

  public void addItem(Item item){
    this.items.add(item);
  }

  public String getStatusMessage(boolean ready){
    return this.ready ? "Your order is ready" : "Your order is being prepared.";
    }
  
  public void displayInfo(){
    System.out.printf("Customer name: %s\n", this.name);

    System.out.printf("You ordered:\n");
    for (Item item : this.items){
      System.out.printf("%s\n", item.getName());
    }
    System.out.printf("Your total is: %.2f \n", this.getTotal(this));
    System.out.println(getStatusMessage(this.ready));
  }
  }


