package com.scr.java.customer;

import java.util.Arrays;
import java.util.Scanner;

public class MainEmpSerices {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Adderess Pune= new Adderess(410038,"Pune");
		Adderess Mumbai=new Adderess(400002,"Mumbai");
		Adderess Surat=new Adderess(395003, "surat");
		Adderess Solapur=new Adderess(395003, "solapur");
		
		
		Employee1 e1=new Employee1(21, "Akash", "solapur", 40000, Gender.MALE);
		Employee1 e2=new Employee1(22, "Akashya", "surat", 50000, Gender.FEMALE);
		Employee1 e3=new Employee1(23, "Aslam", "pune", 45000, Gender.MALE);
		Employee1 e4=new Employee1(24, "Aanad", "Mumbai", 40000, Gender.MALE);
		Employee1 e5=new Employee1(25, "Rajesh", "surat", 40000, Gender.MALE);
		Employee1 e6=new Employee1(26, "Rakesh", "solapur", 40000, Gender.MALE);
		Employee1 e7=new Employee1(27, "Harsh", "pune", 68000, Gender.MALE);
		Employee1 e8=new Employee1(28, "sunil", "mumbai", 65000, Gender.MALE);
		Employee1 e9=new Employee1(29, "Anil", "solapur", 50000, Gender.MALE);
		Employee1 e10=new Employee1(30, "Namrata", "pune", 60000, Gender.FEMALE);
		
		EmployeeServices services=new EmployeeServicesImpl();
		
		services.addEmployee(e1);
		services.addEmployee(e2);
		services.addEmployee(e3);
		services.addEmployee(e4);
		services.addEmployee(e5);
		services.addEmployee(e6);
		services.addEmployee(e7);
		services.addEmployee(e8);
		services.addEmployee(e9);
		services.addEmployee(e10);
		
	
		System.out.println(services.getallEmp());
		System.out.println(services.getEmployee(23));
 
		System.out.println("\n Before Delete...");
		System.out.println(services.getallEmp());
		
	            services.deleteEmp(21);
	    System.out.println("\n after deleted....");  
	    System.out.println(services.getallEmp());
		
	    System.out.println("\n Before updated...");
		System.out.println(services.getallEmp());
		services.updateEmp(23);
		System.out.println("\n after Updated...");
		System.out.println(services.getallEmp());
	    
	}
}