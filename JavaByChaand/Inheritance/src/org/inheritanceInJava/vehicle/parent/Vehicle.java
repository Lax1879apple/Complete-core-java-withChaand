package org.inheritanceInJava.vehicle.parent;

public class Vehicle {
	private boolean driver;
	private String engine;
	private String lights;
	private int wheels;
	private int seats;
	private int  fuelTank;
	
	public Vehicle() {
		 this.driver =true;
		 this.engine = "petrol";
		 this.lights = "LED";
		 this.wheels = 4;
		 this.seats = 5;
		 this.fuelTank = 20;
		
	}
	
	public Vehicle(boolean driver, String engine, String lights, int wheels, int seats, int fuelTank) {
	
		this.driver = driver;
		this.engine = engine;
		this.lights = lights;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
	}

	public boolean isDriver() {
		return driver;
	}

	public String getEngine() {
		return engine;
	}

	public String getLights() {
		return lights;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}
	
	public void run() {
		System.out.println("Running vehicle");
	}

}
