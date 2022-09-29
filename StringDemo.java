import java.util.*;
class StringDemo {
	public static void main(String args[]) {
	/*String name = "Raj Deep";
	String msg = "Welcome to Java Training";
	System.out.println(name);
	System.out.println(msg);
	Scanner obj = new Scanner(System.in);
	System.out.println("Plz enter your name");
	//String fname = obj.next();	// it is use to scan the value through keyword, only one word. 
	String fname = obj.nextLine(); // more than one word till hit enter key
	System.out.println("your name is "+fname);*/
	Scanner obj = new Scanner(System.in);
	System.out.println("How many names do you want to store");
	int n = obj.nextInt();
	String names[]=new String[n];
	System.out.println("Enter the names one by one");
	for(int i=0;i<n;i++){
		names[i]=obj.next();
	}
	System.out.println("All names are");
	for(int i=0;i<n;i++) {
		System.out.println(names[i]);
	}
	}
}