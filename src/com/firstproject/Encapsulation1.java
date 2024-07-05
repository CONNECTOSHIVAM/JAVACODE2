package com.firstproject;

class School{
	
	private int age;
	private String name;
	
	public void setdata(int age , String name)
	{
		this.age=age;
		this.name=name;
	}
	public void showdata()
	{
		System.out.println(name+"  "+age);
	}
	
}

public class Encapsulation1 {

	 public static void main(String[] args)
	 {
		 School obj = new School();
		 obj.setdata(5,"Sans");
		 obj.showdata();
	 }
}
