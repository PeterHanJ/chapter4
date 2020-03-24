package com.smart;

public class Car {
    private String brand;
    private String color;
    private int maxSpeed;

    public void introduce(){
        System.out.println("Car Brand:" + brand + " ,color:"+color+" ,max speed:"+maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
