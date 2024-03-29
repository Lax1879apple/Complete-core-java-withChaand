package org.animal.reptiles.parent;

import org.animal.parent.Animals;

public class Reptiles extends Animals {
	private String skinType;
	private boolean backbone;
	private String eggs;
	
	public Reptiles() {
		super(); 
		this.skinType ="drySkin";
		this.backbone = true;
		this.eggs = "soft-shelled eggs";
	}

	public Reptiles(String skinType, boolean backbone, String eggs,int height, double weight, String animalType, String bloodType) {
		super(2, 4d, "reptile-crawls", "cold-blooded");
		this.skinType = skinType;
		this.backbone = backbone;
		this.eggs = eggs;
	}

	public String getSkinType() {
		return skinType;
	}

	public boolean isBackbone() {
		return backbone;
	}

	public String getEggs() {
		return eggs;
	}

	@Override
	public String showInfo() {
		return "Reptiles [getSkinType()=" + getSkinType() + ", isBackbone()=" + isBackbone() + ", getEggs()="
				+ getEggs() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
}
