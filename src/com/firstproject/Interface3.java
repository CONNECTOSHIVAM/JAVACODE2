package com.firstproject;

interface P
{
	void show();
	default void config()
	{
		System.out.println("in the config");
	}
	static void abc()
	{
		System.out.println("In the abc");
	}
}

class W implements P
{
  public void show()
  {
	  System.out.println("in the show");
  }
	
}
public class Interface3 {

	 public static void main(String[] args)
	 {
		 P.abc();
		 W obj = new W();
		 obj.config();
		 obj.show();
	 }
}
