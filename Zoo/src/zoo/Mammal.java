package zoo;

public class Mammal {
	int Energy;
	
	protected Mammal(int Energy) {
		this.Energy = Energy;
	}
	
	public int displayEnergy() {
		System.out.println(Energy);
		return Energy;
	}
}
