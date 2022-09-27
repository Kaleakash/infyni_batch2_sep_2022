import java.util.*;
class InputValue {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	/*System.out.println("Enter the value of a");
	int a = sc.nextInt();
	System.out.println("Enter the value of b");
	int b = sc.nextInt();
	int sum = a+b;
	System.out.println("Sum is "+sum);*/
	//System.out.println("Value of a is "+a);

	int choice,a,b,sum,sub;
	System.out.println("1:Add 2:Sub");
	System.out.println("Plz enter your choice");
	choice = sc.nextInt();
	switch(choice) {
	case 1: System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		sum = a+b;
		System.out.println("Sum of two number is "+sum);
		break;
	case 2: System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		sub = a-b;
		System.out.println("Sub of two number is "+sub);
		break;
	default : System.out.println("Wrong choice");
		break;
	}
	System.out.println("Finish");
	}
}




