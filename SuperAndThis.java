class A {
	int n=10;
}
class B extends A {
	int n=20;
	void dis1() {
		int n=30;
		System.out.println(" local variable n "+n);			// local variable 
		System.out.println(" Instance variable n "+this.n);	// instance variable 
		System.out.println(" Super class variable n "+super.n);	// super class variable 
	}
}
class SuperAndThis {
	public static void main(String args[]) {
	B obj = new B();
	obj.dis1();
	}
}