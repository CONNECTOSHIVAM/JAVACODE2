package com.firstproject;

class sans{
	
	private int age;
	private String name;
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int  getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
}

public class Encapsulation2 {
     
	public static void main(String[] args)
	{
		sans obj = new sans();
		obj.setAge(9);
		obj.setName("shivam");
		
		int gAge = obj.getAge();
		System.out.println("Your age:- "+gAge);
		
		String gName = obj.getName();
		System.out.println(gName);
		
	}
}
