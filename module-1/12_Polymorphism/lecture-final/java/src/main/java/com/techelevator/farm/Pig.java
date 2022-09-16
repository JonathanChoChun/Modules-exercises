package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {
    public Pig(){
        super("Pig", "Oink!!");
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(100);
    }
}
