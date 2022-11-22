package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterWiseOperation {

	public static void main(String[] args) throws Exception{
		// characterwise source : keyboard destination :console 
//		InputStreamReader isr = new InputStreamReader(System.in);
//		
//		BufferedReader br = new BufferedReader(isr);
//		System.out.println("Enter the name");
//		String name = br.readLine();
//		System.out.println("enter the id");
//		int id = Integer.parseInt(br.readLine());
//		
//		System.out.println("id is "+id);
//		System.out.println("name is "+name);
		
		// character wise source :keyboard destination : file 
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		System.out.println("Enter the data");
//		FileWriter fw = new  FileWriter("abcd.txt");
//		int ch;
//		while((ch = br.read())!= '\n') {
//			System.out.println((char)ch);
//			fw.write(ch);
//		}
//		fw.flush();
		// copy from one file to another file 
		FileReader fr = new FileReader("abcd.txt");
		FileWriter fw = new FileWriter("abcabc.txt");
		int ch;
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		fw.flush();
	}

}
