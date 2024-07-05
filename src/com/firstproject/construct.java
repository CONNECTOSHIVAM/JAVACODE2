package com.firstproject;

class Box{
	
	private int age;
    private String name;
    
    Box()
    {
    	  System.out.println("Parameterzied constructor is ceated by pprogramer");
    }
    Box(int age, String name)
    {
    	this.age=age;
    	this.name=name;
    }
    public void getData()
    {
    	System.out.println("Your name is "+name+"& your age is "+age);
    }
}


public class construct {
	
	public static void main(String[] args) 
	{
		Box obj =new Box();
		Box obj1=new Box(7,"sanyam");
		
		obj.getData();
		obj1.getData();
	}
	
	

}
