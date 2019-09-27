package org.inheritanceInJava.vehicles;

import org.inheritanceInJava.vehicle.parent.Vehicle;

public class Truck extends Vehicle {
	private String carryLoads;
	private int loadCapacity;
	
	public Truck() {
		super();
		this.carryLoads = "heavyGoods";
		this.loadCapacity = 600;	
	}

	public Truck(String carryLoads, int loadCapacity, boolean driver, String engine, String lights, int wheels, int seats, int fuelTank) {
		super(driver,engine,lights,wheels,seats,fuelTank);
		this.carryLoads = carryLoads;
		this.loadCapacity = loadCapacity;
	}

	public String getCarryLoads() {
		return carryLoads;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	@Override
	public String toString() {
		return "Truck [getCarryLoads()=" + getCarryLoads() + ", getLoadCapacity()=" + getLoadCapacity()
				+ ", isDriver()=" + isDriver() + ", getEngine()=" + getEngine() + ", getLights()=" + getLights()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ "]";
	}
	
	public void run() {
		System.out.println("Running Truck with heavy load");
		System.out.println(toString());
	}

	
	
}
