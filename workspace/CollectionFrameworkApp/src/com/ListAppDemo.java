package com;

import java.util.Scanner;

public class ListAppDemo {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	ListService ls = new ListService();
	String con =null;
	String name;
	int index;
	int ch;
		do {
			System.out.println("1:Add, 2:Search using value 3: Search using index 4: Display");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter the name");
			      name = sc.next();
			      ls.storeNames(name);
			      break;
			case 2:System.out.println("enter the name");
		      		name = sc.next();
		      		ls.search(name);
		      	  break;
			case 3 :System.out.println("Enter the index position ");
					index = sc.nextInt();
					ls.findNameUsingIndex(index);
					break;
			case 4 :System.out.println("Add namaes are");
			        ls.displayAllNames();
			        break;
			default :System.out.println("Wrong choice");
			         break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
		System.out.println("Thank you");
	}

}
