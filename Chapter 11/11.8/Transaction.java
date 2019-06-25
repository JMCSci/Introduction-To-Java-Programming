/* Transaction class
 */

package account;

import account.Account;

public class Transaction extends Account {
	private char type;								// type of transaction ('W' for withdrawal, 'D' for deposit)
	private double amount; 								// amount of this transaction
	private double balance;								// new balance after this transaction
	private String description;							// description of this transcription	
	
// argument constructor -- specified data
	Transaction(char type, double amount, double balance, String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		dateCreated();
	}
	
// getters
	public char getType() {
		return type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getNewBalance() {
		if(type == 'W') {
		return balance = balance - getAmount();
		} else if(type == 'D') {
			return balance = balance + getAmount();
		}
		return 0;	
	}

	public String getDescription() {
		return description;
	}
	
// setters
	public void setType(char newValue) {
		type = newValue;
	}
	
	public void setAmount(double newValue) {
		amount = newValue;
	}
	
	public void setNewBalance(double newValue) {
		balance = newValue;
	}
	
	public void setDescription(String newValue) {
		description = newValue;
	}
	
	@Override
	public String toString() {
		String x = "\nType: " + getType() + "\nAmount: $" + getAmount() + "\nBalance: $" + getNewBalance() +
				"\nDescription: " + getDescription() + "\nDate: " + dateCreated() + "\n";
		
		return x;
				
				
	}
	
}
