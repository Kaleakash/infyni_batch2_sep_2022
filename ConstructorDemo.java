class Abc {
	Abc() {
		System.out.println("Object created...");
	}

	void display() {
		System.out.println("display method");
	}

}
class ConstructorDemo {
	public static void main(String args[]) {
	Abc obj1 = new Abc();
	obj1.display();
	obj1.display();
	Abc obj2 = new Abc();
	obj2.display();
	obj2.display();
	obj2.display();
	}
}