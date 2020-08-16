package com.learnJava;

public class FordRaptor extends Car {

	public FordRaptor(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public void startEngine() {
		System.out.println(super.getName() + " engine started");
	}

	@Override
	public void accelerate(int speed) {
		System.out.println(super.getName() + " accelerate with " + speed + "km/h");
	}

	@Override
	public void brake() {
		System.out.println(super.getName() + " brakes ...");
	}

}
