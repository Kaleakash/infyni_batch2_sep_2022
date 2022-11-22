package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseOperation1 {

	public static void main(String[] args) throws Exception{
		// source :keyword and destination : console or monitor 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		
//		ps.println("Enter the name");
//		//System.out.println("Enter the name");
//		String name = dis.readLine();
//		System.out.println("name is "+name);
		
		// source : keyboard and destination : file 
//		DataInputStream dis = new DataInputStream(System.in);
//		//FileOutputStream fos = new FileOutputStream("abc.txt");// it override the data 
//		FileOutputStream fos = new FileOutputStream("abc.txt",true); // it append the data 
//		System.out.println("Enter the data ");
//		int ch;
//		while((ch= dis.read())!= '\n') {
//				//System.out.print(ch);
//				fos.write(ch);		// auto conversion happen of unicode 
//		}
//		fos.close();
		
		// source : file destination : file 
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Maven Plugins.txt");
//		//FileOutputStream fos = new FileOutputStream("sample.txt");
//		FileOutputStream fos = new FileOutputStream("sample.docx");
//		int ch;
//		while((ch = fis.read()) != -1) {		// EOF in Java is -1 
//			fos.write(ch);
//			//System.out.print(ch);			// it display in uni code format 
//			System.out.print((char)ch);		// type casting to convert uni code in character format. 
//		}
//		fis.close();
//		fos.close();
//		System.out.println("File copied operation");
		
// source : file destination : file with buffer 
		
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Maven Plugins.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		//FileOutputStream fos = new FileOutputStream("sample.txt");
		FileOutputStream fos = new FileOutputStream("info.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		while((ch = bis.read()) != -1) {		// EOF in Java is -1 
			bos.write(ch);
			//System.out.print(ch);			// it display in uni code format 
			//System.out.print((char)ch);		// type casting to convert uni code in character format. 
		}
		
		bos.flush();
		System.out.println("File copied operation");
	}

}
