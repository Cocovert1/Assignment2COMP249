package com.company.Package5;

import com.company.Package4.UAV;

public class AgriculturalDrone extends UAV {
    private String brand;
    private int carry_capacity;

    public AgriculturalDrone(){
        super();
        brand = "unknown";
        carry_capacity = 0;
    }

    //copy
    public AgriculturalDrone(AgriculturalDrone agriculturalDrone){
        super(agriculturalDrone);
        this.brand = agriculturalDrone.brand;
        this.carry_capacity = agriculturalDrone.carry_capacity;
    }

    public AgriculturalDrone(double weight, double price, String brand, int carry_capacity) {
        super(weight, price);
        this.brand = brand;
        this.carry_capacity = carry_capacity;
    }

    @Override
    public String toString() {
        return "This Agricultural Drone is manufactured by " + this.brand + ", and it has a carry capacity of " + this.carry_capacity
                + ". It has a weight of " + this.weight + ", and a price of " + this.price + ".";
    }

    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.weight == ((AgriculturalDrone) a).weight && this.price == ((AgriculturalDrone) a).price && this.brand.equals(((AgriculturalDrone) a).brand) && this.carry_capacity == ((AgriculturalDrone) a).carry_capacity) {
            isEqual =true;
        }
        return isEqual;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarry_capacity() {
        return carry_capacity;
    }

    public void setCarry_capacity(int carry_capacity) {
        this.carry_capacity = carry_capacity;
    }
}
