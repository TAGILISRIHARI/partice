	package com.pack;

import java.util.Scanner;

public class UserdefinedException 
{
	static double current_balance = 100;
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw: ");
		int n= sc.nextInt();
		try 
		{
			if(current_balance<n)
			{
				throw new MinimumAccountBalance("Insuffient Funds...! : "+current_balance);  
			}
			else {
				System.out.println("Collect cash :  "+n);
			}
			
		} 
		catch (MinimumAccountBalance e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		
		}
		finally {
			sc.close();
		}
		
	}
}
