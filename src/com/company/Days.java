package com.company;

import java.util.Scanner;


public class Days {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the day of the month");
        int Day = scanner.nextInt();
        if (Day <1 || Day >31) {
            System.out.println("Please enter correct Day of the month");
            System.exit(0);
        }

        System.out.println("Please choose the month");
        int Month = scanner.nextInt();
        if (Month < 1 || Month > 12) {
            System.out.println("Please enter correct month of the year");
            System.exit(0);
        }

        System.out.println("Please choose the year");
        int Year = scanner.nextInt();
        if (Year <0 || Year > 2500) {
            System.out.println("Please enter correct year");
            System.exit(0);
        }

            System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD");
             int ChoseDataType = scanner.nextInt();
            if (ChoseDataType ==1){
                System.out.println(Year + "/" + Month + "/" + Day);
            }
            else if (ChoseDataType ==2){
                System.out.println(Year + "." + Month + "." + Day);

            }

        }


    }

