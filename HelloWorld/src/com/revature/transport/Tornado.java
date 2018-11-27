package com.revature.transport;

public class Tornado extends Vehicle {
	
	public Tornado(double maxWindSpeed) {
		super();
		MaxWindSpeed = maxWindSpeed;
	}

	public Tornado() {
		
	}
	
	private double MaxWindSpeed;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("destroying the city");

	}

	public double getMaxWindSpeed() {
		return MaxWindSpeed;
	}

	public void setMaxWindSpeed(double maxWindSpeed) {
		MaxWindSpeed = maxWindSpeed;
	}

	@Override
	public String toString() {
		return "Tornado [MaxWindSpeed=" + MaxWindSpeed + "]";
	}

}
