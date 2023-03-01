package Calculating;

import java.util.Scanner;

public class DivisibleMitVortragender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int firstNumber = scanner.nextInt();

        int secondNumber = 3;

        int result = firstNumber % secondNumber;

        if (result == 0){
            System.out.println("The number is divisible by 3");
        }
            else {
            System.out.println("The number is not divisible by 3");
        }
    }
}
