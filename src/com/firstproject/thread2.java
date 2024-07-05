package com.firstproject;

public class thread2 {
	
	public static void main(String[] args)
	{
		String name = Thread.currentThread().getName();
		System.out.println("Thread name:- "+name);
		System.out.println("Thread prioriy:- "+Thread.currentThread().getPriority());
		
		Thread t = Thread.currentThread();
		t.setName("shivam");
		t.setPriority(10);
		
		String name1 = Thread.currentThread().getName();
		System.out.println("Thread name:- "+name1);
		System.out.println("Thread Prioriy:- "+Thread.currentThread().getPriority());
		
	}

}
