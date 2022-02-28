package com.company.Package4;

public class UAV {
    protected double weight;
    protected double price;

    public UAV(){
        weight = 0;
        price = 0;
    }

    //copy
    public UAV(UAV uav) {
        this.weight = uav.weight;
        this.price = uav.price;
    }

    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "This UAV has a weight of " + this.weight + ", and a price of " + this.price + ".";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
