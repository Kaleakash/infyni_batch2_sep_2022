import java.util.Scanner;
class Employee {
	private int id;
	private String name;
	private float salary;
	Scanner obj = new Scanner(System.in);
	Address add = new Address();
	void readEmp() {
		System.out.println("Enter the id");	
		id = obj.nextInt();
		System.out.println("Enter the name");	
		name = obj.next();
		System.out.println("Enter the salary");	
		salary = obj.nextFloat();
	}
	void disEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class Manager extends Employee{
	int numberOfEmp;
	void readMgr() {
	System.out.println("Enter the number of employee working under manager");
	numberOfEmp = obj.nextInt();
		add.readAdd();
	}
	void disMgr() {
		System.out.println("Number of employee working under manager is "+numberOfEmp);
		add.disAdd();
	}
}
class Programmer extends Employee {
	String projectName;
	void readPrg() {
		System.out.println("Enter the project name");
		projectName  = obj.next();
		add.readAdd();
	}
	void disPrg() {
		System.out.println("Project name is "+projectName);
		add.disAdd();
	}
}
class Address {
	String city;
	String state;
	Scanner obj = new Scanner(System.in);
	void readAdd() {
		System.out.println("Enter the city");
		city = obj.next();
		System.out.println("Enter the state");
		state = obj.next();
	}
	void disAdd() {
		System.out.println("City is "+city);
		System.out.println("State is "+state);
	}
}
class InheritanceTest {
	public static void main(String args[]) {
	System.out.println("Enter the manager details");
	Manager mgr1 = new Manager();
			mgr1.readEmp();				// id,name,salary (code from employee class)
		mgr1.readMgr();					// numberOfEmp (code from manager) from manager class method we can calling address readAdd method. 
		mgr1.disEmp();	
		mgr1.disMgr();

	System.out.println("Enter programmer details");
	Programmer pr1 = new Programmer();
		pr1.readEmp();
		pr1.readPrg();
		
		pr1.disEmp();
		pr1.disPrg();
	}
}





