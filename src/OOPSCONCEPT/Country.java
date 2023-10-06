package OOPSCONCEPT;

public class Country {
	private String name;
	private long population;
	private String literacy;

	public void Culture() {
		System.out.println("our culture is ancient culture");
	}

	public void Festival() {
		System.out.println("our festival is diwali");
	}

	public Country() {
		super();// -----to call the constructor of the parent class
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getLiteracy() {
		return literacy;
	}

	public void setLiteracy(String literacy) {
		this.literacy = literacy;
	}

	public Country(String name, long population, String literacy) {
		super();
		this.name = name;
		this.population = population;
		this.literacy = literacy;
	}

}
