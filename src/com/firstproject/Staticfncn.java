package com.firstproject;

class Demot{
	
	static int a ;
	static int b;
	
	int m;
	int n;
	
	static 
	{
		System.out.println("Control in the static block  ");
		a=10;
		b=20;
	}
	
	{
		System.out.println("Control in the non static block  ");
		m=80;
		n=90;
	}
	
	static void disp()
	{
		System.out.println("value of static variable a:- "+a);
		System.out.println("value of static variable b:- "+b);
	}
	
	void disp2()
	{
		System.out.println("value of non-static variable m:- "+m);
		System.out.println("value of non-static variable n:- "+n);
	}
	
	
}

public class Staticfncn {
	
	public static void main(String[] args)
	{
//		Demot cd = new Demot();
		
		Demot.disp();
//		cd.disp2();
	}

}
