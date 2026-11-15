package CoffeeApp;

public class Item {
	private String name;
	private double price;
	private int index;
	
	Item(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int index) {
		this.index = index;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice() {
		return this.price;
	}
	
	public double setPrice(double price) {
		return this.price = price;
	}

}
