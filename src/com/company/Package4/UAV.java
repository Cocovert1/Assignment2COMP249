// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------

/*
The UAV class has 2 values. 3 Consturctors (default, copy and a parameterized constructor). It has a toString, an equals method
that finds if the objects compared is of class UAV and if it has the same values as the one its being compared to, and getters and setters.
It is a superclass.
 */

//fourth package
package com.company.Package4;

/**
 * UAV represents each UAV object that is created, it is a superclass
 *
 * @author Alessio Cipriano-Kardous
 * @author Nicholas Pop
 * @version 1.1
 */
public class UAV {
    //initializes values
    protected double weight;
    protected double price;

    //default constructor

    /**
     * Default constructor that initializes a UAV with default values.
     */
    public UAV() {
        weight = 5400;
        price = 500;
    }

    //copy constructor

    /**
     * Copy constructor of the UAV class.
     *
     * @param uav UAV object that is to be copied
     */
    public UAV(UAV uav) {
        this.weight = uav.weight;
        this.price = uav.price;
    }

    //parameterized constructor

    /**
     * Parameterized constructor that initializes the UAV object.
     *
     * @param weight this is the weight of the UAV
     * @param price  this is the price of the UAV
     */
    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    //to string with general message of the class identity
    /**
     *  This returns a String with information on the UAV object.
     * @return a String with the UAV atributes
     */
    public String toString() {
        return "This UAV has a weight of " + this.weight + ", and a price of " + this.price + ".";
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
        } else if (this.weight == ((UAV) a).weight && this.price == ((UAV) a).price) {
            isEqual = true;
        }
        return isEqual;
    }

    //getters and setters

    /**
     * This returns the weight of the UAV.
     *
     * @return an double value of the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the UAV.
     *
     * @param weight is the weight of the UAV
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * This returns the number of rotors of the UAV.
     *
     * @return an int value of the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the UAV.
     *
     * @param price is the price of the UAV
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
