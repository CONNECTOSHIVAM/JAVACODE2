// ******************************tion Program using the static keyword****************************
package com.firstproject;

import java.util.Scanner;

class Emp{
	
	int pa;
	float td;
	static float ri;
	float si;
	
	static {
		ri=5.9f;
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the required amount:- ");
		pa=scan.nextInt();
		System.out.println("Enter the required time:- ");
		td=scan.nextFloat();
		
	}
	void compute()
	{
		si=(pa*td*ri)/100;
	}
	void disp()
	{
		System.out.println("SI is:- "+si);
	}
}
public class Usestaticc {

	public static void main(String[] args)
	{
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.input();
		e1.compute();
		e1.disp();
		
		e2.input();
		e2.compute();
		e2.disp();
	}
}
