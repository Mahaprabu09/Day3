package com.day3;
/*
Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study".
Create an object of the Student class and call both the "speak" and "study" methods.
 */
public class Person {
    String name;
    int age;

    void speak()
    {
        System.out.println("I am Speaking");
    }
}
