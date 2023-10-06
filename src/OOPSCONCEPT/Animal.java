package OOPSCONCEPT;

public class Animal {
	
	private String sound;
	private String colour;
	private String name;
	private String type;
	
	
	public void running() {
		System.out.println("dog is sleeping");
	}


	public Animal(String sound, String colour, String name, String type) {
		super();
		this.sound = sound;
		this.colour = colour;
		this.name = name;
		this.type = type;
	}


	public String getSound() {
		return sound;
	}


	public void setSound(String sound) {
		this.sound = sound;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

}
