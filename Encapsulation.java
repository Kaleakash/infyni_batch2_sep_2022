class Employee {
	private int id;
	private String name;
	private float salary;
	/*void setValue(int id1, String name1, float salary1) {
		id = id1;
		name = name1;
		//salary = salary1;
		if( salary1<0 ) {
			salary = 8000;
		}else {
			salary = salary1;
		}
	}*/
	void setValue(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		if(salary<0) {
			this.salary = 8000;
		}else {
			this.salary = salary;
		}
	}
	void display() {
		System.out.println(" id is "+id);
		System.out.println(" name is "+name);
		System.out.println(" salary is "+salary);
	}
}
class Encapsulation {
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	//emp1.id = 100;
	//emp1.name = "Ravi";
	//emp1.salary = -12000;
	emp1.setValue(100,"Ravi",-12000);
	emp2.setValue(101,"Ramesh",10000);
	emp1.display();
	emp2.display();
	}
}