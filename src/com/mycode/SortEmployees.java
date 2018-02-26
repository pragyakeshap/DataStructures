package com.mycode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortEmployees {
	
	public static void main(String[] args) {
		
		List<Employee> ll = new ArrayList<>();
		
		Employee e1 = new Employee(1, "Pragya", "Keshap");
		Employee e2 = new Employee(2, "Preeti", "Keshap");
		Employee e3 = new Employee(3, "Norah", "Keshap");
		Employee e4 = new Employee(2, "Akhil", "Keshap");
		Employee e5 = new Employee(3, "Test", "Keshap");
		
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
		ll.add(e5);
		
		Collections.sort(ll, new EmployeeComparator());
		
		Iterator<Employee> iter = ll.iterator();
		
		while(iter.hasNext()){
			Employee e = iter.next();
			System.out.println(e.toString());
		}
	}

}
