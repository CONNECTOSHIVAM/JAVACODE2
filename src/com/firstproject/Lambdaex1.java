package com.firstproject;

interface Car5
{
	void show(int avg,int ts);
}

public class Lambdaex1 {
	
	public static void main(String[] args)
	{
		Car5 obj = (avg,ts) -> System.out.println("Driving...Duration:- "+avg+" ts:- "+ts);
		
		obj.show(20,9);
	}

}
