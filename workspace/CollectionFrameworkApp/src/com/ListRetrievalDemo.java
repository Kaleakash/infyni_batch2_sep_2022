package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListRetrievalDemo {

	public static void main(String[] args) {
	List ll = new ArrayList();
	ll.add(6); ll.add(5);ll.add(2);ll.add(10);
	//Collections.sort(ll);
	System.out.println("List Iterator - forward direction");
	ListIterator li = ll.listIterator();
	while(li.hasNext()) {
		Object obj = li.next();
		System.out.println(obj);
	}
	System.out.println("List Iterator - backward direction");
	while(li.hasPrevious()) {
		Object obj = li.previous();
		System.out.println(obj);
	}
	}

}
