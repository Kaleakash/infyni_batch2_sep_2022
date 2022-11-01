package com;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int a=100/1;
			System.out.println("No Exception");
		} catch (Exception e) {
			System.out.println("Catch block "+e.toString());
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Normal Statement");
	}

}
