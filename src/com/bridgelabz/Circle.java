package com.bridgelabz;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void printCircleInfo(){
        System.out.println("Radius of the Circle is : " + getRadius());
        System.out.println("Circumference of the Circle is : " + getCircumference());

    }
    public static void main(String[] args) {
        Circle cir = new Circle(12);
        cir.printCircleInfo();

    }
}
