package com.techelevator.house;

import java.util.*;

public class House {
    /*
    Property	DataType	Get	Set	Constructor	description
    StreetAddress	String	x		X	Number of the house (123)
    Street	String	x		x	Street of the house (Main Ave.)
    PostalCode	String	x		x	Postal Code
    StateCode	String	x		x	State code of the house
    OwnerFirstname	String	x	x	x
    OwnerLastname	String	x	X	X
    SalePrice	Double	x	x	x
    YearlyTaxAmount	Double	x			Derived from taxRate and SalePrice
    TaxRate	Double	x	x

     */
    private String streetAddress;
    private String street;
    private String postalCode;
    private String stateCode;
//    private String ownerFirstname;
//    private String ownerLastname;
//    private double salePrice;
    private static double taxRate;

    public HouseOwner owner;

    public List<HouseOwner> owners;


    public House(String streetAddress, String street, String postalCode, String stateCode, String ownerFirstname, String ownerLastname) {
        this.streetAddress = streetAddress;
        this.street = street;
        this.postalCode = postalCode;
        this.stateCode = stateCode;
        this.owner = new HouseOwner(ownerFirstname,ownerLastname,0);
//        this.ownerFirstname = ownerFirstname;
//        this.ownerLastname = ownerLastname;
//        this.salePrice = 0;
        this.taxRate = 3.0;
    }

    public void setHouseAddress(String streetAddress, String street, String postalCode, String stateCode) {
        this.streetAddress = streetAddress;
        this.street = street;
        this.postalCode = postalCode;
        this.stateCode = stateCode;
    }
    public void setHouseAddress(String fullAddress) {
        //parse the string and set individual fields
    }
    public String getHouseAddress() {
        return this.streetAddress + " " + this.street + " " + this.postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public String getOwnerFirstname() {
        return owner.getOwnerFirstname();
    }

    public String getOwnerLastname() {
        return owner.getOwnerLastname();
    }

    public double getSalePrice() {
        return owner.getSalePrice();
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setOwnerFirstname(String ownerFirstname) {
        owner.setOwnerFirstname( ownerFirstname);
    }

    public void setOwnerLastname(String ownerLastname) {
        owner.setOwnerLastname( ownerLastname);
    }

    public void setSalePrice(double salePrice) {
        owner.setSalePrice(salePrice);
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getYearlyTaxAmount() {
        return this.getSalePrice() * (taxRate/100);
    }

    public boolean sellHouse(String firstName, String lastName, double salePrice){
        if (owners==null){
            owners = new ArrayList<HouseOwner>();
            owners.add(owner);
        }
        owner = new HouseOwner(firstName,lastName,salePrice);
        owners.add(owner);
        return true;
    }
    public List<HouseOwner> getOwners(){
        if (owners==null){
            List<HouseOwner> localOwner = new ArrayList<HouseOwner>();
            localOwner.add(owner);
            return localOwner;
        }
        return owners;
    }
}
