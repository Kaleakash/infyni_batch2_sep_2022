class Abc {
	int a;			
	static int b;		

	void dis1() {
		System.out.println("Non static method");
		System.out.println(" a "+a);
		System.out.println(" b "+b);
	}
	
	
}
class StaticDemo1 {
	public static void main(String args[]) {
			Abc obj1 = new Abc();
			Abc obj2 = new Abc();
			obj1.a=10;
			Abc.b=20;
			obj1.b=30;
			obj2.a=40;
			Abc.b=50;
			obj2.b=60;
			obj1.dis1();				// a = 	10	b=60
			obj2.dis1();				// a	=	40	b =60 
	}
}