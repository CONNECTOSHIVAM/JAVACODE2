package com.firstproject;

interface S1
{
	void disp();
	default void show()
	{
		System.out.println("Control in the show.");
	}
	static void see()
	{
		System.out.println("Control in the see. ");
	}
}

class S2 implements S1
{
	public void disp()
	{
		System.out.println("Control in the disp");
	}
}
public class interfaceExp3 {
	
	public static void main(String[] args)
	{
		S1.see();
		S2 obj1 = new S2();
		obj1.disp();
		obj1.show();
	}
}
