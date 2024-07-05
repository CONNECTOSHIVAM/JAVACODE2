package com.firstproject;
import  java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int number=scan.nextInt();
		
		
		long factoria=1;
		for(int i=1; i<=number; i++)
		{
		   factoria *= i;
		}
		System.out.println("factorial of "+number+" is :- "+factoria);
	}
}
