package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection without generics 
//	List ll = new ArrayList();
//	ll.add(10);
//	ll.add(10.10);
//	ll.add("Ravi");
//	
//	Object obj = ll.get(2);
//	int n = (int)obj;
//	System.out.println(n);
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);   // auto-boxing : converting primitive to object 
		ll.add(20);
		ll.add(30);
		
		int n = ll.get(2);  // auto-unboxing : converting object to primitive 
		System.out.println(n);
	}

}
