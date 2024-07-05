package com.firstproject;

interface A2{
	void disp();
}
interface B2
{
	void abs();
}
class C2 implements A2, B2
{
	public void disp()
	{
		System.out.println("Control in disp");
	}
	public void abs()
	{
		System.out.println("control in abs");
	}
}
public class InterfaceExp2 {
	
	public static void main(String[] args)
	{
		C2 obj1= new C2();
		obj1.disp();
		obj1.abs();
	}

}
