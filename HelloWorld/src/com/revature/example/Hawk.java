package com.revature.example;

public class Hawk extends Raptor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Raptor extends Bird {
	static {
		System.out.println("first static in raptor");
		System.out.println("r1");


	}
	
	public Raptor () {
		System.out.println("in raptor constructor");
		System.out.println("r1");


	}
	
	
	
	
	
}

class Bird {
	{
		System.out.println("in instance block of bird");

		System.out.println("b1");
	}
	
	public Bird() {
		System.out.println("inside bird constructor");

		System.out.println("b2");

	}
	
	static {
		System.out.println("in static bird block");

		System.out.println("b3");

	}
	
}
