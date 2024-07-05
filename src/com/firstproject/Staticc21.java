package com.firstproject;

class sta{
	
	static int a;
	static int b;
	
	int m;
	int n;
	
	static {
		System.out.println("Control in the static block ");
		a=9;
		b=8;
		}
	
	{
		m=98;
		n=94;
	}
	
	static void showData()
	{
		System.out.println("Value of the static variable a:- "+a);
        System.out.println("Value of the static varaible b:- "+b);
	}
	
	public void getData()
	{
		System.out.println("Control in the  non-static block");

		System.out.println("Value of the non-static variable m:-"+m);
		System.out.println("Value of the non-static variable n:-"+n);
	}
}


public class Staticc21 {
	
	public static void main(String[] args)
	{
		sta obj = new sta();
		obj.getData();
		
//		we use static keyword then don't need of create object without create object we call the funtion
		sta.showData();
		
	}

}
