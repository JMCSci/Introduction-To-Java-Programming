/* Chapter 12.4
 * Modify Loan class 
 * Throw IllegalArgumentException if loan amount, interest rate, or number of years is less than or equal to zero
 */

package illegalexception;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	/** Default constructor */
	public Loan() {
		annualInterestRate = 25; 
		numberOfYears = 1;
		loanAmount = 1000;
	}
	
	/** Construct a loan with a specified annual interest rate, 
	 * number of years, and amount
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if(annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
		try {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
		throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException ex) {
			System.out.println("Invalid input. Constructor argument cannot equal zero.");
		}
		
	  }
		
	}
	
	
	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/* Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears; 
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount; 
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
			(1 / Math.pow(1 + monthlyInterestRate,  numberOfYears * 12 )));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}

}
