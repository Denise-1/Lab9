package com.company;

public class Employee {    // parent
    double salary;

    public Employee() {}

    public Employee(double salaryConstructor) {
        this.salary = salaryConstructor;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary() {
        this.salary = salary;
    }
}