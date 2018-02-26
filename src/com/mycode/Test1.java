package com.mycode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	
	MyLinkedList list1 = new MyLinkedList(5);
	
	

	public static void main(String[] args) {
		//list1.
		
		Map<String, String> ma = new HashMap<>();
		ma.put("abc", "def");
		ma.put("x", "y");
		
		Set<Entry<String, String>> entry =  ma.entrySet();
		entry.toArray();
	}

}
