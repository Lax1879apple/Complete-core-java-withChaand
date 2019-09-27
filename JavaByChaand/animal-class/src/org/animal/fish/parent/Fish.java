package org.animal.fish.parent;

import org.animal.parent.Animals;

public class Fish extends  Animals{
	private String habitate;
	private boolean gills;
	
	public Fish() {
		super();
		this.habitate = "water";
		this.gills = true;
	}
	
	public Fish(String habitate, boolean gills, int height, double weight, String animalType, String bloodType) {
		super(2, 5.3d, "aquatic", "cold-blooded");
		this.habitate = habitate;
		this.gills = gills;
	}
	public String getHabitate() {
		return habitate;
	}
	public boolean isGills() {
		return gills;
	}
	
	
}
