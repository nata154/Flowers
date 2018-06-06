package taskFlowers.entity.flowers.typeFlower;

import taskFlowers.entity.flowers.Flower;

public class Landish extends Flower {
	private boolean smell;
	
	public Landish(String name, String colour, double lenghtStem, int freshness, double cost, boolean smell) {
		super(name, colour, lenghtStem, freshness, cost);
		this.smell = smell;
	}
	 
	public boolean getSmell() {
		return smell;
	}
	
	public void setSmell(boolean smell) {
		this.smell = smell;
	}
}
