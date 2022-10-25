class A {
	A() {
			this(100);	
			System.out.println("A()");	
	}
	A(int x) {
			this(100,200);
			System.out.println("A(int)");	
	}
	A(int x, int y) {
			this("Ravi");
			System.out.println("A(int,int)");	
	}
	A(String str) {
		System.out.println("A(string)");
	}
}
class ThisParameter{
	public static void main(String args[]) {
	A obj1 = new A();
	//A obj2 = new A(100);
	//A obj3 = new A(100,200);
	}
}