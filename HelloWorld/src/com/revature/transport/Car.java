package com.revature.transport;

public class Car extends Vehicle implements Steerable {
	
	public Car(int yearMade, String model, String make, double mileSinceOilChange) {
		super();
		this.yearMade = yearMade;
		this.model = model;
		this.make = make;
		this.mileSinceOilChange = mileSinceOilChange;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static double milesBetweenOilChange = 5000;
	
	private int yearMade;
	private String model;
	private String make;
	private double mileSinceOilChange;
	
	public void move() {
		System.out.println("car is moving");
	}

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getMileSinceOilChange() {
		return mileSinceOilChange;
	}

	public void setMileSinceOilChange(double mileSinceOilChange) {
		this.mileSinceOilChange = mileSinceOilChange;
	}

	@Override
	public String toString() {
		return "Car [yearMade=" + yearMade + ", model=" + model + ", make=" + make + ", mileSinceOilChange="
				+ mileSinceOilChange + "]";
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("turn wheel right");

	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("turn wheel left");

		
	}
	

}
