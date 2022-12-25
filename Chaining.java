package com.constructorchaining;

public class Chaining {
	
	// Create No Argument Constructor 
	public Chaining() {
		this("Java");
	System.out.println("This is No Argument Constructor");
	}
	// Create Parameterized Constructor 01
		public Chaining(String course) {
			this(5);
	System.out.println("Course String Name :" + course);
		}
	// Create Parameterized Constructor 02
	  public Chaining(int x) {
		this(3.14f);
	System.out.println("Value Of int x :" + x);
	}
	  
	// Create Parameterized Constructor 03
		  public Chaining(float f) {
			this(8433786334L);
	System.out.println("Value Of Float f :" + f);
		}
		// Create Parameterized Constructor 04
		  public Chaining(long v) {
			  this(4,5);
	System.out.println("Value Of Long v :" + v);
	}
		// Create Parameterized Constructor 05
		  public Chaining(int a , int b) {
			 this(40, 50, 60);
	     System.out.println("Value Of int a :" + a);
		 System.out.println("Value Of int b :" + b);	
	   }
		// Create Parameterized Constructor 06
		  public Chaining(int p , int q , int r) {
	        System.out.println("Value Of int p :" + p);
			System.out.println("Value Of int q :" + q);
			System.out.println("Value Of int r :" + r);
	   }
		  public static void main(String[] args) {
		
		// Create an No Argument Constructor object
		Chaining chain = new Chaining();
	}
 }
