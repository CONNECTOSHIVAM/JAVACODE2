package com.firstproject;

class Student{
	
	private int age;
	private String name;
	
	Student(int age , String name)
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
public class Constructor {
     
	public static void main(String[] args) 
	{
		Student bj = new Student(17,"kriti"); 
		
		int age=bj.getAge();
		String name=bj.getName();
		System.out.println(age);
		System.out.println(name);
		
		
		
	}
}
