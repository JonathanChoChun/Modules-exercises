package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal implements Sellable {

	BigDecimal price;
	public Chicken() {
		super("Chicken", "cluck!");
		this.price = BigDecimal.valueOf(1);
	}

	public void layEgg() {
		System.out.println( getName() + " laid an egg!");
	}

	@Override
	public BigDecimal getPrice() {
		return this.price;
	}
}