package com.firstproject;

class Vmx{
	
	private int age;
	private String name;
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
public class Encap2 {
   
	public static void main(String[] args)
	{
		Vmx obj1 = new Vmx();
		Vmx obj2 = new Vmx();
		obj1.setAge(21);
		obj1.setName("Sanskriti");
		obj2.setAge(18);
		obj2.setName("Shivam");
		
		int Oage= obj1.getAge();
		System.out.println("Student 1 age :- "+Oage);
		String Oname=obj1.getName();
		System.out.println("Student 1 name :- "+Oname);
		int Jage= obj2.getAge();
		System.out.println("Student 2 age :- "+Jage);
		String Jname= obj2.getName();
		System.out.println("Student 2 name :- "+Jname);
	}	
		
}
