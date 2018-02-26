package com.mycode;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {	
		if(e1.empId != e2.empId){
			return e1.empId.compareTo(e2.empId);
		}else
		return e1.empName.compareTo(e2.empName);
	}
	
}