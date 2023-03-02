package com.day3;

public class Vehicle {

    String brand;
    String model;
    int year;

    Vehicle(String brand,String model,int year)
    {
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    void drive(){
        System.out.println("i'd like to drive each day atleast one hour");
    }
}
