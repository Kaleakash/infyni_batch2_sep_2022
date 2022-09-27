class SwitchStatement {
	public static void main(String args[]) {
	int choice = 5;
	switch(choice) {
	case 1:   System.out.println("First block");
			System.out.println("First block finish");
			break;
	case 2: System.out.println("Second block");
			System.out.println("Second block finish");
			break;
	case 3: System.out.println("Third block");
			System.out.println("Third block finish");
			break;
	default : System.out.println("Wrong choice");
			break;
	}
	System.out.println("Finish");
	}
}