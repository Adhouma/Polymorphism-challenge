package com.learnJava;

public class Main {
	/**
	 * Create a base class called Car
	 * It should have a few fields that would be appropriate for a generice car class engine, cylinders, wheels, etc.
	 * Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
	 * Cylinders and names would be passed parameters.
	 * Create appropriate getters
	 * Create some methods like startEngine, accelerate, and brake
	 * show a message for each in the base class
	 * Now create 3 sub classes for your favorite vehicles.
	 * Override the appropriate methods to demonstrate polymorphism in use.
	 */
	public static void main(String[] args) {
		System.out.println("/*--- Car ---*/");
		Car car = new Car("Basic car", 4);
		car.startEngine();
		car.accelerate(80);
		car.brake();
		System.out.println("\n");
		
		System.out.println("/*--- Unknown Car ---*/");
		Car unknownCar = new UnknownCar("Unknown Car", 4);
		unknownCar.startEngine();
		unknownCar.accelerate(50);
		unknownCar.brake();
		System.out.println("\n");
		
		System.out.println("/*--- Ford Raptor ---*/");
		Car fordRaptor = new FordRaptor("Ford Raptor", 8);
		fordRaptor.startEngine();
		fordRaptor.accelerate(220);
		fordRaptor.brake();
		System.out.println("\n");
		
		System.out.println("/*--- BMW X5 ---*/");
		Car bmw = new BMW("BMW X5", 6);
		bmw.startEngine();
		bmw.accelerate(160);
		bmw.brake();
		System.out.println("\n");
		
		System.out.println("/*--- Mercedes AMG ---*/");
		Car mercedes = new Mercedes("Mercedes AMG", 6);
		mercedes.startEngine();
		mercedes.accelerate(140);
		mercedes.brake();
		System.out.println("\n");
	}
}
