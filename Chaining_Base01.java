// This is Parent Class Of Chaining 

package com.constructorchaining;

public class Chaining_Base01 {
	
	// Create No Args Base Class Constructor
	
	public Chaining_Base01() {
		this(" ");
		System.out.println("This is No Args Base Class Constructor");
	}
   
	// Declare Variable for Parameterized Base Class Constructor
	String name;
	
	// Create Parameterized Base Class Constructor
	
	public Chaining_Base01(String name) {
		this.name = name;
		System.out.println("This is Parameterized Base Class Constructor");
	}
}
