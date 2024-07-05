package com.firstproject;
// Anonymos Inner class
interface Car
{
	void drive();
}

public class Anonymosinnercls1 {

	public static void main(String[] args)
	{
		Car obj = new Car() 
		{
			public void drive()
			{
				System.out.println("Driving...");
			}
		};
	}
}
