package OOPSCONCEPT;

public class State extends Country {
	
	
	
	
	private String name;
	
	public void language() {
		System.out.println("marathi is our language");
	}

	public State() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State(String name) {
		super();
		this.name = name;
	}
	



}
	
