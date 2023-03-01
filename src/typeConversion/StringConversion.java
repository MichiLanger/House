package typeConversion;

import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String input = scanner.nextLine();

        //convert to "int":

        int intNumber = Integer.parseInt(input);//wenn man etwas von oder zu String konvertieren möchte, muss
        //man immer die großen Klassen (hier "Integer") dafür verwenden!
        //parseInt steht hier dafür, dass er dieses int hernehmen soll und es in einen String verwenden
        System.out.println(intNumber);

        //convert to double:

        double doubleNumber = Double.parseDouble(input);
        System.out.println(doubleNumber);

    }
}
