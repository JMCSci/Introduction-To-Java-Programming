/* Chapter 11.8
 * 
 */

package account;

public class TestAccount {
	public static void main(String[] args) {
		Account test1 = new Account("George", 1122, 1000); 
		test1.setInterestRate(1.5);
		test1.deposit(30);
		test1.deposit(40);
		test1.deposit(50);
		test1.withdraw(5);
		test1.withdraw(4);
		test1.withdraw(2);
		System.out.println(test1);
		
	}

}
