package com.firstproject;

class AeroPlane2{
	
	public void takeOff()
	{
		System.out.println("Areoplane is taking off");
	}
	public void fly()
	{
		System.out.println("Aeroplane is fly");
	}
}

class CargoPlane2 extends AeroPlane2{
	
	public void takeOff()
	{
		System.out.println("CargoPlane requires longer runway");
	}
	public void fly()
	{
		System.out.println("CargoPlane flyies at longer medium");
	}
}

class PassengerPlane2 extends AeroPlane2{
	
	public void takeOff()
	{
		System.out.println("PassengerPlane required medium size runway");
	}
	public void fly()
	{
		System.out.println("PassengerPlane at medium height");
	}
}

class FighterPlane2 extends AeroPlane2{
	
	public void takOff()
	{
		System.out.println("FighterPlane required small size runway");
	}
	public void fly()
	{
		System.out.println("FighterPlane at flying in higher height");
	}
}

class Airport
{
	public void poly(AeroPlane2 ref)
	{
	  ref.takeOff();
	  ref.fly();
	  
	  System.out.println("*********************************************************");
	}
}
public class Polymorphism2 {

	public static void main(String[] args)
	{
		CargoPlane2 cp = new CargoPlane2();
        PassengerPlane2 pp = new PassengerPlane2();
        FighterPlane2 fp = new FighterPlane2();
        
        Airport a = new Airport();
		a.poly(cp);
		a.poly(pp);
		a.poly(fp);
	
	}
}
