package taskFlowers.entity.byket;

import taskFlowers.entity.assesories.Assesories;
import taskFlowers.entity.flowers.Flower;

public class Byket {
	private Flower [] flowers;
	private Assesories [] accessories;
	private double cost;
	
	public Byket (Flower [] flowers, Assesories [] accessories) {
		this.flowers=flowers;
		this.accessories=accessories;
		}
	
	public double getCost() {
		for(int i=0; i<flowers.length; i++) {
			cost=cost+flowers[i].getCost();
		}
		
		for(int i=0; i<accessories.length; i++) {
			cost=cost+accessories[i].getCost();
		}
		return cost;
	}
	
	public Flower getFlowerByLengthRange(int startLength, int endLenght) {
		Flower flower=null;
		for(int i=0; i<flowers.length; i++) {
			double lenght=flowers[i].getLenghtStem();
			if(lenght>=startLength && lenght<=endLenght) {
				flower=flowers[i];
			}
		}
		return flower;
	}
}