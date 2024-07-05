package com.firstproject;

abstract class Animal1
{
	abstract void Lion();
	void Dog()
	{
		System.out.println("called the dog funtion in class Animal1 ");
	}
}

class Zoo1  extends Animal1
{
	void Lion()
	{
		System.out.println("called the lion methood in class Zoo1 ");
	}
}
public class Abstra1 {
	
	public static void main(String[] args)
	{
		Zoo1 obj1 = new Zoo1();
		obj1.Lion();
		obj1.Dog(); 
	}

}
 