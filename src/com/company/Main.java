// Denise Chen
// IS 147-04
// d189@umbc.edu
// 12/8/2021
// use inheritance for salary and bonus

package com.company;

public class Main {
public static void main(String args[]) {

    Programmer program = new Programmer(5000,100000.0);

    System.out.println ("Programmer salary is: " + program.salary);
    System.out.println ("Bonus of Programmer is: " + program.bonus);

        }
    }