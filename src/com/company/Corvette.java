package com.company;

public class Corvette extends Car {

    private String color;

    public Corvette(int year, String make, String model, int speed, int gas, String color) {
        super(year, make, model, speed, gas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    protected void getCorvetteInfo(){

        System.out.println("You are driving a " + getColor() + " " + getYear() + " " + getMake() + " " + getModel() + ". It is going " + getSpeed() + " MPH and has " + getGas() + "% of it,s gas left.");
    }
}