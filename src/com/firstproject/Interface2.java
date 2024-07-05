package com.firstproject;

interface O{
	void show();
}
interface B{
	void disp();
}

class X implements O,B{
	
	public void show()
	{
		System.out.println("in the show methood");
	}
	public void disp()
	{
		System.out.println("int the disp methood");
	}
}

public class Interface2 {

	public static void main(String[] args)
	{
		X obj = new X();
		obj.show();
		obj.disp();
	}
}
