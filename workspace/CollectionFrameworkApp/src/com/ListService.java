package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListService {
	List<String> names = new ArrayList<String>();
	
	public void storeNames(String name) {
		if(names.contains(name)) {
			System.out.println("Name must be unique");
		}else {
			names.add(name);
			System.out.println("Names added...");
		}
	}
	public void search(String name) {
		if(names.contains(name)) {
			System.out.println("Name is present");
		}else {
			System.out.println("Name not present");
		}
	}
	public void findNameUsingIndex(int index) {
		if(names.get(index)!=null) {
			System.out.println("Name is "+names.get(index));
		}
	}
	public void displayAllNames() {
		Iterator<String> li = names.iterator();
		while(li.hasNext()) {
			String name = li.next();
			System.out.println(name);
		}
	}
}





