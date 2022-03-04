// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------

/*
The Quadcopter class has 1 value. 3 Consturctors (default, copy and a parameterized constructor). It has a toString, an equals method
that finds if the objects compared is of class Quadcopter and if it has the same values as the one its being compared to, and getters and setters.
It extends from the Helicopter class therefore it inherits the values from the Helicopter class. It overrides the toString and equals method.
 */

//second package
package com.company.Package2;

/**
 * Quadcopter represents each quadcopter object that is created, it extends from Helicopter
 *
 * @author Alessio Cipriano-Kardous
 * @author Nicholas Pop
 * @version 1.1
 */
public class Quadcopter extends Helicopter {
    //initializes values
    private int max_fly_speed;

    //default constructor

    /**
     * Default constructor that initializes a quadcopter with default values.
     */
    public Quadcopter() {
        super();
        max_fly_speed = 1450;
    }

    //copy constructor

    /**
     * Copy constructor of the quadcopter class.
     *
     * @param quadcopter quadcopter object that is to be copied
     */
    public Quadcopter(Quadcopter quadcopter) {
        super(quadcopter);
        this.max_fly_speed = quadcopter.max_fly_speed;
    }

    //parameterized constructor

    /**
     * Parameterized constructor that initializes the quadcopter object.
     *
     * @param brand              this is the brand of the quadcopter
     * @param price              this is the price of the quadcopter
     * @param horsepower         this is the horsepower of the quadcopter
     * @param num_cylinders      this is the number of cylinders of the quadcopter
     * @param creation_year      this is the creation year of the quadcopter
     * @param passenger_capacity this is the passenger capacity of the quadcopter
     * @param max_fly_speed      this is the max flying speed of the quadcopter
     */
    public Quadcopter(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity, int max_fly_speed) {
        super(brand, price, horsepower, num_cylinders, creation_year, passenger_capacity);
        this.max_fly_speed = max_fly_speed;
    }

    @Override
    //to string with general message of the class identity
    /**
     *  This returns a String with information on the quadcopter object.
     * @return a String with the quadcopter atributes
     */
    public String toString() {
        return "This Quadcopter has a max flying speed of " + this.max_fly_speed + "." + "It has " + this.num_cylinders + " cylinders."
                + " It was created in " + this.creation_year + ", and it has a passenger capacity of " + this.passenger_capacity
                + ". It is manufactured by " + this.brand + ". Its price is " + this.price + ". It has a horsepower of "
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
        } else if (this.brand.equals(((Quadcopter) a).brand) && this.price == ((Quadcopter) a).price && this.horsepower == ((Quadcopter) a).horsepower && this.num_cylinders == ((Quadcopter) a).num_cylinders && this.creation_year == ((Quadcopter) a).creation_year && this.passenger_capacity == ((Quadcopter) a).passenger_capacity && this.max_fly_speed == ((Quadcopter) a).max_fly_speed) {
            isEqual = true;
        }
        return isEqual;
    }

    //getters and setters

    /**
     * This returns the max flying speed of the quadcopter.
     *
     * @return an int value of the max flying speed
     */
    public int getMax_fly_speed() {
        return max_fly_speed;
    }

    /**
     * Sets the max flying speed of the quadcopter.
     *
     * @param max_fly_speed is the maximum flying speed of the quadcopter
     */
    public void setMax_fly_speed(int max_fly_speed) {
        this.max_fly_speed = max_fly_speed;
    }
}
