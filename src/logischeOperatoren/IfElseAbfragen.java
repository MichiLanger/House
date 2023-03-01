package logischeOperatoren;

import java.util.Scanner;

public class IfElseAbfragen {
    public static void main(String[] args) {
        /*
        //On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isSenior = true;
        boolean isDog = false;
        boolean isStudent = false;

        if (isSenior){
            System.out.println("Discount");
        } else if (isDog) {
            System.out.println("Discount");
        } else if (isStudent) {
            System.out.println("Discount");
        } else {
            System.out.println("You don't get a discount.");
        }
        */

        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.
        int fiction = 1;   /*hier haben wir uns jetzt nur als Beispielwerte jeweils eine Zahl ausgesucht - damit
        wir unsere Abfrage auf Richtigkeit überprüfen können - im Prinzip können wir hier auch einen Scanner
        einbauen so wie bei den anderen Klassen-Beispielen
        */
        int nonFiction = 3;

        if (fiction > 0 && nonFiction >= 3) {
            System.out.println("Discount");
        } else {
            System.out.println("No discount");
        }


        /*hier mit Scanner selbst probiert - nochmal drüber schauen:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of non-fiction books: ");
        int nonFictionBooks = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your number of fiction books: ");
        int fictionBooks = scanner2.nextInt();

        boolean result = nonFictionBooks > 2 && fictionBooks > 1;

        if (result){
            System.out.println("The number is divisible by 3");
        }
        else {
            System.out.println("The number is not divisible by 3");
        }
        */
    }
}
