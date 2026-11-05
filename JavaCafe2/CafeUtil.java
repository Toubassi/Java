import java.util.ArrayList;

public class CafeUtil {
  public int getStreakGoal(int numWeeks){
    int sum = 0;
    for (int i = 0; i <= numWeeks; i++){
      sum = sum + i;
    }
    return sum;
  };

  public double getOrderTotal(double[] prices){
    double total = 0;
    for (int i = 0; i <= prices.length; i++){
      total = total + i;
    }
    return total;
  };

  public void displayMenu(ArrayList<String> menuItems){
    for (int i = 0; i < menuItems.size(); i++){
      System.out.println(menuItems.get(i));
    }
  };

  public void addCustomer(ArrayList<String> customers){
    String username = System.console().readLine();
    System.out.println("Hello " + username);
    int count = customers.size();
    System.out.println("There are " + count + " people infront of you");
    customers.add(username);
    System.out.println(customers);
  }


}
