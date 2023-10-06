package polymorphism;

public class Polyex {

	public static void main(String[] args) {}
  
   int a=10;
   long l=144;
   int c=(int)l;

	private String custName;
	private String emailId;
	private String mobNo;
	
	public Polyex() {
		super();
	}

	public Polyex(String custName, String emailId, String mobNo) {
		this.custName = custName;
		this.emailId = emailId;
		this.mobNo = mobNo;
	}

	String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId=emailId;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public void printCustDetails(int salary, String name) {
		System.out.println(salary + "" + name);
	}

	public void printCustDetails(String salary, String name) {
		System.out.println(salary + "" + name);
	}

	public void printCustDetails(String name, int salary) {
		System.out.println(salary + "" + name);

	
	}
}
