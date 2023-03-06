package arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] myLotteryGuesses = new int[6];
        myLotteryGuesses[0] = 7;
        myLotteryGuesses[1] = 28;
        myLotteryGuesses[2] = 33;
        myLotteryGuesses[3] = 42;
        myLotteryGuesses[4] = 13;
        myLotteryGuesses[5] = 19;

        int[] winningNumbers = getRandomLotteryNumbers();//hier weisen wir unserer Methode diesen "Wert" zu(?!)

        int countMatches = 0;

        for (int i = 0; i < myLotteryGuesses.length; i++){
            if (myLotteryGuesses[i] == winningNumbers[i]){
                countMatches = countMatches + 1;//man könnte hier natürlich auch wieder einfach nur PlusPlus anhängen für den Zähler -> also, countMatches++
            }
        }

        if (countMatches == 6){
            System.out.println("Jackpot!");
        } else if (countMatches == 5) {
            System.out.println("Second Price!");
        } else if (countMatches == 4) {
            System.out.println("Third Price!");
        } else {
            System.out.println("I'm sorry but you lost!");
        }
    }

    public static int[] getRandomLotteryNumbers(){
        int[] randomNumbers = new int[6];
        for (int i = 0; i < randomNumbers.length; i++){
            int number = (int) (Math.random() * 100);
            while (number > 49 || number == 0){
                number = (int) (Math.random() * 100);
            }
            randomNumbers[i] = number;
        }
        return randomNumbers;
    }
}
