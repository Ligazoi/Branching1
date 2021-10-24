package com.company;
import java.util.Scanner;

public class Working {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter working hours in day");
        int workingHoursInDay = scanner.nextInt();
        if (workingHoursInDay <= 8 && workingHoursInDay > 0) {
            System.out.println("hourly rate is " + workingHoursInDay * 10 + "eur/h");
        } else if (workingHoursInDay > 8 && workingHoursInDay < 24){
            System.out.println("The salary is " + (80 +(workingHoursInDay - 8) * 15));
        }
        else {
            System.out.println("Enter valid value");
        }
    }

}