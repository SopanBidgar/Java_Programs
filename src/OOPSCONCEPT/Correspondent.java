package OOPSCONCEPT;

public class Correspondent extends Bank {
	String Adress;
	int Pincode;
	String Owner;

	Correspondent() {
		super();
	}

	public Correspondent(String adress, int pincode, String owner) {
		super();
		Adress = adress;
		Pincode = pincode;
		Owner = owner;

	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		this.Adress = "smdbsbv";
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public void Banking() {
		System.out.println("eeeee");
	}

}