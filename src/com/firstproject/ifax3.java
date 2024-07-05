package com.firstproject;
//Inner class program
class Outer1
{
	void show()
	{
		System.out.println("Inside the show");
	}
	class Inner1
	{
		void disp()
		{
			System.out.println("Inside the disp");
		}
		
	}
}
public class ifax3 {
	
	public static void main(String[] args)
	{
		Outer1 obj = new Outer1();
		Outer1.Inner1 obj1 = obj.new Inner1();
//		Outer1.Inner1 obj1 = new Outer1(). new Inner1(); 
		obj.show();
		obj1.disp();
		
		
	}

}
