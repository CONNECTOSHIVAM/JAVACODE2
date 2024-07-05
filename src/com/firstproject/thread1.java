package com.firstproject;

public class thread1 {
	
	public static void main(String[] args)
	{
		System.out.println("before changing");
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread Name:- "+name);
		int  p = Thread.currentThread().getPriority();
		System.out.println("Priorty is:- "+p);
		
		System.out.println("After changing:- ");
		Thread t = Thread.currentThread();
		t.setName("shivam");
		t.setPriority(10);
		
		String name1 = Thread.currentThread().getName();
		System.out.println("Thread Name:- "+name1);
		int p1 = Thread.currentThread().getPriority();
		System.out.println("Priority is:- "+p1);
	}

}
