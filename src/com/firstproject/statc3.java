package com.firstproject;

import java.util.Scanner;

class Farm1
{
	int pa;
	float td;
	static float ri;
	float si;
	
	static {
		ri=7.8f;
	}
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the requied Amount:- ");
		pa=scan.nextInt();
		System.out.println("Enter the time Duration:- ");
		td=scan.nextFloat();
	}
	public void Compute()
	{
		si=(pa*td*ri)/100f;
	}
	public void disp()
	{
		System.out.println("SIMPLE INTEREST IS:- "+si);
	}
}
public class statc3 {
	
	public static void main(String[] args)
	{
		Farm1 f1 = new Farm1();
		Farm1 f2 = new Farm1();
		
		f1.input();
		f1.Compute();
		f1.disp();
		
		f2.input();
		f2.Compute();
		f2.disp();
	}

}
