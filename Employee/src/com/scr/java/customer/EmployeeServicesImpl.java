package com.scr.java.customer;

import java.util.ArrayList;
import java.util.List;


public class EmployeeServicesImpl implements EmployeeServices {
	List< Employee1> EmpList = new ArrayList< Employee1>();

	@Override
	public void addEmployee(Employee1 e) {
		if(e!=null){
			EmpList.add(e);
		}
		else{
			System.out.println("enter the employees correct values:");
		}
	}

	@Override
	public Employee1 getEmployee(int eId) {
		if(eId>0){
			for (Employee1 employee1 : EmpList) {
				if(employee1.geteId()==eId){
					return employee1;
				 }
			   }
				
			}
		
		return null;
	}

	@Override
	public Employee1 updateEmp(int eId) {
		if(eId>0){
			for (Employee1 employee1 : EmpList) {
				if(employee1!=null && employee1.geteId()==eId){
					employee1.seteName("anu");
					employee1.seteAdderess("surat");
					employee1.seteId(23);
					employee1.setSalary(23000);
					employee1.setGender(Gender.FEMALE);
					return employee1;
				}
			  }
			}
		
		return null;
	}

	@Override
	public boolean deleteEmp(int eId) {
	 Employee1 emp=getEmployee(eId);
	 for (Employee1 employee1 : EmpList) {
		if(employee1.equals(emp)){
			EmpList.remove(emp);
			System.out.println("\n Employee Data is Deleted sucessfully...");
			return true;
		}
	}
		return false;
	}

	@Override
	public List<Employee1> getallEmp() {
		return EmpList;
	}

	
	
}     

