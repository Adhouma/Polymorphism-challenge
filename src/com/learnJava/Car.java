package com.learnJava;

public class Car {
	
	private String name;
	private int wheels;
	private int cylinders;
	private boolean engine;
	
	// Constructor
	public Car(String name, int cylinders) {
		this.name = name;
		this.wheels = 4;
		this.cylinders = cylinders;
		this.engine = true;
	}
	
	// Methods
	public void startEngine() {
		System.out.println("Car engine started");
	}
	
	public void accelerate(int speed) {
		System.out.println("Car accelerate with " + speed + "km/h");
	}
	
	public void brake() {
		System.out.println("Car brakes ...");
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}

	public int getCylinders() {
		return cylinders;
	}

	public boolean isEngine() {
		return engine;
	}
	
}
