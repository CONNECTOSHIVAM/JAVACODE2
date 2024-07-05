package com.firstproject;

public class ExcepHand3 {

	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int result=0;
		int arr[]= {6,9,7,0,4};
		
		try
		{
			result = a/b;
			System.out.println("value of index:- "+arr[8]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You can not Divide by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(arr[arr.length-1]);
			System.out.println("stay in your limits.."+e);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong .."+e);
		}
		
		System.out.println("Divide result :- "+result);
		System.out.println("Good morning shivam ");
	}
}
