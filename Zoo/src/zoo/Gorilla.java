package zoo;

public class Gorilla extends Mammal {
	public Gorilla(int Energy) {
		super(Energy);
	}
	
	public int throwSth() {
		Energy -= 5;
		System.out.println("The gorilla has thrown an banana peel at you, gorilla's remaining energy is: " + Energy);
		return Energy;
	}
	
	public int eatBanana() {
		Energy += 10;
		System.out.println("The gorilla ate a banana, gorilla's energy increased.. New energy level is: "+ Energy);
		return Energy;
	}
	
	public int climb() {
		Energy -= 10;
		System.out.println("The gorilla climbed a tree, gorilla's remaining energy is: " + Energy);
		return Energy;
	}
	
}
