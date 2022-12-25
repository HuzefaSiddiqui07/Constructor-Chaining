// This is Derived Class Of Chaining

package com.constructorchaining;

public class Chaining_Derived01 extends Chaining_Base01 {
	
	// Create No Args Derived Class Constructor
	
	public Chaining_Derived01() {
		
		System.out.println("This is No Args Derived Class Constructor");
	}
	
	// Create Parameterized Derived Class Constructor
	
	public Chaining_Derived01(String name) {
		super(name);
		System.out.println("This is Parameterized Derived Class Constructor");
	}
	
	public static void main (String[] args) {
		
		// Create Parameterized Constructor Object
		Chaining_Derived01 obj = new Chaining_Derived01("Java");
		
	 }
  }
