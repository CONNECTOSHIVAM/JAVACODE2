package com.firstproject;

class Demo5{
	//static variable
	static int a;
	static int b;
	
	//Instance variable
	int m;
	int n;
	
	//static block
	static {
		System.out.println("control in the static block");
		a=9;
		b=8;
	}
	//normal block
	{
		System.out.println("control in the non-static block");
		m=7;
		m=6;
	}
	//static method
	static void disp1()
	{
		System.out.println("Value of a:- "+a);
		System.out.println("Value os b:- "+b);
	}
	//non-static methods
	void disp2()
	{
		System.out.println("Value of m:- "+m);
		System.out.println("Value of n:- "+n);
	}
}

public class statc1 {
	
	public static void main(String[] args)
	{
		//static methods are called without creating object ,It's called directly
		Demo5.disp1();
		
		//non-static methods are called with create object
		Demo5 obj1 = new Demo5();
		obj1.disp2();
	}

}
