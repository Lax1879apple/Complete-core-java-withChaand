package org.animal.parent.main;

import org.animal.fish.parent.Fish;
import org.animal.reptiles.parent.Reptiles;
import org.animal.reptiles.parent.corcodile.Crocodile;


public class MainApp  {

	public static void main(String[] args) {
		// only for reptile class.
		Reptiles reptile = new Reptiles();
		System.out.println("Reptile is = " + reptile.getBloodType());
		System.out.println(reptile.showInfo());		
		System.out.println("*********************");
		
		// below here is reptile class and crocodile sub-class (or child class) console display details.
		Crocodile crocodile = new Crocodile();
		System.out.println(crocodile.showInfo());
		System.out.println("Crocodile has = " + crocodile.getEgg());
		
		System.out.println("*********************");
		
		//showing fish properties.
		
		Fish fish = new Fish("h20", true, 1, 2.0d, "aquatic", "cold");
		System.out.println("Fish is = " + fish.getBloodType());
		System.out.println(fish.showInfo());
	}

}
