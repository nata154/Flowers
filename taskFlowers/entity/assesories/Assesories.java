package taskFlowers.entity.assesories;

public class Assesories{
	public String name;
	public double cost;
	

	public Assesories(String name,  double cost){
//		System.out.println("TypeOfAssesories: "+name+". It costs: "+cost+" $");
		this.name=name;
		this.cost=cost;		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
