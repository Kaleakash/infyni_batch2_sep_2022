class Abc {
	int a;			// instance variable 
	static int b;		// static variable 

	void dis1() {
		System.out.println("Non static method");
	}
	
	static void dis2() {
		System.out.println("Static method");
	}
}
class StaticDemo {
	public static void main(String args[]) {
	Abc obj1 = new Abc();
	obj1.a=100;
		Abc.b=200;
		obj1.b=300;

	obj1.dis1();
		Abc.dis2();
		obj1.dis2();
	}
}