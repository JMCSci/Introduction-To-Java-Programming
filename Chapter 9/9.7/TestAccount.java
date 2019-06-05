/* Test Account class 
 * Data fields are set to private in Account class
 * Getters and setters must be used to change and view values
 */

package account;

public class TestAccount {
	/*  MAIN */ 
	public static void main(String[] args) {
		Account account = new Account();				// create account object
		double monthlyInterest;						// create monthly interest variable
		account.setId(1122);						// value sent to function -- set variable to value
		account.setBalance(20000);					// value sent to function -- set variable to value
		account.setInterestRate(0.045);					// value sent to function -- set variable to value
		account.withdraw();						// withdraw preset amount
		account.deposit(); 						// deposit preset amount

		monthlyInterest = account.getMonthlyInterest(account.getMonthlyInterestRate());
		System.out.println("Account balance $" + account.getBalance() + "\n" + 
							"Monthly interest $" + monthlyInterest + "\n" + 
							 "Account created: " + account.dateCreated());
		
	}

}
