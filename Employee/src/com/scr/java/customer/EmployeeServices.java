package com.scr.java.customer;

import java.util.List;

public interface EmployeeServices {
	
	
	public void addEmployee(Employee1 e);
	public Employee1 getEmployee(int eId);
    public Employee1 updateEmp(int eId);
    public boolean deleteEmp(int eId);
    public List<Employee1>getallEmp();
}
