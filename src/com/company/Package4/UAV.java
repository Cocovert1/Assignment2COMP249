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

public class UAV {
    //initializes values
    protected double weight;
    protected double price;

    //default constructor
    public UAV(){
        weight = 0;
        price = 0;
    }

    //copy constructor
    public UAV(UAV uav) {
        this.weight = uav.weight;
        this.price = uav.price;
    }

    //parameterized constructor
    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    //to string with general message of the class identity
    public String toString() {
        return "This UAV has a weight of " + this.weight + ", and a price of " + this.price + ".";
    }

    //finds if the compared object is equal to this class in values and class
    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.weight == ((UAV) a).weight && this.price == ((UAV) a).price) {
            isEqual =true;
        }
        return isEqual;
    }

    //getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
