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

/**
 * AgriculturalDrone represents each AgriculturalDrone object that is created, it extends from the UAV class
 *
 * @author Alessio Cipriano-Kardous
 * @author Nicholas Pop
 * @version 1.1
 */
public class AgriculturalDrone extends UAV {
    //initializes values
    private String brand;
    private int carry_capacity;

    //default constructor

    /**
     * Default constructor that initializes a AgriculturalDrone with default values.
     */
    public AgriculturalDrone() {
        super();
        brand = "TrucksNStops";
        carry_capacity = 1000;
    }

    //copy constructor

    /**
     * Copy constructor of the agriculturalDrone class.
     *
     * @param agriculturalDrone agriculturalDrone object that is to be copied
     */
    public AgriculturalDrone(AgriculturalDrone agriculturalDrone) {
        super(agriculturalDrone);
        this.brand = agriculturalDrone.brand;
        this.carry_capacity = agriculturalDrone.carry_capacity;
    }

    //parameterized constructor

    /**
     * Parameterized constructor that initializes the agriculturalDrone object.
     *
     * @param weight         this is the weight of the agriculturalDrone
     * @param price          this is the price of the agriculturalDrone
     * @param brand          this is the brand of the agriculturalDrone
     * @param carry_capacity this is the carry capacity of the agriculturalDrone
     */
    public AgriculturalDrone(double weight, double price, String brand, int carry_capacity) {
        super(weight, price);
        this.brand = brand;
        this.carry_capacity = carry_capacity;
    }

    @Override
    //to string with general message of the class identity
    /**
     *  This returns a String with information on the agriculturalDrone object.
     * @return a String with the agriculturalDrone atributes
     */
    public String toString() {
        return "This Agricultural Drone is manufactured by " + this.brand + ", and it has a carry capacity of " + this.carry_capacity
                + ". It has a weight of " + this.weight + ", and a price of " + this.price + ".";
    }

    //finds if the compared object is equal to this class in values and class

    /**
     * This returns a boolean with the outcome of the equals method. Checks if the compared objects are the exact same.
     *
     * @param a Object that is to be compared to
     * @return a boolean of the outcome of the comparison
     */
    public boolean equals(Object a) {
        boolean isEqual = false;
        if (a == null) {
            isEqual = false;
        } else if (this.getClass() != a.getClass()) {
            isEqual = false;
        } else if (this.weight == ((AgriculturalDrone) a).weight && this.price == ((AgriculturalDrone) a).price && this.brand.equals(((AgriculturalDrone) a).brand) && this.carry_capacity == ((AgriculturalDrone) a).carry_capacity) {
            isEqual = true;
        }
        return isEqual;
    }

    //getters and setters

    /**
     * This returns the brand of the agriculturalDrone.
     *
     * @return an String value of the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the agriculturalDrone.
     *
     * @param brand is the brand of the agriculturalDrone
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This returns the carry capacity of the agriculturalDrone.
     *
     * @return an int value of the carry capacity
     */
    public int getCarry_capacity() {
        return carry_capacity;
    }

    /**
     * Sets the carry capacity of the agriculturalDrone.
     *
     * @param carry_capacity is the carry capacity of the agriculturalDrone
     */
    public void setCarry_capacity(int carry_capacity) {
        this.carry_capacity = carry_capacity;
    }
}
