package main;

import java.util.Iterator;
import java.util.List;

import bean.Employee;
import service.EmployeeService;

public class App {

	public static void main(String[] args) {
	EmployeeService es = new EmployeeService();
	
	Employee emp1 = new Employee(100, "Ravi", 12000);
	Employee emp2 = new Employee(100, "Ravi", 12000);
	Employee emp3 = new Employee(102, "Raju", 18000);
	Employee emp4 = new Employee(103, "Raju", 20000);
	String res = es.addEmployee(emp1);
	System.out.println(res);
	res= es.addEmployee(emp2);
	System.out.println(res);
	res= es.addEmployee(emp3);
	System.out.println(res);
	res = es.addEmployee(emp4);
	System.out.println(res);
	
	System.out.println("Number of records are "+es.numberOfRecord());
	
	System.out.println(es.findEmployeeInfo(1));
	System.out.println(es.findEmployeeInfo(103));
	System.out.println(es.deleteEmployeeInfo(100));
	System.out.println("Number of records are "+es.numberOfRecord());
	//System.out.println(es.deleteEmployeeInfoByName("Raju"));
	System.out.println("Number of records are "+es.numberOfRecord());
	List<Employee> listOfEmp = es.findAllEmployee();
	Iterator<Employee> li = listOfEmp.iterator();
	while(li.hasNext()) {
		Employee e = li.next();
		System.out.println(e);
	}
	}

}
