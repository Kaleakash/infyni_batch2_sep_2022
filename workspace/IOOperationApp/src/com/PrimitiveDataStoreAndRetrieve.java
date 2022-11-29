package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveDataStoreAndRetrieve {

	public static void main(String[] args) throws Exception{
	// store primitive infirmation 
//		int id=100;
//		String name = "Ravi Kumar";
//		float salary = 25000;
//		boolean res = true;
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.writeBoolean(res);
//		System.out.println("Employee details stored in file");
//		
		// read primitive data from file 
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id = dis.readInt();
		String name = dis.readUTF();
		float salary = dis.readFloat();
		boolean result = dis.readBoolean();
		System.out.println("Id is "+id);
		System.out.println("name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("Result s "+result);
	}

}
