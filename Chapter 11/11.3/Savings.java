/* SavingsAccount extends Account class
 * Class models a savings account
 */

package subAccount;

import account.Account;

public class SavingsAccount extends Account {
	double savBalance; 
	double startingBalance;
	
	/* Cannot used no-arg constructor since has private data fields
	 * Argument constructor must be invoked
	 * Super used to invoke superclass methods and constructors
	 * Default numbers 0 and 0 are used 
	 */
	
	public SavingsAccount() {
		super(0,0);
	}
	
// getter
	public double getSavings() {
		return savBalance;
	}
	
// setter
	public void setSavings(double savBalance) {
		this.savBalance = savBalance;
	}
	
// method saves initial balance
	public void initialBalance() {
		startingBalance = savBalance; 
	}
	
	
// method determines if savings is overdrawn
	public String overDrawn(double balance) {
		if(balance < 0) {
			savBalance = startingBalance; 
			return "\nInsufficient funds\n" 
					+ "Balance: $" + savBalance; 
		} 
		savBalance = balance;
		return "Savings balance: $" + balance;
	}

}
