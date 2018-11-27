package com.revature.example;

public class Scopes {
	
//	Static variable, in the class or the static scope, is defined for the entire class.
	public static String variable1 = "v1";
	
	
//	this is the variable that all instances will have. in the instance scope not defined outside of the object of class 
	public String variable2;
	
//	write a contructor with argument of variable2
//	the constructor arg has method or local scope
//	constructor arg is shawdowing (same identifier, different scope)
//	the instance varaible of the same name
	public Scopes (String variable2) {
		this.variable2 = variable2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(variable1);
		Scopes s = new Scopes("v2");
		System.out.println(s.variable2);
		s.myMethod("this is 3rd var");

	}
	
//	variable 3 is decleared within a method,
//	therefore it is not accesiable outside the mehtod
	public void myMethod(String variable3) {
		System.out.println(variable3);
//			fun with block scope
		for (int i =0; i<10;i++) {
			System.out.println("value of i is"+i);
		}
		
		if (variable3.equals("v3")) {
			System.out.println("inside a weird if statement");
		}
		
	}
}
