package horsebarn;

public class Horse {

	private String name;
	private double weight;
	
	public Horse(String s, double w){
		name = s;
		weight = w;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
