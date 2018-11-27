package com.revature.example;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello world");
		
//		how to create an instance of calc class
		Calculator myCalc = new Calculator();
		double additionResult =myCalc.add(4,6);
		double subtractionResult = myCalc.subtract(10, 5);
		double multiplyResult = myCalc.multiply(10, 10);
		double divideResult = myCalc.divide(45, 5);
		
		System.out.println(myCalc.toString());
		System.out.println(additionResult);
		
		String s = "5";
		Double d = Double.parseDouble(s);
		System.out.println(d.getClass());
		
		

	}

}
