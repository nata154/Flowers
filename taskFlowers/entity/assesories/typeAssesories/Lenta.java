package taskFlowers.entity.assesories.typeAssesories;



import taskFlowers.entity.assesories.Assesories;

public class Lenta extends Assesories  {
	private double dlinna;
	private String colour;

	public Lenta(String name, double cost, double dlinna, String colour) {
		super(name, cost);
		this.dlinna = dlinna;
		this.colour = colour;
	}

	public double getDlinna() {
		return dlinna;
	}

	public void setDlinna(double dlinna) {
		this.dlinna = dlinna;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String Colour) {
		this.colour = colour;
	}

}
