package Calculating;

import java.util.Scanner;

public class CalculatingIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Number:");
        double number = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner2.nextDouble();

        double result = number % number2;

        if (result == 0) {
            System.out.println("The number you typed in is odd");
        }
            else System.out.println("The number you typed in is even");


    }
}
