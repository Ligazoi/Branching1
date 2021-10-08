package com.company;

public class Main {

    public static void main(String[] args) {
	short numberOne = 17;
    short numberTwo = 26;

    if (numberOne > numberTwo) {
        System.out.println("The largest variable is number One = " + 17);
    }
    else
        System.out.println("The largest variable is number Two = " + 26);

    if (numberOne < numberTwo) {
        System.out.println("The smallest variable is number One = " + 17);
    }
    else
        System.out.println("The smallest variable is number Two = " + 26);

    if (numberOne==numberTwo) {
        System.out.println("Number One and Number Two are equals");
    }
    else
        System.out.println("Number One and Number Two are not equals");

    if (numberOne % 2 == 0) {
        System.out.println("Variable Number One is even");

    }
    else
        System.out.println("Variable Number One is odd");

    if (numberTwo % 2 == 0) {
        System.out.println("Variable Number Two is even");
    }
    else
        System.out.println("Variable Number Two is odd");

    if (numberOne < 0.0) {
        System.out.println("Number One is negative number");
    }
    else
        System.out.println("Number One is positive number");

    if (numberTwo < 0.0) {
        System.out.println("Number Two is negative number");
    }
    else
        System.out.println("Number Two is positive number");

    if (numberOne < 100) {
        System.out.println("Number One is less than 100");
    }
    else
        System.out.println("Number One is more than 100");

    if (numberTwo < 100) {
        System.out.println("Number Two is less than 100");
    }
    else
        System.out.println("NUmber Two is more than 100");
    }
}
