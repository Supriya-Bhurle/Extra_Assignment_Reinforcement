package com.bridgelabz;

public class Student {
    private String name;
    private int age;
    private int ID;
    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }
    public void printNameAndAge() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student std = new Student("Supriya",23 ,12);
        std.printNameAndAge();

    }


}
