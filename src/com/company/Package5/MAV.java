package com.company.Package5;

import com.company.Package4.UAV;

public class MAV extends UAV {
    private String model;
    private double size;

    public MAV(){
        super();
        model = "unknown";
        size = 0;
    }

    //copy
    public MAV(MAV mav){
        super(mav);
        this.model = mav.model;
        this.size = mav.size;
    }

    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "This MAV has a weight of " + this.weight + ", its price is " + this.price + ". It is of model "
                + this.model + ", and of size " + this.size + ".";
    }

    public boolean equals(Object a) {
        boolean isEqual = false;
        if(a == null) {
            isEqual = false;
        }else if (this.getClass() != a.getClass()){
            isEqual = false;
        } else if (this.weight == ((MAV) a).weight && this.price == ((MAV) a).price && this.model.equals(((MAV) a).model) && this.size == ((MAV) a).size) {
            isEqual =true;
        }
        return isEqual;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
