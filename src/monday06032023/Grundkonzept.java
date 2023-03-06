package monday06032023;

import classes.Katze;

import java.util.Scanner;

public class Grundkonzept {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter something: ");
        int number = scanner1.nextInt();

        Katze mieze = new Katze(true, true, "Grey", 4);
        Katze schnurrbert = new Katze(true, true, "Red Brown", 3);
        Katze cookie = new Katze(false, true, "n/a", 4);

        String miezeSpeaks = mieze.speak();
        System.out.println(miezeSpeaks);

        System.out.println(schnurrbert.speak());
    }
}
