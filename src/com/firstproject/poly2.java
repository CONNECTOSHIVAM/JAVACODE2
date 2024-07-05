package com.firstproject;

class Paeroplane1{
	 
	public void takeOff()
	{
		System.out.println("Aeroplane is taking off")
	}
	public void fly()
	{
		System.out.println("Aeroplene is flyoing");
	}
}
class Pcargoplane extends Paeroplane1
{
	public void takeOff()
	{
		System.out.println("Cargoplane required small runway for take Off");
	}
	public void fly()
	{
		System.out.println("CargoPlane flying at low height");
	}
}

class PpassengerPlane extends Paeroplane1
{
	public void takeOff()
	{
		System.out.println("Passenger palane takeOff at medium runway");
	}
	public void fly()
	{
		System.out.println("Passenger plane fly at medium height");
	}
}
class Pfighterplane extends Paeroplane1
{
	public void takeOff()
	{
		System.out.println("Fighter plane required long runway");
	}
	public void fly()
	{
		System.out.println("Fighter plane fly at a long height");
	}
}
class Pairport
{
	public void poly(Paeroplane1 ref)
	{
		ref.takeOff();
		ref.fly();
	}
}

public class poly2 {
	
	public static void main(String args[])
	{
		Pcargoplane cp = new Pcargoplane();
		PpassengerPlane pp = new PpassengerPlane();
		Pfighterplane fp = new Pfighterplane();
		
		Pairport obj1 = new Pairport();
		obj1.poly(cp);
		obj1.poly(pp);
		obj1.poly(fp);
	}

}
