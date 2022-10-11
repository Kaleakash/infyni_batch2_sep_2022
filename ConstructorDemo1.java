class Operation {
	int a, b,sum;		//a=0,b=0,sum=0
	Operation() {
		a=1;
		b=2;
	}
	Operation(int x, int y) {
		a=x;
		b=y;
	}
	void setValue(int x, int y) {
		a=x;
		b=y;
	}
	void add() {
		sum = a+b;
	}
	void display() {
		System.out.println("sum is "+sum);
	}
}
class ConstructorDemo1 {
	public static void main(String args[]) {
	Operation op1 = new Operation();					op1.display();
	Operation op2  =new Operation();		op2.add();		op2.display();
	Operation op3 = new Operation();		op3.add();		op3.display();
	Operation op4 = new Operation(10,20);		op4.add();		op4.display();
	Operation op5 = new Operation(100,200);	op5.add();		op5.display();
	Operation op6 = new Operation();		op6.setValue(11,22);	 op6.setValue(111,222); op6.setValue(1111,2222);	op6.add();	op6.display();
	}
}