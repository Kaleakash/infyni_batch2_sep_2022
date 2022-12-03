package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetrieve {

	public static void main(String[] args) {
		int abc[]= {10,20,30,40};
	Set ss = new HashSet();
	ss.add(4); ss.add(2); ss.add(1); ss.add(5); ss.add(7); ss.add("Ravi"); ss.add(10.10);
	System.out.println(ss);
	System.out.println("for each loop");
	for(Object n :ss) {
		System.out.println(n);
	}
	for(int a:abc) {
		System.out.println(a);
	}
	System.out.println("Using iterator");
	Iterator li   = ss.iterator();
	while(li.hasNext()) {
		Object obj = li.next();		
		System.out.println(obj);
	}
	}

}
