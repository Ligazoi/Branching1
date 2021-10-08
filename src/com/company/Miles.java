package com.company;
import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {


    }

    public static double toMilesPerHour(double kilometersPerHour) {


        if (kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;

    }

        }



