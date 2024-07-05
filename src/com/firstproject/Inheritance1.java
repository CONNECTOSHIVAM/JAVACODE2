package com.firstproject;



class Human{
	
	private String name;
	int age;
	
	
	void sleep()
	{
		age=19;
		System.out.println("Human needs good sleep");
		System.out.println(age);
	}
}

class Studen extends Human{
	
}
public class Inheritance1 {
	
	public static void main(String[] args)
	{
		Studen obj1= new Studen();
		obj1.sleep();
	}

}
