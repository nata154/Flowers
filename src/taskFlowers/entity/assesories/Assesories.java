package taskFlowers.entity.assesories;

import taskFlowers.entity.NameCost;

public class Assesories extends NameCost{
	
	public String colour;

	public Assesories(String name, String colour, double cost){
		System.out.println("TypeOfAssesories: "+name+", the colous is:  "+colour+". It costs: "+cost+" $");
	}
	
	public String setColour(String name){
		return colour;
	}
	
	public String getColour(){
		return colour;
	}
}
