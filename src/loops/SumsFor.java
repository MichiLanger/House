package loops;

public class SumsFor {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++){//i++ nennt man übrigens inkrementieren
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 50; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 0; i < 5; i++){
            System.out.println("Yay for loops are cool!");
        }

    }
}
