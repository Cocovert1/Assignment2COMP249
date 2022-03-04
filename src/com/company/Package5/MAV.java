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

public class MAV extends UAV {
    //initializes values
    private String model;
    private double size;

    //default constructor
    public MAV(){
        super();
        model = "unknown";
        size = 0;
    }

    //copy constructor
    public MAV(MAV mav){
        super(mav);
        this.model = mav.model;
        this.size = mav.size;
    }

    //parameterized constructor
    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    @Override
    //to string with general message of the class identity
    public String toString() {
        return "This MAV has a weight of " + this.weight + ", its price is " + this.price + ". It is of model "
                + this.model + ", and of size " + this.size + ".";
    }

    //finds if the compared object is equal to this class in values and class
    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.weight == ((MAV) a).weight && this.price == ((MAV) a).price && this.model.equals(((MAV) a).model) && this.size == ((MAV) a).size) {
            isEqual =true;
        }
        return isEqual;
    }

    //getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
