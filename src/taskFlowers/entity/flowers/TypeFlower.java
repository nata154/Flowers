package taskFlowers.entity.flowers;

import taskFlowers.entity.NameCost;

public class TypeFlower extends NameCost{

public static int freeness;

	
	public TypeFlower(String name, int freeness, double cost){
		System.out.println("TypeOfFlower: "+name+", Freeness is "+freeness+" days.  "+"It costs: "+cost+" $");
	}
	
	public static int getFreeness(){
		return freeness;
	}
	
	
//	public TypeFlower(){
//		super();
//		System.out.println("NameOfFlower()");
//	}

}
