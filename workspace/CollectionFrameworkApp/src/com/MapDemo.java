package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	//Map mm = new HashMap();
		//Map mm = new LinkedHashMap();
		//Map mm = new TreeMap();
		Map mm = new Hashtable();
	mm.put(2, "Ravi");
	mm.put(4, "Mahesh");
	mm.put(1, "Kishor");
	mm.put(3, "Ram");
	//mm.put("Ajay", "Kumar");
	System.out.println(mm);
		mm.put(1, "Lokesh");		// it replace by new value. 
	mm.put(4, "Ram");
	System.out.println(mm);
	if(mm.containsKey(1)) {
		System.out.println("Key present");
	}else {
		System.out.println("Key not present");
	}
	System.out.println("Get Value "+mm.get(1));
	System.out.println("Get Value "+mm.get(10));
	}

}
