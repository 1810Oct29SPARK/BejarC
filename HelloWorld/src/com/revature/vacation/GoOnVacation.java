package com.revature.vacation;
import com.revature.transport.*;
// static imports within a class can only do one class. 
//import static com.revature.transport.Car.milesBetweenOilChange;

public class GoOnVacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("let's go to Miami");
		System.out.println("we need a car");
//		this is fully qualified classname of car
//		com.revature.transport.Car myCar = new com.revature.transport.Car();
//		instead we can use import save us typeing.
		Car myCar = new Car();
		myCar.setMake("Volkswagen");
		myCar.setModel("Jetta");
		myCar.setYearMade(2019);
		myCar.setMileSinceOilChange(300);
		System.out.println(myCar.toString());
		System.out.println("do we need to change the oil first?");
		System.out.println(Car.milesBetweenOilChange+" how many miles before an oil change.");
		if (myCar.getMileSinceOilChange() >= Car.milesBetweenOilChange) {
			System.out.println("stop change oilt");
		}else {
			System.out.println("all good bro");
		}
		System.out.println("made it to Miami lets have fun!!");
		Kayak myK = new Kayak("red",10,14,13);
		System.out.println(myK.toString());
		
	
		
// Constructors are for creating instances of a class. 
// Constructor chaining: constructor of the subclass will chain all the way back up the heirarhy to Object(). 
		
//	Code Blocks between two curly brackets. 
// called an instance block. executes everytime you create an instance of an object. 
// can also have static blocks executes only once first time the code runs through the jvm. just put static in front of curly braces.

// abstract class may contain both abstract and concrete methods
// cannot be instantiated.
// abstract keyword can be used on classes or methods, but not variables, on a class it has to be extended as a class, when it goes to method there is no method body its left open.

// interfaces a type of class that cannot be instantiated. a special type of class
// defines a contract 
//		implementing class must implement all methods defined by the interface
//		no concrete methods all methods are implicitly abstract public
//		all vars are implicit public static final 
//						**Java 8: default law you can add implementation have to be carful with usage a way of getting around multiple inhertiance issues
//		a class can implement more than one interface sneak around mi issues. 
//		interfaces can extend each other but classes cannot extend them, classes can import multiple interafaces.
//		marker interface: no methods just give a type. 
//		instance of operator to check what is edible. 
		
// Enum is a class essentailly a list of constants, useful if you have a predefined list. 

// final key word- applied to a class cannot be extended, applied to a method cannot be overriden, applied to a var cannot be changed 
	
// method decleration: modifiers, return type, method name, parameter list, exception list
// method signature: method name and params. 
		
// Wrapper class is an object reporesentation of our primitive types. 
// Marker interface an interface that has no defined methods, but can indicate classes that have them so like edible interface with food classes.
		
// heap and stack memory- entire program shares the heap every thread of execution has a stack of its own. Stack is the refrence to the location in heap memory where the object is kept 

// autoboxing is using the wrapper class to turn prim data type to an object autounboxing is the opposite 
	}
	
	static Vehicle chooseAVehicle() {
		Vehicle chosenVehicle = null;
		Vehicle[] vehicles = {new Tornado(147.2), new Kayak("red",10,14,13), new Tornado(50.5)};
		for (int i = 0; i<vehicles.length; i++) {
			if(vehicles[i] instanceof Steerable) {
				
			}
		}
		
		return chosenVehicle;
	}

}
