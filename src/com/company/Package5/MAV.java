// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------

/*
The MAV class has 2 values. 3 Consturctors (default, copy and a parameterized constructor). It has a toString, an equals method
that finds if the objects compared is of class MAV and if it has the same values as the one its being compared to, and getters and setters.
It extends from the UAV class therefore it inherits the values from the Helicopter class. It overrides the toString and equals method.
 */

//fifth package
package com.company.Package5;

import com.company.Package4.UAV; //imports the UAV class package

/**
 * MAV represents each MAV object that is created, it extends from the UAV class
 *
 * @author Alessio Cipriano-Kardous
 * @author Nicholas Pop
 * @version 1.1
 */
public class MAV extends UAV {
    //initializes values
    private String model;
    private double size;

    //default constructor

    /**
     * Default constructor that initializes a MAV with default values.
     */
    public MAV() {
        super();
        model = "DJI";
        size = 670;
    }

    //copy constructor

    /**
     * Copy constructor of the MAV class.
     *
     * @param mav MAV object that is to be copied
     */
    public MAV(MAV mav) {
        super(mav);
        this.model = mav.model;
        this.size = mav.size;
    }

    //parameterized constructor

    /**
     * Parameterized constructor that initializes the MAV object.
     *
     * @param weight this is the weight of the MAV
     * @param price  this is the price of the MAV
     * @param model  this is the model of the MAV
     * @param size   this is the size of the MAV
     */
    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    @Override
    //to string with general message of the class identity
    /**
     *  This returns a String with information on the MAV object.
     * @return a String with the MAV atributes
     */
    public String toString() {
        return "This MAV has a weight of " + this.weight + ", its price is " + this.price + ". It is of model "
                + this.model + ", and of size " + this.size + ".";
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
        } else if (this.weight == ((MAV) a).weight && this.price == ((MAV) a).price && this.model.equals(((MAV) a).model) && this.size == ((MAV) a).size) {
            isEqual = true;
        }
        return isEqual;
    }

    //getters and setters

    /**
     * This returns the model of the MAV.
     *
     * @return an String value of the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the MAV.
     *
     * @param model is the model of the MAV
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * This returns the size of the MAV.
     *
     * @return an double value of the size
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the MAV.
     *
     * @param size is the size of the MAV
     */
    public void setSize(double size) {
        this.size = size;
    }
}
