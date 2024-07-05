//****************************************** Program of Multilevel Inheritance ******************************************

package com.firstproject;

class Dem{
	
	void disp()
	{
		System.out.println("Display in Demo 1 class..");
	}
}

class Demo1 extends Dem{
	
}
class Demo2 extends Demo1{

	
}
public class Multilevelinheritance1 {

	public static void main(String[] args)
	{
		Demo2 d =new Demo2();
		d.disp();
	}
}
