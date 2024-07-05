package com.firstproject;

class ComplexNumber{
	int real;
	int imag;
	
	ComplexNumber(int r, int i)
	{
		this.real=r;
		this.imag=i;
	}
	public void show()
	{
		System.out.println(" "+real+" + "+" "+imag+"i");
	}
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2)
	{
		ComplexNumber obj= new ComplexNumber(0,0);
		obj.real=n1.real+n2.real;
		obj.imag=n1.imag+n2.imag;
		return obj;
	}
}
public class Acomplex {
	
	public static void main(String[] args)
	{
		ComplexNumber a1 = new ComplexNumber(7,9);
		ComplexNumber a2 = new ComplexNumber(5,7);
		
		System.out.print("First Complex Number:- ");
		a1.show();
		System.out.print("Second Complex Number:- ");
		a2.show();
		
		ComplexNumber sum = ComplexNumber.add(a1,a2);
		System.out.print("\n Addition of complex Number:- ");
		sum.show();
		
	}

}
