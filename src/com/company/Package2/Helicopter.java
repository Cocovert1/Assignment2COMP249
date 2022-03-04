// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------

/*
The Helicopter class has 3 values. 3 Consturctors (default, copy and a parameterized constructor). It has a toString, an equals method
that finds if the objects compared is of class Helicopter and if it has the same values as the one its being compared to, and getters and setters.
It extends from the Airplane class therefore it inherits the values from the Airplane class. It overrides the toString and equals method.
 */

//second package
package com.company.Package2;

import com.company.Package1.Airplane; //imports the airplane class package

/**
 * Helicopter represents each helicopter object that is created, it extends from Airplane
 *
 * @author Alessio Cipriano-Kardous
 * @author Nicholas Pop
 * @version 1.1
 */
public class Helicopter extends Airplane {
    //initializes values
    protected int num_cylinders;
    protected int creation_year;
    protected int passenger_capacity;

    //default constructor

    /**
     * Default constructor that initializes a helicopter with default values.
     */
    public Helicopter() {
        super();
        num_cylinders = 10;
        creation_year = 2000;
        passenger_capacity = 120;
    }

    //copy constructor

    /**
     * Copy constructor of the helicopter class.
     *
     * @param helicopter helicopter object that is to be copied
     */
    public Helicopter(Helicopter helicopter) {
        super(helicopter);
        this.num_cylinders = helicopter.num_cylinders;
        this.creation_year = helicopter.creation_year;
        this.passenger_capacity = helicopter.passenger_capacity;
    }

    //parameterized constructor

    /**
     * Parameterized constructor that initializes the helicopter object.
     *
     * @param brand              this is the brand of the helicopter
     * @param price              this is the price of the helicopter
     * @param horsepower         this is the horsepower of the helicopter
     * @param num_cylinders      this is the number of cylinders of the helicopter
     * @param creation_year      this is the creation year of the helicopter
     * @param passenger_capacity this is the passenger capacity of the helicopter
     */
    public Helicopter(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity) {
        super(brand, price, horsepower);
        this.num_cylinders = num_cylinders;
        this.creation_year = creation_year;
        this.passenger_capacity = passenger_capacity;
    }

    @Override
    //to string with general message of the class identity
    /**
     *  This returns a String with information on the helicopter object.
     * @return a String with the helicopter atributes
     */
    public String toString() {
        return "This Helicopter has " + this.num_cylinders + " cylinders, it was created in " + this.creation_year + ", and it can carry up to "
                + this.passenger_capacity + "." + "It is manufactured by " + this.brand + ". Its price is "
                + this.price + ". It has a horsepower of " + this.horsepower + ".";
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
        } else if (this.brand.equals(((Helicopter) a).brand) && this.price == ((Helicopter) a).price && this.horsepower == ((Helicopter) a).horsepower && this.num_cylinders == ((Helicopter) a).num_cylinders && this.creation_year == ((Helicopter) a).creation_year && this.passenger_capacity == ((Helicopter) a).passenger_capacity) {
            isEqual = true;
        }
        return isEqual;
    }

    //getters and setters

    /**
     * This returns the number of cylinders of the helicopter.
     *
     * @return an int value of the number of cylinders
     */
    public int getNum_cylinders() {
        return num_cylinders;
    }

    /**
     * Sets the number of cylinders of the helicopter.
     *
     * @param num_cylinders is the number of cylinders of the helicopter
     */
    public void setNum_cylinders(int num_cylinders) {
        this.num_cylinders = num_cylinders;
    }

    /**
     * This returns the creation year of the helicopter.
     *
     * @return an int value of the creation year
     */
    public int getCreation_year() {
        return creation_year;
    }

    /**
     * Sets the creation year of the helicopter.
     *
     * @param creation_year is the creation year of the helicopter
     */
    public void setCreation_year(int creation_year) {
        this.creation_year = creation_year;
    }

    /**
     * This returns the passenger capacity of the helicopter.
     *
     * @return an int value of the passenger capacity
     */
    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    /**
     * Sets the passenger capacity of the helicopter.
     *
     * @param passenger_capacity is the passenger capacity of the helicopter
     */
    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }
}
