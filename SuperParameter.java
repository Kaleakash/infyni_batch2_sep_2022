class A {
	A() {
		System.out.println("A()");
	}
	A(int x) {
		System.out.println("A(int)");
	}
}
class B extends A{
	B() {
		super(100);		
		System.out.println("B()");
	}

}
class SuperParameter{
	public static void main(String args[]) {
	B obj = new B();
	}
}