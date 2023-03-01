package logischeOperatoren;

public class Methoden {
    public static void main(String[] args) {
//On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isSenior = true;
        boolean isDog = false;
        boolean isStudent = false;

        checkIfDiscount(isSenior, isStudent, isDog);
        checkIfDiscount(true, false, false);/*mit STRG + D markiert man diese ganze Zeile wenn man mit dem Cursor in die Zeile geht und dann eben diese Tastenkombination drückt*/
        checkIfDiscount(true, true, false);
        checkIfDiscount(true, true, true);
        checkIfDiscount(false, true, true);
        checkIfDiscount(false, false, true);
        checkIfDiscount(false, false, false);
    }
    public static void checkIfDiscount(boolean isSenior, boolean isStudent, boolean isDog){
        if (isSenior){
            System.out.println("Discount");
        } else if (isDog) {
            System.out.println("Discount");
        } else if (isStudent) {
            System.out.println("Discount");
        } else {
            System.out.println("You don't get a discount.");
        }
    }
}
