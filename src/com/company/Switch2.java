package com.company;
import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the grade level");

        char gradeLevel = scanner.next().charAt(0);

        switch (gradeLevel) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But you can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat exam!");
                break;
            default:
                System.out.println("You wasn't there!");
                break;

        }

    }
}