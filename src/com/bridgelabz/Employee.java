package com.bridgelabz;

public class Employee {
    private String name;
    private double salary;
    private int ID;
    public Employee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }
    public double calculateYearlySalary() {
        return salary * 12;
    }
    public void printEmployeeInfo() {
        System.out.println("Name of the Employee : " + name);
        System.out.println("Salary of the Employee : " + salary);
        System.out.println("ID of the Employee : " + ID);
        System.out.println("Yearly Salary of the Employee is : " +  calculateYearlySalary() );
    }

    public static void main(String[] args) {
        Employee emp  = new Employee("Mansi",40000,11);
        emp.printEmployeeInfo();

    }
}
