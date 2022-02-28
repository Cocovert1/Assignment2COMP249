package com.company.Package1;

public class Airplane {
    protected String brand;
    protected double price;
    protected int horsepower;

    public Airplane(){
        brand = "Boeing";
        price = 100000000;
        horsepower = 3500;
    }

    //copy
    public Airplane(Airplane airplane) {
        this.brand = airplane.brand;
        this.price = airplane.price;
        this.horsepower = airplane.horsepower;
    }

    public Airplane(String brand, double price, int horsepower) {
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "This Airplane is manufactured by " + this.brand + ". Its price is " + this.price + ". It has a horsepower of "
                + this.horsepower + ".";
    }

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
