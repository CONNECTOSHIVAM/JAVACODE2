package com.firstproject;
import  java.util.Scanner;

public class factor {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int number= scan.nextInt();
		
		int factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial *=i;
		}
		System.out.println("factorial of "+number+" is:- "+factorial);
	}

}
