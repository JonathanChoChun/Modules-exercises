package com.techelevator.house;

public class HouseOwner {
    private String ownerFirstname;
    private String ownerLastname;
    private double salePrice;

    public HouseOwner(String ownerFirstname, String ownerLastname, double salePrice) {
        this.ownerFirstname = ownerFirstname;
        this.ownerLastname = ownerLastname;
        this.salePrice = salePrice;
    }

    public String getOwnerFirstname() {
        return ownerFirstname;
    }

    public void setOwnerFirstname(String ownerFirstname) {
        this.ownerFirstname = ownerFirstname;
    }

    public String getOwnerLastname() {
        return ownerLastname;
    }

    public void setOwnerLastname(String ownerLastname) {
        this.ownerLastname = ownerLastname;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
