package com.company;

public class Time {

    public static void main (String [] args) {

        int time = 20;

        if(time < 12) {
            System.out.println("Good Morning Sunshine!"); //Shows if time is 8

        }
        else if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon. Work Hard.");

        }
        else if (time >= 20 && time <= 24) {
            System.out.println("Good Evening! Get some rest!"); //Shows if time is 20

        }
        else if (time < 0 || time > 24) {
            System.out.println("Not correct time");

        }
}
}
