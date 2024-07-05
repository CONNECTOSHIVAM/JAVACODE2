package com.firstproject;

class Demos{
	
	private int age;
	private String name;
	
	Demos()
	{
		this(20,"shivam");
		System.out.println("Default constructor is called");
		age=19;
		name="Sans";
	}
	Demos(String name)
	{
		this();
		this.name=name;
		age=21;
	}
	Demos(int age,  String name )
	{
		this.age=age;
		this.name=name;
	}
	public  void  disp()
	{
		System.out.println("Age:- "+age);
		System.out.println("Name:- "+name);
	}
}

public class thisconstruct {

	public static void main(String[] args)
	{
		Demos a=new Demos();
		a.disp();
		Demos b=new Demos("kriti");
		b.disp();
		
		
	}
	
}
