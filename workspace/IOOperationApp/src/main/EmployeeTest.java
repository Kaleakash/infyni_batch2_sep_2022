package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//		Employee emp1= new Employee(100, "Raj", 15000);
//		
//		System.out.println("id is "+emp1.getId());
//		System.out.println("name is "+emp1.getName());
//		System.out.println("salary is "+emp1.getSalary());
//		
//		//Store the object in file 
//		FileOutputStream fos = new FileOutputStream("employee.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp1);
//		System.out.println("Object serialization done successfully...");
		
		// Object De-Serialization 
		
		FileInputStream fis = new FileInputStream("employee.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj	= ois.readObject();

		Employee emp2 = (Employee)obj;			// down level type casting. 
		System.out.println("id is "+emp2.getId()+"Name is "+emp2.getName()+"Salary "+emp2.getSalary());
		
		System.out.println("Object De-Serialization done successfully");
	}

}
