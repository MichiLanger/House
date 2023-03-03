package loops;

public class DoCount {
    public static void main(String[] args) {
        int startingNumber = 89;

        doCount(startingNumber);
    }

    public static void doCount (int startingNumber){
        do {
            System.out.println(startingNumber);
            startingNumber++;//bedeutet, er zählt immer eines dazu - mit diesem Doppel-Plus kann man den Zähler so abkürzen
        } while (startingNumber <= 100);
    }

}
