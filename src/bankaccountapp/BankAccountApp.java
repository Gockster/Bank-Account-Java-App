package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		Checking chkacc1 = new Checking("Tom Wilson", "32156", 5800);
		
		Savings savacc1 = new Savings("Jon Snow","46466", 2500);
		
		//savacc1.
		
		savacc1.showInfo();
		System.out.println("*****************************");
		chkacc1.showInfo();
		
		
		
		
//		savacc1.deposit(5000);
//		savacc1.withdraw(200);
//		savacc1.transfer("Brokerage", 3000);
		
		//Read a csv file then create new accounts based on that data
		

	}

}
