package com.firstproject;
class Comp{
	int a;
	int b;
	Comp(int a , int b)
	{
		this.a=a;
		this.b=b;
	}
	public void show()
	{
		System.out.println("Your complex Number:- "+a+" + "+b+"i");
	}
}
public class Addcomplx {

	public static void main(String[] args)
	{
		Comp obj = new Comp(5,8);
		obj.show();
	}

}
