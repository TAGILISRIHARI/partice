package com.pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperations 
{
	public void readFile() throws Exception
	{
		FileInputStream fr = new FileInputStream("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\file6.txt");
		int  a;
		
		while((a=fr.read())!=-1)
		{
			System.out.print((char)a);
		}
		fr.close();
	}
	
	public void writeFile1() throws Exception
	{
		System.out.println("Connection");
		FileOutputStream fw = new FileOutputStream("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\file6.txt");
		String  msg = "srihari  tagili fuck you";
		fw.write(msg.getBytes());
		fw.close();
	}
	
	public void copyFile() throws Exception
	{
		System.out.println("hi");
		FileInputStream fr = new FileInputStream("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\file6.txt");
		
		FileOutputStream fw = new FileOutputStream("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\file7.txt");
		
		int a;
		while((a=fr.read())!=-1)
		{
			fw.write(a);
		}
		System.out.println("hello");
		fr.close();
		fw.close();
		
	}
	public void writeFile2() throws Exception
	{
		System.out.println("Connection");
		FileOutputStream fw = new FileOutputStream("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\file4.txt");
		String  msg = "srihari  tagili fuck you";
		fw.write(msg.getBytes());
		fw.close();
	}
	
	public static void main(String[] args)  throws Exception
	{
	FileOperations object = new FileOperations();
//	object.readFile();
//	object.writeFile1();
	object.copyFile();
	
//	object.writeFile2();
	}
}

