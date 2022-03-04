// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------

/*
The Airplane class has 3 values. 3 Consturctors (default, copy and a parameterized constructor). It has a toString, an equals method
that finds if the objects compared is of class Airplane and if it has the same values as the one its being compared to, and getters and setters.
It is a superclass.
 */

//first package
package com.company.Package1;

/**
 * Airplane represents each airplane object that is created
 *
 * @author Alessio Cipriano-Kardous
 * @author Nicholas Pop
 * @version 1.1
 */
public class Airplane {
    //initializes values
    protected String brand;
    protected double price;
    protected int horsepower;

    /**
     * Default constructor that initializes a airplane with default values.
     */
    public Airplane() { //default constructor
        brand = "Boeing";
        price = 100000000;
        horsepower = 3500;
    }

    /**
     * Copy constructor of the aiplane class.
     *
     * @param airplane airplane object that is to be copied
     */
    public Airplane(Airplane airplane) { //copy constructor
        this.brand = airplane.brand;
        this.price = airplane.price;
        this.horsepower = airplane.horsepower;
    }

    /**
     * Parameterized constructor that initializes the airplane object.
     *
     * @param brand      this is the brand of the airplane
     * @param price      this is the price of the airplane
     * @param horsepower this is the horsepower of the airplane
     */
    public Airplane(String brand, double price, int horsepower) { //parameterized constructor
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    //to string with general message of the class identity
    @Override
    /**
     *  This returns a String with information on the airplane object.
     * @return a String with the airplane atributes
     */
    public String toString() {
        return "This Airplane is manufactured by " + this.brand + ". Its price is " + this.price + ". It has a horsepower of "
                + this.horsepower + ".";
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
        } else if (this.brand.equals(((Airplane) a).brand) && this.price == ((Airplane) a).price && this.horsepower == ((Airplane) a).horsepower) {
            isEqual = true;
        }
        return isEqual;
    }

    //getters and setters

    /**
     * This returns brand of the airplane.
     *
     * @return a String value of the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the airplane.
     *
     * @param brand is the brand of the airplane
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This returns the price of the airplane.
     *
     * @return a double value of the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the airplane.
     *
     * @param price is the price of the airplane
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This returns the horsepower of the airplane.
     *
     * @return an int value of the horsepower
     */
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * Sets the horsepower of the airplane.
     *
     * @param horsepower is the horsepower of the airplane
     */
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
