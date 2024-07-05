package com.firstproject;

class W1
{
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
	public void dispData()
	{
		System.out.println("Your name is "+name+" & your age is "+age);
	}
}



public class Encap1 {
	
	public static void main(String[] args)
	{
		W1 obj = new W1();
		obj.setAge(19);
		obj.setName("shivam");
		obj.dispData();
				
	}

}
