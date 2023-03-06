package arrays;

public class FirstArrays {
    public static void main(String[] args) {
        int[] firstArray = new int[5];//hier geschehen Deklaration und Initialisierung

        firstArray[0] = 1;//das bedeutet, an Stelle 0 haben wir den Wert 1 usw.
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;

        int[] secondArray = new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i < firstArray.length; i++){
            int itemInArray = firstArray[i];
            System.out.println(itemInArray);
        }

        System.out.println("--------------------------------------");//zwecks Übersichtlichkeit

        int[] thirdArray = new int[5];
        thirdArray[1] = 5;
        for (int i = 0; i < thirdArray.length; i++){
            System.out.println(thirdArray[i]);
        }

        System.out.println("--------------------------------------");

        //wir wollen jetzt unseren firstArray hernehmen und an jeder Stelle +12 zum Wert an dieser Stelle dazuzählen:

        for (int element : firstArray){
            element = element + 12;
            System.out.println(element);
        }
    }
}
