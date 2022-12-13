package com;

import java.sql.*;
import java.util.Scanner;
public class DemoTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infi_batch2", "root", "root@123");
	System.out.println("Established the connection");
	Scanner sc = new Scanner(System.in);
	//Statement stmt = con.createStatement();
	
	// insert record using statement 
//		int temp = stmt.executeUpdate("insert into emp values(3,'Ajay',16000)");
//		if(temp>0) {
//			System.out.println("record inserted successfully");
//		}
	
		// Insert query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
//		System.err.println("Enter the id");
//		int id = sc.nextInt();
//			pstmt.setInt(1, id);
//		System.out.println("Enter the name");
//		String name = sc.next();
//			pstmt.setString(2, name);
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//			pstmt.setFloat(3, salary);
//		int temp = pstmt.executeUpdate();
//			if(temp>0) {
//				System.out.println("Record inserted ");
//			}
//		// delete query 
//		int temp = stmt.executeUpdate("delete from emp where id = 3");
//		if(temp>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		// delete query using PreparedStatement 
//	PreparedStatement pstmt = con.prepareStatement("delete from emp where id =?");
//	System.err.println("Enter the id");
//	int id = sc.nextInt();
//		pstmt.setInt(1, id);
//	
//	int temp = pstmt.executeUpdate();
//		if(temp>0) {
//			System.out.println("Record deleted successfully ");
//		}else {
//			System.out.println("Record not present");
//		}
		
//		// update query 
//			int temp = stmt.executeUpdate("update emp set salary = 34000 where id=2");
//			if(temp>0) {
//				System.out.println("Record updated successfully");
//			}else {
//				System.out.println("Record not present");
//			}
	// update query using preparedstatement 
//	PreparedStatement pstmt = con.prepareStatement("update emp set salary = ? where id = ?");
//	System.err.println("Enter the id");
//	int id = sc.nextInt();
//		pstmt.setInt(2, id);
//	System.out.println("Enter the saslary");
//	float salary = sc.nextFloat();
//	pstmt.setFloat(1, salary);
//	
//	int temp = pstmt.executeUpdate();
//		if(temp>0) {
//			System.out.println("Record updated successfully ");
//		}else {
//			System.out.println("Record not present");
//		}
//		ResultSet rs = stmt.executeQuery("select * from emp");
//		while(rs.next()) {
//			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//		}
		// query using PreparedStatement 
		PreparedStatement pstmt = con.prepareStatement("select * from emp where salary > ?");
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		pstmt.setFloat(1, salary);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
