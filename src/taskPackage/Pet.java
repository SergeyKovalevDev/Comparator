package taskPackage;

public class Pet {
	
	private final String breed;
	private final String name;
	private final int weight;
	
	public Pet(String breed, String name, int weight) {
		this.breed = breed;
		this.name = name;
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public Integer getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Pet [breed=" + breed + ", name=" + name + ", weight=" + weight + "]";
	}

	
	
	

}
