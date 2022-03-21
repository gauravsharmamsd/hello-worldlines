package com.cust;

import java.util.Arrays;

public class RegistraionPOJO {
private String name;
private String userName;
private char[] password;
private String gender;

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
private String country;
public String[] getHobbies() {
	return hobbies;
}
public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}
private String[] hobbies;
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public char[] getPassword() {
	return password;
}
public void setPassword(char[] password) {
	this.password = password;
}
@Override
public String toString() {
	return "RegistraionPOJO [name=" + name + ", userName=" + userName + ", password=" + Arrays.toString(password)
			+ ", country=" + country + "]";
}
public RegistraionPOJO(String name, String userName, char[] password,String country) {
	super();
	this.name = name;
	this.country=country;
	this.userName = userName;
	this.password = password;
}
public RegistraionPOJO() {
	super();
	// TODO Auto-generated constructor stub
}

}
