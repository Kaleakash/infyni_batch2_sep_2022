package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		int abc[]= {10,20,30,40};
		String str  = "a10";
		try {
				int res1 = a/b;
				System.out.println("Result "+res1);
			int res2 = abc[2];
			System.out.println("Resutl is "+res2);
			System.out.println(str+10);
			System.out.println(Integer.parseInt(str)+10);
			System.out.println("No Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic "+e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index "+e.toString());
		}catch(Exception e) {
			System.out.println("All Exception "+e.toString());
		}
		System.out.println("Bye....");
		System.out.println("Bye....");
		System.out.println("Bye....");
	}

}
