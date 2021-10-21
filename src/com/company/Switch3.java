package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch3 {
    public static void main (String [] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please write number One");
        int numberOne = input.nextInt();
        System.out.println("Please write number Two");
        int numberTwo = input.nextInt();

        System.out.println("Please choose calculation option: + (sum), - (subtract) , / (divide), * (multiply), % (reminder), p (print out both elements) , b (which element bigger) , s (which element smaller)");
        char user = input.next().charAt(0);

         switch (user) {
             case '+':
                 System.out.println("Sum of Number One and Number Two = " + (numberOne + numberTwo));
                 break;
             case '-':
                 System.out.println("Subtraction of Number One and Number Two = " + (numberOne - numberTwo));
                 break;
             case '/':
                 System.out.println("Dividing Number One and Number Two =  " + (numberOne / numberTwo));
                 break;
             case '*':
                 System.out.println("Multiplication of Number One and Number Two = " + (numberOne * numberTwo));
                 break;
             case '%':
                 System.out.println("The remainder when the Number One is divided by Number Two = " + (numberOne%numberTwo));
                 break;
             case 'p':
                 System.out.println("Number One is " + numberOne + " and Number Two is " + numberTwo);
                 break;
             case 'b':
                 System.out.println("Bigger is number " + (numberOne > numberTwo || numberOne > numberTwo));
                 break;
             case 's':
                 System.out.println("Smaller ir number " + (numberOne < numberTwo || numberTwo < numberOne));
                 break;


         }
    }
}
