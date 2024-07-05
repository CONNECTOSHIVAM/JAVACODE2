package com.firstproject;

class AeroPlane1
{
	 public void takeOff()
	 {
		 System.out.println("Aeroplane is taking off");
	 }
	 public void fly()
	 {
		 System.out.println("Aeroplane is flying");
	 }
}
class CargoPlane1 extends AeroPlane1 {
	
	public void takeOff()
	{
		System.out.println("Cargoplane requires longer runway");
	}
	public void fly()
	{
		System.out.println("Cargoplane Flyies at lower height ");
	}
	
}
class PassengerPlane1 extends AeroPlane1{
	
	public void takeOff()
	{
		System.out.println("Pessenger Plane required medium size runway ");
	}
	public void fly()
	{
		System.out.println("PessengerPlane fly at medium height ");
	}
}


public class Polymophism1 {

	public static void main(String[] args)
	{
		CargoPlane1 cp =new CargoPlane1();
//		cp.takeOff();
//		cp.fly();
		
		PassengerPlane1 pp = new PassengerPlane1 ();
//		pp.takeOff();
//		pp.fly();
		
		AeroPlane1 ref;
		
		ref= cp;
		
		ref.takeOff();
		ref.fly();
		
		ref= pp;
		ref.takeOff();
		ref.fly();
	}
	
}
