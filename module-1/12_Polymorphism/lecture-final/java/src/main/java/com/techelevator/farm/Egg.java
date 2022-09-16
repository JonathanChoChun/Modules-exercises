package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable {
    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(1);
    }

    @Override
    public String getName() {
        return "Egg";
    }
}
