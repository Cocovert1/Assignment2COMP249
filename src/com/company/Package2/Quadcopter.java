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

public class Quadcopter extends Helicopter {
    //initializes values
    private int max_fly_speed;

    //default constructor
    public Quadcopter(){
        super();
        max_fly_speed = 0;
    }

    //copy constructor
    public Quadcopter(Quadcopter quadcopter) {
        super(quadcopter);
        this.max_fly_speed = quadcopter.max_fly_speed;
    }

    //parameterized constructor
    public Quadcopter(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity, int max_fly_speed) {
        super(brand, price, horsepower, num_cylinders, creation_year, passenger_capacity);
        this.max_fly_speed = max_fly_speed;
    }

    @Override
    //to string with general message of the class identity
    public String toString() {
        return "This Quadcopter has a max flying speed of " + this.max_fly_speed + "." + "It has " + this.num_cylinders + " cylinders."
                + " It was created in " + this.creation_year + ", and it has a passenger capacity of " + this.passenger_capacity
                + ". It is manufactured by " + this.brand + ". Its price is " + this.price + ". It has a horsepower of "
                + this.horsepower + ".";
    }

    //finds if the compared object is equal to this class in values and class
    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.brand.equals(((Quadcopter) a).brand) && this.price == ((Quadcopter) a).price && this.horsepower == ((Quadcopter) a).horsepower && this.num_cylinders == ((Quadcopter) a).num_cylinders && this.creation_year == ((Quadcopter) a).creation_year && this.passenger_capacity == ((Quadcopter) a).passenger_capacity && this.max_fly_speed == ((Quadcopter) a).max_fly_speed) {
            isEqual =true;
        }
        return isEqual;
    }

    //getters and setters
    public int getMax_fly_speed() {
        return max_fly_speed;
    }

    public void setMax_fly_speed(int max_fly_speed) {
        this.max_fly_speed = max_fly_speed;
    }
}
