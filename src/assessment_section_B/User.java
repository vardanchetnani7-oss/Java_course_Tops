package assessment_section_B;

public class User {
private String name;
private String upiId;
private double balance;

//Constructor for basic profile 

public User(String name,String upiId) {
	this.name = name;
	this.upiId = upiId;
	this.balance = 0.0;
}

//Overload constructor for premium profile
 public User (String name , String upiId ,double initialBalance) {
	 this.name = name;
	 this.upiId = upiId;
	 this.balance = initialBalance;
 }

 public double getBalance() {
	return balance;
 }

 public void setBalance(double balance) {
	if(balance>=0) {
		 this.balance = balance;
	}
	
 }

 public String getName() {
	return name;
 }

 public String getMaskedUpiId() {
	if(upiId == null || !upiId.contains("@"))
		return upiId;
	int atIndex = upiId.indexOf("@");
	char firstChar = upiId.charAt(0);
	char lastBeforeAt = upiId.charAt(atIndex - 1);
	String domain = upiId.substring(atIndex);
	
	return firstChar + "***" +lastBeforeAt +domain;
 }
 
 

}
