package com.company.Package2;

import com.company.Package2.Helicopter;

public class Quadcopter extends Helicopter {
    private int max_fly_speed;

    public Quadcopter(){
        super();
        max_fly_speed = 0;
    }

    //copy
    public Quadcopter(Quadcopter quadcopter) {
        super(quadcopter);
        this.max_fly_speed = quadcopter.max_fly_speed;
    }

    public Quadcopter(String brand, double price, int horsepower, int num_cylinders, int creation_year, int passenger_capacity, int max_fly_speed) {
        super(brand, price, horsepower, num_cylinders, creation_year, passenger_capacity);
        this.max_fly_speed = max_fly_speed;
    }

    @Override
    public String toString() {
        return "This Quadcopter has a max flying speed of " + this.max_fly_speed + "." + "It has " + this.num_cylinders + " cylinders."
                + " It was created in " + this.creation_year + ", and it has a passenger capacity of " + this.passenger_capacity
                + ". It is manufactured by " + this.brand + ". Its price is " + this.price + ". It has a horsepower of "
                + this.horsepower + ".";
    }

    public int getMax_fly_speed() {
        return max_fly_speed;
    }

    public void setMax_fly_speed(int max_fly_speed) {
        this.max_fly_speed = max_fly_speed;
    }
}
