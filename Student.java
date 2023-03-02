package com.day3;

public class Student extends Person{
    String grade;

    Student(String name,int age,String grade)
    {
        super();
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

   void studentdetails(){
       System.out.println(name+" "+age+" "+grade);
   }

    void study(){
        System.out.println("I am studying");
    }

    public static void main(String[] args) {
        Student s = new Student("Mahaprabu",21,"A grade");
        s.studentdetails();
        s.speak();
        s.study();
    }
}
 //   as per the question we have inherited Person class in subclass Student.
// addtionally we've printed attributes by using constructor
//Output is
/*
Mahaprabu 21 A grade
I am Speaking
I am studying
 */