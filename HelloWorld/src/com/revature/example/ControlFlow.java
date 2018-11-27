package com.revature.example;

public class ControlFlow {
	public static void main(String[] args) {
		
		ifStatements(5.001,5.01);
		forLoops();
		
	}
	
	static void ifStatements(double a, double b) {
		
		
		if (a>b) {
			System.out.println("a is b");
			
		}else if(a ==b) {
			System.out.println("a equals b");
		}else {
			System.out.println("a is less than b");
		}
	}
	
	static void forLoops() {
		
		for (int i =0; i<10;i++) {
			System.out.println(i);
		}
//		will do nothing forever
//		for(;;) {
			
//		}
		
		for (int j =0;;j++) {
			if (j%2 != 0) {
				continue;
			}
			
			System.out.println(j);
			if (j==20) {
				break;
			}
		}
		
	}
	
	static void whileLoops() {
		int i =0;
		while (true) {
			i+=1;
			if (i>150) {
				break;
			}
		}
		
		do {
			System.out.println("do block always runs before codistion is checked.");
		}while(false);
	}
	
	static void switchStatements() {
		String day="Tuesday";
		switch (day) {
			case "Sunday":
				System.out.println("it is Sunday");
				break;
			case "Monday":
				System.out.println("today is monday");
				break;
			case "Tuesday":
				System.out.println("today is tuesday");
				break;
			default: 
				System.out.println("reality is not real.");
		}
		
	}
	
}
