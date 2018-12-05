package com.scr.java.customer;

public class Adderess {
private double pinCode;
private String city;
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "\n Adderess [pinCode=" + pinCode + ", city=" + city + "]";
}
/**
 * @return the pinCode
 */
public double getPinCode() {
	return pinCode;
}
/**
 * @param pinCode the pinCode to set
 */
public void setPinCode(double pinCode) {
	this.pinCode = pinCode;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @param pinCode
 * @param city
 */
public Adderess(double pinCode, String city) {
	super();
	this.pinCode = pinCode;
	this.city = city;
}

}