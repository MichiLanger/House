package House;

public class LivingRoom {
    public static void main(String[] args) {
        //squareMeters
        int squareMeters;//hier deklarieren wir unseren Datentyp - int ist ein Datentyp für normale, ganze Zahlen
        //pricePerSquareMeter
        double pricePerSquareMeter;//double steht wiederum auch für Kommazahlen
        //address
        String address;//String ist wiederum ein komplexerer Datentyp - dieser kann viel mehr als die primitiven
        //Datentypen int & double - diese speichern nur die Zahlen

        //Aufgabe: Print out the cost of the house (squareMeters * pricePerSquareMeter) at (adress).

        //hierbei müssen wir die Variablen zuerst initialisieren:

        squareMeters = 500;
        pricePerSquareMeter = 10.5; //hier initialisieren wir unsere Variablen - Kommazahlen schreibt man hierbei immer mit einem Punkt - nicht Beistrich!
        address = "Hill Street 17";

        //das nun in der Konsole ausgeben:

        System.out.println("The price of the house at " + address + " is: " + squareMeters * pricePerSquareMeter + ".");

    }
}
