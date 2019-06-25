/* New Account class
 * Uses objects to store transactions
 * Should be used with Transaction class
 */ 


package account;

import java.util.Date;
import java.util.ArrayList;

// blueprint
public class Account {
	private int id;						// default (0)
	private double balance;				// default (0)
	private double annualInterestRate;	// stores current interest rate (default 0)
	private Date dateCreated;			// stores the date when account was created
	private String name;				// stores the name of the customer
	private ArrayList <Object> transactions = new ArrayList<>(); 
	
// constructor -- default account 
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		name = " ";
		dateCreated = null;
	}
	
// second constructor -- specified id and initial balance 
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
// third constructor -- specified name, id, and balance
	public Account(String name, int id, double balance) {
		this.name = name;
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
	
// name mutator (setter) method
	public void setName(String newValue) {
		name = newValue;
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
// Name accessor (getter) method
	public String getName() {
		return name;
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
// Transaction object uses balance variable from argument constructor
	void withdraw(double withdrawalAmount) {
		Transaction newWithdrawal = new Transaction('W', withdrawalAmount, balance, "Withdrawal"); 
		// add newWithdrawl object to ArrayList
		transactions.add(newWithdrawal);
		balance = balance - newWithdrawal.getAmount();
		
	}
// deposits specified amount into account	
// Transaction object uses balance variable from argument constructor
	void deposit(double depositAmount) {
		Transaction newDeposit = new Transaction('D', depositAmount, balance, "Deposit");
		// add newDeposit object to ArrayList
		transactions.add(newDeposit);
		balance = balance + newDeposit.getAmount();
	}
	
// override toString method with custom method
// prints Account details, calls overridden toString method in Transaction class
	@Override
		public String toString() {
		String x = "Account name: " + getName() + "\nInterest Rate: " + annualInterestRate() + "%" +  
				"\nBalance: " + getBalance() +  "\n" + transactions.toString();
		// removes brackets and comma from printed string (ArrayList)
		return x.replace("[" , " ").replace("]", " ").replace(",", " ");
			
		
		
	}


	
}
