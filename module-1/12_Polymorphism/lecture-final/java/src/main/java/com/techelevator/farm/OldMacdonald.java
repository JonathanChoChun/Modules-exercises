package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {
//		Cow cow = new Cow();
		Singable chicken = new Chicken();
//		String name2 = ((Chicken)chicken).l;
//
//		FarmAnimal chickenFarmAnimal = new Chicken();
//		chicken.layEgg();
//		chickenFarmAnimal.
		//Singable cow = new Singable()
		Singable[] farmAnimals = new Singable[] { new Cow(), new Chicken(), new Pig(), new Tractor() };


		for (Singable animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] itemsForSale = new Sellable[] {new Egg(), new Tractor(), new Pig(), new Chicken()};
		for (Sellable item : itemsForSale) {
			System.out.println("You can get a " + item.getName() + " if you want it");
			System.out.println("for only :" + item.getPrice() );
		}
	}
}