import java.util.ArrayList;

public class Order {
  String name;
  double total;
  boolean ready;
  ArrayList<Item> items = new ArrayList<>();

  Order(String name, double total, boolean ready){
    this.name = name;
    this.total = total;
    this.ready = ready;
  }
  
}
