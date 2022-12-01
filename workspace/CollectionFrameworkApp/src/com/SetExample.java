package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
	//HashSet hs = new HashSet();
	//LinkedHashSet hs = new LinkedHashSet();
		TreeSet hs = new TreeSet();
	System.out.println("size "+hs.size());
	System.out.println("empty "+hs.isEmpty());
	hs.add(20.10);
	hs.add(10.34);
	hs.add(10.20);
	hs.add(50.11);
	hs.add(60.18);
	hs.add(60.20);
	hs.add(90.00);
	hs.add(40.00);
	System.out.println(hs);
	System.out.println("Adding "+hs.add(30.00));
	System.out.println("Adding "+hs.add(20.12));
	System.out.println(hs);
	System.out.println("Search "+hs.contains(30.00));
	System.out.println("Search "+hs.contains(70.00));
	hs.remove(30.00);
	System.out.println(hs);
	}

}
