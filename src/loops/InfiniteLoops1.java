package loops;

public class InfiniteLoops1 {
    public static void main(String[] args) {
        int i = 1;

        infiniteLoop(i);
    }

    public static void infiniteLoop (int i) {
        do {
            System.out.println(i);
            i = i + 1;//man könnte auch i++ schreiben
        } while (i <= 100);
    }
}
