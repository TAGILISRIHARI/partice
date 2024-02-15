package com.pack;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterFIleOperations 
{
	//Character Stream
	//For reading class FileReader - read() , returns int of ASCII values
	//For writing class FileWriter - write() , parameterized either int,String
			
	void fileRead() throws Exception
	{
		
		System.out.println("Reading file using Character Stream");
		FileReader fr = new FileReader("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\characterfile1.txt");
		int i ;
		System.out.println("Connection Established\n------------------------------\n");
		
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
		System.out.println("\n\n------------------------------------\nConnestion Terminated");
		
		
	}
	
	void fileWrite() throws Exception
	{
		System.out.println("Writig into a  file using Character Stream");	
		FileWriter fw  = new FileWriter("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\characterfile1.txt",true);
		System.out.println("Connection Established\n------------------------\n");
		String s = " Tagili Srihari";
		
		fw.write(s);
		
		fw.close();
		
		System.out.println("\n------------------------------\nConnection Closed");
	}
	void fileCopy() throws Exception
	
	{
		System.out.println("Copy one file content to another file");
		FileReader fr = new FileReader("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\characterfile1.txt");
		FileWriter fw  = new FileWriter("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\characterfile3.txt",true);
		System.out.println("Connection Opened\n--------------------------------\n");
		int i;
		while((i=fr.read())!=-1)
		{
			fw.write(i);
		}
		System.out.println("\n---------------------------------\nConnection");
		fr.close();
		fw.close();
		
	}
	
	void fileCopyMultiMedia() throws Exception
	{
		System.out.println("Copy one file content to another file");
		FileReader fr = new FileReader("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\tajmahal.jpeg");
		FileWriter fw  = new FileWriter("C:\\Users\\sriha\\OneDrive\\Desktop\\oops Test\\tajmahal1.jpeg",true);
		System.out.println("Connection Opened of multiMedia\n--------------------------------\n");
		int i;
		while((i=fr.read())!=-1)
		{
			fw.write(i);
		}
		System.out.println("\n---------------------------------\nConnection close of Multimedia");
		fr.close();
		fw.close();
		
	}

	public static void main(String[] args) throws Exception
	{
		CharacterFIleOperations object = new CharacterFIleOperations();
//		object.fileRead();
//		object.fileWrite();
//		object.fileCopy();
		object.fileCopyMultiMedia();
		
		
	}
}
