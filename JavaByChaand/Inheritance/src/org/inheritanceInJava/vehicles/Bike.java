package org.inheritanceInJava.vehicles;

import org.inheritanceInJava.vehicle.parent.Vehicle;

public class Bike extends Vehicle {
  private String handle;

public Bike() {
	super();
	this.handle = "short";
}

public Bike(String handle, boolean driver, String engine, String lights, int wheels, int seats, int fuelTank) {
	super(driver,engine,lights,wheels,seats,fuelTank);
	this.handle = handle;
}

public String getHandle() { // setting up setters and getters, but since we initialized setters//
	return handle;          //  by using constructors, we singly need getters here.//
}

@Override
public String toString() {
	return "Bike [getHandle()=" + getHandle() + ", isDriver()=" + isDriver() + ", getEngine()=" + getEngine()
			+ ", getLights()=" + getLights() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
			+ ", getFuelTank()=" + getFuelTank() + "]";
}

public void run() {
	System.out.println("Running bike");
	System.out.println(toString());
	
}

}
  
  

