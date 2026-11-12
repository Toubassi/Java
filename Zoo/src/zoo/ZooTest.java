package zoo;

public class ZooTest {
	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(100);
		gorilla.displayEnergy();
		gorilla.throwSth();
		gorilla.throwSth();
		gorilla.throwSth();
		gorilla.eatBanana();
		gorilla.eatBanana();
		gorilla.climb();
		
		Bat bat = new Bat(300);
		bat.fly();
		bat.attackTown();
		bat.eatHumans();
		bat.eatHumans();
		bat.displayEnergy();
	}
}
