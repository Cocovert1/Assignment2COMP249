package com.company.Package3;

import com.company.Package2.Helicopter;

public class Multirotor extends Helicopter {
    private int num_rotors;

    public Multirotor(){
        super();
        num_rotors = 0;
    }

    //copy
    public Multirotor(Multirotor multirotor){
        super(multirotor);
        this.num_rotors = multirotor.num_rotors;
    }

    public Multirotor(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity, int num_rotors) {
        super(brand, price, horsepower, num_cylinders, creation_year, passenger_capacity);
        this.num_rotors = num_rotors;
    }

    @Override
    public String toString() {
        return "This Multirotor has " + this.num_rotors + " rotors." + "It has " + this.num_cylinders + " cylinders."
                + " It was created in " + this.creation_year + ", and it has a passenger capacity of " + this.passenger_capacity
                + ". It is manufactured by " + this.brand + ". Its price is " + this.price + ". It has a horsepower of "
                + this.horsepower + ".";
    }

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

    public int getNum_rotors() {
        return num_rotors;
    }

    public void setNum_rotors(int num_rotors) {
        this.num_rotors = num_rotors;
    }
}
