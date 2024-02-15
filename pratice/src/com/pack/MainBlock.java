package com.pack;

import java.util.Scanner;

public class MainBlock 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int balance=300;
		System.out.println("Enter the amount to withdraw: ");
		int withdraw = sc.nextInt();
		
		try 
		{
			if(withdraw>balance)
			{
				throw new PrintMsg("Insufficent funds  ! Your current balance is "+balance);
			}
			else
			{
				balance=balance-withdraw;
				System.out.println("Please Collect Cash :"+withdraw);
			}
		} 
		catch (PrintMsg e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally 
		{
			sc.close();
			
		}
		
	}

}
