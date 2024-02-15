package com.pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//import javax.annotation.processing.AbstractProcessor;

public class BufferedStream 
{
	static Scanner sc = new Scanner(System.in);
	void method1() throws Exception
	{ 
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\java\\example1.txt"));
		System.out.println("Enter: ");
//		sc.nextLine();
		String s = sc.nextLine();
		bw1.write(s);
		bw1.close();
		method2();
	}
	void method2() throws Exception
	{
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\java\\example1.txt"));		
		int i;
		while((i=br1.read())!=-1)
		{
			System.out.print((char)i);
		}
		br1.close();
	}
	
	public static void main(String[] args) throws Exception
	{
		BufferedStream aobj =new BufferedStream();
		aobj.method1();
	}

}
