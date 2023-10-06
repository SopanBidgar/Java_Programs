package abstractionp;

abstract class Vehicle {

	abstract void show();
}

class Scooter extends Vehicle {
	void show() {
		System.out.println("scooter is running with slow speed");
	}
}

class Bike extends Vehicle {
	void show() {
		System.out.println("bike is running with fast speed");

	}

	public static void main(String[] args) {
		// Vehicle v=new Vehicle();
		Bike b = new Bike();
		b.show();

		Scooter s = new Scooter();
		s.show();
	}
}