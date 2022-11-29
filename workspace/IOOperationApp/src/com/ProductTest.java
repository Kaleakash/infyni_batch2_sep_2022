package com;

public class ProductTest {

	public static void main(String[] args) {
	
		Product p1 = new Product();
		p1.setPid(100);
		p1.setPname("TV");
		p1.setPrice(58000);
		
		System.out.println("PId is "+p1.getPid());
		System.out.println("PName is "+p1.getPname());
		System.out.println("Price is "+p1.getPrice());
		
		Product p2 = new Product(101,"Computer",45000);
		
		System.out.println("PId is "+p2.getPid());
		System.out.println("PName is "+p2.getPname());
		System.out.println("Price is "+p2.getPrice());
		
		
		Product p3 = new Product(102, "Mobile", 86000);
		System.out.println(p3);	
	}

}
