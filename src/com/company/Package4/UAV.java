package com.company.Package4;

import com.company.Package1.Airplane;

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

    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.weight == ((UAV) a).weight && this.price == ((UAV) a).price) {
            isEqual =true;
        }
        return isEqual;
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
