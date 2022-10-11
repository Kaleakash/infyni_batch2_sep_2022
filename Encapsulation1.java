class Employee {
	private int id;
	private String name;
	private float salary;
	
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		if(salary<0) {
			this.salary = 8000;
		}else {
			this.salary = salary;
		}
	}
	void setSalary(float salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println(" id is "+id);
		System.out.println(" name is "+name);
		System.out.println(" salary is "+salary);
	}
}
class Encapsulation1 {
	public static void main(String args[]) {
	Employee emp1 = new Employee(1,"Ravi",-12000);
	Employee emp2 = new Employee(2,"Ramesh",14000);
	emp1.display();
	emp2.display();
	emp1.setSalary(15000);
	emp1.display();
	emp2.display();
	}
}