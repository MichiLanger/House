package logischeOperatoren;

public class Methoden3 {
    public static void main(String[] args) {
        double area1 = calculateArea(2.1, 3d);//das "d" steht hier für "Komma Null" - also steht hier 3.0
        double area2 = calculateArea(6.1, 7.6);

        if (area1 > area2){
            System.out.println("Area 1 is the greatest!");
        } else {
            System.out.println("Area 2 is the greatest!");
        }

    }
    public static double calculateArea (double length, double breadth){//hier wollen wir einen "double"-Wert zurückbekommen
        double area = length * breadth;
        return area;

    }
}
/*mit dieser Methode verwenden wir das, was in der Methode ausgegeben wird weiter...*/