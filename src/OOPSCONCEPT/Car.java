package OOPSCONCEPT;

import java.util.Objects;

public class Car {
	
	@Override
	public int hashCode() {
		return Objects.hash(modelNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return modelNumber == other.modelNumber;
	}
	public Car(String engine, int modelNumber, String brand, long chassiNumber, String engineModel) {
		super();
		this.engine = engine;
		this.modelNumber = modelNumber;
		this.brand = brand;
		this.chassiNumber = chassiNumber;
		this.engineModel = engineModel;
	}

	String engine;
	int modelNumber;
	String brand;
	long chassiNumber;
	String engineModel;
	
	public Car() {
		
	}
	public String getbrand() {
		return this.brand;
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getengine() {
		return this.engine;
	}
	public void setengine(String engine) {
		this.engine=engine;
		
	}
	public void run() {
		System.out.println("running");
	}
}

	

