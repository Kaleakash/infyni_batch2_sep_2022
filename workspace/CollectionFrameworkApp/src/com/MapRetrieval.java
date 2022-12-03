package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrieval {

	public static void main(String[] args) {
		Map mm = new HashMap();
		mm.put(2, "Ravi");
		mm.put(1, "Raju");
		mm.put(3, "Ramesh");
		mm.put(4, "Lokesh");
		Set ss = mm.entrySet();		// converting map to set 
		//Set ss = mm.keySet();
		Iterator li = ss.iterator();
		while(li.hasNext()) {
			Object obj = li.next();
			System.out.println(obj);
			//System.out.println(obj+" "+mm.get(obj));
		}
	}

}
