package com;

public class StringDemoApp {

	public static void main(String[] args) {
//		String str1 = "Welcome to Java Training";
//		String str2 = new String("Welcome to Java Trianing");
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.length());
//		System.out.println(str2.length());
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.substring(5));
//		System.out.println(str1.substring(5, 10));
//		System.out.println(str1.indexOf('e'));
//		System.out.println(str1.charAt(1));
//		System.out.println(str1.contains("Java"));
//		System.out.println(str1.contains("Python"));
//		System.out.println(str1.replace("Java", "Python"));
//				String name1 = "RAJ";
//				String name2 = "Raj";
//		String name3 = new String("Raj");
//		String name4 = new String("Raj");
//		// equals() and equalsIgnore case 
//		if(name3.equalsIgnoreCase(name1)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not equal");
//		}
		String str = "Raj";
		System.out.println(str);
				System.out.println(str.toUpperCase());		// new memory created and converted to upper 
				System.out.println(str.concat("Deep"));
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
			System.out.println(sb.append("Deep"));
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
