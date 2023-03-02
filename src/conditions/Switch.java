package conditions;

public class Switch {
    public static void main(String[] args) {
        int grade = 3;

        System.out.println(grades(1));
        System.out.println(grades(2));
        System.out.println(grades(grade));
        System.out.println(grades(4));
        System.out.println(grades(5));
    }

    public static String grades (int grade) {
        return switch (grade) {//return und switch sind hierbei keywords und innerhalb der runden Klammern stehen die Konditionen
            case 1 -> "Outstanding";
            case 2 -> "Excellent";
            case 3 -> "Acceptable";
            case 4 -> "Passing";
            //case 5 -> "fail";//dadurch, dass wir unseren default als Fail bezeichnen, brauchen wir den Case 5 hier nicht mehr, wenn wir insgesamt nur 5 Fälle ausgeben wollen
            default -> "Fail";//default bedeutet, "in jedem anderen Fall" und signalisiert gleichzeitig das Ende des switch
        };
    }
}
