package bankaccountapp;

public class Savings extends Account{

	
	//List properties specific to the savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//Constructor to initialize settings for the savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("Account number " + this.accountNumber);
		System.out.println("New savings account");
		
	} 
	
	//List any methods specific to savings account

}
