/* Game: ATM Machine 
* Utilizes Account class
*/

package account;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account atm = new Account();
		int choice;
		double withdraw;
		
	// create 10 accounts in an array w/ ID 0-9; initial balance of $100
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
	
	// prompt user to enter ID number; if incorrect ask user to enter correct number
	
	System.out.println("Enter an id: ");
	atm.setId(input.nextInt());
	atm.setBalance(bankAccountsBal[atm.getId()]); // set balance using array and id getter method
	
	while(true) {
		if(atm.getId() < 0 && atm.getId() > 10) {
			System.out.println("Number is incorrect. Please enter correct number: "); continue;
	} else {
		// continue code in while loop
		System.out.println("Main menu");
		System.out.println("1. Check balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		System.out.print("Enter a choice: ");
		choice = input.nextInt();
		switch(choice) {
		case 1: System.out.println(atm.getBalance()); break;
		case 2: System.out.println("Enter an amount to withdraw: ");
				atm.withdraw(input.nextDouble());
				System.out.println("Balance: $" + atm.getBalance()); break;
		
		case 3: atm.deposit(); break;
		case 4: System.out.println("Goodbye"); break;
		default: System.out.println("Invalid selection"); break;
		}
		
		}
		System.out.println("Enter an id: ");
		atm.setId(input.nextInt());
	} // end of while loop
	
	// main menu displayed; user enters choice 1-4  
	
	// exit system; prompt user for ID again; once system starts it will not stop
	}
	

}
