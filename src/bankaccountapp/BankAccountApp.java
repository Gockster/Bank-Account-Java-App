package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
				
		//Read a csv file then create new accounts based on that data
		String file = "C:\\Users\\gmdim\\OneDrive\\Υπολογιστής\\MyEclipseWorkspace\\BankAccountApp\\NewBankAccounts.csv";
		List<String[]> newAccountHolders  = utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType + " €" + initDeposit);
			if(accountType.contentEquals("Savings")) {
				//System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				//System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		} 
		
		//accounts.get(5).showInfo();
		
		for(Account acc: accounts) {
			System.out.println("\n**************");
			acc.showInfo();
		}
		
		//accounts.get((int) Math.random() * accounts.size()).deposit(10000);
		//accounts.get((int) Math.random() * accounts.size()).deposit(1500);
	}
}
