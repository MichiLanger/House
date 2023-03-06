package recursion;

public class CountDown {
    public static void main(String[] args) {

        doCountDown(10);

    }

    public static void doCountDown (int n){
        if (n != 0){
            System.out.println(n);
            n--;//hier zählt unser Zähler bei jedem Durchlauf Minus 1
            doCountDown(n);
        } else {
            System.out.println(n);
        }
    }
}
