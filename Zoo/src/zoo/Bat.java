package zoo;

public class Bat extends Mammal {
	
	
	public Bat(int Energy) {
		super(Energy);
	}
	
	public int fly() {
		Energy -= 50;
		System.out.println("The bat is not airborne, remaining energy is: " + Energy);
		return Energy;
	}
	
	public int eatHumans() {
		Energy += 25;
		System.out.println("The bat ate a human, it's energy increased.. Bat's energy now is: " + Energy);
		return Energy;
	}
	
	public int attackTown() {
		Energy -= 100;
		System.out.println("The bat attacked a town, remaining energy: " + Energy);
		return Energy;
	}
}
