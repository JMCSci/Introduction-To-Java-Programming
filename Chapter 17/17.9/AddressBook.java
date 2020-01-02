/* AddressBook class
 */

package addressbook;

import java.io.RandomAccessFile;
import java.io.IOException;

public class AddressBook extends Display {
	protected static byte[] nameByte = new byte [32];
	protected static byte[] streetByte = new byte [32];
	protected static byte[] cityByte = new byte [20];
	protected static byte[] stateByte = new byte [2];
	protected static byte[] zipByte = new byte [5];
	protected static String tempName;
	protected static String tempStreet;
	protected static String tempCity;
	protected static String tempState;
	protected static String tempZip;
	protected static int temp = 0;
	protected static int index = 0;
	protected static int sLength = 0;
	protected static int maxIndex = 0;
	RandomAccessFile inout = new RandomAccessFile("address.dat", "rw");
	
	AddressBook() throws Exception {
		// Displays first address in address book
		firstAddress();	
	}
	
	// Add Address
	// 91 bytes blocks
	public void addAddress() throws IOException{
		try {
			inout.seek(inout.length());
			// 32 characters
			inout.write(nameByte);
			// 32 characters
			inout.write(streetByte);
			// 20 characters
			inout.write(cityByte);
			// 2 characters
			inout.write(stateByte);
			// 5 characters
			inout.write(zipByte);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

	// First Address
	// FILL STRING WITH WHITESPACE
	public void firstAddress() throws Exception {
		try {
			// Find max index
			checkMax();
			inout.seek(0);
			inout.read(nameByte);
			inout.read(streetByte);
			inout.read(cityByte);
			inout.read(stateByte);
			inout.read(zipByte);
			
			tempName = new String(nameByte);
			tempStreet = new String(streetByte);
			tempCity = new String(cityByte);
			tempState = new String(stateByte);
			tempZip = new String(zipByte);
			tempName = new String(nameByte);
			index = 1;
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	// Next Address
	public void nextAddress() throws IOException, Exception {
		try {
			checkMax();
			inout.seek(index * 91);
			inout.read(nameByte);
			inout.read(streetByte);
			inout.read(cityByte);
			inout.read(stateByte);
			inout.read(zipByte);
			
			tempName = new String(nameByte);
			tempStreet = new String(streetByte);
			tempCity = new String(cityByte);
			tempState = new String(stateByte);
			tempZip = new String(zipByte);
			// If user is at last entry do not increase index, if not, increase by 1
			if(index == maxIndex) {
				return;
			} else {
				index++;
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	// Last Address
	public void lastAddress() throws Exception {
		try {
			checkMax();
			index = maxIndex;
			// If not entries, don't do anything
			if(index == 0) {
				return;
			} else {
				inout.seek(inout.length() - 91);
				inout.read(nameByte);
				inout.read(streetByte);
				inout.read(cityByte);
				inout.read(stateByte);
				inout.read(zipByte);
				
				tempName = new String(nameByte);
				tempStreet = new String(streetByte);
				tempCity = new String(cityByte);
				tempState = new String(stateByte);
				tempZip = new String(zipByte);
			}
			
		
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void previousAddress() throws Exception {
		try {
			checkMax();
			if(index == 0) {
				return;
			} else {
				// If at first entry, do not decrease index, it not, decrease by 1
				if(index == 1) {
					return;
				} else {
				index--;
				}
				inout.seek((index * 91) - 91);
				inout.seek(inout.getFilePointer());
				inout.read(nameByte);
				inout.read(streetByte);
				inout.read(cityByte);
				inout.read(stateByte);
				inout.read(zipByte);
				
				tempName = new String(nameByte);
				tempStreet = new String(streetByte);
				tempCity = new String(cityByte);
				tempState = new String(stateByte);
				tempZip = new String(zipByte);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// Updated Address
	public void updateAddress() throws Exception {
		try {
			inout.seek(inout.getFilePointer() - 91);
			inout.write(nameByte);
			inout.write(streetByte);
			inout.write(cityByte);
			inout.write(stateByte);
			inout.write(zipByte);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void checkMax() throws Exception {
		@SuppressWarnings("unused")
		long getIndex = 0;
		getIndex = (inout.length() - 91) / 91;
		maxIndex = (int) (inout.length() / 91);
	}
	
	
	/*** SETTERS ***/
	
	// setName: Adds whitespace to string to fill byte array
	public void setName(String newValue) {
		String wSpace = "";
		tempName = newValue;
		if(newValue.length() < 32) {
			sLength = 32;
			wSpace = Integer.toString(sLength);
			tempName = String.format("%-" + wSpace + "s", tempName);
		} else {
			tempName = newValue;
		}
		
	}
	
	// setStreet: Adds whitespace to string to fill byte array
	public void setStreet(String newValue) {
		String wSpace = "";
		tempStreet = newValue;
		if(newValue.length() < 32) {
			sLength = 32;
			wSpace = Integer.toString(sLength);
			tempStreet = String.format("%-" + wSpace + "s", tempStreet);
		} else {
			tempStreet = newValue;
		}
		
	}
	
	// setCity: Adds whitespace to string to fill byte array
	public void setCity(String newValue) {
		String wSpace = "";
		tempCity = newValue;
		if(newValue.length() < 20) {
			sLength = 20;
			wSpace = Integer.toString(sLength);
			tempCity = String.format("%-" + wSpace + "s", tempCity);
		} else {
			tempCity = newValue;
		}
		
	}
	
	// setState: Adds whitespace to string to fill byte array
	public void setState(String newValue) {
		String wSpace = "";
		tempState = newValue;
		if(newValue.length() < 2) {
			sLength = 2;
			wSpace = Integer.toString(sLength);
			tempState = String.format("%-" + wSpace + "s", tempState);
		} else {
			tempState = newValue;
		}
		
	}
	
	// setZip: Adds whitespace to string to fill byte array
	public void setZip(String newValue) {
		String wSpace = "";
		tempZip = newValue; 
		if(newValue.length() < 5) {
			sLength = 5;
			wSpace = Integer.toString(sLength);
			tempZip = String.format("%-" + wSpace + "s", tempZip);
		} else {
			tempZip = newValue; 
		}
		
	}
	
	public void setNameByte(byte[] newValue){
		nameByte = newValue;
	}

	public void setStreetByte(byte[] newValue){
		streetByte = newValue;
	}
	
	public void setCityByte(byte[] newValue){
		cityByte = newValue;
	}
	
	public void setStateByte(byte[] newValue){
		stateByte = newValue;
	}
	
	public void setZipByte(byte[] newValue){
		zipByte = newValue;	
	}
	
	
	/*** GETTERS ***/
	
	public String getName() {
		return tempName;
	}
	
	public String getStreet() {
		return tempStreet;
	}
	
	public String getCity() {
		return tempCity;
	}
	
	public String getState() {
		return tempState;
	}
	
	public String getZip() {
		return tempZip;
	}
	
	public byte [] getNameByte(){
		return nameByte;
	}
	
	public byte [] getStreetByte(){
		return streetByte;
	}
	
	public byte [] getCityByte(){
		return cityByte;
	}
	
	public byte [] getStateByte(){
		return stateByte;
	}
	
	public byte [] getZipByte(){
		return zipByte;
	}
	
}
