package CoffeeApp;

import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeKiosk {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Item> items;
	ArrayList<Order> orders;
	
	// member variables
	public CoffeeKiosk() {
		this.items = new ArrayList<Item>();
		this.orders = new ArrayList<Order>();
	}
	// Customer order
	public void newOrder() {
		System.out.println("What is your name?");
		String customer = scanner.nextLine();
		System.out.println("Welcome " + customer.toUpperCase() + ", what would you like to order?\n");
		Order order = new Order(customer, 0.0, false);
		
		displayMenu();
		
		
		while (true) {
			System.out.println("Please enter a menu number or 'q' to quit:\n");
			String itemNumber = scanner.nextLine();
			
			if (itemNumber.equals("q")) {
				break;
			}
			try {
				int index = Integer.parseInt(itemNumber);
				if(index < 0 || index >= items.size()) {
					System.out.println("Incorrect number.. try again");
					continue;
				}
				Item selectedItem = items.get(index);
				
				order.addItem(selectedItem);
				
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid letter.. try again");
			}
		}
		System.out.println("Thank you " + customer + ". Here are your order details");
		for (Item item : order.items) {
			System.out.println(item.getName() + " -- NIS " + item.getPrice());
		}
		System.out.println("Total = " + order.getTotal(order));
		
		orders.add(order);
	}
	
	public void addMenuItem(String name, double price) {
		Item item = new Item(name, price);
		item.setIndex(items.size());
		items.add(item);
	}
	
	public void displayMenu() {
		for (Item item : items) {
			System.out.println(item.getIndex() + " - " + item.getName() + ": NIS" + item.getPrice());
			}
		}
	}

	

