package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(100);			// it is use to add 
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println("Remove "+ss.pop()); // it is use to remove top most element 
		System.out.println(ss);
		System.out.println("check top most element "+ss.peek());// it will display top most element 
		System.out.println(ss);
		System.out.println("search "+ss.search(500));	// if not present it return -1
		System.out.println("search "+ss.search(100));	// if present return position 
		System.out.println(ss);
	}

}
