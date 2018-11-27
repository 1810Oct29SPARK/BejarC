package com.revature.transport;

public abstract class Vehicle {
	
	public Vehicle() {
		super();
		System.out.println("vehicle constructor completed");
	}

	
//	abstract class cannot be instantiated
//	if there is a single or more abstract method, the class must be abstract 
//	will have to implement this method in the first concrete subclass 
	public abstract void move();
	
}
