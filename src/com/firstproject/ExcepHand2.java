package com.firstproject;

public class ExcepHand2 {

	public static void main(String[] args)
	{
		int a=10;
		int b=2;
		int result=0;
		int arr[]= {5,6,3,7,2};		
		try
		{
			result = a/b;
			System.out.println("index value:- "+arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can not devide by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(arr[arr.length-1]);
			System.out.println("Stay in your limits");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong..");
		}
		
		System.out.println(result);
		System.out.println("Good morning");
	}
}
