class IfElseIfStatement {
	public static void main(String args[]) {
	int m1=70, m2=90,m3=50;
	int total = m1+m2+m3;
	int avg = total/3;
	if(avg>90) {
		System.out.println("A++ Grade");
	}else if(avg>75) {
		System.out.println("A Grade");
	}else if(avg >65){
		System.out.println("B Grade");
	}else {
		System.out.println("C Grade");
	}
	System.out.println("Thank You!");
	}
}