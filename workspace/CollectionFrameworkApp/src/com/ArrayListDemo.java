package com;

import java.util.ArrayList;
class A {}
class B {}
public class ArrayListDemo {

	public static void main(String[] args) {
//	ArrayList al = new ArrayList();
//	System.out.println("Size "+al.size());
//	al.add(10);		// auto-boxing : converting primitive to object. 
//	al.add(10.10);
//	al.add("Ravi");
//	al.add(true);
//	A obj1 = new A();
//	B obj2 = new B();
//	al.add(obj1);
//	al.add(obj2);
//	System.out.println("Size "+al.size());
	
	ArrayList al = new ArrayList();
	ArrayList al1 = new ArrayList();
	al1.add(100);  
	al1.add(200);
	al1.add(400);
	System.out.println("Size "+al.size());
	System.out.println("Empty "+al.isEmpty());
	al.add(6);
	al.add(2);
	al.add(8);
	al.add(1);
	al.add(7);
	//al.add(al1);
	al.add(1, 1010);		// added 1010 element in 1 index position 
	System.out.println("Size "+al.size());
	System.out.println("Empty "+al.isEmpty());
	System.out.println(al);    // it display in string format
	System.out.println("1st index position "+al.get(1));
	System.out.println("2nd index posistion "+al.get(2));
	al.remove(1);		//remove element using index position 
	Object obj = 8;
	al.remove(obj);		// it remove using value 
	System.out.println(al);
	System.out.println("Search "+al.contains(7));	// search if present return true 
	System.out.println("Search "+al.contains(100));	// search if not present false. 
	}

}
