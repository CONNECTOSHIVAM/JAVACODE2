package com.firstproject;

class AeroPlane3{
	
	public void takeOff()
	{
		System.out.println("AeroPlane is the take off");
	}
	public void Fly()
	{
		System.out.println("AerPlane is flying");
	}
}

class CargoPlane3 extends AeroPlane3{
	
	public void takeOff()
	{
		System.out.println("CargoPlane require loonger runway");
	}
	public void Fly()
	{
		System.out.println("CargoPlane flying at longer medium");
	}
}

class PassengerPlane3 extends AeroPlane3{
	
	public void takeOff()
	{
		System.out.println("PassengerPlane require medium runway");
	}
	public void Fly()
	{
		System.out.println("Passenger plane flying at medium height");
	}
	
}
class FighterPlane3 extends AeroPlane3{
	
	public void takeOff()
	{
		System.out.println("FighterPlane require small runway ");
	}
	public void Fly()
	{
		System.out.println("FighterPlane flying at low height");
	}
}
class Airport3{
	
	public void comp(AeroPlane3 ref)
	{
		ref.takeOff();
		ref.Fly();
		
		System.out.println("____________________________________________________________________________________");7
	}
}

public class realploymorphism {

	public static void main(String[] args)
	{
		CargoPlane3 cg = new CargoPlane3();
		PassengerPlane3 pp = new PassengerPlane3();
		FighterPlane3 fp = new FighterPlane3();
		
		Airport3 a = new Airport3();
		a.comp(cg);
		a.comp(pp);
		a.comp(fp);
	}
}
