package com.pack;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task 
{
	static Scanner sc = new Scanner(System.in);
	int teacherCount=1;
	int studentCount=1;
	
	final static String password = "TEACHER"; 
	
	public void method1() throws Exception
	{
		System.out.println("\nWellCome User\n"
				+ "-------------------------------------\n");
		System.out.println("Login As : \n"
				+ "1. Teacher\n"
				+ "2. Student\n"
				+ "3. Exit\n"
				+ "----------------------");
		
		System.out.println("Choose Your Option: ");
		int userOption=sc.nextInt();
		switch (userOption) 
		{
			case 1: 
				System.out.println("-------------------------");
				System.out.println("WellCome Teacher:");
				int count1= new Task().teacherCount;
				TeacherOptionsMethod(count1);
				break;
			case 2:
				System.out.println("----------------------");
				System.out.println("Enter Your Name: ");
				String UserName = sc.next().toUpperCase();
				int count2 = new Task().studentCount;
				StudentOptionsMethod(UserName,count2);
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Input");
				method1();
				break;
		}	
		
	}
	
	public void TeacherOptionsMethod(int count) throws Exception
	{
		
		System.out.println("Enter Your Password: ");
		String userPassword = sc.next();
		
		if(userPassword.equals(password))
		{
			System.out.println("\n1. Write Question\n"
							 + "2. Check Answers\n"
							 + "3. Goto Main\n"
							 + "4. Exit\n"
							 + "---------------------");
			System.out.println("Choose Your option: ");
			int userOption = sc.nextInt();
			switch(userOption)
			{
				case 1:
					questionsTakeMethod();
					break;
				case 2:
					displayQuestionAndAnswer();
					break;
				case 3:
					method1();
					break;
				case 4:
					System.out.println("Exit");
				default:
						System.out.println("Invalid Option");
						TeacherOptionsMethod(count);
					break;
			}
			
		}
		else
		{
			
			if(count<2)
			{
				count++;
				System.out.println("Invalid Password");
				TeacherOptionsMethod(count);
			}
			else 
			{
				method1();
			}
		}
	}
	
	public void questionsTakeMethod() throws Exception
	{
		System.out.println("Write Your Question: ");
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\java\\question.txt"));
		sc.nextLine();
		String question=sc.nextLine();
		bw.write(question);
		bw.close();
		method1();
	}
	
	public void StudentOptionsMethod(String UserName,int count) throws Exception
	{
		System.out.println("Wellcome "+UserName);
		System.out.println("Enter Password (your name in Capital):");
		String UserPassword = sc.next();
		if(UserName.equals(UserPassword))
		{
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\java\\question.txt"));
			int j;
			while( (j=br.read())!=-1 )
			{
				System.out.print((char)j);
			}
			br.close();
			questionCopyMethod();
			
		}
		else 
		{
			
			if(count < 2)
			{
				count++;
				System.out.println("Invalid Password");
				StudentOptionsMethod(UserName,count);
			}
			else
			{
				method1();
			}
			
			
		}
		
	}
	public void questionCopyMethod() throws Exception
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\java\\questionAndAnswer.txt",true));
		BufferedReader br = new BufferedReader(new FileReader("C:\\java\\question.txt"));

		int i;
		while( (i=br.read())!=-1)
		{
			bw.write(i);
		}
		bw.close();
		br.close();
		answerTakeMethod();
		
	}
	public void answerTakeMethod() throws Exception
	{
		System.out.println("\nEnter Your Answer: ");
		sc.nextLine();
		String answer = sc.nextLine();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\java\\questionAndAnswer.txt",true));
		bw.write(answer);
		bw.close();	
		method1();
		
	}
	
	public void displayQuestionAndAnswer() throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\java\\questionAndAnswer.txt"));
		int i;
		while( (i=br.read())!=-1 )
		{
			System.out.print((char)i);
		}
		br.close();
		method1();
		
	}
	
	public static void main(String[] args)  throws Exception
	{
		Task object = new Task();
		object.method1();
	}
}
