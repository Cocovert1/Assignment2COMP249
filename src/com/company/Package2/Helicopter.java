package com.company.Package2;

import com.company.Package1.Airplane;

public class Helicopter extends Airplane {
    protected int num_cylinders;
    protected int creation_year;
    protected int passenger_capacity;

    public Helicopter(){
        super();
        num_cylinders = 0;
        creation_year = 0;
        passenger_capacity = 0;
    }

    //copy
    public Helicopter(Helicopter helicopter) {
        super(helicopter);
        this.num_cylinders = helicopter.num_cylinders;
        this.creation_year = helicopter.creation_year;
        this.passenger_capacity = helicopter.passenger_capacity;
    }

    public Helicopter(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity) {
        super(brand, price, horsepower);
        this.num_cylinders = num_cylinders;
        this.creation_year = creation_year;
        this.passenger_capacity = passenger_capacity;
    }

    @Override
    public String toString() {
        return "This Helicopter has " + this.num_cylinders + " cylinders, it was created in " + this.creation_year + ", and it can carry up to "
                + this.passenger_capacity + "." + "It is manufactured by " + this.brand + ". Its price is "
                + this.price + ". It has a horsepower of " + this.horsepower + ".";
    }

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
