import java.util.*;
class ArrayMemoryCreation {
	public static void main(String args[]) {
	/*int abc[]={100,200,300,400};
	int num[]=new int[10];
	System.out.println("Size of array is "+num.length);
	System.out.println("Size of array is "+abc.length);	
	System.out.println("Value in zero index position "+num[0]);
	System.out.println("Value in 2 index position "+num[2]);
	System.out.println("Value in 9 index position "+num[9]);
	//System.out.println("Value in 10 index position "+num[10]);
	num[0]=100;
	num[1]=200;
	System.out.println(num[0]);
	System.out.println(num[1]);*/
	
	Scanner obj = new Scanner(System.in);
	System.out.println("How many number do you want store");
		int n = obj.nextInt();
	int num[]=new int[n];	
	System.out.println("Plz enter number one by one");
	for(int i=0;i<num.length;i++) {
		num[i]=obj.nextInt();
	}
	int sum=0;
	System.out.println("All elements are ");
	for(int i=0;i<num.length;i++) {
		//System.out.println(num[i]);
		sum  = sum + num[i];		// sum = 0+1, sum = 1+10
	}
	System.out.println("Sum of all numbers are "+sum);
	}
}


