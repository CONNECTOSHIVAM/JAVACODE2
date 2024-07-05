package com.firstproject;

class Aeroplane3{
	
	public void takeOff()
	{
		System.out.println("Aeroplane is taling off");
	}
	public void fly()
	{
		System.out.println("Aeroplane is flying");
	}
	
}
class Cargoplane3 extends Aeroplane3{
	
	public void takeOff()
	{
		System.out.println("Cargoplane required longer highway");
	}
	public void fly()
	{
		System.out.println("Cargoplane fly at longer medium");
	}
}
class Passengerplane3 extends Aeroplane3{
	
	public void takeoff()
	{
		System.out.println("Passenger plane required medium land for take off.");
	}
	public void fly()
	{
	     System.out.println("Passenger plane fly at Medium height ");	
	}
}
class Fighterplane3 extends Aeroplane3{
	
	public void takeOff()
	{
		System.out.println("Fighter plane takeOff for small runway. ");
	}
	public void fly()
	{
		System.out.println("Fighter plane fly at small medium");
	}
}

class Airport3
{
	public void poly3(Aeroplane3 ref)
	{
		ref.takeOff();
		ref.fly();
		
		System.out.println("*************************************************************");
	}
}

public class Poly1 {

	public static void main(String[] args)
	{
		Cargoplane3 cp = new Cargoplane3();
		Passengerplane3 pp = new Passengerplane3();
		Fighterplane3 fp = new Fighterplane3();
		
		Airport3 obj1 = new Airport3();
		obj1.poly3(cp);
		obj1.poly3(pp);
		obj1.poly3(fp);
	}
}
