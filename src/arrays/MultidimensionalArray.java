package arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] heartArray = {
                {0,1,0,0,0,1,0},
                {1,1,1,0,1,1,1},
                {1,1,1,1,1,1,1},
                {0,1,1,1,1,1,0},
                {0,0,1,1,1,0,0},
                {0,0,0,1,0,0,0},
        };//hiermit deklarieren und initialisieren wir unseren zweidimensionalen Array

        for (int[] row : heartArray){
            for (int rowItem : row){
                if (rowItem == 0){
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();//dies bewirkt, dass wir nach jedem Loop/nach jedem Durchgang der Schleife in die nächste Zeile gelangen - also hiermit wird ein "Line-Break" eingefügt
        }
    }
}
