package com.firstproject;

public class ExceptionHand1 {
	
    public static void main(String[] args)
    {
    	int a=9;
    	int b=3;
    	int result=0;
    	
    	try
    	{
    		result = a/b;
    		System.out.println("Contol in the try block ");
    	}
    	catch(Exception e)
    	{
    		System.out.println("Something went wrong.."+e);
    	}
    	5
    	
    	System.out.println(result);
    	System.out.println("Good morning");
    }

}
