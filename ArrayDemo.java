class ArrayDemo {
	public static void main(String args[]) {
	
	int a=10;
	a=20;
	int abc[];
	int xyz[]={10,20,30,40,50,100,12,34,54,34,23,56,78,90,45,67,100,10,200,300,400};	
	System.out.println(a);
	//System.out.println(xyz);
	System.out.println(xyz[0]);
	System.out.println(xyz[1]);
	System.out.println(xyz[2]);
	System.out.println("Size of the array "+xyz.length);
	System.out.println("Retrieve the elements from array using loop");
	int searchNumber = 10;
	int flag = 0;
	for(int i=0 ; i<xyz.length ; i++){
		//System.out.println(xyz[i]);
		if(searchNumber ==xyz[i]){
			flag++;	
			//break;	
		}
	}
	
		if(flag>0){
			System.out.println("Element is present and it present number of times are "+flag);
		}else {
			System.out.println("Element not present");
		}
	}
}


