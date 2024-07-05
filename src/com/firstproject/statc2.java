package com.firstproject;

import java.util.Scanner;

class Emp1{
	
	int pa;
	float td;
    static float ri;
	float si;
	
	static{
		ri=5.6f;
	}
    void input()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the reqired Amount:- ");
    	pa=scan.nextInt();
    	System.out.println("Enter the requred time:- ");
    	td=scan.nextFloat();
    }
    public void compute()
    {
    	si=(pa*td*ri)/100f;
    }
    public void disp()
    {
    	System.out.println("SI is :-"+si);
    }
    
	
}
public class statc2 {
	
	public static  void main(String[] args)
	{
		Emp1 obj1= new Emp1();
		Emp1 obj2= new Emp1();
		
		obj1.input();
		obj1.compute();
		obj1.disp();

		obj2.input();
		obj2.compute();
		obj2.disp();
	}

}
