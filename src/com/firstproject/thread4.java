package com.firstproject;
//Thread extends using interface
import java.util.Scanner;

class calc implements Runnable {
	
	 public void run()
	 {
		 System.out.println("Calculator is started.");
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter first number:- ");
		 int num1 = scan.nextInt();
		 
		 System.out.println("Please enter Second number:- ");
		 int num2 = scan.nextInt() ;
		 
		 int result= num1+ num2;
		 
		 System.out.println("Calculator result:- "+result);
		 System.out.println("calculator task is ended..");
		 System.out.println("***********************************************************");
	 }
	
}

class Message implements Runnable {
	
	public void run()
	{
		System.out.println("Displaying important message task");
		for(int i=0;i<5;i++)
		{
			System.out.println("Ovservation is master skills for big Man ");
		}
		
		System.out.println("Displaing task is ended..");
	}
}


public class thread4 {
	
	public static void main(String[] args)
	{
		System.out.println("Started the Main Thread");
		
		calc s1 = new calc();
		
		Message s2 = new Message();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		
		t1.start();
		t2.start();
	}

}
