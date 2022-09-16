package com.techelevator.house;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        House house = new House("123","main","33701","FL","Rob","Stewart");
        house.setSalePrice(100000);
        house.setTaxRate(5);
        System.out.println(house.getYearlyTaxAmount());
        System.out.println(house.getOwnerFirstname());


        House house2 = new House("124","main","33701","FL","George","Smith");
        house2.setSalePrice(150000);
        house.setTaxRate(5);
        System.out.println(house2.getYearlyTaxAmount());
        System.out.println(house2.getOwnerFirstname());
        house2.sellHouse("Rob","George",175000);
        System.out.println(house2.getOwnerFirstname());
        System.out.println("----");
        for (HouseOwner owner : house.getOwners()) {
            System.out.println(owner.getOwnerFirstname());
        }

    }
}
