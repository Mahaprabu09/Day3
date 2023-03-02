package com.day3;

public class Car extends Vehicle{
    String color;

    Car(String brand, String model, int year,String color) {
        super(brand, model, year);
        this.color=color;
    }

    void cardetails(){
        System.out.println(brand+" "+model+" "+year+" "+color);
    }

    void honk()
    {
        System.out.println("i won't like honks when ever i drove");
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota innova","2.5 vx",2012,"white");
        c.cardetails();
        c.drive();
        c.honk();
    }
}

//as per the question we have inherited vehicle class in subclass car.
// addtionally we've printed attributes by using constructor
//Output is
/*
//Toyota innova 2.5 vx 2012 white
//i'd like to drive each day atleast one hour
//i won't like honks when ever i drove
 */