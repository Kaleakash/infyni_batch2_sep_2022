package com;

class VoteException extends Exception {
	public VoteException() {
	
	}
	public VoteException(String str) {
		super(str);				// we need to pass this message to super class constructor 
	}
}
public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age=20;
		
		try {
		if(age<21) {
			//throw new Exception();	// throw generic exception 
			//throw new Exception("age must be > 21"); // throw generic with custom message 
			//throw new ArithmeticException();	// throwing specific exception 
			//throw new ArithmeticException("age must be > 21"); // pre defined exception with custom message 
			//throw new VoteException();	// custom exception empty constructor 
			throw new VoteException("age must be > 21");	// parameter constructor 
		}else {
			System.out.println("You can vote!");
		}
		}catch(Exception e) {
			System.out.println("Catch block "+e.toString());
		}
		
		System.out.println("Task Done!");
	}

}
