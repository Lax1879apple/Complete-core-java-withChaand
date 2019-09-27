package org.animal.reptiles.parent.corcodile;

import org.animal.reptiles.parent.Reptiles;

public class Crocodile extends Reptiles {
	private String egg;

	public Crocodile() {
		super();
		this.egg = "hard-shelled eggs";
	}

	public Crocodile(String eggs) {
		super();
		this.egg = eggs;
	}

	public String getEgg() {
		return egg;
	}

	@Override
	public String toString() {
		return "Crocodile [getEgg()=" + getEgg() + ", getSkinType()=" + getSkinType() + ", isBackbone()=" + isBackbone()
				+ ", getEggs()=" + getEggs() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	
	
}
