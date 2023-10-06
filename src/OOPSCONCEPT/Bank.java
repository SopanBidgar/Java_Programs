package OOPSCONCEPT;

public class Bank {
	private int accountNumber;
	private String branchName;
	private String bankNmae;
	private	String IFSC;
	
	public void currentAccount() {
		System.out.println("customer is opening  current acc");
	}
	public void realAccount() {
		System.out.println("customer is opening real acc");
	}
	public void openAccount() {
		System.out.println("customer is opening open acc");
	}

	Bank() {
		super();
	}

	public Bank(int i, String branchName, String string, int j) {
		super();
		this.accountNumber = i;
		this.branchName = branchName;
		this.bankNmae = string;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	private String getBankNmae() {
		return bankNmae;
	}

	public void setBankNmae(String bankNmae) {
		this.bankNmae =bankNmae;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		this.IFSC = iFSC;
	}

	}
