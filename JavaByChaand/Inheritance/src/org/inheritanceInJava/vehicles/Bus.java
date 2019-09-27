package org.inheritanceInJava.vehicles;

import org.inheritanceInJava.vehicle.parent.Vehicle;

public class Bus extends Vehicle {
	private String passengers;
	private String whereGo;
	private boolean fare;
	
	public Bus() {
		super();
		passengers = "publicTravellers";
		whereGo = "Ktm";
		fare = true;
	
	}
	
	public Bus(String passengers, String whereGo, boolean fare, boolean driver, String engine, String lights, int wheels, int seats, int fuelTank) {
		super(driver,engine,lights,wheels, seats, fuelTank);
		this.passengers = passengers;
		this.whereGo = whereGo;
		this.fare = fare;
	}


	public String getPassengers() {
		return passengers;
	}

	public String getWhereGo() {
		return whereGo;
	}

	public boolean isFare() {
		return fare;
	}

	@Override
	public String toString() {
		return "Bus [getPassengers()=" + getPassengers() + ", getWhereGo()=" + getWhereGo() + ", isFare()=" + isFare()
				+ ", isDriver()=" + isDriver() + ", getEngine()=" + getEngine() + ", getLights()=" + getLights()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ "]";
	}
	
	public void run() {
		System.out.println("Running bus with full of passengers");
		System.out.println(toString());
	}
	
}