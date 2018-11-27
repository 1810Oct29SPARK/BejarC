package com.revature.transport;

public class Kayak extends Boat {

	public Kayak(String color, double hullLength, int numSeats, double paddleLength) {
		super(color, hullLength);
		this.color = color;
		this.hullLength = hullLength;
		this.numSeats = numSeats;
		this.paddleLength = paddleLength;
		System.out.println("calling the jayak the longer one");

	}
	public Kayak(String color, double hullLength) {
		super(color, hullLength);
		// TODO Auto-generated constructor stub
	}
	public Kayak(int numSeats, double paddleLength) {
		super();
		this.numSeats = numSeats;
		this.paddleLength = paddleLength;
		System.out.println("calling the jayak");
	}
	public Kayak() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	
	private int numSeats;
	private double paddleLength;
	public int getNumSeats() {
		return numSeats;
	}
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	public double getPaddleLength() {
		return paddleLength;
	}
	public void setPaddleLength(double paddleLength) {
		this.paddleLength = paddleLength;
	}
	@Override
	public String toString() {
		return "Kayak [numSeats=" + numSeats + ", paddleLength=" + paddleLength + ", color=" + color + ", hullLength="
				+ hullLength + "]";
	}
	
	
	

}
