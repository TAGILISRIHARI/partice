package com.pack;
import java.util.Scanner;

public class ThrowException 
{
	static int balance=3000;
	public void method1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw : ");
		int withdrawAmount = sc.nextInt();
		if(withdrawAmount > balance)
		{
			throw new ArithmeticException("insuffient funds");
		}
		else {
			System.out.println("take amount of "+withdrawAmount);
			balance=balance-withdrawAmount;
		}
		System.out.println("Balance Amount: "+balance);
		sc.close();
		
	}
	public static void main(String[] args) 
	{
		ThrowException object = new ThrowException();
		object.method1();
		
	}

}
