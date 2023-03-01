package logischeOperatoren;

public class Methoden2 {
    public static void main(String[] args) {
        int fiction = 13;
        int nonFiction = 5;

        //checkIfBookDiscount(fiction, nonFiction);//das gehört noch zur void-Methode
        String result = checkIfBookDiscount(fiction, nonFiction);
        System.out.println(result);

        System.out.println(checkIfBookDiscount(5, 12));
    }
    /*
    public static void checkIfBookDiscount(int fiction, int nonFiction){
        if (fiction > 0 && nonFiction >= 3) {
            System.out.println("Discount");
        } else {
            System.out.println("No discount");
        }
        //möchte man das ganze jetzt mit einem Rückgabewert machen:*/
    public static String checkIfBookDiscount(int fiction, int nonFiction){
        String discount = "Discount";

        if (fiction > 0 && nonFiction >= 3) {
            return discount;
        } else {
            return "no discount";
        }
    }
}