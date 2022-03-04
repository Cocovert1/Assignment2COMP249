// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------

/*
The Multirotor class has 1 value. 3 Consturctors (default, copy and a parameterized constructor). It has a toString, an equals method
that finds if the objects compared is of class Multirotor and if it has the same values as the one its being compared to, and getters and setters.
It extends from the Helicopter class therefore it inherits the values from the Helicopter class. It overrides the toString and equals method.
 */

//third package
package com.company.Package3;

import com.company.Package2.Helicopter; //imports Helicopter class package

public class Multirotor extends Helicopter {
    //initializes values
    private int num_rotors;

    //default constructor
    public Multirotor(){
        super();
        num_rotors = 0;
    }

    //copy constructor
    public Multirotor(Multirotor multirotor){
        super(multirotor);
        this.num_rotors = multirotor.num_rotors;
    }

    //parameterized constructor
    public Multirotor(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity, int num_rotors) {
        super(brand, price, horsepower, num_cylinders, creation_year, passenger_capacity);
        this.num_rotors = num_rotors;
    }

    @Override
    //to string with general message of the class identity
    public String toString() {
        return "This Multirotor has " + this.num_rotors + " rotors." + "It has " + this.num_cylinders + " cylinders."
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
        } else if (this.brand.equals(((Multirotor) a).brand) && this.price == ((Multirotor) a).price && this.horsepower == ((Multirotor) a).horsepower && this.num_cylinders == ((Multirotor) a).num_cylinders && this.creation_year == ((Multirotor) a).creation_year && this.passenger_capacity == ((Multirotor) a).passenger_capacity && this.num_rotors == ((Multirotor) a).num_rotors) {
            isEqual =true;
        }
        return isEqual;
    }

    //getters and setters
    public int getNum_rotors() {
        return num_rotors;
    }

    public void setNum_rotors(int num_rotors) {
        this.num_rotors = num_rotors;
    }
}
