/* Account class simulates bank account transactions */

package account;

import java.util.Date;

// blueprint
public class Account {
	private int id;						// default (0)
	private double balance;				// default (0)
	private double annualInterestRate;	// stores current interest rate (default 0)
	private Date dateCreated;			// stores the date when account was created

// constructor -- default account 
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = null;
	}
	
// second constructor -- specified id and initial balance 
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
// accessor (getter) method
	public int getId() {
		return id;
	}
// id mutator (setter) method	
	public void setId(int newValue) {
		id = newValue;
	}
// balance accessor (getter) method	
	public double getBalance() {
		return balance;
	}
// balance mutator (setter) method	
	public void setBalance(double newValue) {
		balance = newValue;
	}
// annualInterestRate (getter) method	
	public double annualInterestRate() {
		return annualInterestRate;
	}
// annualInterestRate mutator (setter) method
	public void setInterestRate(double newValue) {
		annualInterestRate = newValue;
	}
// Date accessor (getter)
	public Date dateCreated() {
		Date date = new Date();
		dateCreated = date;
		return dateCreated;
	}
	
// method returns monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
// method returns monthly interest
	public double getMonthlyInterest(double monthlyInterestRate) {
		return balance * monthlyInterestRate;
	}
// method withdraws specified amount from account 
	void withdraw() {
		balance = balance - 2500;
		
	}
// deposits specified amount into account	
	void deposit() {
		balance = balance + 3000;
	}
	
}
