class Operation {
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}	
	void add(double x, double y) {
		System.out.println(x+y);
	}
	void add(String x, String y) {
		System.out.println(x+y);
	}
}
class MethodOverloading{
	public static void main(String args[]) {
	Operation op = new Operation();
	op.add(1,2,3);
	op.add(1,2);
	op.add(10.10,20.20);
	op.add("10","20");
	}
}