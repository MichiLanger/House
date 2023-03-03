package loops;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        int startingNumber = 100;

        countDown(startingNumber);
//      countDown2(startingNumber);

    }
    //eine Variante:
    public static void countDown (int startingNumber){
        System.out.println(startingNumber);
        while (startingNumber !=0){
            startingNumber = startingNumber - 1;
            System.out.println(startingNumber);
        }
    }

    //andere Möglichkeit:
//    public static void countDown2 (int startingNumber){
//        while (startingNumber >= 0){
//            System.out.println(startingNumber);
//            startingNumber = startingNumber - 1;
//        }
//    }

    //selbst versucht mit Scanner:
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Please type in a number from 0 to 100:");
//        int typedNumber = scanner1.nextInt();
//
//
//    }
//
//    public static void countDown (int from){
//        while (int typedNumber > 0){
//            System.out.println();
//            typedNumber = typedNumber - 1;
//
//        }
//    }

}
