// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------

/*
The AgriculturalDrone class has 2 values. 3 Consturctors (default, copy and a parameterized constructor). It has a toString, an equals method
that finds if the objects compared is of class AgriculturalDrone and if it has the same values as the one its being compared to, and getters and setters.
It extends from the UAV class therefore it inherits the values from the Helicopter class. It overrides the toString and equals method.
 */

//fifth package
package com.company.Package5;

import com.company.Package4.UAV; //imports the UAV class package

public class AgriculturalDrone extends UAV {
    //initializes values
    private String brand;
    private int carry_capacity;

    //default constructor
    public AgriculturalDrone(){
        super();
        brand = "unknown";
        carry_capacity = 0;
    }

    //copy constructor
    public AgriculturalDrone(AgriculturalDrone agriculturalDrone){
        super(agriculturalDrone);
        this.brand = agriculturalDrone.brand;
        this.carry_capacity = agriculturalDrone.carry_capacity;
    }

    //parameterized constructor
    public AgriculturalDrone(double weight, double price, String brand, int carry_capacity) {
        super(weight, price);
        this.brand = brand;
        this.carry_capacity = carry_capacity;
    }

    @Override
    //to string with general message of the class identity
    public String toString() {
        return "This Agricultural Drone is manufactured by " + this.brand + ", and it has a carry capacity of " + this.carry_capacity
                + ". It has a weight of " + this.weight + ", and a price of " + this.price + ".";
    }

    //finds if the compared object is equal to this class in values and class
    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.weight == ((AgriculturalDrone) a).weight && this.price == ((AgriculturalDrone) a).price && this.brand.equals(((AgriculturalDrone) a).brand) && this.carry_capacity == ((AgriculturalDrone) a).carry_capacity) {
            isEqual =true;
        }
        return isEqual;
    }

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarry_capacity() {
        return carry_capacity;
    }

    public void setCarry_capacity(int carry_capacity) {
        this.carry_capacity = carry_capacity;
    }
}
