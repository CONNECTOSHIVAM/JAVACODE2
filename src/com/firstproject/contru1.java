package com.firstproject;

class Demo4{
	private int age;
	private String name;
	
	Demo4(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
}
public class contru1 {

	public static void main(String[] args)
	{
		Demo4 obj = new Demo4(19,"Shivam");
		int hage=obj.getAge();
		System.out.println("age is :- "+hage);
		String hname=obj.getName();
		System.out.println("Name is :- "+hname);
	}
}
