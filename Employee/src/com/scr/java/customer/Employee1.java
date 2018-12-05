package com.scr.java.customer;

public class Employee1 {
private int eId;
private String eName;
private String eAdderess;
private double salary;
private Gender gender;
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "\n emp [eId=" + eId + ", eName=" + eName + ", eAdderess=" + eAdderess + ", salary=" + salary + ", gender="
			+ gender + "]";
}
/**
 * @param eId
 * @param eName
 * @param eAdderess
 * @param salary
 * @param gender
 */
public Employee1(int eId, String eName, String eAdderess, double salary, Gender gender) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.eAdderess = eAdderess;
	this.salary = salary;
	this.gender = gender;
}
/**
 * @return the eId
 */
public int geteId() {
	return eId;
}
/**
 * @param eId the eId to set
 */
public void seteId(int eId) {
	this.eId = eId;
}
/**
 * @return the eName
 */
public String geteName() {
	return eName;
}
/**
 * @param eName the eName to set
 */
public void seteName(String eName) {
	this.eName = eName;
}
/**
 * @return the eAdderess
 */
public String geteAdderess() {
	return eAdderess;
}
/**
 * @param eAdderess the eAdderess to set
 */
public void seteAdderess(String eAdderess) {
	this.eAdderess = eAdderess;
}
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
/**
 * @return the gender
 */
public Gender getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(Gender gender) {
	this.gender = gender;
}



}
enum Gender{
	FEMALE,
	MALE
}