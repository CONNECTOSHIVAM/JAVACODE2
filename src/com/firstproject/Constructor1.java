package com.firstproject;


	class Student{
		  
	    private int age ;
	    private String name;

	    public Student(int age, String name)
	    {
	        this.age=age;
	        this.name=name;
	    }
	    public int getAge(){
	    
	         return age;
	    }
	    public String getName(){
	    
	        return name;
	    }


	}

	public class Constructor1 {
	    
	    public static void main(String[] args) {
	        
	        Student st = new Student(18,"shivam");

	        int age= st.getAge();
	        System.out.println(age);
	        String name = st.getName();
	        System.out.println(name);

	    }
	}


