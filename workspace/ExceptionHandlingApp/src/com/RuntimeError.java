package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		System.out.println("hello");
		int abc[]= {100,200,300,400};
			try {
		int res = a/b;
			System.out.println("Result is "+res);
				int res1 = 100/abc[5];
				System.out.println("Result is "+res1);
			}catch(Exception e) {
				//System.out.println("I Take Care!");
				//System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("bye....");
	}

}
