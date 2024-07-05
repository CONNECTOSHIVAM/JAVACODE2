package com.firstproject;

class Oxs{
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
	public void getData()
	{
		System.out.println("your name is "+name+" & your age:-"+age);
	}
}
public class Ecapsu5 {
     
	public static void main(String[] args)
	{
		Oxs obj1 = new Oxs();
		Oxs obj2 = new Oxs();
		
		obj1.setAge(7);
		obj1.setName("Shivam");
		obj2.setAge(9);
		obj2.setName("Sanskriti");
		
		obj1.getData();
		obj2.getData();
		
	}
}
