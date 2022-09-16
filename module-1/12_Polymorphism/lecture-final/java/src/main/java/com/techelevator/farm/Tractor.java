package com.techelevator.farm;

import java.math.BigDecimal;

public class Tractor implements Singable, Sellable {
    BigDecimal price;

    public Tractor(){
        this.price = new BigDecimal(10000);
    }
    public void driveOnTheFarm(){

    }
    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Tractor";
    }

    @Override
    public String getSound() {
        return "Vroom!";
    }
}
