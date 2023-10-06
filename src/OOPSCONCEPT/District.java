package OOPSCONCEPT;

public class District extends State {
	private String place;
	public String panchayat;
	
	public void environment(){
		System.out.println("environment is good");
	}

	public District() {
		super();
	}

	public District(String place, String panchayat) {
		super();
		this.place = place;
		this.panchayat = panchayat;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = "chandwad";
	}

	public String getPanchayat() {
		return panchayat;
	}

	public void setPanchayat(String panchayat) {
		this.panchayat = panchayat;
	}
	public static void Arti(String[] args) {
		District d=new District();
		d.environment();
		d.Festival();
	}
}
