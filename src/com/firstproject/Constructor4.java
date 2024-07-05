package com.firstproject;

class Collage{
	
	private int age;
	private String name;
	
	Collage()
	{
		this(20,"shivam");
		System.out.println("Default constructor is called");
		age=19;
		name="Sans";
	}
	Collage(String name)
	{
		this();
		this.name=name;
		age=21;
	}
	Collage(int age,  String name )
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

public class Constructor4{

	public static void main(String[] args)
	{
		Collage b=new Collage("kriti");
		b.disp();
		
		
	}
	
}
