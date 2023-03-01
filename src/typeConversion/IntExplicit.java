package typeConversion;

import java.util.Scanner;

public class IntExplicit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//diesen verwenden wir um Daten aus der Konsole einzulesen
        System.out.println("Type in a number: ");//dies wird uns wieder wie immer in unserer Konsole angezeigt
        //int number = scanner.nextInt();//das könnten wir in einen double speichern, aber wenn wir dann in der
        //Konsole einen double eingibt (also eine Kommazahl) geht das nicht - deshalb müssen wir diese Zeile
        //umändern in "double number = scanner.nextDouble();
        double number = scanner.nextDouble();

        System.out.println("Before conversion: " + number);

        /*double temporaryStorage = number;

        System.out.println("After conversion: " + temporaryStorage);*/

        int temporaryStorage = (int) number;
        System.out.println("After conversion: " + temporaryStorage);

        System.out.println((float) number);
        System.out.println((long) number);
        System.out.println((short) number);

        String stringNumber = Double.toString(number);
        System.out.println(stringNumber);

    }
}
