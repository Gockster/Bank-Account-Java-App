package bankaccountapp;

public abstract class Account implements IBaseRate {
	//List common properties for savings and checkings
	String name;
	String sSN;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	
	//Constructor to set base and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		System.out.println("Name: " + name + " SSN: " + sSN + " Balance: " + balance);
		
		//Set account number
		index++;
		this.accountNumber = setAccountNumber();
			}
	
	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;
	}
	
	//List common methods
}
