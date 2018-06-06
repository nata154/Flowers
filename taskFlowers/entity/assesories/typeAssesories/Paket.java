package taskFlowers.entity.assesories.typeAssesories;



import taskFlowers.entity.assesories.Assesories;

public class Paket extends Assesories  {
	private String colour;

	public Paket(String name, double cost, String colour) {
		super(name, cost);
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String Colour) {
		this.colour = colour;
	}

}
