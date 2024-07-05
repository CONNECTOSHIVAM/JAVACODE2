package com.firstproject;

import java.util.Scanner;

public class Sinterst {
	
	public static void main(String[] args)
	{
		int Amount;
	    float rate = 5;
		int time;
		float result;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the required Amount:-  ");
		Amount=scan.nextInt();
		System.out.print("\nEnter the required Duration:- ");
		time=scan.nextInt();
		
		result= (Amount*rate*time)/100f;
		
		System.out.println("Simple interst of your Amount:- "+result);
	}

}
