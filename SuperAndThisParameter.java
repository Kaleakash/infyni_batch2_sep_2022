abstract class Employee {
	private int id;
	private String name;
	private float salary;
	Employee() {
		id = 123;
		name = "Unknown";
		salary = 8000;					// we set these information with big logic. 
	}
	Employee(int id) {
		this();
		this.id = id;
			
	}	
	Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	Employee(int id, String name,float salary) {
		this(id,name);
		this.salary = salary;
	}
	void disEmp() {
		System.out.println("id is "+id);	
		System.out.println("name is "+name);	
		System.out.println("salary is "+salary);	
	}
}
class Manager extends Employee {
	private int numberOfEmp;
	Manager() {						// by default super() present it will call super class empty constructor 
		numberOfEmp =2;
	}
	Manager(int id) {
		super(id);				// calling super class with one parameter as id 
		numberOfEmp =2;
	}
	Manager(int id, String name) {
		super(id,name);			// calling super class with two parameter as id and name	
		numberOfEmp =2;
	}
	Manager(int id, String name,float salary) {
		super(id,name,salary);			// calling super class with three parameter id ,name and salary
		numberOfEmp =2;
	}
	Manager(int id, String name,float salary, int numberOfEmp) {
		super(id,name,salary);
		this.numberOfEmp = numberOfEmp;
	}
	void disMgr() {
		System.out.println("Number of emp "+numberOfEmp);
	}
}
class SuperAndThisParameter {
	public static void main(String args[]) {
				Manager mgr1 = new Manager();				mgr1.disEmp();			mgr1.disMgr();
				Manager mgr2 = new Manager(100);			mgr2.disEmp();			mgr2.disMgr();
	Manager mgr3 = new Manager(101,"Ajay");			mgr3.disEmp();			mgr3.disMgr();
	Manager mgr4 = new Manager(102,"Vijay",45000);			mgr4.disEmp();			mgr4.disMgr();
	Manager mgr5 = new Manager(103,"Mahesh",55000,10);			mgr5.disEmp();			mgr5.disMgr();
	}
}