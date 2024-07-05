package com.firstproject;

class Demo{
	
	private int a;
	private int b;
	
	Demo()
	{
		System.out.println("Zero peramiterized constructor created by programer");
	}
	
	Demo(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class Constructor2 {

	 public static void main(String[] args)
	 {
		 Demo d =new Demo();
		 d.disp();
		 
		 Demo e = new Demo(7,8);
		 e.disp();
		 
			
	 }
}
