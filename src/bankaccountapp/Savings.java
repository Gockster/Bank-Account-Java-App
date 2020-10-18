package bankaccountapp;

public class Savings extends Account{

	
	//List properties specific to the savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//Constructor to initialize settings for the savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	} 
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	};
	
	
	
	//List any methods specific to savings account
	public void showInfo() {
		System.out.println("Account type: Savings");
		super.showInfo();
		System.out.println(
					"Your savings account features" +
					"\nSafety Deposit Box ID: " + safetyDepositBoxID +
					"\nSafety dDposit Box Key: " + safetyDepositBoxKey
					);
			
	}
}
