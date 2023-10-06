package OOPSCONCEPT;

public class Customer extends Bank{

	private String custName;
	private String emailId;
	private int mnumber;
	private String adress;

public void openAccount() {
	System.out.println("customer is opening open acc");
}

public Customer() {
	super();
}



public Customer(String custName, String emailId, int mnumber, String adress) {
	super();
	this.custName = custName;
	this.emailId = emailId;
	this.mnumber = mnumber;
	this.adress = adress;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public int getMnumber() {
	return mnumber;
}

public void setMnumber(int mnumber) {
	this.mnumber = mnumber;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

}
