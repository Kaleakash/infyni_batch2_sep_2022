package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Employee;

public class EmployeeService {
List<Employee> listOfEmp = new ArrayList<Employee>();

	public String addEmployee(Employee emp) {
		int flag = 0;		
				if(listOfEmp.size()==0) {
					listOfEmp.add(emp);
					return "Employee added successfully";	
				}else {
					
					Iterator<Employee> li = listOfEmp.iterator();
					while(li.hasNext()) {
						Employee e = li.next();
						if(e.getId()==emp.getId()) {
								flag++;
								break;
						}
					}
				}
				if(flag==0) {
					listOfEmp.add(emp);
					return "Employee added successfully";
				}else {
					return "Employee id must be unique";
				}
	}
	
	public int numberOfRecord() {
		return listOfEmp.size();
	}
	
	public String findEmployeeInfo(int id) {
		int flag = 0;
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee e = li.next();
			if(e.getId()==id) {
					flag++;
					return e.toString();
			}
		}
		if(flag==0) {
			return "Record not present";
		}else {
			return null;
		}
	}
	
	public String deleteEmployeeInfo(int id) {
		int flag = 0;
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee e = li.next();
			if(e.getId()==id) {
					flag++;
						li.remove();
					break;
			}
		}
		if(flag==0) {
			return "Record not present";
		}else {
			return "Record deleted successfully";
		}
	}
	
	public String deleteEmployeeInfoByName(String name) {
		int flag = 0;
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee e = li.next();
			if(e.getName().equals(name)) {
					flag++;
						li.remove();
						break;
			}
		}
		if(flag==0) {
			return "Record not present";
		}else {
			return "Record deleted successfully";
		}
	}
	
	public List<Employee> findAllEmployee() {
		return listOfEmp;
	}
}
