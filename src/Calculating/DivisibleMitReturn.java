package Calculating;

//import java.util.Scanner;

public class DivisibleMitReturn {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter number: ");
//        int firstNumber = scanner.nextInt();
//
//        int secondNumber = 3;
//
//        int result = firstNumber % secondNumber;
//
//        if (result == 0){
//            System.out.println("The number is divisible by 3");
//        }
//        else {
//            System.out.println("The number is not divisible by 3");
//        }

        int dividend = 18;//als Beispiel zur Berechnung
        int divisor = 9;//ebenso als Beispiel
        int resultOfDivisible = isDivisible(dividend, divisor);

        if (resultOfDivisible != 0){
            System.out.println(dividend + " is divisible by " + divisor);
        }

    }
    public static int isDivisible (int dividend, int divisor) {
        int restFromDivision = dividend % divisor;

        if (restFromDivision == 0) {
            return dividend;
        } else {
            return 0;
        }
    }

        public static int isDivisible2 (int dividend, int divisor){
            int restFromDivision = dividend % divisor;
            int returnValue = 0;
            if (restFromDivision == 0){
                returnValue = dividend;
            }
            return returnValue;

    }
}
