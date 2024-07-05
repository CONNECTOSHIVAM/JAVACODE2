//Write a program of convert the Decimal value in Binary number

package com.firstproject;
import java.util.Scanner;

public class dectobin {
	
	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the num for find his binary representations:- ");
		 int number=scan.nextInt();
		 int fix= number;
		 String a=" ";
		 while(number>0)
		 {
			 int r = number%2;
			 a= r+a;
			 number=number/2;
		 }
		 System.out.println("Your entered number "+fix+" & his Binary number"+a);
		
		
	}

}
