package com.firstproject;

public class Excephand4 {
	
	public static void main(String[] args)
	{
		int a=8;
		int b=2;
		int result=0;
		int arr[]= {7,9,8,5};
		
		try
		{
			result = a/b;
			System.out.println("Your index value:- "+arr[8]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You can not divide by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(arr[arr.length-1]);
			System.out.println("Stay in your limits.."+e);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong.."+e );
		}
		
		
		System.out.println("your Ans :- "+result);
		System.out.println("Shivam you use your power.");
	}

}
