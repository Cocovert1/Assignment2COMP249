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

public class Airplane {
    //initializes values
    protected String brand;
    protected double price;
    protected int horsepower;

    //default constructor
    public Airplane(){
        brand = "Boeing";
        price = 100000000;
        horsepower = 3500;
    }

    //copy constructor
    public Airplane(Airplane airplane) {
        this.brand = airplane.brand;
        this.price = airplane.price;
        this.horsepower = airplane.horsepower;
    }

    //parameterized constructor
    public Airplane(String brand, double price, int horsepower) {
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    @Override
    //to string with general message of the class identity
    public String toString() {
        return "This Airplane is manufactured by " + this.brand + ". Its price is " + this.price + ". It has a horsepower of "
                + this.horsepower + ".";
    }

    //finds if the compared object is equal to this class in values and class
    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.brand.equals(((Airplane) a).brand) && this.price == ((Airplane) a).price && this.horsepower == ((Airplane) a).horsepower) {
            isEqual =true;
        }
        return isEqual;
    }

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
