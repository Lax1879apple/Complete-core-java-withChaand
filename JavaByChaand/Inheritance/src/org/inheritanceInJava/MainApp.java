package org.inheritanceInJava;

import org.inheritanceInJava.vehicles.Bike;
import org.inheritanceInJava.vehicles.Bus;
import org.inheritanceInJava.vehicles.Truck;

public class MainApp {

	public static void main(String[] args) {
//		Bike bike = new Bike();
//		System.out.println(bike.getFuelTank());
//		System.out.println(bike.getHandle());
		
		Bike bike = new Bike("long", false, "petrol", "focusedLED", 2, 2, 10 );
		System.out.println(bike);
		System.out.println("****************");
		Bus bus = new Bus("generalPeople", "Delhi", true, true, "diseal", "LED", 4, 30, 65);
		System.out.println(bus);
		System.out.println("****************");
		
		Truck truck = new Truck("heavy loads", 800, true, "diseal", "normal lights", 18, 4, 300);
		System.out.println(truck);
		System.out.println("****************");
		System.out.println("Truck engine is " + truck.getEngine());
		System.out.println("****************");
		System.out.println("Truck carries " + truck.getCarryLoads());
		System.out.println("****************");
		bike.run();
		System.out.println("****************");
		truck.run();
		System.out.println("****************");
		bus.run();
		
	
	}

}
