/* Chapter 11.3
 * TestSubAccount creates objects for CheckingAccount and SavingsAccount
 * Utilizes methods from Account class
 */

package subAccount;

public class TestSubAccount {

	public static void main(String[] args) {
		CheckingAccount checking = new CheckingAccount();
		SavingsAccount savings = new SavingsAccount();
		
		// gets the current checking account balance
		System.out.printf("Checking balance: $%.2f\n", checking.getBalance());
		// sets the checking account balance -- deposit $100
		checking.setChecking(checking.deposit(100));
		// withdraw method in Account class used
		// balance returned and used as parameter in overDrawn
		// withdraw $150
		System.out.println(checking.overDrawn(checking.withdraw(150)));
		// sets the savings account balance -- deposit $200
		savings.setSavings(savings.deposit(200));
		// saves initial balance in Savings class before withdrawal
		savings.initialBalance();
		// withdraw method in Account class used
		// balance returned and used as parameter in overDrawn
		// withdraw $10
		System.out.println(savings.overDrawn(savings.withdraw(10)));

	}

}
