package com.revature.transport;

public class Boat extends Vehicle implements Steerable{
	
	public Boat(String color, double hullLength) {
		this();
		this.color = color;
		this.hullLength = hullLength;
		System.out.println("boat arg constructor completeted");
	}


	public Boat() {
		super();
		System.out.println("boat no args contructor completed");
	}
	
	protected String color;
	protected double hullLength;
	

	@Override
	public void move() {
		System.out.println("boat is moving");

	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getHullLength() {
		return hullLength;
	}


	public void setHullLength(double hullLength) {
		this.hullLength = hullLength;
	}


	@Override
	public String toString() {
		return "Boat [color=" + color + ", hullLength=" + hullLength + "]";
	}


	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("turn rudder clockwise");
		
	}


	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("turn rudder counterclockwise");
		
	}

}
