package com.cust;

public class Customer {
String userName;
String crushName;
public Customer() {
	super();
	System.out.println("Customer object called");
}
@Override
public String toString() {
	return "Customer [userName=" + userName + ", crushName=" + crushName + "]";
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getCrushName() {
	return crushName;
}
public void setCrushName(String crushName) {
	this.crushName = crushName;
}
public Customer(String userName, String crushName) {
	super();
	this.userName = userName;
	this.crushName = crushName;
}

}
