package com.firstproject;


class Brain{
	private int use;
	private String name;
	
	public void setData(int use,String name)
	{
		this.use=use;
		this.name=name;
	}
	public void getData()
	{
		System.out.println(name+" ,You use "+use+"% your brain in total of 100%");
	}
}
public class Encsp {
	
	public static void main(String[] args)
	{
		Brain obj = new Brain();
		Brain obj1 = new Brain();
		
		obj.setData(3,"Shivam");
		obj1.setData(3, "Sanskriti");
		
		obj.getData();
		obj1.getData();
		
		
	}

}
