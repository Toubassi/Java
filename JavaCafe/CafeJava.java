package JavaCafe;

public class CafeJava {
  public static void main(String[] args){
    String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattePrice = 2.5;
        double cappuccinoPrice = 4.0;
        double dripCoffeePrice = 5.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4 = "Adam";
    
        // Order completions (add yours below)
        boolean isReadyOrderShatha = false;
        boolean isReadyOrderAhmad = false;
        boolean isReadyOrderSali = false;
        boolean isReadyOrderAdam = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //

        // Sali ordered a coffee. Based on her order status, print the correct status message to the console.
        System.out.println(generalGreeting + customer3 + pendingMessage);

        // Ahmad ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.
        System.out.println(generalGreeting + customer2 + (isReadyOrderAhmad ? readyMessage + displayTotalMessage + cappuccinoPrice : pendingMessage ));

        // Sali just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(customer3 + (isReadyOrderSali ? readyMessage + displayTotalMessage + (lattePrice + lattePrice) : pendingMessage));
        
        // Adam just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println("Hi " + customer4 + ", sorry for the miscalculations.. " + displayTotalMessage + (dripCoffeePrice-lattePrice));

        // Try changing the price values for each drink and isReady flags (booleans), to test if all of your logic works, even when prices and statuses are changed.
  }
}
