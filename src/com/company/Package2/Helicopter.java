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

public class Helicopter extends Airplane {
    //initializes values
    protected int num_cylinders;
    protected int creation_year;
    protected int passenger_capacity;

    //default constructor
    public Helicopter(){
        super();
        num_cylinders = 0;
        creation_year = 0;
        passenger_capacity = 0;
    }

    //copy constructor
    public Helicopter(Helicopter helicopter) {
        super(helicopter);
        this.num_cylinders = helicopter.num_cylinders;
        this.creation_year = helicopter.creation_year;
        this.passenger_capacity = helicopter.passenger_capacity;
    }

    //parameterized constructor
    public Helicopter(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity) {
        super(brand, price, horsepower);
        this.num_cylinders = num_cylinders;
        this.creation_year = creation_year;
        this.passenger_capacity = passenger_capacity;
    }

    @Override
    //to string with general message of the class identity
    public String toString() {
        return "This Helicopter has " + this.num_cylinders + " cylinders, it was created in " + this.creation_year + ", and it can carry up to "
                + this.passenger_capacity + "." + "It is manufactured by " + this.brand + ". Its price is "
                + this.price + ". It has a horsepower of " + this.horsepower + ".";
    }

    //finds if the compared object is equal to this class in values and class
    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.brand.equals(((Helicopter) a).brand) && this.price == ((Helicopter) a).price && this.horsepower == ((Helicopter) a).horsepower && this.num_cylinders == ((Helicopter) a).num_cylinders && this.creation_year == ((Helicopter) a).creation_year && this.passenger_capacity == ((Helicopter) a).passenger_capacity) {
            isEqual =true;
        }
        return isEqual;
    }

    //getters and setters
    public int getNum_cylinders() {
        return num_cylinders;
    }

    public void setNum_cylinders(int num_cylinders) {
        this.num_cylinders = num_cylinders;
    }

    public int getCreation_year() {
        return creation_year;
    }

    public void setCreation_year(int creation_year) {
        this.creation_year = creation_year;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }
}
