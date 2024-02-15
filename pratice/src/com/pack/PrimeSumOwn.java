package com.pack;

import java.util.Arrays;
import java.util.Scanner;
public class PrimeSumOwn 
{
	static int number=999;
	Scanner sc = new Scanner(System.in);
	
	public void pairSum(int []arr)
	{
//		System.out.println(Arrays.toString(arr));
		boolean flag = false;
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				
				if(arr[i]+arr[j]==number) 
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+number);
					flag=true;
				}
//				 System.out.println(a+" "+b);
			}
		}
		
		if(!flag)
			System.out.println(number+" cannot be sum off prime numbers");
	}
	
	public void getArrayPrime()
	{
		int arr[] = new int[number];
		int index=0;
		for(int i=2 ;i<=number ;i++)
		{
			if(checkPrime(i))
			{
				arr[index]=i;
				index++;
			}
		}
	
		int arr2[]= new int[index];
		for(int i=0; i<index ; i++)
		{
		arr2[i]=arr[i];	
		}
//		System.out.println(Arrays.toString(arr2));
		pairSum(arr2);
	}
	
	
	public boolean checkPrime(int num)
	{
		boolean isPrime = true;
		
		for(int i=2; i<=num/2 ;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) 
	{
		PrimeSumOwn obj = new PrimeSumOwn();
		obj.getArrayPrime();
		
	}
}
//Sum  : 3 + 163 = 166
//Sum  : 17 + 149 = 166
//Sum  : 29 + 137 = 166
//Sum  : 53 + 113 = 166
//Sum  : 59 + 107 = 166
//Sum  : 83 + 83 = 166
