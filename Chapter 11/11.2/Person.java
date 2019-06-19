/* Person class
 * Person has a name, address, phone number and email address 
 */

package person;

public class Person {
	private String name;
	private String address;
	private String phNumber;
	private String email;
	
// no-arg constructor	
	Person() {
		name = null;
		address = null;
		phNumber = null;
		email = null;
	}
	
// argument constructor 
	Person(String name, String address, String phNumber, String email){
		this.name = name;
		this.address = address;
		this.phNumber = phNumber;
		this.email = email;
	}
	
// getters
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
// setters
	public void setName(String newValue) {
		name = newValue;
	}
	
	public void setAddress(String newValue) {
		address = newValue;
	}
	
	public void setPhoneNumber(String newValue) {
		phNumber = newValue;
	}
	
	public void setEmail(String newValue) {
		email = newValue;
	}
	
// toString method
	public String toString() {
		return "Class name: Person, " + "Person's name: " + getName() + ", Address: " + getAddress() + 
				", Phone Number: " + getPhoneNumber() + ", Email: " + getEmail(); 
	}
	

}
