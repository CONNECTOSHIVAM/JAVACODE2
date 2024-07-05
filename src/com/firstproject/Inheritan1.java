// program of multilevel inheritance  

package com.firstproject;

class Gfather
{
	void disp()
	{
		System.out.println("Control in the Gfather");
	}
}
class Father extends Gfather
{
	
}
class Son extends Father
{
	
}

public class Inheritan1 {
	
	public static void main(String[] args)
	{
		Son obj1 = new Son();
		obj1.disp();
	}

}
