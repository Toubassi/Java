package CoffeeApp;

import java.util.ArrayList;

import java.util.Scanner;

public class Order {
	
	String customer;
	double total;
	boolean isReady;
	ArrayList<Item> items = new ArrayList<>();
	
	Order(String customer, double total, boolean isReady){
		this.customer = customer;
		this.total = total;		
	}
	
	public double getTotal(Order order) {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPrice();
		};
		return total;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	
}
