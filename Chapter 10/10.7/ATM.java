/* Game: Simulated ATM machine
 * Utilizes methods and constructors from Account class
 * Accounts (ID #'s) are numbered 0 thru 9
 * The PIN number for all accounts is 1234
 * Initial balance in accounts is $100
 * ATM loop never ends; prompts a new user to enter their "account" (ID)  
 */

package account;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account atm = new Account();
		int option, PIN;
		
	// create 10 "accounts" in an array w/ ID 0-9; initial balance of $100
	int [] bankAccountsID = new int [10];
	double [] bankAccountsBal = new double [10];
	
	// fill ID array
	for(int i = 0; i < bankAccountsID.length; i++) {
			bankAccountsID[i]= i;
 	}
	// fill Balance array 
	for(int i = 0; i < bankAccountsBal.length; i++) {
		bankAccountsBal[i] = 100;
	}
	
	// prompt user to enter ID number; if number does match "account #", asks user to enter correct number 
	System.out.print("Enter an ID: ");
	atm.setId(input.nextInt());
	
	// check ID number
	while(true) {
		if(atm.getId() < 0 || atm.getId() >= 10) {
		System.out.println("ID is incorrect. Please enter correct number. "); 
		System.out.print("Enter an ID: ");
		atm.setId(input.nextInt());
		continue;
	  } 
	break;
   }
	
	// set balance using array and id getter method; balance will be used in method formulas
	atm.setBalance(bankAccountsBal[atm.getId()]); 
	
	// check if user "account" is in "system" (in ID array)
	while(true) {
		if(atm.getId() < 0 && atm.getId() > 10) {
			System.out.println("Number is incorrect. Please enter correct number: "); continue;
	} else {
		// user must enter PIN
		System.out.println("Enter 4-digit PIN: ");
		PIN = input.nextInt();
		
		// check PIN; prompt user if incorrect
		while(PIN != 1234) {
				System.out.println("PIN is incorrect. Try again.");
				PIN = input.nextInt();
		}
		System.out.println("\n*** Main Menu ***");
		System.out.println("1. Check balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		System.out.print("\nSelect an option: ");
		option = input.nextInt();
		switch(option) {
		case 1: System.out.println("Balance: $" + bankAccountsBal[atm.getId()]); break;
		case 2: System.out.println("Enter an amount to withdraw: ");
				bankAccountsBal[atm.getId()] = atm.withdraw(input.nextDouble());
				System.out.println("Balance: $" + bankAccountsBal[atm.getId()]); break;
		case 3: System.out.println("Enter an amount to deposit: ");
				bankAccountsBal[atm.getId()] = atm.deposit(input.nextDouble());
				System.out.println("New balance: $" + bankAccountsBal[atm.getId()]); break;
		case 4: System.out.println("\nGoodbye"); break;
		default: System.out.println("Invalid selection."); break;
		}
		// start new loop
		System.out.println("\nEnter an ID: ");
		atm.setId(input.nextInt());
		
		// check ID number 
		while(true) {
			if(atm.getId() < 0 || atm.getId() >= 10) {
			System.out.println("ID is incorrect. Please enter correct number. "); 
			System.out.print("Enter an ID: ");
			atm.setId(input.nextInt());
			continue;
		  }  else {
			 break;
		  }
			
		}
	
	  }
		
	}
	
  }
	
}
