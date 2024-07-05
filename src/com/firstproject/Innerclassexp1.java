package com.firstproject;

class outer
{
	void disp()
	{
		System.out.println("In the outer class");
	}
	class inner
	{
		void show()
		{
			System.out.println("In the inner class");
		}
	}
}
public class Innerclassexp1 {
	
	public static void main(String[] args)
	{
		outer obj1= new outer();
//		outer.inner obj2 = obj1.new inner();
		outer.inner obj2 = new outer().new inner();
		
		obj1.disp();
		obj2.show();
	}

}
