package com;

public class CheckeException {
	static void display() throws Exception{
		
		Thread.sleep(3000);
		
		System.out.println("We will start next topic");
	}
	
	public static void main(String[] args) throws Exception{
		display();
	}

}
