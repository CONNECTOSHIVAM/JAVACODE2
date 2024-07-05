package com.firstproject;

class New{
	private int age;
	private String name;
	
	//Default constructor
	New()
	{
		System.out.println("Control in the Default Constriuctor");
	}
	//parameterized Constructor
	New(int age, String name)
	{
		
		this.age=age;
		this.name=name;
	}
	
	public void showData()
	{
		System.out.println("Your name is :- "+age);
		System.out.println("Your age is :- "+age);
	}
}
public class Construc6 {

	public static void main(String[] args)
	{
		New obj1 = new New();
		New obj2 = new New(7,"satyam");
		
		obj1.showData();
		obj2.showData();
	}
     	
}
