package polymorphism;

public class Flat {

	private String adress;
	private String name;
	private int price;
	private int postalcode;

	public Flat() {
		super();
	}

	public Flat(String adress, String name, int price, int postalcode) {
		super();
		this.adress = adress;
		this.name = name;
		this.price = price;
		this.postalcode = postalcode;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

}
